app.controller("brandController", function ($scope, $controller,brandService) {

    $controller("baseController", {$scope: $scope});

    $scope.findAll = function () {
        brandService.findAll().success(function (response) {
            $scope.list = response;
        });
    };


    $scope.findPage = function (page, rows) {
        brandService.findPage(page, rows)
            .success(function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            });
    }

    $scope.findOne = function (id) {
        brandService.findOne(id).success(function (response) {
            $scope.entity = response;
        });
    }

    $scope.save = function () {
        var method = "add";
        if ($scope.entity.id != null) {
            method = "update";
        }
        brandService.save(method, $scope.entity).success(function (response) {
            if (response.success) {
                $scope.reloadList();
            } else {
                alert(response.message);
            }
        });
    };

    $scope.delete = function () {
        if ($scope.selectIds.length < 1) {
            alert("请选择删除项");
            return;
        }
        if (confirm("确认要进行删除?")) {
            brandService.delete($scope.selectIds).success(function (response) {
                if (response.success) {
                    $scope.selectIds = [];
                    $scope.reloadList();
                } else {
                    alert(response.message);
                }
            })
        }
    }

    $scope.searchEntity = {};
    $scope.search = function (page, rows) {
        brandService.search(page, rows,$scope.searchEntity).success(function (response) {
            $scope.list = response.rows;
            $scope.paginationConf.totalItems = response.total;
        })
    }
});