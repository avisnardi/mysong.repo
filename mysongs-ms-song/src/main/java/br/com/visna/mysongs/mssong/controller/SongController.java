package br.com.visna.mysongs.mssong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visna.mysongs.mssong.model.Song;
import br.com.visna.mysongs.mssong.service.SongService;

// TODO Tratamento de erro.
// TODO retornar codigos http corretos.
// TODO Implamentar Inclusão
// TODO Implamentar Alteração
// TODO Implamentar Exclusao
// TODO Implamentar Consulta por ID
// TODO Implamentar Consultas com filtros


@RestController 
@RequestMapping("/song")
public class SongController {
	
	@Autowired
	private SongService service;
	
	@GetMapping
	public List<Song> list() {	
		return service.list();
	}
}
