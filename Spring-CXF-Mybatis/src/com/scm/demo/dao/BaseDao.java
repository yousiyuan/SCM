package com.scm.demo.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<TEntity> {

	/**
	 * 新增
	 */
	public abstract void insertObject(String sqlId, TEntity object);

	/**
	 * 查询
	 * 
	 * @param primaryKey
	 *            主键
	 */
	public abstract TEntity queryForObject(String sqlId, Object primaryKey);

	/**
	 * 集合查询
	 */
	public List<TEntity> queryForList(String sqlId, TEntity object);

	/**
	 * 更新
	 */
	public abstract void updateObject(String sqlId, TEntity object);

	/**
	 * 键值对更新
	 */
	public abstract void updateObject(String sqlId, Map<String, Object> map);

	/**
	 * 删除
	 * 
	 * @param primaryKey
	 *            主键
	 */
	public abstract void deleteObject(String sqlId, Object primaryKey);

}
