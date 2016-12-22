app.factory('JobService',function($http){
	
	var jobService=this;
	
	var BASE_URL="http://localhost:8070/CollaborationBackend/"
	
	
	
	jobService.registerJob=function(job){
		return $http.post(BASE_URL + "job",job) 
	}
	return jobService;
})