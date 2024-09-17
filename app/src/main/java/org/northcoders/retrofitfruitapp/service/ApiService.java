package org.northcoders.retrofitfruitapp.service;

import org.northcoders.retrofitfruitapp.model.Fruit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("all")
    Call<List<Fruit>> getAllFruits();
}
