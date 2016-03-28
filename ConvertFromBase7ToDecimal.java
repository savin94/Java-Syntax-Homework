package com.company;

import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberToConvert = scanner.nextLine();

            Integer decimalRepresentation = Integer.valueOf(numberToConvert, 7);
        System.out.println(decimalRepresentation);
    }
}
