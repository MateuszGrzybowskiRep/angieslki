package andrzej.dupa.service;

import andrzej.dupa.dto.ListsDto;
import andrzej.dupa.model.Lists;

import java.util.List;

public interface ListsService {

    List<Lists> getAllLists();
    void removeLists(Long id);
    long addLists(ListsDto listsDto);

}
