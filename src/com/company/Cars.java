package com.company;

public class Cars {
    private Long id;
    private String name;
    private int price;
    private double volume;

    public Cars() {
    }

    public Cars(Long id, String name, int price, double volume) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}
