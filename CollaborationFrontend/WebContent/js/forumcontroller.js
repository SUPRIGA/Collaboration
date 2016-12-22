app.controller('ForumController',function($scope,$location,ForumService){
	
	$scope.forum={forum_id:'',user_name:'',forum_title:'',forum_comment:'',forum_date:''};
	
	$scope.registerForum=function(){
		console.log('entering registerJob')
		ForumService.registerForum($scope.forum)
		.then(function(response){ 
			console.log("forum success" + response.status)
			alert("create forum successfully")
			$location.path("/home");
		},function(response){
			console.log("forum failed" + response.status)
			console.log(response.data)
			$location.path("/forum")
		})
	}
})
