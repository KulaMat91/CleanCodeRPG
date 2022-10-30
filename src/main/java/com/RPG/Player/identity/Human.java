package com.RPG.Player.identity;

import com.RPG.Player.inventory.Inventory;
import com.RPG.Player.statistic.LifePoints;
import com.RPG.Player.statistic.MagicPoints;
import com.RPG.Player.statistic.StrengthPoints;

public class Human extends Race{
    public Human(String name) {
        super(name, new LifePoints(45), new MagicPoints(20), new StrengthPoints(8));
    }
}
