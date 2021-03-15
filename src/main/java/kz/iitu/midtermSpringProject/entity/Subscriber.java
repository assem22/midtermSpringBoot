package kz.iitu.midtermSpringProject.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "subscriber")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriber_id;
    private String subscriber_name;
    private String subscriber_email;
    private String subscriber_password;

    @ManyToMany
    private Set<Author> publishers;


}
