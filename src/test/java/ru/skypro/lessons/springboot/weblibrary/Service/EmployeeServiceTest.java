package ru.skypro.lessons.springboot.weblibrary.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.skypro.lessons.springboot.weblibrary.Employee;
import ru.skypro.lessons.springboot.weblibrary.dto.EmployeeDTO;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeServiceImpl;

import java.util.*;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    private final EmployeeRepository repositoryMock = mock(EmployeeRepository.class);
    @InjectMocks
    private EmployeeServiceImpl out;
    Employee a = new Employee(0,"0",0,0);
    List<EmployeeDTO> emptyListEmployeeDTO = new ArrayList<>();
    List<Employee> emptyListEmployee = new ArrayList<>();
    @BeforeEach
    public void init() {
        out = new EmployeeServiceImpl(repositoryMock);
    }

    @Test
    public void getAllTest(){
        when(out.getAll())
                .thenReturn(emptyListEmployeeDTO);

        Assertions.assertIterableEquals(out.getAll(),emptyListEmployeeDTO);
    }
    @Test
    public void getEmployeeByIdTest(){
        when(repositoryMock.findEmployeeById(0))
                .thenReturn(null);
        Assertions.assertIterableEquals(repositoryMock.findEmployeeById(0),null);
    }
    @Test
    public void addEmployeeTest(){
        when(repositoryMock.save(a))
                .thenReturn(null);
    }
    @Test
    public void deleteEmployeeTest(){
        out.addEmployee(a);
        when(repositoryMock.findEmployeeById(a.getId()))
                .thenReturn(null);
        out.deleteEmployeeById(a.getId());
    }
}
