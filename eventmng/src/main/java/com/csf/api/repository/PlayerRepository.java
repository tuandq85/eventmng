/**
 * 
 */
package com.csf.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csf.api.entity.PlayerEntity;

/**
 * @author TuanDQ
 *
 */
@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
	List<PlayerEntity> findByTeamId(long teamId);
}