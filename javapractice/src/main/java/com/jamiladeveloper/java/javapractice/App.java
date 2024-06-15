package com.jamiladeveloper.java.javapractice;

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

        StreamApi.printExceptWithLen(sArray, 2);
    }
}
