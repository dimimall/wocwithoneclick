package com.wocwithoneclick.wocwithoneclick.Repositories;

import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.User;


import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
		
    User findByEmail(String email);
    
    User findByPassword(String password);

}
