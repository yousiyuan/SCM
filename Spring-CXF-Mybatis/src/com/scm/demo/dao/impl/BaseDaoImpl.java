package com.scm.demo.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.scm.demo.dao.BaseDao;

public abstract class BaseDaoImpl<TEntity> extends SqlSessionDaoSupport implements BaseDao<TEntity> {

	@Autowired
	protected SqlSession sqlSession;

	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}


	@Override
	public void insertObject(String sqlId, TEntity object) {
		sqlSession.insert(sqlId, object);
	}

	@Override
	public TEntity queryForObject(String sqlId, Object primaryKey) {
		return sqlSession.selectOne(sqlId, primaryKey);
	}

	@Override
	public void updateObject(String sqlId, TEntity object) {
		sqlSession.update(sqlId, object);
	}

	@Override
	public void updateObject(String sqlId, Map<String, Object> map) {
		sqlSession.update(sqlId, map);
	}

	@Override
	public void deleteObject(String sqlId, Object primaryKey) {
		sqlSession.delete(sqlId, primaryKey);
	}

	@Override
	public List<TEntity> queryForList(String sqlId, TEntity object) {
		return sqlSession.selectList(sqlId, object);
	}

}
