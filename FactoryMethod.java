package org.java9;

import java.util.List;
import java.util.Map;


//Factory Methods for Immutable List, Set, Map and Map.Entry
/*
Factory methods are special type of static methods that are used to create unmodifiable instances of collections.
It means we can use these methods to create list, set and map of small number of elements.
It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException
* */
public class FactoryMethod {

    public static void main(String[] args) {

        //Empty List/Map Example
        List immutableList = List.of();
        Map emptyImmutableMap = Map.of();

        System.out.println("Empty List:"+immutableList);
        System.out.println("Empty Map:"+emptyImmutableMap);

        //Non-Empty List/Map Example
        List nonimmutableList = List.of("one","two","three");
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println("No-Empty List:"+nonimmutableList);
        System.out.println("No-Empty Map:"+nonemptyImmutableMap);

        //nonimmutableList.add("1"); Exception in thread "main" java.lang.UnsupportedOperationException

        //Non-Empty Map.Entry() Example
        Map nonemptyImmutableMapyntr7 = Map.ofEntries(Map.entry("1","2"));
        System.out.println("No-Empty Map.Entry():"+nonemptyImmutableMapyntr7);
        //System.out.println(lst.size());
    }
}
