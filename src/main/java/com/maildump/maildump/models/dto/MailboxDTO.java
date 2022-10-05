package com.maildump.maildump.models.dto;

import lombok.Data;

import java.util.Set;

@Data
public class MailboxDTO {
    private Long id;
    private String address;
    private String name;
    private Long userId;
    private Set<Integer> filtersIds;

    public MailboxDTO(Long id, String address, String name, Long userId, Set<Integer> filtersIds) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.userId = userId;
        this.filtersIds = filtersIds;
    }
}
