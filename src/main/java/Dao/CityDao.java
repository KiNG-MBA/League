package Dao;

import entities.City;

import javax.persistence.EntityManager;

public class CityDao extends JpaDaoImpl {
    public CityDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<City> getEntityClass() {
        return City.class;
    }
}
