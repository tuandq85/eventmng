/**
 * 
 */
package com.csf.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csf.api.service.SoccerService;

/**
 * @author TuanDQ
 *
 */
@Controller
@RequestMapping(path = "/api")
public class SoccerController {

	@Autowired
	SoccerService soccerService;

	@GetMapping(path = "/")
	public String gets(Model model) {

		List<String> players = soccerService.getAllTeamPlayers(1);
		for (String player : players) {
			System.out.println("Introducing Barca player => " + player);
		}

		return "index";
	}
}
