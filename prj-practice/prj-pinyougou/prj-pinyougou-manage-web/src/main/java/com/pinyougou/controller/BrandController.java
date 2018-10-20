package com.pinyougou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.vo.PageResult;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.pinyougou.vo.Result;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public Result add(@RequestBody TbBrand tbBrand) {
        try {
            brandService.add(tbBrand);
            return Result.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("添加失败");
    }

    @GetMapping("findOne")
    public TbBrand findOne(long id) {
        return brandService.findOne(id);
    }

    @PostMapping("/update")
    public Result update(@RequestBody TbBrand tbBrand) {
        try {
            brandService.update(tbBrand);
            return Result.ok("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("添加失败");
    }

    @GetMapping("/delete")
    public Result delete(Long[] ids) {

        try {
            brandService.deleteByIds(ids);
            return Result.ok("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("删除失败!");
    }

    @PostMapping("/search")
    public PageResult search(@RequestBody TbBrand tbBrand,
                             @RequestParam(value="page", defaultValue = "1") Integer page,
                             @RequestParam(value = "rows", defaultValue = "10") Integer rows) {
        return brandService.search(tbBrand, page, rows);
    }
}
