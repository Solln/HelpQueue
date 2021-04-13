package com.example.helpqueue.configurations;

import com.example.helpqueue.constants.TicketConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class DatabaseConfiguration {

    @Value("#{${database.tickets.elements.status}}")
    private Map<String, String> ticketStatusValues;

    @Bean
    public TicketConstants TicketConstants(){

        return new TicketConstants(ticketStatusValues);
    }
}
