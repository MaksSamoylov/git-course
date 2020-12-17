import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBuffer1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile(
                "text.txt", "rw");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder string = new StringBuilder();

            int a = channel.read(buffer);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a = 0;
    }
}
