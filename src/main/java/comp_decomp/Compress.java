package Compress_DeCompress;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Compress {
    public static void method(File file) throws IOException {
        // Get the directory path of the file
        String fileDirectory = file.getParent();

        // Create FileInputStream to read the file
        FileInputStream fis = new FileInputStream(file);

        // Create FileOutputStream to write the compressed file
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/CompressedFile.gz");

        // Create GZIPOutputStream to compress the file
        GZIPOutputStream gzip = new GZIPOutputStream(fos);

        // Create a buffer for reading file data
        byte[] buffer = new byte[1024];
        int len;

        // Read data from the file and write it to the GZIPOutputStream
        while ((len = fis.read(buffer)) != -1) {
            gzip.write(buffer, 0, len);
        }

        // Close the GZIPOutputStream, FileOutputStream, and FileInputStream
        gzip.close();
        fos.close();
        fis.close();
    }
}
