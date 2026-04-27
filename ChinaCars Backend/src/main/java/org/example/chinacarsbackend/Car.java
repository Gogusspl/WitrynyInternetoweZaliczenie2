package org.example.chinacarsbackend;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private String range;
    private String price;
    private String image;
    private String description;
    private String type;
    @Column(name = "car_year")
    private Integer year;
    private String color;
    private Integer horsepower;

    public Car() {}

    public Car(String name, String brand, String range, String price,
               String image, String description, String type,
               Integer year, String color, Integer horsepower) {
        this.name = name;
        this.brand = brand;
        this.range = range;
        this.price = price;
        this.image = image;
        this.description = description;
        this.type = type;
        this.year = year;
        this.color = color;
        this.horsepower = horsepower;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getRange() { return range; }
    public void setRange(String range) { this.range = range; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Integer getHorsepower() { return horsepower; }
    public void setHorsepower(Integer horsepower) { this.horsepower = horsepower; }
}
