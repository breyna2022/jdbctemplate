
package com.example.model.controller;


import com.example.model.entity.Post;
import com.example.model.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author prof.software
 */
@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/all")
    public String lista(Model model){
        model.addAttribute("posts", postService.readAll());        
        return "post/lista";
        
    }
    @GetMapping("/add")
    public String post(Model model){
        Post post = new Post();
        model.addAttribute("post", post);        
        return "post/add";        
    }
    @PostMapping("/save")
    public String post(@Validated @ModelAttribute Post post, Model model){
        postService.create(post);                  
        return "redirect:/posts/all";
        
    }
    @GetMapping("/delete/{id}")
    public String del(@PathVariable("id") int id){
        postService.delete(id);                  
        return "redirect:/posts/all";
        
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        Post post = postService.read(id);
        model.addAttribute("post", post);
        return "post/add";
        
    }
    @PutMapping("/update")
    public String edit2(@RequestBody Post post){  
        System.out.println("id: "+post.getIdpost());
        postService.update(post);
        return "redirect:/posts/all";
        
    }
    
}
