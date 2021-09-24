package com.company;

import java.sql.Statement;
import java.util.*;

public class Main {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int summa = 0;
        boolean Exit = true;

        Room rum1 = new Room("Jupiter", 3000, true);
        Room rum2 = new Room("Mars", 1600,true);
        Room rum3 = new Room("Tellus", 1600,true);
        Room rum4 = new Room("Pluto", 1600,true);
        Room rum5 = new Room("Saturnus", 3000,true);
        Room rum6 = new Room("Venus", 1600,true);


        List<String> rumslista = new ArrayList();
        rumslista.add("Rum 1 " + rum1.rumsnamn +  "- Pris per natt " +  rum1.Rumskostnad);
        rumslista.add("Rum 2 " + rum2.rumsnamn + "- Pris per natt  " +  rum2.Rumskostnad);
        rumslista.add("Rum 3 " + rum3.rumsnamn + "- Pris per natt  " +  rum3.Rumskostnad);
        rumslista.add("Rum 4 " + rum4.rumsnamn + "- Pris per natt  " +  rum4.Rumskostnad);
        rumslista.add("Rum 5 " + rum5.rumsnamn + "- Pris per natt  " +  rum5.Rumskostnad);
        rumslista.add("Rum 6 " + rum6.rumsnamn + "- Pris per natt  " +  rum6.Rumskostnad);

        //Skapade objekt ligger nu i rumslista.

        List<Room> BokadeRum = new ArrayList();


    while(Exit) {
        Startsida.menu();
        int val = scanner.nextInt();

        switch (val) {
            case 1: // få upp en lista med alla återstående tillgängliga rum
                for (String w : rumslista)


                System.out.println("välj vilket rum du vill du boka av dessa");
                int roomselect = scanner.nextInt();

                switch (roomselect) {
                    case 1:
                        //Skickas till bokningssidan , booking(int x);
                        if (rumslista.contains(rum1) == true) ;
                        System.out.println("Du valde " + rum1.rumsnamn + " med en kostnad för " + rum1.Rumskostnad);
                        System.out.println(rum1.rumsnamn + " är nu bokat och borttaget från menyn");
                        System.out.println();
                        rumslista.remove(0);
                        break;
                    case 2:
                        System.out.println("Du valde " + rum2.rumsnamn + " med en kostnad för " + rum2.Rumskostnad);
                        rumslista.remove(1);

                        System.out.println();
                        break; }

            case 2:
                for (String x: BokadeRum
                     ) {
                    System.out.println(x);
                    System.out.println("Inga bokade rum");

                } break;
            case 3:
                for (String s : rumslista
                ) {
                    System.out.println(s);
                }
                System.out.println();
                break;
            case 4:

                break;
            case 5:
                summa = rum1.Rumskostnad;
                System.out.println(summa);
                break;
            case 6:
                System.out.println("Du loggas nu ur systemet");
                Exit = false;
                break;
            default:
                System.out.println("Ej giltigt val, tryck igen");
                break;
        }
    }






    }



    }

