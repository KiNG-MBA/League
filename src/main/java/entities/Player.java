package entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor

@ToString
@Table(name= "Player")
public class Player extends Person {


    private String position;

    @ManyToOne
    private Team team;


}
