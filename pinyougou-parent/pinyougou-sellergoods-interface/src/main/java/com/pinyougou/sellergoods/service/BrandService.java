package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;
import entity.Result;

import java.util.List;

/**
 * 品牌接口
 * @Auther: invokersun
 * @Date: 2019/1/16   23:19
 * @Desription:
 */
public interface BrandService {
    //查询所有
    List<TbBrand> findAll();
    //分页查询
    PageResult pagingQuery(int pageNum,int pageSize);
    //增加品牌
    Result addBrand(TbBrand tbBrand);
    //修改品牌
    void updateBrand(TbBrand tbBrand);
    //通过ID查询
    TbBrand findOne(Long id);
    //删除选中项
    void deleteSlected(Long[] ids);
    //条件查询
    PageResult criteriaQuery(TbBrand tbBrand,int pageNum,int pageSize);
}
