package com.jamiladeveloper.java.javapractice;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {

    public static void printEleFromArray(String[] sArray) {
        Arrays.stream(sArray).forEach(s -> System.out.println(s));
    }

    public static void printElemWithLen(String[] sArray, int len) {
        Arrays.stream(sArray).filter(s -> s.length() >= len).forEach(s -> System.out.println(s));
    }

    public static void isAllLenLessThan(String[] sArray, int len) {
        System.out.println(Arrays.stream(sArray).allMatch(s -> s.length() <= len));
    }

    public static void isAnyMatchLen(String[] sArray, int len) {
        System.out.println(Arrays.stream(sArray).anyMatch(s -> s.length() == len));
    }

    public static void countOfMatchofLenLessThan(String[] sArray, int len) {
        System.out.println(Arrays.stream(sArray).filter(s -> s.length()<= len).count());
    }

    public static void printExceptWithLen(String[] sArray, int len) {
        Arrays.stream(sArray).dropWhile(s -> s.length() == len).forEach(s -> System.out.println(s));
    }
}
