package com.ticketing.simpleticketin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketing.simpleticketin.models.Ticket;

// Definisikan Repository sebagai interface antara model dengan logic service
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    
}
