package com.adidyk.repository;

import com.adidyk.models.pojo.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Interface UserRepository used for access to data base. first day, second day. predicate
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 06.06.2020.
 * @version 1.0.
 */
@Repository
public interface UserRepository extends ItemRepository<User, String> {

    @Query(value = "SELECT * FROM users AS u WHERE u.first_name = :firstName"
           // "(u.first_name is null OR u.first_name = :firstName) "
            //"(login is null OR u.login =: login)",
            ,
    nativeQuery = true)
    List<User> getAllUserByCriteria(@Param("firstName") String firstName);

}

/*
SELECT * FROM users AS u WHERE
        (u.first_name IS NULL OR u.first_name = '11111') AND
        (u.first_name IS NULL OR u.login = NULL) IS NOT NULL
        ;


    @Query("SELECT rb FROM ReportBeanTemplate rb JOIN ExampleTable et WHERE et.idTemplate = rb.id AND (:id is null OR :id = rb.id) AND (:city is null OR :city = rb.city) AND (:state is null OR :state = rb.state)")
    public List<ReportTemplateBean> findTemplates(@Param("id") Long id, @Param("city") String city, @Param("state") String state);



        */