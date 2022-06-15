package com.company;

public class Bread {
    int price;
    double weight;

    void bake(){
        System.out.println("Испечь !");
    }
    void pack(){
        System.out.println("Упаковать ! ");
    }

    public Bread(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread " +
                "price = " + price +
                ", weight = " + weight ;
    }
}
