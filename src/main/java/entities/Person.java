package entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer ID;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDay;


}
