package com.jamiladeveloper.java.javapractice;

import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] sArray = new String[] {"1", "22", "333", "4444", "55555", "666666"};

        //StreamApi.printEleFromArray(sArray);

        //StreamApi.printElemWithLen(sArray, 4);

        //StreamApi.isAllLenLessThan(sArray, 6);

        //StreamApi.isAnyMatchLen(sArray, 4);

        //StreamApi.countOfMatchofLenLessThan(sArray, 3);

        //StreamApi.printExceptWithLen(sArray, 2);

        //StreamApi.printSumOfList(Arrays.asList(1,2,3,4,5));

        //StreamApi.printMaxFromList(Arrays.asList(1,2,3,4,5));

        //StreamApi.printEvenFromList(Arrays.asList(1,2,3,4,5));

        //StreamApi.countStringContainingChar(Arrays.asList("anand", "gautam", "vikram"), 'g');
    
        StreamApi.printAllInUpperCase(Arrays.asList("anand", "kumar", "gautam"));
    }
}
