package com.company;

public class Roomservice {

    private String roomservice;
    private int roomservicecost;


    public Roomservice(String roomservice, int roomservicecost){
        this.roomservice = roomservice;
        this.roomservicecost = roomservicecost;
    }

    public String getRoomservice() {
        return roomservice;
    }

    public void setRoomservice(String roomservice) {
        this.roomservice = roomservice;
    }

    public int getRoomservicecost() {
        return roomservicecost;
    }

    public void setRoomservicecost(int roomservicecost) {
        this.roomservicecost = roomservicecost;
    }
}
