package designPatterns.example.StrategyPattern.Repository.Entities;

import designPatterns.example.StrategyPattern.Repository.Entities.Interfaces.CouponInterface;

public class Coupon implements CouponInterface{
    private int id;
    private String name;

    public Coupon(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}