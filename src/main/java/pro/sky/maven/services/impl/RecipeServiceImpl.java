package pro.sky.maven.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.maven.model.Recipe;
import pro.sky.maven.services.RecipeService;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final Map<Integer, Recipe> recipeMap = new HashMap<>();

    private int countId = 1;

    @Override
    public int putRecipe (Recipe recipe) {
        int id = countId++;
        recipeMap.put(id, recipe);
        return id;

    }

    @Override
    public Recipe getRecipe (int id) {
        return recipeMap.get(id);
    }
}