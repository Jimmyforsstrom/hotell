package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int summa = 0;
        Room rum1 = new Room("Jupiter", 3000);
        Room rum2 = new Room("Mars", 1600);

        List<String> rumslista = new ArrayList();
        rumslista.add(rum1.rumsnamn + " med en kostnad på " +  rum1.Rumskostnad);
    Startsida.menu();
    int val = scanner.nextInt();

    switch (val) {
        case 1:
            System.out.println(rumslista);

        break;
        case 2:
            break;
        case 3:
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

