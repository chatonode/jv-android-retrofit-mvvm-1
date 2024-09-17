package org.northcoders.retrofitfruitapp;

import android.app.Application;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import org.northcoders.retrofitfruitapp.model.Fruit;
import org.northcoders.retrofitfruitapp.repository.FruitRepository;
import org.northcoders.retrofitfruitapp.repository.MainActivityViewModel;
import org.northcoders.retrofitfruitapp.ui.adapter.FruitAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Fruit> fruitList;
    private FruitAdapter fruitAdapter;
//    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // Debugging
//        Application application = new Application();
//        FruitRepository fruitRepository = new FruitRepository(application);
//        fruitRepository.getMutableLiveFruitData();

        viewModel = new ViewModelProvider(this)
                .get(MainActivityViewModel.class);

        getAllFruits();
    }

    private void getAllFruits() {
        viewModel.getAllFruits().observe(this, new Observer<List<Fruit>>() {
            @Override
            public void onChanged(List<Fruit> fruits) {
                fruitList = fruits;

                displayFruitsInRecyclerView();
            }
        });
    }

    private void displayFruitsInRecyclerView() {
//        recyclerView = binding
    }
}