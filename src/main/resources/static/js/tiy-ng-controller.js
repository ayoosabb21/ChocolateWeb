angular.module('TIYAngularApp', [])
   .controller('CocoaAppController', function($scope, $http, $timeout) {

          $scope.processSolutionSmalls = function() {
                    console.log("processSolutionSmalls ...");
                    if ($scope.tempSolution.smalls <= 0) {
                        console.log("Done processing solution!");
                        return;
                    }
                    $scope.tempSolution.smalls--;
                    $scope.chocolateRequest.smalls--;
                    $scope.chocolateSolution.smalls++;
                    $timeout($scope.processSolutionSmalls, 1000);
                }

            $scope.processSolutionBigs = function() {
                      console.log("processSolutionBigs ...");
                      if ($scope.tempSolution.bigs <= 0) {
                          console.log("Done processing solution!");
                          return;
                      }
                      $scope.tempSolution.bigs--;
                      $scope.chocolateRequest.bigs--;
                      $scope.chocolateSolution.bigs++;
                      $timeout($scope.processSolutionBigs, 1000);
                  }

        $scope.testFunction = function() {
            console.log("Testing ...");
            alert("Testing ...");
        }

        $scope.makeChocolate = function() {
            console.log("About to go get me some chocolate!");
            console.log($scope.ChocolateInput);

            $http.post("/addChocolateInput.json", $scope.ChocolateInput)
                            .then( // this code below, is only going to get executed after the server gives response *Async*
                                function successCallback(response) {
                                    console.log(response.data);
                                    console.log("Adding chocolate to scope");
                                    $scope.chocolate = response.data; // chocolate equal to all within scoop
                                },
                                function errorCallback(response) {
                                    console.log("Unable to get data");
                                });

        };
        console.log("CocoaAppController ...");
        $scope.ChocolateInput = {};

          $scope.makeArray = function(arraySize) {
                    var returnArray = [];
                    for (var i = 0; i < arraySize; i++) {
                        returnArray.push(i);
                    }
                    return returnArray;
                }

   });
