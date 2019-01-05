package com.jskj.dao;

import com.jskj.entity.Recipe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface RecipeMapper {
    List<Recipe> findRecipe();
}
