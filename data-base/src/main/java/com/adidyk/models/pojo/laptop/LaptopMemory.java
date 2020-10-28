package com.adidyk.models.pojo.laptop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Memory used for creates new object display with params: id, screen size, screen resolution, touch screen.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 28.10.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "laptop_memory")
public class LaptopMemory {

    /**
     * @param id - storage id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memory_id")
    Integer memoryId;

    /**
     * @param systemMemoryRAM - system memory RAM.
     */
    @Column(name = "system_memory_RAM")
    Integer systemMemoryRAM;

    /**
     * @param typeOfMemoryRAM - type of memory RAM.
     */
    @Column(name = "type_of_memory_RAM")
    String typeOfMemoryRAM;

    /**
     * @param systemMemoryRAMSpeed - system memory RAM speed.
     */
    @Column(name = "system_memory_RAM_speed")
    Integer systemMemoryRAMSpeed;

}