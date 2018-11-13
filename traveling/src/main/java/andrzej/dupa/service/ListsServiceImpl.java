package andrzej.dupa.service;

import andrzej.dupa.dto.ListsDto;
import andrzej.dupa.model.Lists;
import andrzej.dupa.repository.ListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("listsService")
public class ListsServiceImpl implements ListsService {

    @Autowired
    private ListsRepository listsRepository;

    @Override
    public List<Lists> getAllLists() {
        return listsRepository.findAll();
    }

    @Override
    public void removeLists(Long id) {
        listsRepository.deleteById(id);

    }

    @Override
    public long addLists(ListsDto listsDto) {
        Lists listsEntitiy = new Lists();
        listsEntitiy.setLists(listsDto.getLists());
        return listsRepository.save(listsEntitiy).getId();
    }
}
