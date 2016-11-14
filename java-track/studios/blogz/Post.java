package blogz;

import java.util.ArrayList;
import java.util.Date;

public class Post extends Entity{

	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	
	private static ArrayList<Post>PostList = new ArrayList<Post>();
	
	public Post(String title, String body, String author, int uid){
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		Date d = new Date();
		this.created = d;
		this.modified = d;
	}
	
	public String getTitle(){
		return this.title;
	}
	public String getBody(){
		return this.body;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public static void addToPostList(Post newPost){
		PostList.add(newPost);
	}
	
	public void updateTitle(String newTitle){
		this.title = newTitle;
		this.modified = new Date();
	}
	
	public void updatedBody(String newBody){
		this.body = newBody;
		this.modified = new Date();
	}
}
