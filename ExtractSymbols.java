package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,}");
        Matcher match = pattern.matcher(input);
            while (match.find()){
                System.out.print(match.group(0) + " ");
            }
    }
}
