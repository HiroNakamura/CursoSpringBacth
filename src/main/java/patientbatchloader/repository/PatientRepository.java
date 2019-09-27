package springbatch.patientbatchloader.repository;


import springbatch.patientbatchloader.domain.PatientEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

}
