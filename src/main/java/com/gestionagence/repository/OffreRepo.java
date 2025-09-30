package com.gestionagence.repository;

import com.gestionagence.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepo  extends JpaRepository<Offre, Integer> {
}
