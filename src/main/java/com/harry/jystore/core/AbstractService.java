package com.harry.jystore.core;


import org.apache.ibatis.exceptions.TooManyResultsException;
import org.hibernate.service.spi.ServiceException;
import tk.mybatis.mapper.entity.Condition;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractService<T> implements Service<T> {


    protected Mapper<T> mapper;

    private Class<T> modelClass;

    public AbstractService() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    public void save(T modle) {
        mapper.insertSelective(modle);
    }

    public void save(List<T> modles) {
        mapper.insertList(modles);
    }

    public void deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    public void update(T modle) {
        mapper.updateByPrimaryKeySelective(modle);
    }

    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    public T findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> findAll() {
        return mapper.selectAll();
    }

    public T findby(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }
}
