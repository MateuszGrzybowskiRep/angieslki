package pl.mgrzybowski.service;

import pl.mgrzybowski.dto.ListsDto;
import pl.mgrzybowski.model.WordList;

import java.util.List;

public interface ListsService {

    List<WordList> getAllLists();
    void removeLists(Long id);
    long addLists(ListsDto listsDto);

}
