package com.wocwithoneclick.wocwithoneclick.Repositories;

import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
		
	
	@Query(value = "SELECT * FROM User WHERE firstname = ?1 AND lastname = ?1", nativeQuery = true)
    List<User> findByfirstnamelastname(String firstname, String lastname);

}
