package com.example.cardapio.food;

public class FoodResponseDTO {
    public FoodResponseDTO(Food food){
        this(food.getTitle(), food.getImage(), food.getPrice());
    }

    public FoodResponseDTO(String title, String image, Integer price) {

    }
}
