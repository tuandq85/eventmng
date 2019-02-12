/**
 * 
 */
package com.csf.eventmng.repository;

import org.springframework.data.repository.CrudRepository;

import com.csf.eventmng.entity.Event;

/**
 * @author tuandq
 *
 */
public interface EventsRepository extends CrudRepository<Event, Integer> {

}
