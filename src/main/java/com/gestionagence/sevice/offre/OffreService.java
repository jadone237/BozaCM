package com.gestionagence.sevice.offre;

import com.gestionagence.entities.Offre;

import java.util.List;

public interface OffreService {
    String createOffre(Offre offre);

    List<Offre> getOffres();

    Offre getOffreById(Integer offreId);

    String updateOffre(Integer offreId, Offre offre);

    String deleteOffre(Integer offreId);

    void CreateOffre(Offre offre);
}
