package com.company;

import java.util.Scanner;

public class RegtangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] spliting = input.nextLine().split(" ");

        int firstSide = Integer.parseInt(spliting[0]);
        int secondSide = Integer.parseInt(spliting[1]);
        int result = calculateRegtangleArea(firstSide,secondSide);
        System.out.println(result);
    }
    private static int calculateRegtangleArea(int firstSide, int secondSide){
        int result = firstSide * secondSide;
        return result;
    }
}
