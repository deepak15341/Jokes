package com.deepak15341.retrofitimplimentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServiceGenerator {

    private final static String BASE_API_URL = "https://programming-quotes-api.herokuapp.com/";
    private static Retrofit mRetrofit=null;
    private static Gson gson =new GsonBuilder().create();

    private  static HttpLoggingInterceptor httpLoggingInterceptor =new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder okhttpClientBuilder =new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);

    private static  OkHttpClient okHttpClient =okhttpClientBuilder.build();

   protected static <T> T createRetrofitService(Class<T> serviceClass){
        if(mRetrofit==null){
            mRetrofit=new Retrofit.Builder().client(okHttpClient).baseUrl(BASE_API_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return mRetrofit.create(serviceClass);
    }
}
