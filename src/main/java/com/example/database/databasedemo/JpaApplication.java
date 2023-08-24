package com.example.database.databasedemo;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jpa.PersonJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
;

import java.sql.Timestamp;

@SpringBootApplication

public class JpaApplication implements CommandLineRunner {
	@Autowired
	PersonJpaRepo jpaRepo;

	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(jpaRepo.save(new Person(10004,"Sam","Bhayanddar",Timestamp.valueOf("2003-05-01 09:01:15"))));
		System.out.println(jpaRepo.save(new Person(1,"Samruddhi","Bhayandar",Timestamp.valueOf("2003-05-01 09:01:15"))));

		System.out.println(jpaRepo.findById(1));
		System.out.println(jpaRepo.findAll());
		/*
		System.out.println("values delete are total of"+" "+ jpaRepo.delById(10003));
		System.out.println(jpaRepo.getALL());

		System.out.println(jpaRepo.getALL());
		System.out.println(jpaRepo.getALL());

		 */
	}
}
