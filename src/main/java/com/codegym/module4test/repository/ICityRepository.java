package com.codegym.module4test.repository;

import com.codegym.module4test.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICityRepository extends JpaRepository<City,Long> {
}
