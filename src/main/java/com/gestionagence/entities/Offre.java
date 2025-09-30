package com.gestionagence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "offres")
public class Offre {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titre;
    private String description;
    private Double prix;

    @Temporal(TemporalType.DATE)
    private Date dateDepart;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "offre")
    private List<Reservation> reservations = new ArrayList<>();



}
