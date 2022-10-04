package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        File newFile = new File("somefile.txt");
        cat(newFile);
    }

    public static void cat(File file) throws IOException {


//        TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (Exception e) {

        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
