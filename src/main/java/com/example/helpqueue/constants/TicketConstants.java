package com.example.helpqueue.constants;

import java.util.Map;

public class TicketConstants {

    private Map<String,String> ticketStatus;

    public TicketConstants(Map<String,String> ticketStatusValues){
        this.ticketStatus = ticketStatusValues;
    }

    public  Map<String,String> getTicketStatus(){
        return this.ticketStatus;
    }
}

