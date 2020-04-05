package com.slotvinskiy.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Headers {

    @SerializedName("x-forwarded-proto")
    @Expose
    public String xForwardedProto;
    @SerializedName("host")
    @Expose
    public String host;
    @SerializedName("content-length")
    @Expose
    public String contentLength;
    @SerializedName("accept-encoding")
    @Expose
    public String acceptEncoding;
    @SerializedName("content-type")
    @Expose
    public String contentType;
    @SerializedName("user-agent")
    @Expose
    public String userAgent;
    @SerializedName("x-forwarded-port")
    @Expose
    public String xForwardedPort;

    @Override
    public String toString() {
        return "{"  + "\n" +
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
