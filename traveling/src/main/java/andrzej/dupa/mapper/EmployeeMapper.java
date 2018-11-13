package andrzej.dupa.mapper;

import andrzej.dupa.dto.EmployeeDto;
import andrzej.dupa.model.Employee;

public class EmployeeMapper extends AbstractMapper<Employee, EmployeeDto> {

    @Override
    public EmployeeDto toDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        dto.setName(entity.getName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setActive(entity.isActive() ? "on" : "off");
        dto.setId(entity.getId());
        return dto;
    }
}
