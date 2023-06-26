
package com.example.model.service;

import com.example.model.entity.Post;
import java.util.List;

/**
 *
 * @author prof.software
 */
public interface PostService {
    int create(Post p);
    int update(Post p);
    int delete(int id);
    Post read(int id);
    List<Post> readAll();
}
