package com.maildump.maildump.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.maildump.maildump.models.dto.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PEOPLE")
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

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mailboxes = new ArrayList<>();
        this.filters = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mailboxes=" + mailboxes +
                ", filters=" + filters +
                '}';
    }

    public UserDTO toDTO() {
        return new UserDTO(this.id, this.name, this.email);
    }
}
