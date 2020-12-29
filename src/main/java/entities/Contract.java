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
    @JoinColumn(name ="Person_ID")
    private Person person;

    private Double salary;

    @ManyToOne
    private Team team;


}
