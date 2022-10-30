package com.RPG.Player.identity;

import com.RPG.Player.inventory.Inventory;
import com.RPG.Player.statistic.LifePoints;
import com.RPG.Player.statistic.MagicPoints;
import com.RPG.Player.statistic.StrengthPoints;

public abstract class Race {
    protected String name;
    protected LifePoints lifePoints;
    protected MagicPoints magicPoints;
    protected StrengthPoints strengthPoints;


    public Race(String name, LifePoints lifePoints, MagicPoints magicPoints, StrengthPoints strengthPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magicPoints = magicPoints;
        this.strengthPoints = strengthPoints;
    }
}
