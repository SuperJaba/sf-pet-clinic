package pl.superjaba.sfpetclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}
