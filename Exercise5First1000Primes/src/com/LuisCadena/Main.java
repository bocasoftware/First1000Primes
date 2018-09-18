package com.LuisCadena;

public class Main {

    public static void main(String[] args) {
        runTheNumbers();


    }

    private static void runTheNumbers() {

        for (int i = 3; i <= 1000; i++) {

            if (isPrime(i)) {

                System.out.println(i);

            }
        }


    }

    private static boolean isPrime(int number) {

        if (number == 1) {
            return false;

        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }


        }
        return true;

    }


}
