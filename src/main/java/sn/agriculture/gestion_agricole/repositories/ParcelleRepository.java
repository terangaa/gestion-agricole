package sn.agriculture.gestion_agricole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.agriculture.gestion_agricole.models.Parcelle;

public interface ParcelleRepository extends JpaRepository<Parcelle, Long> {}
