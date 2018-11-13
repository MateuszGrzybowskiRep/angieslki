package pl.mgrzybowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.mgrzybowski.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}