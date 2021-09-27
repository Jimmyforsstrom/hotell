package com.company;

import java.util.List;
import java.util.Scanner;

public class Hotelmethods {
    private List<Room> rumslista;




    Scanner scanner = new Scanner(System.in);


    public Hotelmethods(List<Room> rumslista) {
        this.rumslista = rumslista;
    }


    //booking

    public void booking() {
        System.out.println("Book a room:");
        for (int i = 0; i < rumslista.size(); i++)
            if (rumslista.equals(true)) {
                System.out.println(i);
                int menu = 0;
                menu = scanner.nextInt();
                rumslista.get(menu - 1);
                rumslista.get(rumslista.indexOf(rumslista)).setRoomavailable(false);
                /*scanner.nextInt(rumslista.indexOf(rumslista));
                rumslista.get(rumslista.indexOf(rumslista)).setRoomavailable(false);

                 */
            }

       /* Iterator itr = rumslista.iterator();
        while (((Iterator<?>) itr).hasNext()) {
            Room rum = (Room) itr.next();
            System.out.println("rum " + rum.rumsnamn + " med en kostnad på " + rum.Rumskostnad);

        }

        */

    }
       /* public void AvaliableRoom () {
            System.out.println("This is all valiable rooms");
            //se en lista på alla upptagna rum
            //se en lista på all lediga rum
        }

        public void Checkout () {
            System.out.println("Which room would you like to check out from?");
            //loopa ut alla tagna rum
        }

        */
    }





    //available rooms
    //list all rooms
    //checkout
    // add roomservice



