package com.gestionagence.repository;

import com.gestionagence.entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajetRepo extends JpaRepository<Trajet, Integer> {

}
