package andrzej.dupa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import andrzej.dupa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}