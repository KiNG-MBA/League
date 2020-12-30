package entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private Integer season;

    @ManyToOne
    @JoinColumn(name = "coach_ID")
    private Coach coach;

    private Double salary;

    @ManyToOne
    private Team team;


}
