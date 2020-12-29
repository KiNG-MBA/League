package Dao;

import entities.Player;

import javax.persistence.EntityManager;

public class PlayerDao extends JpaDaoImpl {
    public PlayerDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Player> getEntityClass() {
        return Player.class;
    }
}
