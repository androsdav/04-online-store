package com.adidyk.models.pojo.laptop;

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
    @Column(name = "processor_id")
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
     * @param processorModel - processor model.
     */
    @Column(name = "processor_model")
    String processorModel;

    /**
     * @param processorModelNumber - processor model number.
     */
    @Column(name = "processor_model_number")
    String processorModelNumber;

}