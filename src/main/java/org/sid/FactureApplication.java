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
	
	

	public static void main(String[] args) {
		SpringApplication.run(FactureApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
			System.out.println("okok ok ok");
	
	}
}
