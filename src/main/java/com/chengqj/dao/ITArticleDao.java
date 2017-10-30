package com.chengqj.dao;

import com.chengqj.model.ArticleModel;

import java.util.List;

public interface ITArticleDao {

	void insert(ArticleModel model);

	ArticleModel selectByPrimaryKey(Integer id);

	List<ArticleModel> selectByType(int type,int smallType);
}