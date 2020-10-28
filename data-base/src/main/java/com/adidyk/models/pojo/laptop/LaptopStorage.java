package com.adidyk.models.pojo.laptop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Storage used for creates new object display with params: id, screen size, screen resolution, touch screen.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 28.10.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "laptop_storage")
public class LaptopStorage {

    /**
     * @param id - storage id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "storage_id")
    Integer storageId;

    /**
     * @param storageType - storage type.
     */
    @Column(name = "storage_type")
    String storageType;

    /**
     * @param totalStorageCapacity - total storage capacity.
     */
    @Column(name = "total_storage_capacity")
    Integer totalStorageCapacity;

    /**
     * @param solidStateDriveCapacity - solid state drive capacity.
     */
    @Column(name = "solid_state_drive_capacity")
    Integer solidStateDriveCapacity;

    /**
     * @param solidStateDriveInterface - solid state drive interface.
     */
    @Column(name = "solid_state_drive_interface")
    String solidStateDriveInterface;

}