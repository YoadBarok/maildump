package com.maildump.maildump.models;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Mailbox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String password;
    private String name;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JsonIgnore
    @JoinTable(
            name = "Mailbox_Filter",
            joinColumns = {@JoinColumn(name = "mailbox_id")},
            inverseJoinColumns = {@JoinColumn(name = "filter_id")}
    )
    Set<Filter> filters = new HashSet<>();
    @ManyToOne(cascade = CascadeType.DETACH)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("userId")
    private User user;


    public Mailbox(String address, String password, String name, Set<Filter> filters) {
        this.address = address;
        this.password = password;
        this.name = name;
        this.filters = filters;
    }
}
