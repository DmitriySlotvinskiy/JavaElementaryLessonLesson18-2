package com.slotvinskiy.response;

import com.google.gson.annotations.Expose;

import java.util.Arrays;

public class Args {

    @Expose
    public String[] args;


    @Override
    public String toString() {
        return args == null ? "{}" : Arrays.toString(args);
    }
}
