package Dao;

import entities.Stadium;

import javax.persistence.EntityManager;

public class StadiumDao extends JpaDaoImpl {
    public StadiumDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Stadium> getEntityClass() {
        return Stadium.class;
    }
}
