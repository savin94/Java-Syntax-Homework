package com.company;

import java.lang.reflect.Array;
import java.util.*;


public class RandomizeNumbersInRangeNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer min = input.nextInt();
        Integer max = input.nextInt();
        Integer smallerNumber = Integer.min(min, max);
        Integer biggerNumber = Integer.max(min, max);
        Random randomGenerator = new Random();
        List<Integer> randomizedNumbers = new ArrayList<Integer>();
        randomizeNumbers(smallerNumber, biggerNumber, randomizedNumbers);

        System.out.println(Arrays.toString(randomizedNumbers.toArray()));
    }

    private static void randomizeNumbers(int smallerNumber, int biggerNumber, List<Integer> randomizedNumbers) {
        Random randomGenerator = new Random();

        for (int i = 0; i <= biggerNumber - smallerNumber; i++) {
            Integer randomNumber = randomGenerator.nextInt(biggerNumber - smallerNumber + 1) + smallerNumber;
            while (randomizedNumbers.contains(randomNumber)) {
                randomNumber = randomGenerator.nextInt(biggerNumber - smallerNumber + 1) + smallerNumber;
            }
            randomizedNumbers.add(randomNumber);

        }
    }
}