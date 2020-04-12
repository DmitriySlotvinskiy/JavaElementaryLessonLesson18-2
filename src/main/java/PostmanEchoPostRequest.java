//2) Программно послать POST запрос на https://postman-echo.com/post
// где в BODY передать foo1=bar1&foo2=bar2 в формате x-www-form-urlencoded
//
//Ответ распарсить и вывести.

import com.google.gson.Gson;
import com.slotvinskiy.response_model.MyResponseBodyClass;
import okhttp3.*;

import java.io.IOException;

public class PostmanEchoPostRequest {

    public static final String URL = "https://postman-echo.com/post";

    public static void main(String[] args) {

        String responseJson = post();
        Gson gson = new Gson();
        MyResponseBodyClass myResponseBodyClass = gson.fromJson(responseJson, MyResponseBodyClass.class);
        System.out.println(myResponseBodyClass);

    }

    private static String post() {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        String postBody = "foo1=bar1&foo2=bar2";
        RequestBody requestBody = RequestBody.create(
                MediaType.parse("application/x-www-form-urlencoded"), postBody);
        Request request = new Request.Builder()
                .url(URL)
                .post(requestBody)
                .build();
        String responseBody = new String();
        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            responseBody = response.body().string();

//            System.out.println(responseBody);// Here you can check original Json response
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseBody;
    }
}
