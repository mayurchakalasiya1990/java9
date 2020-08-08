package org.java9;

public interface PrivateMethod {

    //Private method to reduce duplication of code
    private void privateMethod(){
        System.out.println("Private Method from PrivateMethod Interface...");
    }

    //Static method Implementation of Interface
    public static void staticMethod(){
        System.out.println("Default Method from PrivateMethod Interface...");
    }

    /*
     * Java 8 introduces the “Default Method” or (Defender methods) feature, which allows the developer to add new methods to the interfaces without breaking their existing implementation.
     * It provides the flexibility to allow interface to define implementation which will use as the default in a situation where a concrete class fails to provide an implementation for that method.
     * */
    /**
     * Reengineering an existing JDK framework is always very complex.
     * Modifying one interface in a JDK framework breaks all classes that extend the interface, which means that adding any new method could break millions of lines of code.
     * Therefore, default methods have introduced as a mechanism to extend interfaces in a backward-compatible way.
     */
    default void defaultMethod(){
        System.out.println("defaultMethod() from PrivateMethod Interface...");
    }


    public static void main(String[] args) {
        System.out.println("public static void main(String[] args) from PrivateMethod Interface...");
        staticMethod();
    }
}


class TestClass implements PrivateMethod{
    public static void main(String[] args) {
        PrivateMethod privateMethod=new TestClass();
        privateMethod.defaultMethod();
        PrivateMethod.staticMethod();

    }
}