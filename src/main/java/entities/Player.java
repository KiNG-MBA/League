package entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name= "Player")
public class Player  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDay;


    private String position;

    @ManyToOne
    private Team team;


}
