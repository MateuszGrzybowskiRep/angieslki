package pl.mgrzybowski.service;

import pl.mgrzybowski.dto.WordsDto;
import pl.mgrzybowski.model.Word;
import pl.mgrzybowski.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wordsService")
public class WordsServiceImpl implements WordsService {

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public List<Word> getAllWords() {
        return wordsRepository.findAll();
    }

    @Override
    public void removeWords(Long id) {
        wordsRepository.deleteById(id);

    }

    @Override
    public long addWords(WordsDto wordsDto) {
        Word wordsEntitiy = new Word();
        wordsEntitiy.setEng(wordsDto.getEng());
        wordsEntitiy.setPol(wordsDto.getPol());
        return wordsRepository.save(wordsEntitiy).getId();
    }
}
