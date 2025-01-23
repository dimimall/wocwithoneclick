package com.wocwithoneclick.wocwithoneclick.Repositories;

import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Category;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
