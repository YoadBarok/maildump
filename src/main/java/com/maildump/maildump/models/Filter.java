package com.maildump.maildump.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(mappedBy = "filters")
    private Set<Mailbox> mailboxes = new HashSet<>();
    private String name;
    private String senders;
    private Long timePeriod;
    @ManyToOne(cascade = CascadeType.DETACH)
    private User user;

}
