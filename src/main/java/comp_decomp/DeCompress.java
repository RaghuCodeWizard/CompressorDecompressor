package Compress_DeCompress;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DeCompress {
    public static void method(File file) throws IOException {
        // Get the directory path of the file
        String fileDirectory = file.getParent();

        // Create FileInputStream to read the compressed file
        FileInputStream fis = new FileInputStream(file);

        // Create GZIPInputStream to decompress the file
        GZIPInputStream gzip = new GZIPInputStream(fis);

        // Create FileOutputStream to write the decompressed file
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/DeCompressedFile.gz");

        // Create a buffer for reading compressed data
        byte[] buffer = new byte[1024];
        int len;

        // Read data from the GZIPInputStream and write it to the FileOutputStream
        while ((len = gzip.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        // Close the GZIPInputStream, FileOutputStream, and FileInputStream
        gzip.close();
        fos.close();
        fis.close();
    }
}
