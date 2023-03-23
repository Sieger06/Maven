package pro.sky.maven.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.maven.model.Recipe;
import pro.sky.maven.services.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/get")
    public Recipe getRecipe(@RequestParam int id){
        return recipeService.getRecipe(id);
    }
    @PutMapping("/put")
    public String putRecipe (@RequestBody Recipe recipe){
        return "Рецепт успешно добавлен (ID: " + recipeService.putRecipe(recipe) + ")";
    }



}

