package com.greglturnquist.payroll.countries;

// import org.springframework.data.jpa.repository.JpaRepository; 
// ^^^ apparently better choice as it inherits CrudRepository adn others that allow pagination (advanced)
// class we are inheriting mehtods from and using directly without overriding any of these methods:
import org.springframework.data.repository.CrudRepository;


public interface CountryRepository extends CrudRepository<Country, Long> { //(1)

}