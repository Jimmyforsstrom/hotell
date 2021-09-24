package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);


        Room rum1 = new Room("Jupiter", 3000, true);
        Room rum2 = new Room("Mars", 1600,true);
        Room rum3 = new Room("Tellus", 1600,true);
        Room rum4 = new Room("Pluto", 1600,true);



        List<String> rumslista = new ArrayList();
        rumslista.add("Rum 1 " + rum1.rumsnamn +  "- Pris per natt " +  rum1.Rumskostnad);
        rumslista.add("Rum 2 " + rum2.rumsnamn + "- Pris per natt  " +  rum2.Rumskostnad);
        rumslista.add("Rum 3 " + rum3.rumsnamn + "- Pris per natt  " +  rum3.Rumskostnad);
        rumslista.add("Rum 4 " + rum4.rumsnamn + "- Pris per natt  " +  rum4.Rumskostnad);

        //Skapade objekt ligger nu i rumslista.

        List<Room> bokadeRum = new ArrayList();
        bokadeRum.add(rum1);
        bokadeRum.add(rum2);
        bokadeRum.add(rum3);
        bokadeRum.add(rum4);











    }



    }

