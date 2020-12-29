package Dao;

import entities.Contract;

import javax.persistence.EntityManager;
import java.sql.Connection;

public class ContractDao extends JpaDaoImpl {
    public ContractDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Contract> getEntityClass() {
        return Contract.class;
    }
}
