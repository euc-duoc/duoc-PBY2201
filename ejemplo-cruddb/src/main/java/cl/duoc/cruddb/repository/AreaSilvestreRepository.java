package cl.duoc.cruddb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.cruddb.model.AreaSilvestre;

@Repository
public interface AreaSilvestreRepository extends JpaRepository<AreaSilvestre, Integer> {
}
