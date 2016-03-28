package com.company;

import com.sun.javafx.scene.layout.region.Margins;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] parts = input.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        String binaryNum = Integer.toBinaryString(a);

        System.out.printf("|%X  |%s|  %.2f|%.3f",a,binaryNum,b,c);
    }
}
