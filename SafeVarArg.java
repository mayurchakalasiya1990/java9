package org.java9;

/*
* It is an annotation which applies on a method or constructor that takes varargs parameters.
* It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
* It was included in Java7 and can only be applied on
    1. Final methods
    2. Static methods
    3. Constructors

* From Java 9, it can also be used with private instance methods.
* */
/*
* A programmer assertion that the body of the annotated method or constructor does not perform potentially unsafe operations on its varargs parameter.
* Applying this annotation to a method or constructor suppresses unchecked warnings about a non-reifiable variable arity (vararg) type
* and suppresses unchecked warnings about parameterized array creation at call sites.

 * */
import java.util.ArrayList;
import java.util.List;

public class SafeVarArg {
    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        SafeVarArg p = new SafeVarArg();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }
}

/*
* What happens? If we compile the following code by using older versions of Java.
SafeVar.java:6: error: Invalid SafeVarargs annotation. Instance method display(List<String>...) is not final.
	private void display(List<String>... products) {
	             ^
Note: SafeVar.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
* */