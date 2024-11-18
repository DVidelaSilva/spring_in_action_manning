package com.davs.tacoCloud_1.data;

import org.springframework.data.repository.CrudRepository;

import com.davs.tacoCloud_1.models.Ingredient;
 

 
public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {
  
}