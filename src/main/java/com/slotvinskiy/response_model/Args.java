package com.slotvinskiy.response_model;

import java.util.Arrays;

public class Args {

    private String[] args;

    public String toString() {
        return args == null ? "{}" : Arrays.toString(args);
    }
}
