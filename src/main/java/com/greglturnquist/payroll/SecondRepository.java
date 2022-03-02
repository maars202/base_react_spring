package com.greglturnquist.payroll;

// class we are inheriting mehtods from and using directly without overriding any of these methods:
import org.springframework.data.repository.CrudRepository;

// extends CrudRepository<Second, Long>
public interface SecondRepository extends CrudRepository<Second, Long>{ //(1)
    // fun findBySlug(slug: String): Article?
}