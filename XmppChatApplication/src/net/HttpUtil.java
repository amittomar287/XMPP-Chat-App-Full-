package net;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.Map;

/**
 * Created by Administrator on 2015/1/22.
 */
public class HttpUtil {
    static HttpClient httpClient = new DefaultHttpClient();
    public String httpGet(String url,Map<String,String> paras){
        HttpGet httpGet = new HttpGet(url);
        return "";
    }
}
