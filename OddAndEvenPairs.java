package com.company;

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        if (numbers.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                int temp = Integer.parseInt(numbers[i]);
                int nextTemp = Integer.parseInt(numbers[i +1]);

                if (temp % 2 == 0 && nextTemp % 2 == 0){

                    System.out.printf("%d, %d -> both are even",
                                temp,nextTemp);
                    System.out.println();

                }else if (temp % 2 != 0 && nextTemp % 2 != 0){

                    System.out.printf("%d, %d -> both are odd",
                            temp,nextTemp);
                }else{

                    System.out.printf("%d, %d -> different",temp,nextTemp);
                    System.out.println();
                }
            }
        }
    }
}
