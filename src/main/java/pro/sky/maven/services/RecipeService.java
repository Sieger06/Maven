package pro.sky.maven.services;

import pro.sky.maven.model.Recipe;

public interface RecipeService {
    int putRecipe (Recipe recipe);
    Recipe getRecipe (int id);
}