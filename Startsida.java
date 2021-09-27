package com.company;

import java.util.Scanner;

public class Startsida {


    public static int menu() {

        System.out.println("1. Boka ett tillgängligt rum");
        System.out.println("2. Checka ut från ett rum");
        System.out.println("3. Se alla rum");
        System.out.println("4. Lägga till alt ta bort roomservice från något rum");
        System.out.println("5. Få notan för ett valt rum");
        System.out.println("6. Avsluta");

        return 0;
    }
    public static void menuOptions(){
        Scanner scanner = new Scanner(System.in);
        boolean inuse = true;
        while (inuse){
            int choice = menu();
            scanner.nextInt();
            switch (choice){
                case 1:
            }
        }
    }

}
