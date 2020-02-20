package com.harry.jystore.core;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;

public interface Service<T> {
    void save(T model);

    void save(List<T> models);

    void deleteById(Integer id);

    void deleteByIds(String ids);

    void update(T model);

    T findById(Integer id);

    List<T> findByIds(String ids);

    List<T> findAll();

    List<T> findByCondition(Condition condition);
}
