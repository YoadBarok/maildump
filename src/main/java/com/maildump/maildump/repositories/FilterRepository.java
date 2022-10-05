package com.maildump.maildump.repositories;

import com.maildump.maildump.models.Filter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilterRepository extends JpaRepository<Filter, Long> {
    List<Filter> findAllByUserId(Long userId);
}
