package com.tp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tp.model.Movie;

@RestController
public class MovieController {
@Autowired 
MovieService mvs;
@GetMapping("all")
public List<Movie> getall()
{
	
return mvs.findMovies();

}
@GetMapping("/directorends/{directorEnd}")
public List<Movie> getdirectorEnd(@PathVariable(value = "directorEnd") String directorEnd)
{
	
return mvs.findMoviebydirectorEnd(directorEnd);

}
@GetMapping("/directornot/{directorEnd}")
public List<Movie> getdirectornot(@PathVariable(value = "directorEnd") String directorEnd)
{
	
return mvs.findMoviebydirectorNotLike(directorEnd);

}
@GetMapping("/titlecontains/{title}")
public List<Movie> getdirectorLike(@PathVariable(value = "title") String title)
{
	
return mvs.findMoviebytitlecn(title);

}
}
