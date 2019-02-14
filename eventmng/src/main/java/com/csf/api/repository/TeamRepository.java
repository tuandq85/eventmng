/**
 * 
 */
package com.csf.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csf.api.entity.TeamEntity;

/**
 * @author TuanDQ
 *
 */
@Repository
public interface TeamRepository extends CrudRepository<TeamEntity, Long> {

	TeamEntity findByPlayers(long playerId);
}