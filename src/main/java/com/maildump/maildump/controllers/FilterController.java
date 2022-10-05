package com.maildump.maildump.controllers;

import com.maildump.maildump.models.Filter;
import com.maildump.maildump.models.dto.FilterDTO;
import com.maildump.maildump.services.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "filter/")
public class FilterController {
    private final FilterService filterService;

    @Autowired
    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @GetMapping
    public List<FilterDTO> getAllFilters() {
        return this.filterService.getAllFilters().stream()
                .map(Filter::toDTO).collect(Collectors.toList());
    }
}
