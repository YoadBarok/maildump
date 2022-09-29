package com.maildump.maildump.services.impl;

import com.maildump.maildump.models.Filter;
import com.maildump.maildump.repositories.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterServiceImpl implements com.maildump.maildump.services.FilterService {

    private final FilterRepository filterRepository;

    @Autowired
    public FilterServiceImpl(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @Override
    public List<Filter> getAllFilters() {
        return this.filterRepository.findAll();
    }

    @Override
    public List<Filter> getAllByUserId(Long userId) {
        return this.filterRepository.findAllByUserId(userId);
    }
}
