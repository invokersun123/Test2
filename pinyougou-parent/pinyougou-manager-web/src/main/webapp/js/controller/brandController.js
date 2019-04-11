app.controller('brandController', function ($scope, $http, $controller, brandService) {


    $controller('baseController',{$scope:$scope});//继承


    $scope.findAll = function () {
        $http.get("../brand/findAll").success(function (response) {
            $scope.list = response;
        })
    };
    //初始化searchEntity
    $scope.searchEntity={};

    //分页查询
    $scope.pagingQuery = function (page, size) {
        brandService.pagingQuery(page, size).success(function (response) {
            $scope.list = response.list;
            $scope.paginationConf.totalItems = response.totals;
        })
    };
    //保存brand
    $scope.saveBrand = function () {
        var object = null;
        //通过id 是否为null 判断是修改还是新建 品牌
        if ($scope.entity.id != null) {
            object = brandService.updateBrand($scope.entity);
        } else {
            object = brandService.addBrand($scope.entity);
        }
        object.success(function (response) {
            if (response.success) {
                $scope.reloadList();//重新加载
            } else {
                alert(response.resultMessage);
            }
        })
    };
    //将对应的品牌绑定到$scope.entity
    $scope.findOne = function (pojo) {
        $scope.entity = pojo;
    };

    //删除选中项
    $scope.deleteSelected = function () {
        brandService.deleteSelected($scope.selectIds).success(function (response) {
            if (response.success) {
                $scope.reloadList();//重新加载
            } else {
                alert(response.resultMessage);
            }
        });
        $scope.selectIds=[];
    };

    //条件查询
    $scope.criteriaQuery = function (page, size) {
        brandService.criteriaQuery(page, size, $scope.searchEntity).success(function (response) {
            $scope.list = response.list;
            $scope.paginationConf.totalItems = response.totals;
        })
    };
    //清空entity
    $scope.clearEntity = function () {
        $scope.entity = {};
    }
});