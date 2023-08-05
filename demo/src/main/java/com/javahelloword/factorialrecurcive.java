package com.javahelloword;

public class factorialrecurcive {
    static int factorialrecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialrecurcive(value - 1);
        }
    }
}
