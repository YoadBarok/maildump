package com.maildump.maildump.models;


import com.fasterxml.jackson.annotation.*;
import com.maildump.maildump.models.dto.FilterDTO;
import lombok.Data;
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
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String senders;
    private Long timePeriod;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("userId")
    private User user;

    @Override
    public String toString() {
        return "Filter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", senders='" + senders + '\'' +
                ", timePeriod=" + timePeriod +
                ", user=" + user +
                '}';
    }

    public FilterDTO toDTO() {
        return new FilterDTO(this.id, this.name, this.senders, this.timePeriod, this.user.getId());
    }

}
