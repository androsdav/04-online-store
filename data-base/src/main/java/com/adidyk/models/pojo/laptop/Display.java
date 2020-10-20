package com.adidyk.models.pojo.laptop;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

/**
 * Class Display used for creates new object display with params: id, screen size, screen resolution, touch screen.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 23.09.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "display")
public class Display {

    /**
     * @param id - display id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "display_id")
    Integer displayId;

    /**
     * @param screenSize - display screen size in inches.
     */
    @Column(name = "screen_size")
    Float screenSize;

    /**
     * @param screenResolution - display screen resolution.
     */
    @Column(name = "screen_resolution")
    String screenResolution;

    /**
     * @param touchScreen - touch screen display.
     */
    @Column(name = "touch_screen")
    String touchScreen;

    @Column(name = "display_type")
    String displayType;

}