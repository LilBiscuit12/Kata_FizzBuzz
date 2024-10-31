package org.example;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        class FizzBuzz {
            public static String fizzBuzz(int numero) {
                if (numero % 15 == 0) {
                    return "FizzBuzz";
                } else if (numero % 3 == 0) {
                    return "Fizz";
                } else if (numero % 5 == 0) {
                    return "Buzz";
                } else {
                    return String.valueOf(numero);

                }
            }

            public static
            void main(String[] args) {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(fizzBuzz(i));
                }
            }
        }
    }

}