package sn.agriculture.gestion_agricole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.agriculture.gestion_agricole.models.Culture;

public interface CultureRepository extends JpaRepository<Culture, Long> {}
