package com.maildump.maildump.models.dto;

import lombok.Data;

@Data
public class FilterDTO {

    private Long id;
    private String name;
    private String senders;
    private Long timePeriod;
    private Long userId;

    public FilterDTO(Long id, String name, String senders, Long timePeriod, Long userId) {
        this.id = id;
        this.name = name;
        this.senders = senders;
        this.timePeriod = timePeriod;
        this.userId = userId;
    }

}
