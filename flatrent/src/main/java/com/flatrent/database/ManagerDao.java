package com.flatrent.database;

import com.flatrent.model.Flat.Flat;
import com.flatrent.model.Person.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerDao {
    Optional<List<Manager>> findAll();
    Long save(Manager manager);
    void update(Manager manager);
    void deleteById(Long Id);
    Optional<Manager> findById(Long Id);
}
