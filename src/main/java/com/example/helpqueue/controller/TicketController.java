package com.example.helpqueue.controller;

import com.example.helpqueue.model.Ticket;
import com.example.helpqueue.service.TicketServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {

    @Autowired
    TicketServiceImp ticketService;

    @PostMapping("/create")
    public boolean addTicket(@RequestBody Ticket ticket) {
        return ticketService.create(ticket);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Ticket> getAllTickets() {
        return ticketService.readAll();
    }

    @GetMapping(path="/id")
    public Optional<Ticket> getTicketById(@RequestParam("id") Long id) {
        return ticketService.findById(id);
    }

    @GetMapping(path="/status")
    public Iterable<Ticket> getTicketByStatus(@RequestParam("status") String status) {
        System.out.println("In Status");
        return ticketService.findByTicketStatus(status);
    }

    @GetMapping(path="/author")
    public Iterable<Ticket> getTicketByAuthor(@RequestParam("author") String author) {
        return ticketService.findByTicketAuthor(author);
    }


    @GetMapping(path="/David")
    public String whatisDavid() {
        return "A bitch";
    }



}
