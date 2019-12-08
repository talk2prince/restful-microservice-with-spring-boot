package org.talk2prince.entity;

public class Post {
	int PostId;
	String title;
	String body;
	
	public Post(int postId, String title, String body) {
		
		this.PostId = postId;
		this.title = title;
		this.body = body;
	}

	public int getPostId() {
		return PostId;
	}

	public void setPostId(int postId) {
		PostId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [PostId=" + PostId + ", title=" + title + ", body=" + body + "]";
	}
	
	
}
