package com.gestionagence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "trajets")
public class Trajet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String depart;
    private String arrivee;
    private String duree;

    @OneToMany(mappedBy = "trajet")
    private List<Offre> offres = new ArrayList<>();
}
