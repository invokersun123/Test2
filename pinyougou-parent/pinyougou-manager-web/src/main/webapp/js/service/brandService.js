app.service("brandService",function ($http) {
    this.pagingQuery = function (page, size) {
        return $http.get('../brand/pagingQuery?pageNum=' + page +
            '&pageSize=' + size);
    };
    this.addBrand = function (entity) {
        return $http.post('../brand/addBrand',entity);
    };
    this.updateBrand = function (entity) {
        return $http.post('../brand/updateBrand',entity);
    };
    this.deleteSelected = function (selectIds) {
        return $http.get('../brand/deleteSelected?ids='+selectIds);
    };
    this.criteriaQuery = function (page, size, searchEntity) {
        return $http.post('../brand/criteriaQuery?pageNum=' + page +
            '&pageSize=' + size,searchEntity);
    };
});