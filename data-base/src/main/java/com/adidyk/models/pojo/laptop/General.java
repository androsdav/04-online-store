package com.adidyk.models.pojo.laptop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Notebook used for creates new object user with params: id, login, password, first name, second name.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 20.10.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Table(name = "general")
public class General {

    /**
     * @param id - notebook id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "general_id")
    Integer generalId;

    /**
     * @param name - notebook name.
     */
    @Column(name = "name")
    String name;

    /**
     * @param brand - notebook brand.
     */
    @Column(name = "brand")
    String brand;

    /**
     * @param modelNumber - model number.
     */
    @Column(name = "model_number")
    String modelNumber;

    /**
     * @param color - color.
     */
    @Column(name = "color")
    String color;

    /**
     * @param colorCategory - color category.
     */
    @Column(name = "color_category")
    String colorCategory;

}