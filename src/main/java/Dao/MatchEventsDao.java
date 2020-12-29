package Dao;

import entities.MatchEvents;

import javax.persistence.EntityManager;

public class MatchEventsDao extends JpaDaoImpl {
    public MatchEventsDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<MatchEvents> getEntityClass() {
        return MatchEvents.class;
    }
}
