package br.com.visna.mysongs.phonogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MysongsMsPhonogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysongsMsPhonogramApplication.class, args);
	}

}
