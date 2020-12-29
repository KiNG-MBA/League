package Dao;

import entities.City;

import javax.persistence.EntityManager;

public class CoachDao extends JpaDaoImpl {
    public CoachDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<City> getEntityClass() {
        return City.class;
    }
}
