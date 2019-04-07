package com.service.stats.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.stats.model.StatsModel;

@Repository
public interface StatsDataRepository extends JpaRepository<StatsModel, Integer>{
}
