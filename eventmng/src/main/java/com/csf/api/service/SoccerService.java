/**
 * 
 */
package com.csf.api.service;

import java.util.List;

/**
 * @author TuanDQ
 *
 */
public interface SoccerService {
    public List<String> getAllTeamPlayers(long teamId);
    public void addPlayer(String name, String position, int number);
}
