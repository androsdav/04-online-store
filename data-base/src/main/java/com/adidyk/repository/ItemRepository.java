package com.adidyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Interface ItemRepository it one point to connect to to data base.
 * @author Didyk Andrey (androsdav@gmail.com).
 * @since 06.06.2020.
 * @version 1.0.
 */
@NoRepositoryBean
interface  ItemRepository<T, ID> extends JpaRepository<T, ID> {
}
