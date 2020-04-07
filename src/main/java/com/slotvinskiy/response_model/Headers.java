package com.slotvinskiy.response_model;

public class Headers {

    private String xForwardedProto;
    private String host;
    private String contentLength;
    private String acceptEncoding;
    private String contentType;
    private String userAgent;
    private String xForwardedPort;

    @Override
    public String toString() {
        return "{" + "\n" +
                "   xForwardedProto=\"" + xForwardedProto + '\"' + ",\n" +
                "   host=\"" + host + '\"' + ",\n" +
                "   contentLength=\"" + contentLength + '\"' + ",\n" +
                "   acceptEncoding=\"" + acceptEncoding + '\"' + ",\n" +
                "   contentType=\"" + contentType + '\"' + ",\n" +
                "   userAgent=\"" + userAgent + '\"' + ",\n" +
                "   xForwardedPort=\"" + xForwardedPort + '\"' + "\n" +
                '}';
    }
}
