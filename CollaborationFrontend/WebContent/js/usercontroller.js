app.controller('UserController',function($scope,$location,UserService){
	$scope.user={id:'',user_name:'',password:'',email_id:'',role:'',mobile_number:'',gender:''};
	$scope.message;
	$scope.submit=function(){
		console.log('Entering - submit function in usercontroller')
		UserService.authenticate($scope.user)
		.then(function(response){
				$scope.user=response.data;
				$location.path("/home");
		},
		function(response){//invalid user name and password - failure 
			 console.log('invalid username and password')
			  $scope.message="Invalid Username and Password";
			  $location.path("/login");
		})
	}
	
	$scope.registerUser=function(){
		console.log('entering registerUser')
		UserService.registerUser($scope.user)
		.then(function(response){ //success 
			console.log("registration success" + response.status)
			$location.path("/home");
		},function(response){//failure
			console.log("registration failed" + response.status)
			console.log(response.data)
			$scope.errorMessage="Registration failed...." + response.data.message
			$location.path("/register")
		})
	}
})