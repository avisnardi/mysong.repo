package br.com.visna.mysongs.msartist.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.visna.mysongs.msartist.model.Artist;

@Repository
public interface ArtistRepository extends org.springframework.data.repository.Repository<Artist, Long> {
	public List<Artist> findAll();
}
