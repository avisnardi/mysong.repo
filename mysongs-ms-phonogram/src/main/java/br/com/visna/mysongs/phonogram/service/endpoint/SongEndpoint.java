package br.com.visna.mysongs.phonogram.service.endpoint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="SongEndpoint", url="http://localhost:3001/song")
public interface SongEndpoint {

	@RequestMapping(method = RequestMethod.GET, value = "")
	List<Song> getAllSongs();
}
