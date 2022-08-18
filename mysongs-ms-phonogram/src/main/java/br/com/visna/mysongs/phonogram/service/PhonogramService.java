package br.com.visna.mysongs.phonogram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.visna.mysongs.phonogram.model.Phonogram;
import br.com.visna.mysongs.phonogram.repository.PhonogramRepository;

@Service
public class PhonogramService {

	@Autowired
	private PhonogramRepository repository;
	
	public List<Phonogram> list(){
		return repository.findAll();		
	}
	
	public List<Phonogram> listBkp(){
		Phonogram phonogram = new Phonogram();
		List<Phonogram> list = new ArrayList<>();
		
		phonogram.setArtistId(1L);
		phonogram.setSongId(2L);
		list.add(phonogram);
		return list;		
	}
}
