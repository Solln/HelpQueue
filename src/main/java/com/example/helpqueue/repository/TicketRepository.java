package com.example.helpqueue.repository;

import com.example.helpqueue.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query(value = "SELECT * FROM TICKET WHERE status=(:status);", nativeQuery = true)
    List<Ticket> findByStatus(@Param("status") String status);

    @Query(value = "SELECT * FROM TICKET WHERE author=(:author);", nativeQuery = true)
    List<Ticket> findByAuthor(@Param("author") String author);

}

