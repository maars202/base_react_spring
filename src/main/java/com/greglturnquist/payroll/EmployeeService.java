package com.greglturnquist.payroll;

// public class EmployeeService {
    
// }
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository userRepository;

    public List<Employee> findAll() {

        Iterable<Employee> it = userRepository.findAll();

        ArrayList<Employee> users = new ArrayList<Employee>();
        it.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return userRepository.count();
    }

    public void deleteById(Long userId) {

        userRepository.deleteById(userId);
    }
}