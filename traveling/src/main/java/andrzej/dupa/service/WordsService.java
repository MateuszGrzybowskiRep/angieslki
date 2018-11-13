package andrzej.dupa.service;

import andrzej.dupa.dto.WordsDto;
import andrzej.dupa.model.Words;

import java.util.List;

public interface WordsService {

    List<Words> getAllWords();
    void removeWords(Long id);
    long addWords(WordsDto wordsDto);
}
