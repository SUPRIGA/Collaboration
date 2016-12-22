app.factory('ForumService',function($http){
	
	var forumService=this;
	
	var BASE_URL="http://localhost:8070/CollaborationBackend/"
	
	
	
	forumService.registerForum=function(forum){
		return $http.post(BASE_URL + "forum",forum) 
	}
	return forumService;
})