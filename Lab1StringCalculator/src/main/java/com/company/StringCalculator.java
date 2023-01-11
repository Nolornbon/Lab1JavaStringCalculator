package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) throws Exception {
        int sum = 0;
        int number = 0;
        String temp = "";
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Character> delimiters = new ArrayList<>();
        delimiters.add('\n');
        delimiters.add(',');
        char arr[] = numbers.toCharArray();
        if (arr.length > 1 && arr[0] == '/' && arr[1] == '/') {
            int i = 2;
            while (arr[i] != '\n') {
                if (arr[i] == '[' || arr[i] == ']') {
                    i++;
                } else {
                    delimiters.add(arr[i]);
                    i++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            while (i < arr.length) {
                if (delimiters.contains(arr[i])) break;
                temp += arr[i];
                i++;
            }
            //System.out.println(temp);
            try {
                number = Integer.parseInt(temp);
                if (number > 1000) {
                    number = 0;
                }
                if (number < 0) {
                    negativeNumbers.add(number);
                }
            } catch (Exception e) {
            }

            sum += number;
            temp = "";
            number = 0;

        }
        if (negativeNumbers.size() != 0) {
            for (int num :
                    negativeNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
            throw new Exception("negatives not allowed") {

            };
        }
        return sum;
    }
}
