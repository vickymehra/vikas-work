package com.service.stats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.stats.dao.StatsDataRepository;
import com.service.stats.model.StatsModel;

@Service
public class StatsDataServiceImpl implements StatsDataService{
	
	@Autowired
	private StatsDataRepository dataRepository;
	
	public List<StatsModel> getAllServerStats(){
		return dataRepository.findAll();
	}
	
	public void updateServerStats(List<StatsModel> models){
		dataRepository.saveAll(models);
	}
}
