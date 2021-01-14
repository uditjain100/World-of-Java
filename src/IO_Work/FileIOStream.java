package IO_Work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

    public static void main(String[] args) {

        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream(new File("F:\\cf1.txt"));
            fos = new FileOutputStream(new File("F:\\cf2.txt"));
            int size = fis.available();
            int i = 0;
            while (i != size) {
                fos.write(fis.read());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Work Done :)");

    }

}
