package com.example.model.daoImpl;

import com.example.model.dao.PostDao;
import com.example.model.entity.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author prof.software
 */
@Repository
public class PostDaoImpl implements PostDao{
    @Autowired
    private JdbcTemplate template;

    @Override
    public int create(Post p) {
        String SQL= "insert into post(titulo, descripcion, estado) values(?,?,1)";
        return template.update(SQL, new Object[]{p.getTitulo(),p.getDescripcion()});
       
    }

    @Override
    public int update(Post p) {
        String SQL= "update post set titulo=?, descripcion=? where idpost=?";
        return template.update(SQL, new Object[]{p.getTitulo(),p.getDescripcion(),p.getIdpost()});
    }

    @Override
    public int delete(int id) {
        String SQL= "delete from post where idpost=?";
        return template.update(SQL, new Object[]{id});
    }

    @Override
    public Post read(int id) {
        String SQL= "select *from post where idpost=?";
        Post post = template.queryForObject(SQL, 
                BeanPropertyRowMapper.newInstance(Post.class),id);
        return post;
    }

    @Override
    public List<Post> readAll() {
        return template.query("select *from post", 
                BeanPropertyRowMapper.newInstance(Post.class));
    }
    
}
