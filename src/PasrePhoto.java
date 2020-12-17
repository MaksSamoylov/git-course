import java.io.*;

public class PasrePhoto {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Maks\\" +
                "Desktop\\Screenshot_1.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("Screenshot_1.jpg"))
        {
            int i;
            while ((i=fileInputStream.read()) !=-1) {
                fileOutputStream.write(i);
            }
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream("my_file.bin"));
            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream("my_file.bin"));
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(52352);
            dataInputStream.readBoolean();
            dataInputStream.readInt();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
