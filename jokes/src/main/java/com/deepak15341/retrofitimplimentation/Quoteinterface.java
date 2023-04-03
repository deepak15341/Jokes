package com.deepak15341.retrofitimplimentation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Quoteinterface {

    @GET("random_ten")
    Call<List<Quotemodal>> getQuotes();

}
