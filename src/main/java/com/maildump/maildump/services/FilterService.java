package com.maildump.maildump.services;

import com.maildump.maildump.models.Filter;

import java.util.List;

public interface FilterService {
    List<Filter> getAllFilters();
    List<Filter> getAllByUserId(Long userId);
}
