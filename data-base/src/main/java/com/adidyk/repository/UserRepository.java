package com.adidyk.repository;

import com.adidyk.models.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Interface UserRepository used for access to data base. first day
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 06.06.2020.
 * @version 1.0.
 */
@Repository
public interface UserRepository extends ItemRepository<User, String> {
}
