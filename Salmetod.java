package com.company;

import java.util.Scanner;

public class Salmetod {

    //Meny 1
    public static void BokaSal(Sal[] mittHotell, Sal[] bokadeRum, int val) {
        System.out.println("<-------------Please pick one-------------->");
        Salmetod.seSalar(mittHotell, bokadeRum);
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt() - 1;
        System.out.println("Du valde " + mittHotell[val].getNamn() + " till en kostnad för " + mittHotell[val].getCost());
        bokadeRum[val] = mittHotell[val];


        scanner.nextLine();
        Startsida.menu();
    }

    //Meny 2
    public static void BokadeSalar(Sal[] mittHotell, Sal[] bokadeRum, int val) {
        System.out.println("vilket rum vill du checka ut ifrån? ");
        Salmetod.seSalar(mittHotell, bokadeRum);
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt() - 1;
        System.out.println("Du valde att boka ut från " + bokadeRum[val].getNamn()); //Ändrat till bokade rum.namn.
        System.out.println("Din räkning för rummet är " + bokadeRum[val].getCost()); //Ändrat till bokade rum kostnad

        System.out.println("<------- Nu är rummet ledigt för andra att boka --------->");

        scanner.nextLine();
        Startsida.menu();
        //Tar bort indexet från bokadeRum, samt addera det mitthotell?
    }

    //Meny 3
    public static void seSalar(Sal[] mittHotell, Sal[] bokadeRum) {
        System.out.println("Lediga rum är:");
        for (Sal s : mittHotell
        ) {
            System.out.println(s.getNamn() + " kostar " + s.getCost());
        }
        System.out.println("-----------------------");
        System.out.println("Bokade rum är:");
        for (Sal l : bokadeRum){
            System.out.println(l.getNamn()+ " kostar " + l.getCost());
        }
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Startsida.menu();
    }


}


