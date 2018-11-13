package pl.mgrzybowski.service;

import pl.mgrzybowski.dto.WordsDto;
import pl.mgrzybowski.model.Word;

import java.util.List;

public interface WordsService {

    List<Word> getAllWords();
    void removeWords(Long id);
    long addWords(WordsDto wordsDto);
}
