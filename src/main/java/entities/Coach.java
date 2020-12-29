package entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor

@ToString

@Table(name = "Coach")
public class Coach extends Person {

}
