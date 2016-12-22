app.controller('JobController',function($scope,$location,JobService){
	
	$scope.job={job_id:'',job_designation:'',job_details:'',company_name:'',address:''};
	
	$scope.registerJob=function(){
		console.log('entering registerJob')
		JobService.registerJob($scope.job)
		.then(function(response){ 
			console.log("job success" + response.status)
			alert("posted job successfully")
			$location.path("/home");
		},function(response){
			console.log("job failed" + response.status)
			console.log(response.data)
			$location.path("/job")
		})
	}
})
