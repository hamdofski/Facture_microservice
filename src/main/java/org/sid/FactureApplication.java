package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactureApplication implements CommandLineRunner {
	@Autowired
	private FactureRepository factureRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(FactureApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		factureRepository.findAll().forEach(f->{
			System.out.println(f.getIdFacture());
		});
	}
}
