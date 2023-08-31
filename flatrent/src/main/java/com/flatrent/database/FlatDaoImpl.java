package com.flatrent.database;

import com.flatrent.model.Flat.Flat;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class FlatDaoImpl implements FlatDao {
    @PersistenceContext
    private EntityManager entityManager;

    public FlatDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<List<Flat>> findAll() {
        return Optional.empty();
    }

    @Override
    public Long save(Flat flat) {
        return null;
    }

    @Override
    public void update(Flat flat) {

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Flat> findById(Long Id) {
        return Optional.empty();
    }
}
