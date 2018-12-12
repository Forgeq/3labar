package com.company;

public class Main {
    public static void main(String[] args) {
        farmЕheorem();
        EQUATION();
    }

    public static void farmЕheorem() {
        int test; // проверка результата
        int n = 2;
        for(int c = 1; c < 100; ++c)
            for (int a = 1; a <= 10; ++a)
                for (int b = 1; b <= 10; ++b) {
                   test = (int) (Math.pow(a, n) + Math.pow(b, n)); // преоброзование в целое число
                    if (test <= 100 && test == Math.pow(c, n)) {
                        System.out.println(a+"^" + n + " + " + b + "^" + n + " = "+ test);
                    }
                }
    }

    public static void EQUATION () {
        double result = 0;
        for(double i = 1; i < 10000; ++i){
            if (i % 2 == 0) {
                result -= 1/(i);
            }
            else {
                result += 1/(i);
            }
        }
        System.out.print("\nРезультат = " + result);
    }
}