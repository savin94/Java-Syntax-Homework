package com.company;
import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Locale locale = Locale.ROOT;

        Scanner input = new Scanner(System.in);
        String[] parts = input.nextLine().split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        double f1 = firstFormula(a,b,c);
        double f2 = secondFormula(a,b,c);
        double inputAverage = calculateInputAverage(a,b,c);
        double formulaAverage = calculateFormulaeAverage(f1,f2);
        double diff = Math.abs(inputAverage - formulaAverage);
        printResult(f1,f2,diff);
    }
    private static double calculateInputAverage(double a, double b, double c){
        double result = (a+b+c) / 3;
        return result;
    }
    private static double calculateFormulaeAverage(double firstFormula, double seconsFormula){
        double result = (firstFormula + seconsFormula) /2;
        return result;
    }
    private static double firstFormula(double a, double b, double c){
        double firstFormula = Math.pow(((a*a + b*b)/(a*a - b*b)),(a+b+c)/Math.sqrt(c));
        return firstFormula;
    }
    private static double secondFormula(double a, double b, double c){
        double secondFormula = Math.pow((a*a + b*b - Math.pow(c,3)),a-b);
        return secondFormula;
    }
    private static void printResult(double firstFormula, double secondFormula,double difference){
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstFormula,
                secondFormula,
                difference);
    }
}
