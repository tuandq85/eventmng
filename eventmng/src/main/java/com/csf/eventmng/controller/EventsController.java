/**
 * 
 */
package com.csf.eventmng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csf.eventmng.entity.Event;
import com.csf.eventmng.repository.EventsRepository;

/**
 * @author tuandq
 *
 */
@Controller // This means that this class is a Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class EventsController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private EventsRepository eventsRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Event> getAllEvents() {
		
		// Get list Events.
		Iterable<Event> result = eventsRepository.findAll();
		
		return result;
	}
}
