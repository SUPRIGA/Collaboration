package com.niit.collaboration.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaboration.model.Blog;
import com.niit.collaboration.model.Person;

@Repository("BlogDAO")
public class BlogDAOImpl implements BlogDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public BlogDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}

	@Transactional
	public List<Blog> getAllBlog() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Blog");
		List<Blog> blog=query.list();
		session.close();
		return blog;
	}

	@Transactional
	public Blog getBlog(int blog_id) {
		return(Blog)sessionFactory.getCurrentSession().get(Blog.class, blog_id);
	}

	@Transactional
	public void insertBlog(Blog blog) {
		sessionFactory.getCurrentSession().saveOrUpdate(blog);

	}

	@Transactional
	public Blog updateBlog(int id, Blog blog) {
Session session=sessionFactory.openSession();
		
		System.out.println("Id of Blog is " +blog.getBlog_id());
		if(session.get(Person.class, id)==null)
		return null;
		session.merge(blog); 
		
		Blog updatedBlog=(Blog)session.get(Blog.class, id); 
		session.flush();
		session.close();
		return updatedBlog;
	}

	@Transactional
	public void deleteBlog(int id) {
		Session session=sessionFactory.openSession();
		
		Blog blog=(Blog)session.get(Blog.class, id);
		session.delete(blog);
		
		session.flush();
		session.close();
	}

	@Transactional
	public void deleteallBlog(Blog blog) {
		// TODO Auto-generated method stub

	}

}
