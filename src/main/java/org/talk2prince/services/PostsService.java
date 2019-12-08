package org.talk2prince.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.talk2prince.entity.Post;

@Service
public class PostsService {
	
	static List<Post> Posts = new ArrayList<>(
			Arrays.asList(
					new Post(1,"Data type","text"),
					new Post(2,"Classes","text"),
					new Post(3,"Objects","text"),
					new Post(4,"Methods","text")
					)
			
			);

	

	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return Posts;
	}


	public Post getPost(int id) {
		// TODO Auto-generated method stub
		
		for(Post post:Posts) {
			if(post.getPostId()==id) {
				return post;
			}
		}
		return null;
	}


	public void addPost(Post listElement) {
		Posts.add(listElement);
		
	}


	public void updatePost(Post post, int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<Posts.size();i++) {
			Post temppost = Posts.get(i);
			if(temppost.getPostId()==id) {
				Posts.set(i, post);
				return;
			}
		}
	}


	public void deletePost(int id) {

		for(int i=0;i<Posts.size();i++) {
			Post temppost = Posts.get(i);
			if(temppost.getPostId()==id) {
				Posts.remove(i);
				return;
			}
		}
		
	}
}
