package com.example.gradleresttoken;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import java.net.URI;

/**
 * Created by vvarm1 on 10/23/13.
 */
public class RequestMaker {
    private HttpUriRequest request;
    public enum METHOD{
        GET,POST;
    }
    public RequestMaker(METHOD method,URI uri){
        switch (method){
            case GET:request=new HttpGet(uri);break;
            case POST:request=new HttpPost(uri);break;
        }
    }
    public void payload(String attr,String json){
        HttpParams params=new BasicHttpParams();
        params.setParameter(attr,json);
       request.setParams(params);
    }
    

}
