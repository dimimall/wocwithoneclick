package com.wocwithoneclick.wocwithoneclick.Repositories;

import org.springframework.stereotype.Repository;

import com.wocwithoneclick.wocwithoneclick.Models.Category;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
