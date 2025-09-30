package com.gestionagence.sevice.trajet;

import com.gestionagence.entities.Trajet;

import java.util.List;

public interface TrajetService {
    String createTrajet(Trajet trajet);

    List<Trajet> getTrajets();

    Trajet getTrajetById(Integer trajetId);

    String updateTrajet(Integer trajetId, Trajet trajet);

    String deleteTrajet(Integer trajetId);

    void CreateTrajet(Trajet trajet);
}
