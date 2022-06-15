package com.company;

public class Lepeshka extends Bread{
   private double rarius;

    public Lepeshka(int price, double weight, double rarius) {
        super(price, weight);
        this.rarius = rarius;
    }

    private double getRarius() {
        return rarius;
    }

    private void setRarius(double rarius) {
        this.rarius = rarius;
    }

   void vanish(){
        System.out.println("Лакировать !");
    }
    void printPatterns(){
        System.out.println("Нанести узоры !");
    }

    @Override
    public String toString() {
        return "Lepeshka " +
                "price  =" + price +
                ", weigh t= " + weight +
                ", rarius = " + rarius ;
    }




    }

