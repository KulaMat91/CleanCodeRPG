package com.RPG.Items;

import com.RPG.Player.statistic.StrengthPoints;

public class Sword extends Item {
    private StrengthPoints strengthPoints;

    public Sword(String name, Integer goldValue, Integer weight, StrengthPoints strengthPoints) {
        super(name, weight, goldValue);
        this.strengthPoints = strengthPoints;
    }

    public StrengthPoints getStrengthPoints() {
        return strengthPoints;
    }

}
