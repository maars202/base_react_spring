package com.greglturnquist.payroll.users;

// import org.springframework.data.jpa.repository.JpaRepository; 
// ^^^ apparently better choice as it inherits CrudRepository adn others that allow pagination (advanced)
// class we are inheriting mehtods from and using directly without overriding any of these methods:
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> { //(1)

}