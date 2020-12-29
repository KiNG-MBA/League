package util;

import com.github.javafaker.Faker;
import entities.Coach;
import entities.Person;
import entities.Player;
import entities.Team;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Coach coach = new Coach();
        coach.setFirstName("a");
        coach.setLastName("b");
        coach.setBirthDay(format.parse("2020-10-12"));

        Player player = new Player();
        player.setFirstName("b");
        player.setLastName("k");
        player.setBirthDay(format.parse("2020-10-12"));
        player.setPosition("fw");


        entityManager.persist(coach);
        entityManager.persist(player);


        entityManager.getTransaction().commit();
        entityManager.close();


        JPAUtil.shutdown();
    }
}
