package com.example.helpqueue.service;

import com.example.helpqueue.model.Ticket;

import java.util.Optional;

public interface TicketService {

    boolean createTicket(Ticket ticket);

    Optional<Ticket> getTicket(Long id);

    Iterable<Ticket> getTickets(String status);

    void updateTicket(Ticket ticket);

    void deleteTicket(Long id);


}
