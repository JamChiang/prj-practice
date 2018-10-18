package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/17 2:03 PM
 * @desc todo
 */
public interface BrandMapper extends Mapper<TbBrand> {

    List<TbBrand> queryAll();

}
