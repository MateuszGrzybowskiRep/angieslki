package pl.mgrzybowski.mapper;

import pl.mgrzybowski.dto.EmployeeDto;
import pl.mgrzybowski.model.Employee;

public class EmployeeMapper extends EmployeeAbstractMapper<Employee, EmployeeDto> {

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
