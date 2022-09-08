package br.com.visna.mysongs.phonogram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.visna.mysongs.phonogram.controller.PhonogramForm;
import br.com.visna.mysongs.phonogram.model.Phonogram;
import br.com.visna.mysongs.phonogram.repository.PhonogramRepository;
import br.com.visna.mysongs.phonogram.service.endpoint.Song;
import br.com.visna.mysongs.phonogram.service.endpoint.SongEndpoint;

@Service
public class PhonogramService {

	@Autowired
	private PhonogramRepository repository;

	@Autowired
	SongEndpoint songEndpoint;
	
	public List<Phonogram> list(){
		return repository.findAll();		
	}
	
	public Phonogram insert(PhonogramForm phonogramForm){
		
		// TODO Obter song pelo nome
		// TODO Obter artista pelo nome
		
		List<Song> songList = songEndpoint.getAllSongs();
		Song song = songList.get(0);
		
		System.out.println(song.getName());
		return new Phonogram(-1L, -1L, -1L);
	}
}
