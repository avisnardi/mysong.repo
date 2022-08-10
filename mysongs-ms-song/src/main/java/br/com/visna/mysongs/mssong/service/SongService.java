package br.com.visna.mysongs.mssong.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.visna.mysongs.mssong.model.Song;
import br.com.visna.mysongs.mssong.repository.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository repository;
	
	public List<Song> list() {
		// TODO Incluir paginação, ordenação e filtros
		return repository.findAll();
	}
	
	public List<Song> listBkp() {
		
		System.out.println("Passou ............................");
		List<Song> list = new ArrayList<Song>();
		Song s = new Song();

		s.setId(1L);
		s.setName("Feira de Mangio");
		
		list.add(s);
		
		return list;
	}
	
}
