package com.example.database.databasedemo.Jdbcmain;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.personJdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
@ComponentScan("com.example.database.databasedemo")
@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {
	@Autowired
	personJdbcDAO dao;


	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dao.getALL());
		System.out.println(dao.findById(10001));
		System.out.println("values delete are total of"+" "+dao.delById(10003));
		System.out.println(dao.getALL());
		System.out.println(dao.insert(new Person(10004,"Sam","Bhayanddar",Timestamp.valueOf("2003-05-01 09:01:15"))));
		System.out.println(dao.getALL());
		System.out.println(dao.update(new Person(10004,"Samruddhi","Bhayandar",Timestamp.valueOf("2003-05-01 09:01:15"))));
		System.out.println(dao.getALL());


	}
}
