package com.base_team.base_team.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.base_team.base_team.dto.TeamDto;
import com.base_team.base_team.model.TeamModel;
import com.base_team.base_team.repository.TeamRepository;


/**
 * TeamService
 */
@Service 
public class TeamService {
    private final TeamRepository teamRepository;
	public TeamService(TeamRepository teamRepository){
	this.teamRepository = teamRepository; 
	}
	public List<TeamDto> findAll(){
	    return teamRepository.findAll().stream().map(TeamModel::toDto).toList();
	}
}