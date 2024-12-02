package com.gmail.box.avpog;

import com.gmail.box.avpog.function.*;


import java.time.LocalDate;

import static java.lang.Math.sqrt;

public class App {
    public static void main(String[] args) {
        //
        FibonacciCalcUnaryOperator<Integer> fibonacci = n -> {
            if (n <= 1) return n;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int next = a + b;
                a = b;
                b = next;
            }
            return b;
        };

        System.out.println(fibonacci.calculate(10));

        //
        DoubleToLongRoundFunction dToLong = n -> (long) Math.round(n);
        System.out.println(dToLong.apply(25.4));

        //
        GenerateNumberConsumer<Number> genNumBefore = n -> {
            Double d = n.doubleValue();
            Integer generated = (int) Math.round((Math.random() * d));
            System.out.println("Generated: " + generated);
        };

        genNumBefore.accept(2.2);

        //
        IsSimpleNumbersPredicate<Integer> isSimple = n -> {
            if (n < 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(isSimple.test(4));

        //
        WeekDaySupplier weekDay = () -> LocalDate.now().getDayOfWeek();
        System.out.println(weekDay.get());
    }
}
