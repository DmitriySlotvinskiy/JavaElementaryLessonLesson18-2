package com.slotvinskiy.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Json {

    @SerializedName("foo1")
    @Expose
    public String foo1;
    @SerializedName("foo2")
    @Expose
    public String foo2;

    @Override
    public String toString() {
        return "{" + "\n" +
                "   foo1=\"" + foo1 + '\"' + ",\n" +
                "   foo2=\"" + foo2 + '\"' + ",\n" +
                '}';
    }
}
