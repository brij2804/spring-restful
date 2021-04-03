package com.brijesh.restful.service;

import com.brijesh.restful.beans.Post;
import com.brijesh.restful.beans.User;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostDaoService {

    public static List<Post> posts = new ArrayList<>();
    public static int postCounter=0;


    //all posts for a user
    public List<Post> findAll(Integer userId){
        List<Post> userPosts= new ArrayList<>();
      for(Post post:posts){
          if(post.getUserId()==userId){
              userPosts.add(post);
          }
      }
        return userPosts;
    }
    //create a post for a user
    public Post save(Post post,Integer userId){
        if(post.getId()==null){
            post.setId(++postCounter);
        }
        if(post.getUserId()==null){
          post.setUserId(userId);
        }
       posts.add(post);
        return post;
    }
    //retrive details of a post
    public Post findOne(Integer postId, Integer userId){
        for(Post post:posts){
            if(post.getId()==postId && post.getUserId()==userId){
                return post;
            }
        }
        return null;
    }

}
