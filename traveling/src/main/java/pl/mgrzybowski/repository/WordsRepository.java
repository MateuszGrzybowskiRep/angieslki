package pl.mgrzybowski.repository;

import pl.mgrzybowski.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordsRepository extends JpaRepository<Word,Long> {
}
