package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Hotelmethods {
    private ArrayList rumslista;
    Scanner scanner = new Scanner(System.in);


    public Hotelmethods(ArrayList rumslista) {
        this.rumslista = rumslista;
    }


    //booking
    public void booking() {
      //  System.out.println("Book a room:");
     //   for (int i = 0; i < rumslista.size(); i++) {
     //       System.out.println(i);

        Iterator itr = rumslista.iterator();
        while (itr.hasNext()) {
            Room rum = (Room) itr.next();
            System.out.println("rum " + rum.rumsnamn + " med en kostnad på " + rum.Rumskostnad);

        }

        //  }else if (rumslista.equals(false)) {
        //    System.out.println(rumslista);

    } public void AvaliableRoom () {
        System.out.println("This is all valiable rooms");
        //se en lista på alla upptagna rum
        //se en lista på all lediga rum
    }

    public void Checkout () {
        System.out.println("Which room would you like to check out from?");
        //loopa ut alla tagna rum
    }
}




    //available rooms
    //list all rooms
    //checkout
    // add roomservice /remove roomservice



