package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Bread bread = new Bread(22,300);
        System.out.println(bread);
        bread.pack();
        bread.bake();
        System.out.println(" ");

        Lepeshka lepeshka = new Lepeshka(22,150,16);
        System.out.println(lepeshka);
        lepeshka.bake();
        lepeshka.pack();
        lepeshka.vanish();
        lepeshka.printPatterns();

        if(lepeshka.getWeight()==0){
            System.out.println("Подделка");

        System.out.println( " ");

        Lavash lavash = new Lavash(18,152);
        System.out.println(lavash);
        lavash.message();
        lavash.baked();
        lavash.zavernut();

        System.out.println();

        Baget baget = new Baget(56,260,54.2,7);
        System.out.println(baget);
        baget.rubzevat();
        baget.pack();

         }





    }
}
