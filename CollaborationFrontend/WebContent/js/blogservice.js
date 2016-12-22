app.factory('BlogService',function($http){
	
	var blogService=this;
	
	var BASE_URL="http://localhost:8070/CollaborationBackend/"
	
	
	
	blogService.registerBlog=function(blog){
		return $http.post(BASE_URL + "blog",blog) 
	}
	return blogService;
})