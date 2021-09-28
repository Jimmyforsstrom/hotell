package com.company;

import java.util.Scanner;

public class Salmetod {


    public static void seSalar(Sal[]mittHotell, Sal[]bokadeRum) {
        for (Sal s: mittHotell
        ) {
            System.out.println(s.getNamn());
        }
    }
    public static void BokaSal (Sal[]mittHotell, Sal[]bokadeRum, int val) {
        System.out.println("<-------------Please pick one-------------->");
        Salmetod.seSalar(mittHotell, bokadeRum);
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt() -1;
        System.out.println("Du valde " +mittHotell[val].getNamn()+ " till en kostnad för " + mittHotell[val].getCost());
    }

    public static void BokadeSalar(Sal[] mittHotell, Sal[] bokadeRum, int val) {
        System.out.println("vilket rum vill du boka ut ifrån? ");
        Salmetod.seSalar(mittHotell, bokadeRum);
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt()-1;
        System.out.println("Du valde att boka ut från "+ mittHotell[val].getNamn());
        System.out.println("Din räkning för rummet är " + mittHotell[val].getCost());
        //Tar bort indexet från bokaRum, samt addera det mitthotell?
    }
}


