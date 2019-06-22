package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti suma initiala");
        int sumPlayer1 = input.nextInt();
        int sumPlayer2 = sumPlayer1;
        do{
            int miza;
            do{
                System.out.println("Introduceti miza:");
                miza = input.nextInt();
            }while(miza>sumPlayer1 || miza > sumPlayer2);
            System.out.println("Zar player1");
            int zarPlayer1= zarPlayer();
            System.out.println("Zar player2");
            int zarPlayer2= zarPlayer();
            if(zarPlayer1<zarPlayer2) {
                sumPlayer1-=miza;
                sumPlayer2+=miza;
            }else if(zarPlayer2<zarPlayer1){
                sumPlayer1+=miza;
                sumPlayer2-=miza;
            }
            System.out.println("Player 1 are "+sumPlayer1);
            System.out.println("Player 2 are "+sumPlayer2);
        }while(!(sumPlayer1==0 || sumPlayer2==0));
        if(sumPlayer1==0){
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

    private static int zarPlayer() {
        int zar1= new Random().nextInt(6)+1;
        int zar2= new Random().nextInt(6)+1;
        System.out.println(zar1+","+zar2);
        return zar1+zar2;
    }
}
