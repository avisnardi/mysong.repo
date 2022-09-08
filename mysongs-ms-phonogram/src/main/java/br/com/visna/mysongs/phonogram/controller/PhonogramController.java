package br.com.visna.mysongs.phonogram.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visna.mysongs.phonogram.model.Phonogram;
import br.com.visna.mysongs.phonogram.service.PhonogramService;

@RestController
@RequestMapping("/phonogram")
public class PhonogramController {

	@Autowired
	private PhonogramService service;

	@GetMapping
	public List<Phonogram> list() {
		return service.list();
	}

	@PostMapping
	public Phonogram insert(@RequestBody PhonogramForm phonogramForm) {
		return service.insert(phonogramForm);
	}
}
