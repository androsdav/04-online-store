package com.adidyk.models.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * Class User.
 */
//@ToString(exclude = "f")
//@EqualsAndHashCode
    @Data
public class User {

  //  @Getter
//    @Setter
    private Integer id;

  //  @Getter
  //  @Setter
    private String firstName;

  //  @Getter
  //  @Setter
    private String secondName;


}
