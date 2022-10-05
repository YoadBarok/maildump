package com.maildump.maildump.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.maildump.maildump.models.dto.MailboxDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Transactional
public class Mailbox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String password;
    private String name;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("userId")
    private User user;
    @Lob
    private Set<Integer> filtersIds;

    public Mailbox(String address, String password, String name, User user) {
        this.address = address;
        this.password = password;
        this.name = name;
        this.user = user;
        this.filtersIds = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Mailbox{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", filtersIds=" + filtersIds +
                ", user=" + user +
                '}';
    }

    public MailboxDTO toDTO() {
        return new MailboxDTO(this.id, this.address, this.name, this.user.getId(), this.filtersIds);
    }
}
