package br.com.visna.mysongs.msartist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.visna.mysongs.msartist.model.Artist;
import br.com.visna.mysongs.msartist.repository.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository repository;
	
	public List<Artist> list() {
		// TODO Incluir paginação, ordenação e filtros
		
		return repository.findAll();
	}


	public List<Artist> searchByName(String name) {
		return repository.findByName(name);
	}
}
