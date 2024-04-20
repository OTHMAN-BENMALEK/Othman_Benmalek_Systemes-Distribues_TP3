package ma.fs.hospital.repository;

import ma.fs.hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page <Patient> findByNomContains(String keyword , Pageable pageable);
    @Query("select p from Patient p where p.nom like :x")
    Page <Patient> chercher(@Param("x") String keyword ,Pageable pageable);

}
