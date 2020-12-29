package entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer ID;

    private String name;

    @OneToMany(mappedBy = "city")
    private Set<Stadium> stadiumList;

    @OneToMany(mappedBy = "team")
    private Set<Team> teamList;

}
