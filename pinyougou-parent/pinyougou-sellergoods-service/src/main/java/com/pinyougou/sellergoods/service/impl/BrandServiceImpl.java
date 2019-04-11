package com.pinyougou.sellergoods.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.sellergoods.service.BrandService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @Auther: invokersun
 * @Date: 2019/1/17   18:22
 * @Desription:
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper tbBrandMapper;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public PageResult pagingQuery(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByExample(null);

        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public Result addBrand(TbBrand tbBrand) {
        try {
            tbBrandMapper.insert(tbBrand);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "保存失败");
        }
        return new Result(true, "保存成功");
    }

    @Override
    public void updateBrand(TbBrand tbBrand) {
        tbBrandMapper.updateByPrimaryKey(tbBrand);
    }

    @Override
    public TbBrand findOne(Long id) {
        return tbBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteSlected(Long[] ids) {
        for (Long id : ids) {
            tbBrandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult criteriaQuery(TbBrand tbBrand, int pageNum, int pageSize) {
        TbBrandExample tbBrandExample = new TbBrandExample();
        TbBrandExample.Criteria criteria = tbBrandExample.createCriteria();
        if (tbBrand != null) {
            if (tbBrand.getName() != null && tbBrand.getName().length() > 0) {
                criteria.andNameLike("%" + tbBrand.getName() + "%");

            }
            if (tbBrand.getFirstChar() != null && tbBrand.getFirstChar().length() > 0) {

                criteria.andFirstCharEqualTo(tbBrand.getFirstChar());
            }
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> tbBrands = (Page<TbBrand>) tbBrandMapper.selectByExample(tbBrandExample);

        return new PageResult(tbBrands.getTotal(), tbBrands.getResult());
    }
}
