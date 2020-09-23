package com.adidyk.models.pojo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Notebook used for creates new object user with params: id, login, password, first name, second name.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 04.09.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "notebook")
public class Notebook {

    /**
     * @param id - notebook id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

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
     * @param lineup - notebook lineup.
     */
    @Column(name = "lineup")
    String lineup;

    /**
     * @param type - notebook type.
     */
    @Column(name = "type")
    String type;

    /**
     * @param description - notebook description.
     */
    @Column(name = "description")
    String description;

    /**
     * Notebook - constructor.
     */
    public Notebook(Integer id) {
        this.id = id;
    }

    /**
     * Notebook - constructor.
     * @param name - notebook name.
     * @param brand - notebook brand.
     * @param lineup - notebook lineup.
     * @param type - notebook type.
     * @param description - notebook description.
     */
    public Notebook(String name, String brand, String lineup, String type, String description) {
        this.name = name;
        this.brand = brand;
        this.lineup = lineup;
        this.type = type;
        this.description = description;
    }

}