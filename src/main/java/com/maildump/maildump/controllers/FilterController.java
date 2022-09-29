package com.maildump.maildump.controllers;

import com.maildump.maildump.models.Filter;
import com.maildump.maildump.services.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "filter/")
public class FilterController {
    private final FilterService filterService;

    @Autowired
    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @GetMapping
    public List<Filter> getAllFilters() {
        return this.filterService.getAllFilters();
    }
}
