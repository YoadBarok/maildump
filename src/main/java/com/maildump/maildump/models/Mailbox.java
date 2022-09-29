package com.maildump.maildump.models;

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
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Mailbox_Filter",
            joinColumns = { @JoinColumn(name = "mailbox_id") },
            inverseJoinColumns = { @JoinColumn(name = "filter_id") }
    )
    Set<Filter> filters = new HashSet<>();
    @ManyToOne(cascade = CascadeType.DETACH)
    private User user;


    public Mailbox(String address, String password, String name, Set<Filter> filters) {
        this.address = address;
        this.password = password;
        this.name = name;
        this.filters = filters;
    }
}
