/**
 * 
 */
package com.csf.api.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author TuanDQ
 *
 */
@Controller
public class WelcomeController {
	private final String HOME = "index";
	private final String POST_PAGE = "post";
	private final String PUT_PAGE = "put";
	private final String DEL_PAGE = "delete";

	@GetMapping("/")
	public String helloPage(Model model) {
		model.addAttribute("user", "Dang Quang Tuan");

		String sServices = System.getenv("VCAP_SERVICES");
		JSONObject jServices = new JSONObject(sServices);
		JSONArray aElephant = jServices.getJSONArray("elephantsql");
		JSONObject jElephant = aElephant.getJSONObject(0);
		JSONObject jCredentials = jElephant.getJSONObject("credentials");
		String dbUrl = jCredentials.getString("uri");

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl(dbUrl);

		return HOME;
	}

	@PostMapping("/")
	public String postPage(Model model) {
		return POST_PAGE;
	}

	@PutMapping("/")
	public String putPage(Model model) {
		return PUT_PAGE;
	}

	@DeleteMapping("/")
	public String deletePage(Model model) {
		return DEL_PAGE;
	}
}
