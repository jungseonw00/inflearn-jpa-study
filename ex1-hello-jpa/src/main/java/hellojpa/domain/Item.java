package hellojpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

@Entity
@Inheritance(strategy = TABLE_PER_CLASS)
@DiscriminatorColumn
@Getter
@Setter
public abstract class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;
}
