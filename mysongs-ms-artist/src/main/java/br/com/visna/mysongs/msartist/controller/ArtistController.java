package br.com.visna.mysongs.msartist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.visna.mysongs.msartist.model.Artist;
import br.com.visna.mysongs.msartist.service.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	private ArtistService service;
	
	@GetMapping
	public List<Artist> list() {
		
		return service.list();
		
	}
	
	
	@GetMapping("/name")
	public List<Artist> searchByName(@RequestParam String name) {	
		return service.searchByName(name);
	}
}
