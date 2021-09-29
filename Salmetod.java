package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Salmetod {

    //Meny 1
    public static void BokaSal(Sal[] mittHotell, Sal[] bokadeRum, int val) {
        System.out.println("<-------------Please pick one-------------->");
       // Salmetod.seSalar(mittHotell, bokadeRum);
        int sort = 1;
        for (Sal s: mittHotell
             )  { if(s.isOckuperat() == false)
            System.out.println(s.getNamn() + " och kostar per natt " + s.getCost());
            else if (s.isOckuperat() == true){
            System.out.println(s.getNamn() + " är bokat och kan inte bokas");
        }
        }

        Scanner scanner = new Scanner(System.in);
        val = scanner.nextInt() - 1;
        if (mittHotell[val].isOckuperat()) {
            System.out.println("Detta rum är redan ockuperat, vänligen välj ett annat ");
        }
        else {
        System.out.println("Du valde " + mittHotell[val].getNamn() + " till en kostnad för " + mittHotell[val].getCost());
        mittHotell[val].setOckuperat(true); }
      //  bokadeRum[val] = mittHotell[val];
     //   bokadeRum[0] = mittHotell[val];

        System.out.println("Vill du gå tillbaka till huvudmenyn J/N ?");
        String svar = scanner.next().toUpperCase();

        if (svar.equals("J")) {Startsida.menu();}
        else {
            System.out.println("Kund inbokad ");



     /*   System.out.println("Nu loopas bokade rum ut");
        for (Sal s: bokadeRum
             ) {
            System.out.println(s.getNamn());
*/
        }

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

        Startsida.menu();
        //Tar bort indexet från bokadeRum, samt addera det mitthotell?
    }


    //Meny 3
    public static void seSalar(Sal[] mittHotell, Sal[] bokadeRum) {
        System.out.println("Alla rum är nedan ");
        for (Sal s : mittHotell)
        {
            System.out.println(s.getNamn() + " och kostar " + s.getCost());
        }
    //    System.out.println("Alla bokade rum är nedan ");
        for (Sal d: bokadeRum)
        {
            System.out.println(d.getNamn() + " är bokat");
        }
        System.out.println("-----------------------");
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Tryck valfri knapp för att komma tillbaka till meny ");
      //  scanner.nextLine();
      //  Startsida.menu();
    }


    public static void roomservice(Sal[] bokadeRum, Roomservice[] roomservices){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a room to add or remove roomservice to");
        for (Sal s : bokadeRum)
        System.out.println(s.getNamn());
        int roomChoice = scanner.nextInt() - 1;
        System.out.println("You chose " + bokadeRum[roomChoice].getNamn());

        System.out.println("Press 1 to add roomservice\n" + "Press 2 to remove roomservice");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Choose roomservice to add to the room");
            for (Roomservice t : roomservices)
                System.out.println(t.getRoomservice()+ " " + t.getRoomservicecost());
                int servicechoice = scanner.nextInt();
                roomservices[roomChoice].getRoomservice();

            System.out.println(roomservices[servicechoice].getRoomservicecost() + " kommer att läggas på din rumsnota");
             int value =  bokadeRum[roomChoice].getCost();
             int value2 =  roomservices[servicechoice].getRoomservicecost();
             int totalValue =    value + value2;

            System.out.println("total charge is " + totalValue);


                roomservices[servicechoice].setChosen(false);






        }else if (choice == 2){
            for (Roomservice f : roomservices);


        }



    }




}


