package com.company;

public class Baget extends Bread {
    private double length;
    private int quantitySlice;

    public Baget(int price, double weight, double length, int quantitySlice) {
        super(price, weight);
        this.length = length;
        this.quantitySlice = quantitySlice;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getQuantitySlice() {
        return quantitySlice;
    }

    public void setQuantitySlice(int quantitySlice) {
        this.quantitySlice = quantitySlice;
    }
    void rubzevat(){
        System.out.println("Рубцевать !");
    }
    void pack(){
        System.out.println("В экологичный пакет !");
    }

    @Override
    public String toString() {
        return "Baget " +
                "length = " + length +
                ", quantitySlice = " + quantitySlice +
                ", price ="  + price +
                ", weight = " + weight;
    }
}
