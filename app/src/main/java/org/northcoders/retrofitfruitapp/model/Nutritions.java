package org.northcoders.retrofitfruitapp.model;

import com.google.gson.annotations.SerializedName;

public class Nutritions {

    @SerializedName(value = "calories")
    private int calories;
    @SerializedName(value = "fat")
    private double fat;
    @SerializedName(value = "sugar")
    private double sugar;
    @SerializedName(value = "carbohydrates")
    private double carbohydrates;
    @SerializedName(value = "protein")
    private double protein;

    public Nutritions() {}

    public Nutritions(int calories, double fat, double sugar, double carbohydrates, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
