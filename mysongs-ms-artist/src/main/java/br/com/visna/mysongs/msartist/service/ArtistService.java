package br.com.visna.mysongs.msartist.service;

import java.util.ArrayList;
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
	
	public List<Artist> listBkp() {
		// TODO Incluir paginação, ordenação e filtros
		Artist artist = new Artist();
		artist.setId(1L);
		artist.setName("Alceu Valença");
		
		Artist artist1 = new Artist();
		artist1.setId(2L);
		artist1.setName("Dominguinhos");
		
		
		List<Artist> list = new ArrayList<Artist>();
		list.add(artist);
		list.add(artist1);
		
		return list;
	}
}
