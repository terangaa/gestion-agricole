package sn.agriculture.gestion_agricole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.agriculture.gestion_agricole.models.SuiviCulture;

public interface SuiviCultureRepository extends JpaRepository<SuiviCulture, Long> {}