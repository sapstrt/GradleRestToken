package com.example.gradleresttoken;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

/**
 * Created by vvarm1 on 10/23/13.
 */
public class RestClient {
    HttpClient client;
    private static final RestClient restClient=new RestClient();
    private RestClient(){
        client=new DefaultHttpClient();
    }
    public static RestClient getInstance(){
        return restClient;
    }
    public HttpResponse executeRequest(HttpUriRequest request) throws IOException {
        String token="";
        request.addHeader("token",token);
        return client.execute(request);
    }
}
