package com.niit.collaboration.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.collaboration.model.FriendList;


@Repository("FriendListDAO")
public class FriendListDAOImpl implements FriendListDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public FriendListDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}

	@Transactional
	public List<FriendList> getAllFriendList() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from FriendList");
		List<FriendList> friendlist=query.list();
		session.close();
		return friendlist;
	}
	
	

	@Transactional
	public FriendList getFriendList(int friendlist_id) {
		return(FriendList)sessionFactory.getCurrentSession().get(FriendList.class, friendlist_id);
	}

	@Transactional
	public void insertFriendList(FriendList friendlist) {
		sessionFactory.getCurrentSession().saveOrUpdate(friendlist);

	}

	@Transactional
	public FriendList updateFriendList(int id, FriendList friendlist) {
Session session=sessionFactory.openSession();
		
		System.out.println("Id of FriendList is " +friendlist.getFriendlist_id());
		if(session.get(FriendList.class, id)==null)
		return null;
		session.merge(friendlist); 
		
		FriendList updatedFriendList=(FriendList)session.get(FriendList.class, id); 
		session.flush();
		session.close();
		return updatedFriendList;
	}
	
	
	@Transactional
	public void deleteFriendList(int id) {
		Session session=sessionFactory.openSession();
		
		FriendList friendlist=(FriendList)session.get(FriendList.class, id);
		session.delete(friendlist);
		
		session.flush();
		session.close();
	}


	@Transactional
	public void deleteallFriendList(FriendList friendlist) {
		// TODO Auto-generated method stub

	}

}
