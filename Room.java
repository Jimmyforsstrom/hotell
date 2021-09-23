package com.company;

public class Room {
   public String rumsnamn;
   public int Rumskostnad;

    public Room(String rumsnamn, int rumskostnad) {
        this.rumsnamn = rumsnamn;
        Rumskostnad = rumskostnad;
    }

    public String getRumsnamn() {
        return rumsnamn;
    }

    public void setRumsnamn(String rumsnamn) {
        this.rumsnamn = rumsnamn;
    }

    public int getRumskostnad() {
        return Rumskostnad;
    }

    public void setRumskostnad(int rumskostnad) {
        Rumskostnad = rumskostnad;
    }

    public int getTillval() {
        return tillval;
    }

    public void setTillval(int tillval) {
        this.tillval = tillval;
    }

    public int tillval;






    /* Rum 1 = dubbelrum, guldrum:
    Rum2 = dubbelrum silverrum;
     */
    public Room getRum1() {
        System.out.println("Du valde rum1");
        return getRum1();
    }
}

