package com.ticketing.simpleticketin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketing.simpleticketin.models.Ticket;
import com.ticketing.simpleticketin.repositories.TicketRepository;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository ticketRepository;

    // Method untuk menyimpan data
    public Ticket saveTicket(Ticket ticket)
    {
        return ticketRepository.save(ticket);
    }

    // Method untuk menarik semua data
    public List<Ticket> getAllTicket()
    {
        return ticketRepository.findAll();
    }

    // Method untuk melihat data berdasarkan id
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    // Method untuk menghapus data
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    
}
