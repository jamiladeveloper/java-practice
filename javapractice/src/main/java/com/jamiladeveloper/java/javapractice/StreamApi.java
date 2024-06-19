package com.jamiladeveloper.java.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

    public static void printSumOfList(List<Integer> list) {
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

    public static void printMaxFromList(List<Integer> list) {
        System.out.println(list.stream().mapToInt(Integer::intValue).max().getAsInt());
    }

    public static void printEvenFromList(List<Integer> list) {
        System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()));
    }

    public static void countStringContainingChar(List<String> list, char c) {
        System.out.println(list.stream().filter(s -> s.contains(c+"")).collect(Collectors.toList()).size());
    }

    public static void printAllInUpperCase(List<String> list) {
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
