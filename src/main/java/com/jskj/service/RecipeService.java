package com.jskj.service;

import com.jskj.dao.RecipeMapper;
import com.jskj.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public List<Recipe> findRecipe(){
        return recipeMapper.findRecipe();
    }


}
