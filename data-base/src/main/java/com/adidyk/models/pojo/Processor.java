package com.adidyk.models.pojo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Processor used for creates new object display with params: id, screen size, screen resolution, touch screen.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 23.09.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "processor")
public class Processor {

    /**
     * @param id - display id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    /**
     * @param processorBrand - processor brand.
     */
    @Column(name = "processor_brand")
    String processorBrand;

    /**
     * @param processorSpeedBase - processor speed base.
     */
    @Column(name = "processor_speed_base")
    String processorSpeedBase;

    /**
     * @param processorSpeedBase - processor speed base.
     */
    @Column(name = "processor_speed_maximum")
    String processorSpeedMaximum;

    /**
     * @param processorModel - processor model.
     */
    @Column(name = "processor_model")
    String processorModel;

    /**
     * @param processorModelNumber - processor model number.
     */
    @Column(name = "processor_model_number")
    String processorModelNumber;

    /**
     * @param processorCores - processor cores.
     */
    @Column(name = "processor_cores")
    Integer processorCores;

    /**
     * Processor - constructor.
     * @param id - processor id.
     */
    public Processor(Integer id) {
        this.id = id;
    }

    /**
     * Processor - constructor.
     * @param processorBrand - processor brand.
     * @param processorSpeedBase - processor speed base.
     * @param processorSpeedMaximum - processor speed maximum.
     * @param processorModel - processor model.
     * @param processorModelNumber processor model number.
     * @param processorCores - processor cores.
     */
    public Processor(String processorBrand, String processorSpeedBase, String processorSpeedMaximum, String processorModel, String processorModelNumber, Integer processorCores) {
        this.processorBrand = processorBrand;
        this.processorSpeedBase = processorSpeedBase;
        this.processorSpeedMaximum = processorSpeedMaximum;
        this.processorModel = processorModel;
        this.processorModelNumber = processorModelNumber;
        this.processorCores = processorCores;
    }

}