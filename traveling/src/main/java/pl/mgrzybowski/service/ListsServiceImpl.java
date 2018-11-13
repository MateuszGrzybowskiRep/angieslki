package pl.mgrzybowski.service;

import pl.mgrzybowski.dto.ListsDto;
import pl.mgrzybowski.model.WordList;
import pl.mgrzybowski.repository.ListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("listsService")
public class ListsServiceImpl implements ListsService {

    @Autowired
    private ListsRepository listsRepository;

    @Override
    public List<WordList> getAllLists() {
        return listsRepository.findAll();
    }

    @Override
    public void removeLists(Long id) {
        listsRepository.deleteById(id);

    }

    @Override
    public long addLists(ListsDto listsDto) {
        WordList listsEntitiy = new WordList();
        listsEntitiy.setListName(listsDto.getLists());
        return listsRepository.save(listsEntitiy).getId();
    }
}
