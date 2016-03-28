package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numberToConvert = scanner.nextInt();
        System.out.print(Integer.toString(numberToConvert, 7));
    }
}