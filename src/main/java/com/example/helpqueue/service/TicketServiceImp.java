package com.example.helpqueue.service;

import com.example.helpqueue.constants.TicketConstants;
import com.example.helpqueue.model.Ticket;
import com.example.helpqueue.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TicketServiceImp implements TicketService{

    @Autowired
    private TicketRepository ticketRepo;

    @Autowired
    private TicketConstants ticketConstants;

    @Override
    public boolean createTicket(Ticket ticket) {
        //TODO logic for if save fails
        this.ticketRepo.save(ticket);
        return true;
    }

    //getTickets
        //Get All with no params

    @Override
    public Iterable<Ticket> getTickets(String status){
        // Checks for values in here
        if (status != null){
            return this.ticketRepo.findByStatus(status);
        } else {
            return this.ticketRepo.findAll();
        }
    }

    @Override
    public Optional<Ticket> getTicket(Long id) {
        return ticketRepo.findById(id);
    }

    @Override
    public void updateTicket(Ticket updatedTicket) {
//        Ticket originalticket = ticketRepo.findById(updatedTicket.getId()).get();
        ticketRepo.save(updatedTicket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepo.deleteById(id);
    }

}
