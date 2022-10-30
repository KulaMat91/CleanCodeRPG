package com.RPG.Player.identity;

import com.RPG.Player.inventory.Inventory;
import com.RPG.Player.statistic.LifePoints;
import com.RPG.Player.statistic.MagicPoints;
import com.RPG.Player.statistic.StrengthPoints;

public class Elf extends Race{
    public Elf(String name) {
        super(name, new LifePoints(40), new MagicPoints(30), new StrengthPoints(5));
    }
}
