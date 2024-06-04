package com.ticketing.simpleticketin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Definisikan Entitas Sesuai dengan kebutuhan 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Ticket {

    @Id
    @Column(name="ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "ticket_type")
    private String ticketType;

    private int quantity;

    private double price;
}
