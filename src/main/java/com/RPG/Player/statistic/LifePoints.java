package com.RPG.Player.statistic;

public class LifePoints {
    protected Integer currentLifePoints;
    protected Integer maxLifePoints;

    public LifePoints(Integer maxLifePoints) {
        this.currentLifePoints = maxLifePoints;
        this.maxLifePoints = maxLifePoints;
    }
}
