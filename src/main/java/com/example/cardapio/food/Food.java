package com.example.cardapio.food;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id @GenerateValue(strategy = Generation.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
