package com.gestionagence.repository;

import com.gestionagence.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepo  extends JpaRepository<Agence, Integer> {
}
