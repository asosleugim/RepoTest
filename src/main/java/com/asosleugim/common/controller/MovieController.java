package com.asosleugim.common.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.asosleugim.common.movieData.Movie;

@Controller
@RequestMapping("/movie")
public class MovieController {

	/**
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	// http://localhost:8081/SpringMVC/movie/ironMan

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name,
			@ModelAttribute("movie") Movie movie, ModelMap model) {

		// ModelAndView modelAndView = new ModelAndView();
		// Movie movieObject = new Movie();
		// movieObject.setCurrentTime(new Time(0));
		// movieObject.setName(name);
		// modelAndView.addObject("movieData", movieObject);
		model.addAttribute("movie", movie);

		return "list";

	}
	
	
	@RequestMapping(value = "/sports/{name}", method = RequestMethod.GET)
	public String getSport(@PathVariable String name,
			@ModelAttribute("sports") Movie sports, ModelMap model) {

		// ModelAndView modelAndView = new ModelAndView();
		// Movie movieObject = new Movie();
		// movieObject.setCurrentTime(new Time(0));
		// movieObject.setName(name);
		// modelAndView.addObject("movieData", movieObject);
		model.addAttribute("sports", sports);

		return "sportsList";

	}

	@ModelAttribute("movie")
	public Movie getMovieName() {
		Movie movieObject = new Movie();
		movieObject.setCurrentTime(new Date());
		movieObject.setName("Terminator II");
		movieObject.setMovieLocation("Austin, TX");
		movieObject.setMovieStartTime(new Date());
		movieObject.setMovieType("Action");

		return movieObject;
	}

	
	@ModelAttribute("sports")
	public Movie getMovieSports() {
		Movie movieObject = new Movie();
		movieObject.setCurrentTime(new Date());
		movieObject.setName("Troy");
		movieObject.setMovieLocation("San Antonio, TX");
		movieObject.setMovieStartTime(new Date());
		movieObject.setMovieType("Action");

		return movieObject;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getMovieEmpty() {

		return "emptyList";

	}

}