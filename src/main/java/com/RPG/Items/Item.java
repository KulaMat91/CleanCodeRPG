package com.RPG.Items;

public abstract class Item {
    protected String name;
    protected Integer goldValue;
    protected Integer weight;

    public Item(String name, Integer goldValue, Integer weight) {
        this.name = name;
        this.goldValue = goldValue;
        this.weight = weight;
    }

    public Integer getGoldValue() {
        return goldValue;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
