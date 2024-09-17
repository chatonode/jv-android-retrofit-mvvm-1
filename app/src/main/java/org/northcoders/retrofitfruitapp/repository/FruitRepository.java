package org.northcoders.retrofitfruitapp.repository;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import org.northcoders.retrofitfruitapp.model.Fruit;
import org.northcoders.retrofitfruitapp.service.ApiService;
import org.northcoders.retrofitfruitapp.service.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FruitRepository {

//    private List<Fruit> fruits = new ArrayList<>();
    private MutableLiveData<List<Fruit>> mutableLiveFruitData = new MutableLiveData<>();
    private Application application;

    public FruitRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Fruit>> getMutableLiveFruitData() {
        ApiService apiService = RetrofitInstance.getService();
        Call<List<Fruit>> call = apiService.getAllFruits();

        call.enqueue(new Callback<List<Fruit>>() {
            @Override
            public void onResponse(Call<List<Fruit>> call, Response<List<Fruit>> response) {
                List<Fruit> fruits = response.body();
                mutableLiveFruitData.setValue(fruits);
            }

            @Override
            public void onFailure(Call<List<Fruit>> call, Throwable t) {
                Log.e("HTTP Failure", Objects.requireNonNull(t.getMessage()));
            }
        });

        return mutableLiveFruitData;
    }
}
