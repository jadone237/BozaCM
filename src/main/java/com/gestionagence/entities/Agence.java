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
@Table(name = "agences")
public class Agence {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    private List<Offre> offres = new ArrayList<>();
}
