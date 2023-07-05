package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int reminder = number % 10;
        number /= 10;
        int sum = reminder;

        reminder = number % 10;
        number /= 10;
        sum += reminder;

        reminder = number % 10;
        number /= 10;
        sum += reminder;

        reminder = number % 10;
        number /= 10;
        sum += reminder;

        System.out.println(sum);
    }

}
