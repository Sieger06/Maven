package pro.sky.maven.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.maven.model.Ingredient;
import pro.sky.maven.services.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @GetMapping("/get")
    public Ingredient getIngredient(@RequestParam int id){
        return ingredientService.getIngredient(id);
    }
    @PutMapping("/put")
    public String putIngredient (@RequestBody Ingredient ingredient){
        return "Рецепт успешно добавлен (ID: " + ingredientService.putIngredient(ingredient) + ")";
    }
}