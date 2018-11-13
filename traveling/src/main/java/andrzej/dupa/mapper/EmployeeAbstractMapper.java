package andrzej.dupa.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EmployeeAbstractMapper<E, D> {

    public abstract D toDto(E entity);

    public List<D> toDtoList(List<E> entities){

        List<D> convertedDtos = new ArrayList<>(entities.size());

        for (E entity : entities){
            D dto = toDto(entity);
            convertedDtos.add(dto);
        }

        return convertedDtos;

//        return entities.stream().map(entity -> toDto(entity)).collect(Collectors.toList());
    }
}
