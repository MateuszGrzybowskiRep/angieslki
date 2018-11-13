package andrzej.dupa.service;

import andrzej.dupa.dto.WordsDto;
import andrzej.dupa.model.Words;
import andrzej.dupa.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wordsService")
public class WordsServiceImpl implements WordsService {

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public List<Words> getAllWords() {
        return wordsRepository.findAll();
    }

    @Override
    public void removeWords(Long id) {
        wordsRepository.deleteById(id);

    }

    @Override
    public long addWords(WordsDto wordsDto) {
        Words wordsEntitiy = new Words();
        wordsEntitiy.setEng(wordsDto.getEng());
        wordsEntitiy.setPol(wordsDto.getPol());
        return wordsRepository.save(wordsEntitiy).getId();
    }
}
