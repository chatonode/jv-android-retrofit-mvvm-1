package org.northcoders.retrofitfruitapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.northcoders.retrofitfruitapp.R;
import org.northcoders.retrofitfruitapp.model.Fruit;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitItemViewHolder> {
    List<Fruit> fruitItems;

    public FruitAdapter(List<Fruit> fruitItems) {
        this.fruitItems = fruitItems;
    }

    @NonNull
    @Override
    public FruitItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.fruit_item_layout, parent, false);

        return new FruitItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitItemViewHolder holder, int position) {
        Fruit fruitItem = fruitItems.get(position);

        holder.fruitItemId.setText(String.valueOf(fruitItem.getId()));
        holder.fruitItemName.setText(fruitItem.getName());
        holder.fruitItemCalories.setText(String.valueOf(fruitItem.getNutritions().getCalories()));
    }

    @Override
    public int getItemCount() {
        return fruitItems.size();
    }

    public static class FruitItemViewHolder extends RecyclerView.ViewHolder {
        TextView fruitItemId, fruitItemName, fruitItemCalories;

        public FruitItemViewHolder(@NonNull View itemView) {
            super(itemView);

            fruitItemId = itemView.findViewById(R.id.textView_fruit_item_id);
            fruitItemName = itemView.findViewById(R.id.textView_fruit_item_name);
            fruitItemCalories = itemView.findViewById(R.id.textView_fruit_item_calories_value);
        }
    }

}
