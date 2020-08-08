package org.java9;

//Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
// Using the diamond with anonymous classes was not allowed in Java 7.
abstract class ABCD<T>{ // Diamond Operator in definition of abstract class
    abstract T show(T a, T b);
}
public class AnonymousInnerClasses {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a+b;
            }
        };
        String result = a.show("Java9"," diamond operator is empty");
        System.out.println(result);

        ABCD<String> b = new ABCD<>() { // diamond operator is empty
            String show(String a, String b) {
                return a+b;
            }
        };
        String result1 = a.show("Java9"," diamond operator is empty");
        System.out.println(result1);
    }
}
/*
*Java 8 compiler throws compile time error because it can't infer type. The error message looks like the below.
TypeInferExample.java:7: error: cannot infer type arguments for ABCD<T>
		ABCD<String> a = new ABCD<>() {
		                         ^
  reason: cannot use '<>' with anonymous inner classes
  where T is a type-variable:
    T extends Object declared in class ABCD
1 error
* */