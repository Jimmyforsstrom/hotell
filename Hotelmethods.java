package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotelmethods {
    private ArrayList rumslista;
    Scanner scanner = new Scanner(System.in);


    public Hotelmethods(ArrayList rumslista) {
        this.rumslista = rumslista;
    }


    //booking
    public void booking(){
        System.out.println("Book a room:");

        for (int i = 0; i < rumslista.length; i++)
        if (rumslista.equals(true)){
            System.out.println(i);

        }else if (rumslista.equals(false)) {
            System.out.println(rumslista);

        }
    }


    //available rooms
    //list all rooms
    //checkout
    // add roomservice


}
