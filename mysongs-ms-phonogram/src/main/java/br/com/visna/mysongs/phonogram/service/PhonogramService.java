package br.com.visna.mysongs.phonogram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.visna.mysongs.phonogram.controller.PhonogramForm;
import br.com.visna.mysongs.phonogram.model.Phonogram;
import br.com.visna.mysongs.phonogram.repository.PhonogramRepository;
import br.com.visna.mysongs.phonogram.service.endpoint.Artist;
import br.com.visna.mysongs.phonogram.service.endpoint.ArtistEndpoint;
import br.com.visna.mysongs.phonogram.service.endpoint.Song;
import br.com.visna.mysongs.phonogram.service.endpoint.SongEndpoint;

@Service
public class PhonogramService {

	@Autowired
	private PhonogramRepository repository;

	@Autowired
	SongEndpoint songEndpoint;
	
	@Autowired
	ArtistEndpoint artistEndpoint;
	
	
	public List<Phonogram> list(){
		return repository.findAll();		
	}
	
	public Phonogram insert(PhonogramForm phonogramForm){
		
		// TODO Obter song pelo nome
		// TODO Obter artista pelo nome
		// TODO Criar e chamar metodos que força a criação do song e do artist caso não existam.
		
		System.out.println("1: " + phonogramForm.getSongName());
		
		List<Song> songList = songEndpoint.searchByName(phonogramForm.getSongName());
		Song song = songList.get(0);
		System.out.println(song.getName());
		
		
		List<Artist> artistList = artistEndpoint.searchByName(phonogramForm.getArtistName());
		Artist artist = artistList.get(0);
		System.out.println(artist.getName());

		return new Phonogram(-1L, song.getId(), artist.getId());
	}
}
