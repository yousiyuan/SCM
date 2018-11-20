package com.scm.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.scm.demo.dao.BaseDao;
import com.scm.demo.service.BaseService;

public abstract class BaseServiceImpl<TEntity> implements BaseService<TEntity> {

	@Autowired
	private BaseDao<TEntity> baseDao;

	@Override
	public void insertObject(TEntity object) {
		baseDao.insertObject(this.getInsertSqlId(), object);
	}

	@Override
	public TEntity queryForObject(Object primaryKey) {
		return baseDao.queryForObject(this.getQuerySqlId(), primaryKey);
	}

	@Override
	public void updateObject(TEntity object) {
		baseDao.updateObject(this.getUpdateSqlId(), object);
	}

	@Override
	public void deleteObject(Object primaryKey) {
		baseDao.deleteObject(this.getDeleteSqlId(), primaryKey);
	}

	private String insertSqlId;
	private String querySqlId;
	private String updateSqlId;
	private String deleteSqlId;

	public String getInsertSqlId() {
		return insertSqlId;
	}

	public void setInsertSqlId(String insertSqlId) {
		this.insertSqlId = insertSqlId;
	}

	public String getQuerySqlId() {
		return querySqlId;
	}

	public void setQuerySqlId(String querySqlId) {
		this.querySqlId = querySqlId;
	}

	public String getUpdateSqlId() {
		return updateSqlId;
	}

	public void setUpdateSqlId(String updateSqlId) {
		this.updateSqlId = updateSqlId;
	}

	public String getDeleteSqlId() {
		return deleteSqlId;
	}

	public void setDeleteSqlId(String deleteSqlId) {
		this.deleteSqlId = deleteSqlId;
	}

}
