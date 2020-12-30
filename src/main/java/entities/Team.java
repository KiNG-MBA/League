package entities;


import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Team_ID")
    private Integer ID;

    private String name;

    @OneToOne(targetEntity = Coach.class)
    private Coach coach;

//    @OneToMany(mappedBy = "Team")
//    private Set<Player> playersList;

    @ManyToOne
    private City city;

    @OneToOne(targetEntity = Stadium.class)
    private Stadium stadium;




    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
