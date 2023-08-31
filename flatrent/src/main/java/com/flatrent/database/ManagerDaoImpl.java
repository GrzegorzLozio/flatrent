package com.flatrent.database;

import com.flatrent.model.Person.Manager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ManagerDaoImpl implements ManagerDao {
    @PersistenceContext
    private EntityManager entityManager;

    public ManagerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<List<Manager>> findAll() {
        return Optional.empty();
    }

    @Override
    public Long save(Manager manager) {
        return null;
    }

    @Override
    public void update(Manager manager) {

    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public Optional<Manager> findById(Long Id) {
        return Optional.empty();
    }
}
