package com.gmail.box.avpog.function;

@FunctionalInterface
public interface GenerateNumberConsumer<T extends Number> {
    void accept(T t);
}
