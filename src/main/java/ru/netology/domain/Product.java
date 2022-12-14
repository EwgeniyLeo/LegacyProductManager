package ru.netology.domain;

public class Product {

    protected int id;
    protected String name;
    protected int price;

    public Product (int id, int price){
        this. id = id;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
