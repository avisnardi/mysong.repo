package br.com.visna.mysongs.phonogram.service.endpoint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ArtistEndpoint", url="http://localhost:3002/artist")
public interface ArtistEndpoint {  
	
	@RequestMapping(method = RequestMethod.GET, value = "/name")
	List<Artist> searchByName(@RequestParam(value="name") String name);
}
