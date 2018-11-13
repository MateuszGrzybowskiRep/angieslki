package pl.mgrzybowski.repository;

import pl.mgrzybowski.model.WordList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends JpaRepository<WordList, Long> {
}
