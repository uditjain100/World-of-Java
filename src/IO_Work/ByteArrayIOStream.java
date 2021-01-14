package IO_Work;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayIOStream {

    public static void main(String[] args) {

        FileInputStream fis;
        // ByteArrayInputStream bais;
        ByteArrayOutputStream baos;
        byte[] arr;
        try {
            fis = new FileInputStream(new File("F:\\cf1.txt"));
            int size = fis.available();
            arr = new byte[size + 1];
            int i = 0;
            while (i != size)
                arr[i++] = (byte) fis.read();
            // bais = new ByteArrayInputStream(arr);
            baos = new ByteArrayOutputStream();
            baos.write(arr);
            // byte[] op = baos.toByteArray();
            // for (byte ele : op)
            // System.out.print((char) ele);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
