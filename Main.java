package com.company;

import java.sql.Statement;
import java.util.*;

public class Main {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int summa = 0;

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

    while(true) {
        Startsida.menu();
        int val = scanner.nextInt();

        switch (val) {
            case 1: // få upp en lista med alla återstående tillgängliga rum
                for (String w : rumslista
                ) {
                    System.out.println(w);
                }

            {
                System.out.println("välj vilket rum du vill du boka av dessa");
                int roomselect = scanner.nextInt();
                switch (roomselect) {
                    case 1:
                        System.out.println("Du valde " + rum1.rumsnamn + " med en kostnad för " + rum1.Rumskostnad);
                        System.out.println(rum1.rumsnamn + " är nu bokat och borttaget från menyn");
                        rumslista.remove(rum1);

                }
            }
            break;
            case 2:
                break;
            case 3:
                for (String s : rumslista
                ) {
                    System.out.println(s);
                }

                break;
            case 4:

                break;
            case 5:
                summa = rum1.Rumskostnad;
                System.out.println(summa);
                break;
            case 6:
                Startsida.menu();
                break;
            default:
                System.out.println("Ej giltigt val, tryck igen");
                break;
        }
    }






    }



    }

