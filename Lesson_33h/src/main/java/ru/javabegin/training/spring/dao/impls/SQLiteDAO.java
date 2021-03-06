package ru.javabegin.training.spring.dao.impls;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(MP3 mp3) {
        String sql = "insert into mp3 (name, author) VALUES (?, ?)";
        jdbcTemplate.update(sql, new Object[]{mp3.getName(), mp3.getAuthor()});
    }

    @Override
    public void insert(List<MP3> mp3List) {
        for (MP3 mp3 : mp3List) {
            insert(mp3);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from mp3 where id=?";
        int result = jdbcTemplate.update(sql, id);
    }

    @Override
    public void delete(MP3 mp3) {
        delete(mp3.getId());
    }

    @Override
    public MP3 getMP3ByID(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MP3> getMP3ListByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MP3> getMP3ListByAuthor(String author) {
        // TODO Auto-generated method stub
        return null;
    }
}
