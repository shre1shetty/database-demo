package com.example.database.databasedemo;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.personJdbcDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class web {
    @Autowired
    personJdbcDAO dao;
    @GetMapping("/welcome")
    public Person welcome(@RequestBody User user){
        System.out.println(user.id);
        return dao.findById(user.id);

    }
}
