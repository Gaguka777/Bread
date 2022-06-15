package com.company;

public class Lavash extends Bread {


    public Lavash(int price, double weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Lavash " +
                "price = " + price +
                ", weight = " + weight ;
    }
    void zavernut(){
        System.out.println("Завернуть !");
    }
    void baked(){
        System.out.println("Я лаваш,меня испекли !");
    }
    void message (){
        System.out.println("Элитный лаваш !");
    }

}
