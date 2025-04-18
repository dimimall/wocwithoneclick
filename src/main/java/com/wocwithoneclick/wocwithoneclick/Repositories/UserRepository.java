package com.wocwithoneclick.wocwithoneclick.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{
		
    User findByEmail(String email);
    
    User findByPassword(String password);

}
