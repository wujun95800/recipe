package com.jskj.controller;

import com.alibaba.fastjson.JSON;
import com.jskj.dao.RecipeMapper;
import com.jskj.entity.Recipe;
import com.jskj.entity.ResultBean;
import com.jskj.service.RecipeService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;


    @RequestMapping("/getList")
    @ResponseBody
    public String getRecipeList(){
        ResultBean ret=new ResultBean();
        List<Recipe> recipeList=recipeService.findRecipe();

        return JSON.toJSONString(ret);
    }
}
