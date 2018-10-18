package com.pinyougou.service;

import com.pinyougou.vo.PageResult;

import java.io.Serializable;
import java.util.List;

/**
 * @author JW
 * @createTime 2018/10/18 6:38 PM
 * @desc todo
 */
public interface BaseService<T> {

    /**
     * 查找一个
     * @param id
     * @return
     */
    T findOne(Serializable id);

    /**
     * 查找全部
     * @return
     */
    List<T> findAll();

    /**
     * 根据条件查找
     * @param t
     * @return
     */
    List<T> findWhere(T t);

    /**
     * 分页查找
     * @param page
     * @param rows
     * @return
     */
    PageResult findByPage(Integer page, Integer rows);

    /**
     * 根据条件分页查找
     * @param page
     * @param rows
     * @param t
     * @return
     */
    PageResult findByPage(Integer page, Integer rows, T t);

    /**
     * 新增
     * @param t
     */
    void add(T t);

    /**
     * 更新
     * @param t
     */
    void update(T t);

    /**
     * 根据ids删除
     * @param ids
     */
    void deleteByIds(Serializable[] ids);

}
