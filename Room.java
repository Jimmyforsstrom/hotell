package com.company;

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

    public boolean isRoomavailable() {

        return roomavailable;
    }

    public void setRoomavailable(boolean roomavailable) {
        this.roomavailable = roomavailable;

    }





    }



