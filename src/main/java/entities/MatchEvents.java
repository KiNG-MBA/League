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
@Table(name = "match")
public class MatchEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private Integer ID;

    private Date date;

    private Integer season;

    @OneToOne(targetEntity = Team.class)
    private Team homeTeam;

    @OneToOne(targetEntity = Team.class)
    private Team awayTeam;

    @OneToOne(targetEntity = Team.class)
    private Team winner;

    @OneToOne(targetEntity = Stadium.class)
    private Stadium stadium;



}
