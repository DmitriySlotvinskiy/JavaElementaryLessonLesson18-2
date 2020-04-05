package com.slotvinskiy.response;

import java.util.Arrays;

public class Files {

    String[] files;

    @Override
    public String toString() {
        return files == null ? "{}" : Arrays.toString(files);

    }
}
