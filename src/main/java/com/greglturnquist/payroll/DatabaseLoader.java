package com.greglturnquist.payroll;

// annotators: (1 and 3)
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

import com.greglturnquist.payroll.companies.Company;
import com.greglturnquist.payroll.companies.CompanyRepository;
import com.greglturnquist.payroll.countries.Country;
import com.greglturnquist.payroll.countries.CountryRepository;
import com.greglturnquist.payroll.remittance.Remittance;
import com.greglturnquist.payroll.remittance.RemittanceRepository;
import com.greglturnquist.payroll.users.User;
import com.greglturnquist.payroll.users.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;


// interfaces: (2)
import org.springframework.boot.CommandLineRunner;

// Exceptions and other reusable classes: (4)


@Component //(1)
// This class is marked with Spring’s @Component annotation so that it is automatically picked up by @SpringBootApplication
public class DatabaseLoader implements CommandLineRunner { //(2)

    // It implements Spring Boot’s CommandLineRunner so that it gets run after all the beans are created and registered.

	private final EmployeeRepository repository;
	private final SecondRepository secondrepository;

	// official repositories for project:
	private final UserRepository userRepository;
	private final RemittanceRepository remittanceRepository;
	private final CountryRepository countryRepository;
	private final CompanyRepository companyRepository;

	@Autowired //(3)
    // It uses constructor injection and autowiring to get Spring Data’s automatically created EmployeeRepository.
	public DatabaseLoader(EmployeeRepository repository, SecondRepository secondrepository,
	UserRepository userRepository, RemittanceRepository remittanceRepository, 
	CountryRepository countryRepository, CompanyRepository companyRepository) {
		// , SecondRepository secondrepository
		this.repository = repository;
		this.secondrepository = secondrepository;


		// official repositories for project:
		this.userRepository = userRepository;
		this.remittanceRepository = remittanceRepository;
		this.countryRepository = countryRepository;
		this.companyRepository = companyRepository;

	}

	@Override
	public void run(String... strings) throws Exception { //(4)
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Number2employee", "awesome", "treasure hunter"));
        this.repository.save(new Employee("mon", "mon", "president"));
        this.repository.save(new Employee("maaruni", "pandithurai", "martian"));



		this.secondrepository.save(new Second("2Frodo", "Baggins", "ring bearer"));
        this.secondrepository.save(new Second("2Number2employee", "awesome", "treasure hunter"));
        this.secondrepository.save(new Second("2mon", "mon", "president"));
        this.secondrepository.save(new Second("2maaruni", "pandithurai", "martian"));
		

		// official repositories for project: testing insertion of data into USER TABLE
		this.userRepository.save(new User("Steve", "Jobs", "UOB user"));
        this.userRepository.save(new User("User 2", "awesome", "POSB user"));

		// official repositories for project: testing insertion of data into REMITTANCE TABLE
		this.remittanceRepository.save(new Remittance("Remittance Company #1", "Philiphines", "1000"));
        this.remittanceRepository.save(new Remittance("Remittance Company #2", "Japan", "5000"));

		// official repositories for project: testing insertion of data into COUNTRY TABLE
		this.countryRepository.save(new Country("France", "20", "20000"));
        this.countryRepository.save(new Country("Spain", "90", "50200"));

		// official repositories for project: testing insertion of data into COMPANY TABLE
		this.companyRepository.save(new Company("Company #2", "24000", "50%"));
        this.companyRepository.save(new Company("Company #5", "39040", "70%"));


	}
}