package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {

    public String rumsnamn;
    public int Rumskostnad;
    boolean roomavailable;

    public Room(String rumsnamn, int rumskostnad, boolean roomavailable) {
        this.rumsnamn = rumsnamn;
        Rumskostnad = rumskostnad;
        this.roomavailable = roomavailable;
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

    public boolean isRoomavailable() {
        return roomavailable;
    }

    public void setRoomavailable(boolean roomavailable) {
        this.roomavailable = roomavailable;
    }

    /* Rum 1 = dubbelrum, guldrum:
        Rum2 = dubbelrum silverrum;
         */
    public com.company.Room getRum1() {
        System.out.println("Du valde rum1");
        return getRum1();
    }



    }



