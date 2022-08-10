package br.com.visna.mysongs.mssong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode;

// TODO Entender a notação Builder do lombok 
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode 
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
