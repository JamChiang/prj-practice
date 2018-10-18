package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.pinyougou.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/17 3:10 PM
 * @desc todo
 */

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl extends BaseServiceImpl<TbBrand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

  /*如果是spring版本低于4.x,可以使用set方法
    @Autowired
    public void setBrandMapper(BrandMapper brandMapper) {
        super.setMapper(brandMapper);
        this.brandMapper = brandMapper;
    }*/


    @Override
    public List<TbBrand> testPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        return brandMapper.selectAll();
    }
}
