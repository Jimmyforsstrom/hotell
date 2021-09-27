package com.company;

import java.util.List;
import java.util.Scanner;

public class Startsida {
    private List<Room> rumslista;

    private static Scanner scanner = new Scanner(System.in);
    public static int menu() {

        System.out.println("1. Boka ett tillgängligt rum");
        System.out.println("2. Checka ut från ett rum");
        System.out.println("3. Se alla rum");
        System.out.println("4. Lägga till alt ta bort roomservice från något rum");
        System.out.println("5. Få notan för ett valt rum");
        System.out.println("6. Avsluta");
        int choice = scanner.nextInt();
        return choice;


    }
    public static void menuOptions(){
        System.out.println(menu());

        boolean inuse = true;
        while (inuse){
            int choice = menu();
            scanner.nextInt();
            switch (choice){
                case 1: Hotelmethods test = new Hotelmethods();
                test.booking();
            }
        }
    }
    public Startsida(List<Room> rumslista) {
        this.rumslista = rumslista;
    }

}
