package com.service.stats.service;

import java.util.List;

import com.service.stats.model.StatsModel;

public interface StatsDataService {
	public List<StatsModel> getAllServerStats();
	
	public void updateServerStats(List<StatsModel> statsModels);
}
