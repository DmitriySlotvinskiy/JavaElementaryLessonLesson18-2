package com.slotvinskiy.response_model;

import java.util.Arrays;

public class Files {

    private String[] files;

    @Override
    public String toString() {
        return files == null ? "{}" : Arrays.toString(files);

    }
}
