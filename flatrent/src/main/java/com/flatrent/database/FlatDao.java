package com.flatrent.database;

import com.flatrent.model.Flat.Flat;

import java.util.List;
import java.util.Optional;

public interface FlatDao {
    Optional<List<Flat>> findAll();
    Long save(Flat flat);
    void update(Flat flat);
    void deleteById(Long Id);
    Optional<Flat> findById(Long Id);
}
