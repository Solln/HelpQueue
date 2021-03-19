package com.example.helpqueue.service;

import com.example.helpqueue.model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    boolean create(Ticket ticket);

    Optional<Ticket> findById(Long id);

    Iterable<Ticket> readAll();

    List<Ticket> findByTicketStatus(String status);

    List<Ticket> findByTicketAuthor(String author);

    void update(Long id, Ticket ticket);

    void delete(Long id);

}
