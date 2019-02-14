/**
 * 
 */
package com.csf.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.api.entity.PlayerEntity;
import com.csf.api.entity.TeamEntity;
import com.csf.api.repository.PlayerRepository;
import com.csf.api.repository.TeamRepository;

/**
 * @author TuanDQ
 *
 */
@Service
public class SoccerServiceImpl implements SoccerService {
	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private TeamRepository teamRepository;

	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<String>();
		List<PlayerEntity> players = playerRepository.findByTeamId(teamId);
		for (PlayerEntity player : players) {
			result.add(player.getName());
		}
		return result;
	}

	public void addPlayer(String name, String position, int number) {
		TeamEntity barcelona = teamRepository.findOne(1l);
		PlayerEntity newPlayer = new PlayerEntity();
		newPlayer.setName(name);
		newPlayer.setPosition(position);
		newPlayer.setNum(number);
		newPlayer.setTeam(barcelona);
		playerRepository.save(newPlayer);
	}
}