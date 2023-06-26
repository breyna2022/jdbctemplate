/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.model.dao;

import com.example.model.entity.Post;
import java.util.List;

/**
 *
 * @author prof.software
 */
public interface PostDao {
    int create(Post p);
    int update(Post p);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
