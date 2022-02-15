package com.greglturnquist.payroll;



// annotators: (1 and 3)
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


// interfaces: (2)
import org.springframework.boot.CommandLineRunner;

// Exceptions and other reusable classes: (4)


@Component //(1)
// This class is marked with Spring’s @Component annotation so that it is automatically picked up by @SpringBootApplication
public class DatabaseLoader implements CommandLineRunner { //(2)

    // It implements Spring Boot’s CommandLineRunner so that it gets run after all the beans are created and registered.

	private final EmployeeRepository repository;

	@Autowired //(3)
    // It uses constructor injection and autowiring to get Spring Data’s automatically created EmployeeRepository.
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception { //(4)
        // The run() method is invoked with command line arguments, loading up your data.
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Number2employee", "awesome", "treasure hunter"));
        this.repository.save(new Employee("mon", "mon", "president"));
        this.repository.save(new Employee("maaruni", "pandithurai", "martian"));
	}
}