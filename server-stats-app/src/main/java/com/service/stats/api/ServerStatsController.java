package com.service.stats.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.stats.model.StatsModel;
import com.service.stats.service.StatsDataService;

@RestController
public class ServerStatsController {

	@Autowired
	StatsDataService statsDataService;

	@CrossOrigin
	@ResponseBody
	@RequestMapping(value = "/stats", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<StatsModel>> getServerStats() {
		List<StatsModel> serverStats = statsDataService.getAllServerStats();
		return new ResponseEntity<>(serverStats, HttpStatus.OK);
	}
}
