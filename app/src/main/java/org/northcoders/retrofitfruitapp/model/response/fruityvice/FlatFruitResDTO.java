package org.northcoders.retrofitfruitapp.model.response.fruityvice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlatFruitResDTO {

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
    private FlatFruitNutritionsResDTO nutritions;

    public FlatFruitResDTO() {
    }

    public FlatFruitResDTO(String name, int id, String family, String order, String genus, FlatFruitNutritionsResDTO nutritions) {
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

    public FlatFruitNutritionsResDTO getNutritions() {
        return nutritions;
    }

    public void setNutritions(FlatFruitNutritionsResDTO nutritions) {
        this.nutritions = nutritions;
    }
}
