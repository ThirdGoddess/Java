package com.examplehub.projecteuler;

import com.examplehub.maths.Factorial;
import com.examplehub.maths.SumOfDigits;

public class Problem20 {
    public static int solution1(int number) {
        return SumOfDigits.sumOfDigits(Factorial.factorial(number));
    }
}
