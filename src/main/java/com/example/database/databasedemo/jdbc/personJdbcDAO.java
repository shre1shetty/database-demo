package com.example.database.databasedemo.jdbc;

import com.example.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class personJdbcDAO {
    @Autowired
    JdbcTemplate jdbc;

    class PersonRowMapper implements RowMapper<Person>{
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person=new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setDatebirth(rs.getTimestamp("date_birth"));
            return person;
        }
    }

    public List<Person> getALL(){
        return jdbc.query("select*from person",
                new PersonRowMapper());
    }
    public Person findById(int id){
        return jdbc.queryForObject("select*from person where id=?",new Object[]{id}, new PersonRowMapper());
    }

    public int delById(int id){
        return jdbc.update("delete from person where id=?",new Object[]{id});
    }

    public int insert(Person person){
        return jdbc.update("insert into person values(?,?,?,?)",
                new Object[]{person.getId(),person.getName(),person.getLocation(),
                        new Timestamp(person.getDatebirth().getTime())});
    }

    public int update(Person person){
        return jdbc.update("update person set name=?,location=? where id=?",
                new Object[]{ person.getName(),person.getLocation(), person.getId()});
    }

}
