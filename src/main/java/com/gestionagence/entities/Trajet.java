package com.gestionagence.entities;

import jakarta.persistence.*;
import lombok.*;

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
}
