package org.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        * Java introduced try-with-resource feature in Java 7 that helps to close resource automatically after being used.
          In other words, we can say that we don't need to close resources (file, connection, network etc) explicitly,
          try-with-resource close that automatically by using AutoClosable interface.
        * */
        try(FileOutputStream fileStream=new FileOutputStream("java7.txt");){
            String greeting = "Welcome to java.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }

        /*
        * If we do like the following code in Java 7, compiler generates an error message.
        * error: <identifier> expected try(fileStream){
        * */
        FileOutputStream fileStream=new FileOutputStream("java9.txt");

        try(fileStream){
            String greeting = "Welcome to java.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
