/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.model.serviceImpl;

import com.example.model.dao.PostDao;
import com.example.model.entity.Post;
import com.example.model.service.PostService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author prof.software
 */
@Service
public class PostServiceImpl implements PostService
{
@Autowired
private PostDao pdao;
    @Override
    public int create(Post p) {
        return pdao.create(p);
    }

    @Override
    public int update(Post p) {
        return pdao.update(p);
   }

    @Override
    public int delete(int id) {
        return pdao.delete(id);
    }

    @Override
    public Post read(int id) {
        return pdao.read(id);
    }

    @Override
    public List<Post> readAll() {
        return pdao.readAll();
    }
    
}
