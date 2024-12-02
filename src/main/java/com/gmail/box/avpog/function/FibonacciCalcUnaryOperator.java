package com.gmail.box.avpog.function;

@FunctionalInterface
public interface FibonacciCalcUnaryOperator<T extends Number> {
    T calculate (T n);
}
