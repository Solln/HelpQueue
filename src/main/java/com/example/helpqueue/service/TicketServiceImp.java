package com.example.helpqueue.service;

import com.example.helpqueue.model.Ticket;
import com.example.helpqueue.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Optional;
import java.util.List;


@Service
public class TicketServiceImp implements TicketService{

    @Autowired
    private TicketRepository ticketRepo;

    @Override
    public boolean create(Ticket ticket) {
        //TODO logic for if save fails
        this.ticketRepo.save(ticket);
        return true;
    }

    @Override
    public Iterable<Ticket> readAll(){
        return this.ticketRepo.findAll();
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return ticketRepo.findById(id);
    }

    @Override
    public List<Ticket> findByTicketStatus(String status) {
        return ticketRepo.findByStatus(status);
    }

    @Override
    public List<Ticket> findByTicketAuthor(String author) {
        return ticketRepo.findByAuthor(author);
    }

    @Override
    public void update(Long id, Ticket ticket) {

    }

    @Override
    public void delete(Long id) {

    }
}
