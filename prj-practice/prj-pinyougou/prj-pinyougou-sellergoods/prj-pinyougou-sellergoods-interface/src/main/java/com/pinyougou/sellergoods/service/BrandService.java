package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BaseService;

import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/17 3:09 PM
 * @desc todo
 */
public interface BrandService extends BaseService<TbBrand> {

    List<TbBrand> testPage(Integer page, Integer rows);
}
