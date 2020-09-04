package com.adidyk.models.pojo;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Class User used for creates new object user with params: id, login, password, first name, second name.
 * Used Lombok for created method: getters, setters, equals, hashcode and toString.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 04.09.2020.
 * @version 1.0.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

  /**
   * @param id - user id.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  String id;

  /**
   * @param login - user login.
   */
  @NotBlank(message = "login is mandatory")
  @Column(name = "login", nullable = false)
  @Size(min = 3, max = 70, message = "login must contain at least 3 characters")
  String login;

  /**
   * @param password - user password.
   */
  @NotBlank(message = "password is mandatory")
  @Column(name = "password", nullable = false)
  @Size(min = 3, max = 70, message = "password must contain at least 3 characters")
  String password;

  /**
   * @param confirmPassword - user confirm password.
   */
  @Transient
  String confirmPassword;

  /**
   * @param firstName - user first name.
   */
  @Column(name = "first_name")
  @Size(min = 3, max = 70, message = "login must contain at least 3 characters")
  String firstName;

  /**
   * @param secondName - user second name.
   */
  @Column(name = "second_name")
  @Size(min = 3, max = 70, message = "login must contain at least 3 characters")
  String secondName;

  /**
   * User - constructor.
   * @param login - user login.
   * @param password - user password.
   * @param firstName - user first name.
   * @param secondName - user second name.
   */
  public User(String login, String password, String firstName, String secondName) {
    this.login = login;
    this.password = password;
    this.firstName = firstName;
    this.secondName = secondName;
  }

}