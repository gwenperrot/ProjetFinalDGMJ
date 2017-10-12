var app=angular.module("myApp",[]);
app.controller("pdtCTRL",function($scope, $http){
	$http.get("http://localhost:8080/springDataAngularJs/index")
    .then(function(response) {
        $scope.produits = response.data;
       
    })
    .catch (function(reason){
    	alert("erreur de récupération des données");
    	console.log(reason);	
    })
});

app.controller("ajoutCTRL", function($scope, $http) {
	$scope.produit={};
	$scope.ajouter=function(){
		$http.post("http://localhost:8080/springDataAngularJs/saveProduit", $scope.produit)
		.then(function(value){
			$scope.produit=value;
		})
		.catch(function(reason){
			alert("erreur ajout");
			console.log(reason);
		})
	}
});

app.controller("suppCTRL", function($scope, $http) {
	$scope.produit={};
	$scope.ajouter=function(){
		$http.post("http://localhost:8080/springDataAngularJs/saveProduit", $scope.produit)
		.then(function(value){
			$scope.produit=value;
		})
		.catch(function(reason){
			alert("erreur ajout");
			console.log(reason);
		})
	}
});