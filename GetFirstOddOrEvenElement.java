package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String[] oddOrEven = scanner.nextLine().split(" ");

        if (oddOrEven[2].equals( "odd")){
            sumOddNumbers(numbers);
        }else if (oddOrEven[2].equals("even")){
            sumEvenNumbers(numbers);
        }
    }

    private static void sumOddNumbers(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int temp = Integer.parseInt(numbers[i]);
            if (temp % 2 != 0){
                System.out.print(temp + " ");
            }
        }

    }
    private static void sumEvenNumbers(String[] numbers) {
        StringBuilder sum = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int temp = Integer.parseInt(numbers[i]);
            if (temp % 2 == 0){
                System.out.print(temp + " ");
            }
        }
    }
}
