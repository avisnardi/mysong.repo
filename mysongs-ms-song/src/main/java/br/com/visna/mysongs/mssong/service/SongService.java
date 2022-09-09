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
	
	public List<Song> searchByName(String name) {
		// TODO Incluir paginação, ordenação e filtros
		return repository.findByName(name);
	}
	
}
