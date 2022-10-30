package com.RPG.Player.inventory;

import com.RPG.Items.Item;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Integer inventoryWeightLimit;
    private Integer actuallyInventoryWeight;
    private Integer inventoryGold = 0;

    private List<Item> itemList = new ArrayList<>();


    public Inventory(Integer inventoryWeightLimit) {
        this.inventoryWeightLimit = inventoryWeightLimit;
    }

    public Integer getInventoryWeightLimit() {
        return inventoryWeightLimit;
    }

    public Integer getInventoryGold() {
        return inventoryGold;
    }

    public boolean addItem(Item item) {
        if ((item.getWeight() + actuallyInventoryWeight) <= inventoryWeightLimit) {
            itemList.add(item);
            actuallyInventoryWeight += item.getWeight();
            return true;
        } else {
            return false;
        }
    }

    public boolean removeItem(Item item) {
        if (itemList.contains(item)) {
            itemList.remove(item);
            actuallyInventoryWeight -= item.getWeight();
            return true;
        } else {
            return false;
        }
    }

    public void useItem() {
    }
}
