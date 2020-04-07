package com.slotvinskiy.response_model;

public class Json {

    private String foo1;
    private String foo2;

    @Override
    public String toString() {
        return "{" + "\n" +
                "   foo1=\"" + foo1 + '\"' + ",\n" +
                "   foo2=\"" + foo2 + '\"' + ",\n" +
                '}';
    }
}
