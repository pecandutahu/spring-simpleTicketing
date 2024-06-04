package com.ticketing.simpleticketin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketing.simpleticketin.models.Ticket;
import com.ticketing.simpleticketin.repositories.TicketRepository;
import com.ticketing.simpleticketin.services.TicketService;

@RestController
@RequestMapping("/ticket") //Definisikan routes
public class TicketController {
    @Autowired
    TicketService ticketService; // sebagai penghubung dengan class service

    // Fungsi untuk menangani permintaan create
    @PostMapping // definisikan routes dengan method post
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket); 
    }

    // Fungsi untuk menangani permintaan list ticket
    @GetMapping
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTicket();
    }

    // Fungsi untuk menangani permintaan tiket secara sepesifik
    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id){
        return ticketService.getTicketById(id);
    }

    // Fungsi untuk menangani permintaan delete tiket
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
        
        return new ResponseEntity<>("Ticket with ID " + id + " deleted successfully", HttpStatus.OK);
    }
}
