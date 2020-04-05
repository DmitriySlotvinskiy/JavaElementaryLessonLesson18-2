package com.slotvinskiy.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class MyResponseBodyClass {

    @SerializedName("args")
    @Expose
    public Args args;
    @SerializedName("data")
    @Expose
    public String data;
    @SerializedName("files")
    @Expose
    public Files files;
    @SerializedName("form")
    @Expose
    public Form form;
    @SerializedName("headers")
    @Expose
    public Headers headers;
    @SerializedName("json")
    @Expose
    public Json json;
    @SerializedName("url")
    @Expose
    public String url;


    @Override
    public String toString() {
        return "{"  + "\n" +
                "  args=" + args + ",\n" +
                "  data='" + data + '\'' + ",\n" +
                "  files=" + files + ",\n" +
                "  form=" + form + ",\n" +
                "  headers=" + headers + ",\n" +
                "  json=" + json + ",\n" +
                "  url='" + url + '\'' + ",\n" +
                '}';
    }
}

