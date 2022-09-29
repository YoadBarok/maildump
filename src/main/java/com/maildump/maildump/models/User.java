package com.maildump.maildump.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Mailbox> mailboxes;
    @OneToMany(mappedBy = "user")
    private List<Filter> filters;

    public User(String name, String email, String password, List<Mailbox> mailboxes, List<Filter> filters) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mailboxes = mailboxes;
        this.filters = filters;
    }

}
