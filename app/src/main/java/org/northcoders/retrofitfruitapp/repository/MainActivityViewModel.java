package org.northcoders.retrofitfruitapp.repository;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.northcoders.retrofitfruitapp.model.Fruit;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private FruitRepository fruitRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.fruitRepository = new FruitRepository(application);
    }

    public LiveData<List<Fruit>> getAllFruits() {
        return fruitRepository.getMutableLiveFruitData();
    }
}
