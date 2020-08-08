package org.java9;

public class UnderscoreKeyword {


    /*
    * In earlier versions of Java, underscore can be used as identifier and to create variable name also.
      But in Java 9 release, underscore is a keyword and can't be used as an identifier or variable name.
      If we use the underscore character ("_") as an identifier, our source code can no longer be compiled.
    * */
    public static void main(String[] args) {
        //int _ = 10; // creating variable
        //System.out.println(_);
    }
}
