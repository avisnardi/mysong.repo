package br.com.visna.mysongs.phonogram.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.visna.mysongs.phonogram.model.Phonogram;

@Repository
public interface PhonogramRepository extends org.springframework.data.repository.Repository<Phonogram, Long>{

	public List<Phonogram> findAll();
	
}
