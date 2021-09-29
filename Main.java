package com.company;


import java.nio.charset.StandardCharsets;
import java.time.temporal.JulianFields;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rullarMenyn = true;
        int val = 0;
        Sal[] mittHotell = new Sal[3];
        mittHotell[0] = new Sal("Jupiter", 2000);
        mittHotell[1] = new Sal("Mars", 1500);
        mittHotell[2] = new Sal("Venus", 1250);

        Sal[] bokadeRum = new Sal[3];
        bokadeRum[0] = new Sal("", 0);
        bokadeRum[1] = new Sal("", 0);
        bokadeRum[2] = new Sal("", 0);

        Roomservice[] roomservices = new Roomservice[5];
        roomservices[0] = new Roomservice("Breakfast", 100);
        roomservices[1] = new Roomservice("Lunch", 150);
        roomservices[2] = new Roomservice("Dinner", 300);
        roomservices[3] = new Roomservice("Champagne", 600);
        roomservices[4] = new Roomservice("Cheese", 150);

        Startsida.menu();

        do {
            val = scanner.nextInt();

            switch (val) {
                case 1:
                    Salmetod.BokaSal(mittHotell, bokadeRum, val);
                    break;
                case 2:
                    Salmetod.BokadeSalar(mittHotell, bokadeRum, val);
                    break;
                case 3:
                    Salmetod.seSalar(mittHotell, bokadeRum);
            }
        }  while (val != 6) ;
    }
}


