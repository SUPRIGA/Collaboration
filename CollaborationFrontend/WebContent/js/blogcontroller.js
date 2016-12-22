app.controller('BlogController',function($scope,$location,BlogService){
	
	$scope.blog={blog_id:'',blog_content:'',blog_date:'',blog_name:''};
	
	$scope.registerBlog=function(){
		console.log('entering registerBlog')
		BlogService.registerBlog($scope.blog)
		.then(function(response){ 
			console.log("blog success" + response.status)
			alert("posted blog successfully")
			$location.path("/home");
		},function(response){
			console.log("blog failed" + response.status)
			console.log(response.data)
			$location.path("/blog")
		})
	}
})

/*app.controller('BlogController',function($scope,$location,BlogService){
	$scope.blog={blog_id:'',blog_content:'',blog_date:'',blog_name:''};
	$scope.registerBlog=function(){
		console.log('entering  in blog controller')
		BlogService.registerBlog($scope.blog)
		.then(function(response){
			console.log("successfully inserted blog details");
			alert("Posted blog successfully");
			$location.path("/home");
		},function(respone){
			console.log("failure " +response.status);
			$location.path("/blog");
		})
	}
})*/