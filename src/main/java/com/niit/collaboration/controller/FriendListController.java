package com.niit.collaboration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.niit.collaboration.model.FriendList;
import com.niit.collaboration.service.FriendListDAO;

@Controller
public class FriendListController {
	
	@Autowired
	private FriendListDAO friendlistDAO;
	
	
	public FriendListDAO getFriendListDAO() {
		return friendlistDAO;
	}

	public void setFriendListDAO(FriendListDAO friendlistDAO) {
		this.friendlistDAO = friendlistDAO;
	}
	
	@RequestMapping(value="friendlist",method=RequestMethod.GET)
	public  ResponseEntity<List<FriendList>> getAllFriendList(){
		
		System.out.println(friendlistDAO.getAllFriendList());
		
		List<FriendList> friendlist=friendlistDAO.getAllFriendList();
		
		if(friendlist.isEmpty())
			return new ResponseEntity<List<FriendList>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<FriendList>>(friendlist,HttpStatus.OK);
	}

	//http://localhost:8080/crudusingrest/person/2
	@RequestMapping(value="friendlist/{id}",method=RequestMethod.GET)
	public ResponseEntity<FriendList> getFriendListById(@PathVariable(value="id") int id){
		FriendList friendlist=friendlistDAO.getFriendList(id);
		if(friendlist==null)
			return new ResponseEntity<FriendList>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<FriendList>(friendlist,HttpStatus.OK);
	}


	@RequestMapping(value="friendlist",method=RequestMethod.POST)
	//RequestBody - to convert JSON data to java object
	//ResponseBody -> servet to client
	//RequestBody -> client to server
	public ResponseEntity<Void> createFriendList(@RequestBody FriendList friendlist,
			UriComponentsBuilder build){
		//personDAO.savePerson(friendlist);
		HttpHeaders headers=new HttpHeaders();
		//http://localhost:8080/appname/person/210
		java.net.URI urilocation=
				build.path("friendlist/")
				.path(String.valueOf(friendlist.getFriendlist_id()))
				.build()
				.toUri();
		headers.setLocation(urilocation);
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}

	@RequestMapping(value="friendlist/{id}",method=RequestMethod.PUT)
	public ResponseEntity<FriendList> updateFriendList(
			@PathVariable int id,@RequestBody FriendList friendlist){
		
		FriendList updatedFriendList=friendlistDAO.updateFriendList(id, friendlist);
		if(friendlist==null)
			return new ResponseEntity<FriendList>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<FriendList>(updatedFriendList,HttpStatus.OK);
		
		
	}
	@RequestMapping(value="friendlist/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteFriendList(@PathVariable int id){
		FriendList friendlist=friendlistDAO.getFriendList(id);
		if(friendlist==null)
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		friendlistDAO.deleteFriendList(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}


	

}
