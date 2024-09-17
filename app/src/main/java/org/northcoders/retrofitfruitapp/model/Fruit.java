package org.northcoders.retrofitfruitapp.model;

import com.google.gson.annotations.SerializedName;

public class Fruit {

    @SerializedName(value = "name")
    private String name;
    @SerializedName(value = "id")
    private int id;
    @SerializedName(value = "family")
    private String family;
    @SerializedName(value = "order")
    private String order;
    @SerializedName(value = "genus")
    private String genus;
    @SerializedName(value = "nutritions")
    private Nutritions nutritions;

    public Fruit() {
    }

    public Fruit(String name, int id, String family, String order, String genus, Nutritions nutritions) {
        this.name = name;
        this.id = id;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }
}
