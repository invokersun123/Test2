package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import entity.PageResult;

import entity.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: invokersun
 * @Date: 2019/1/17   18:39
 * @Desription:
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping("pagingQuery")
    public PageResult pagingQuery(@RequestParam(name = "pageNum",required = true,defaultValue = "1") int num,@RequestParam(name = "pageSize",required = true,defaultValue = "10")int size) {
        return brandService.pagingQuery(num,size);
    }
    @RequestMapping("addBrand")
    public Result addBrand(@RequestBody TbBrand tbBrand){
       return brandService.addBrand(tbBrand);
    }
    @RequestMapping("findOne")
    public TbBrand findOne(Long id){
        return brandService.findOne(id);
    }
    @RequestMapping("updateBrand")
    public Result updateBrand(@RequestBody TbBrand tbBrand){
        try {
            brandService.updateBrand(tbBrand);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败！");
        }
        return new Result(true,"修改成功!");
    }
    //删除选中项目
    @RequestMapping("deleteSelected")
    public Result deleteSelected(Long[] ids){
        try {
            brandService.deleteSlected(ids);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败！");
        }
        return new Result(true,"删除成功!");
    }
    //条件查询
    @RequestMapping("criteriaQuery")
    public PageResult criteriaQuery(@RequestBody TbBrand tbBrand,int pageNum,int pageSize){
        return brandService.criteriaQuery(tbBrand,pageNum,pageSize);
    }
}
