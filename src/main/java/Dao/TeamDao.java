package Dao;

import entities.Team;

import javax.persistence.EntityManager;

public class TeamDao extends JpaDaoImpl {
    public TeamDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Team> getEntityClass() {
        return Team.class;
    }
}
