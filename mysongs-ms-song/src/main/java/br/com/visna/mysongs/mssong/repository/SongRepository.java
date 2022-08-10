package br.com.visna.mysongs.mssong.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.visna.mysongs.mssong.model.Song;

@Repository
public interface SongRepository extends org.springframework.data.repository.Repository<Song, Long> {

	public List<Song> findAll();
	
}
