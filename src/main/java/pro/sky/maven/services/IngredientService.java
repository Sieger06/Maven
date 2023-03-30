package pro.sky.maven.services;

import pro.sky.maven.model.Ingredient;

public interface IngredientService {
    int putIngredient (Ingredient ingredient);
    Ingredient getIngredient (int id);
}