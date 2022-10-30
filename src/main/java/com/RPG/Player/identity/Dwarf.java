package com.RPG.Player.identity;

import com.RPG.Player.inventory.Inventory;
import com.RPG.Player.statistic.LifePoints;
import com.RPG.Player.statistic.MagicPoints;
import com.RPG.Player.statistic.StrengthPoints;

public class Dwarf extends Race{


    public Dwarf(String name) {
        super(name, new LifePoints(50), new MagicPoints(0), new StrengthPoints(10));
    }
}
