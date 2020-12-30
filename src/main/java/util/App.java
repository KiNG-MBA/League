package util;

import Dao.*;
import com.github.javafaker.Faker;
import entities.*;


import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {

    private static CityDao cityDao;
    private static CoachDao coachDao;
    private static ContractDao contractDao;
    private static MatchEventsDao matchEventsDao;
    private static StadiumDao stadiumDao;
    private static TeamDao teamDao;
    private static PlayerDao playerDao;

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Faker faker = new Faker();
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        initialDao(entityManager);

        City city1 = new City();
        city1.setName("Tehran");
        City city2 = new City();
        city2.setName("Tabriz");

        cityDao.save(city1);
        cityDao.save(city2);

        Coach coach1 = new Coach();
        coach1.setFirstName(faker.name().firstName());
        coach1.setLastName(faker.name().lastName());
        coach1.setBirthDay(faker.date().birthday());

        Coach coach2 = new Coach();
        coach2.setFirstName(faker.name().firstName());
        coach2.setLastName(faker.name().lastName());
        coach2.setBirthDay(faker.date().birthday());

        coachDao.save(coach1);
        coachDao.save(coach2);

        Stadium stadium1 = new Stadium();
        stadium1.setName(faker.name().name());
        stadium1.setCity(city1);
        stadium1.setCapacity(faker.number().randomDigitNotZero());

        Stadium stadium2 = new Stadium();
        stadium2.setName(faker.name().name());
        stadium2.setCity(city2);
        stadium2.setCapacity(faker.number().randomDigitNotZero());

        stadiumDao.save(stadium1);
        stadiumDao.save(stadium2);

        Team team1 = new Team();
        team1.setName(faker.team().name());
        team1.setCoach(coach1);
        team1.setCity(city1);
        team1.setStadium(stadium1);

        Team team2 = new Team();
        team2.setName(faker.team().name());
        team2.setCoach(coach2);
        team2.setCity(city2);
        team2.setStadium(stadium2);

        teamDao.save(team1);
        teamDao.save(team2);

        Player player1 = new Player();
        player1.setFirstName(faker.name().firstName());
        player1.setLastName(faker.name().lastName());
        player1.setTeam(team1);
        player1.setBirthDay(faker.date().birthday());
        player1.setPosition("def");

        Player player2 = new Player();
        player2.setFirstName(faker.name().firstName());
        player2.setLastName(faker.name().lastName());
        player2.setTeam(team1);
        player2.setBirthDay(faker.date().birthday());
        player2.setPosition("mid");

        Player player3 = new Player();
        player3.setFirstName(faker.name().firstName());
        player3.setLastName(faker.name().lastName());
        player3.setTeam(team1);
        player3.setBirthDay(faker.date().birthday());
        player3.setPosition("fw");

        Player player4 = new Player();
        player4.setFirstName(faker.name().firstName());
        player4.setLastName(faker.name().lastName());
        player4.setTeam(team2);
        player4.setBirthDay(faker.date().birthday());
        player4.setPosition("def");

        Player player5 = new Player();
        player5.setFirstName(faker.name().firstName());
        player5.setLastName(faker.name().lastName());
        player5.setTeam(team2);
        player5.setBirthDay(faker.date().birthday());
        player5.setPosition("mid");

        Player player6 = new Player();
        player6.setFirstName(faker.name().firstName());
        player6.setLastName(faker.name().lastName());
        player6.setTeam(team2);
        player6.setBirthDay(faker.date().birthday());
        player6.setPosition("fw");

        playerDao.save(player1);
        playerDao.save(player2);
        playerDao.save(player3);
        playerDao.save(player4);
        playerDao.save(player5);
        playerDao.save(player6);

        Contract contract1 = new Contract();
        contract1.setCoach(coach1);
        contract1.setSeason(2019);
        contract1.setSalary(500.35);
        contract1.setTeam(team1);

        Contract contract2 = new Contract();
        contract1.setCoach(coach2);
        contract1.setSeason(2020);
        contract1.setSalary(700.35);
        contract1.setTeam(team2);

        contractDao.save(contract1);
        contractDao.save(contract2);


        MatchEvents matchEvents1 = new MatchEvents();
        matchEvents1.setDate(format.parse("2020-05-20"));
        matchEvents1.setHomeTeam(team1);
        matchEvents1.setAwayTeam(team2);
        matchEvents1.setWinner(team2);
        matchEvents1.setSeason(2020);
        matchEvents1.setStadium(stadium1);

        matchEventsDao.save(matchEvents1);


        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtil.shutdown();
    }


    public static void initialDao(EntityManager entityManager) {
        cityDao = new CityDao(entityManager);
        coachDao = new CoachDao(entityManager);
        contractDao = new ContractDao(entityManager);
        matchEventsDao = new MatchEventsDao(entityManager);
        stadiumDao = new StadiumDao(entityManager);
        teamDao = new TeamDao(entityManager);
        playerDao = new PlayerDao(entityManager);


    }
}

