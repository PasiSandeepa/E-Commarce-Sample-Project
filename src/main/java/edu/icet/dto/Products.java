package edu.icet.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products {
    private int id;
    private String name;
    private String brand;
    private String description;
    private double price;
    private int qty;
    private String category;
}
