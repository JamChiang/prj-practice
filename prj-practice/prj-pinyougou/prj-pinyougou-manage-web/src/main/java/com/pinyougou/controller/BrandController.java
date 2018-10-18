package com.pinyougou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.vo.PageResult;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/17 3:12 PM
 * @desc todo
 */
@RequestMapping("/brand")
@RestController
public class BrandController {

    @Reference
    BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    @GetMapping("/findByPage")
    public PageResult findByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows
    ) {
        return brandService.findByPage(page, rows);
    }
}
