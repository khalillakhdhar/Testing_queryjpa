package com.tp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.model.Movie;
import com.tp.repositories.MovieRepository;
@Service
public class MovieService {
@Autowired
MovieRepository mr;
void create(Movie mv)
{
	mr.save(mv);

}
List<Movie> findMovies()
{
return 	(List<Movie>) mr.findAll();

}
List<Movie> findMoviebydirectorEnd(String directorEnd)
{
return 	(List<Movie>) mr.findByDirectorEndsWith(directorEnd);

}	
List<Movie> findMoviebydirectorNotLike(String directorEnd)
{
return 	(List<Movie>) mr.findByDirectorNotLike(directorEnd);

}	
List<Movie> findMoviebytitlecn(String title)
{
return 	(List<Movie>) mr.findByTitleContaining(title);

}	
List<Movie> findMoviebytitlelike(String title)
{
return 	(List<Movie>) mr.findByTitleLike(title);

}	

}
