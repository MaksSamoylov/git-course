import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_test {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile(
                "text.txt", "rw")) {
            file.seek(23);
            String line1 = file.readLine();
            System.out.println(line1);
            long pointer = file.getFilePointer();
            System.out.println(pointer);
            file.writeBytes("Privet ");
            file.seek(file.length()-1);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ; {

        }
    }
}
