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

@Table(name = "Coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDay;

}
