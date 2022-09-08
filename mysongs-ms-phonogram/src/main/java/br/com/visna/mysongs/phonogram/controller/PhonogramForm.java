package br.com.visna.mysongs.phonogram.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PhonogramForm {
	
	@NotNull @NotEmpty @Length(min = 2)
	private String songName;
	
	@NotNull @NotEmpty @Length(min = 2)
	private String artistName;

	public String getSongName() {
		return songName;
	}
	
	public String getArtistName() {
		return artistName;
	}

}
