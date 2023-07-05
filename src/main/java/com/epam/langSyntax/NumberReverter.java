package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int last = number % 10;
        int middle = number  % 100 - last;
        int first = number % 1000 - middle - last;

        int result = last * 100 + middle + first / 100;

        System.out.println(result);
    }

}
