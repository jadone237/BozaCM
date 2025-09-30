package com.gestionagence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomClient;
    private String emailClient;

    @Temporal(TemporalType.DATE)
    private Date dateReservation;

    private String statut;
}
