package com.deepak15341.retrofitimplimentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecycerView;
    private List<Quotemodal> mQuotemodalList =new ArrayList<>();
    private  PQAdapter mPQAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycerView = findViewById(R.id.recyclerRow);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        mRecycerView.setLayoutManager(linearLayoutManager);
        mPQAdapter =new PQAdapter(this,mQuotemodalList);
        mRecycerView.setAdapter(mPQAdapter);

        requestQuotes();
    }

    private void requestQuotes() {

        Quoteinterface quoteinterface = RetrofitServiceGenerator.createRetrofitService(Quoteinterface.class);

        Call<List<Quotemodal>> call = quoteinterface.getQuotes();
        call.enqueue(new Callback<List<Quotemodal>>() {
            @Override
            public void onResponse(Call<List<Quotemodal>> call, Response<List<Quotemodal>> response) {

                if(response.isSuccessful()){
                    for(Quotemodal Quote : response.body()){
                        mQuotemodalList.add(Quote);
                    }
                    mPQAdapter.notifyDataSetChanged();
                }
                else {
                    Log.e(TAG, response.message() );
                }
            }

            @Override
            public void onFailure(Call<List<Quotemodal>> call, Throwable t) {
                Log.e(TAG, t.getMessage() );
            }
        });
    }
}