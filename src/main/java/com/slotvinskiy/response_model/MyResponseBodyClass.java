package com.slotvinskiy.response_model;

public class MyResponseBodyClass {

    private Args args;
    private String data;
    private Files files;
    private Form form;
    private Headers headers;
    private Json json;
    private String url;

    @Override
    public String toString() {
        return "{" + "\n" +
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

