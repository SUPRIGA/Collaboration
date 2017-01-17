package com.second.CollaborationBack.DAO;

import java.util.List;

import com.second.CollaborationBack.model.Blog;
public interface BlogDAO {

	public List<Blog> list();
	
	public Blog get(int bid);
	
	public Blog saveOrUpdate(Blog blog);
		
	public void delete(int bid);
	
	
}
