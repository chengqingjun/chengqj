package com.chengqj.service;

import com.chengqj.model.ArticleModel;

import java.util.List;

/**
 * Created by cheng on 2017/10/30.
 */
public interface ITArticleService {
    void insert(ArticleModel model);

    ArticleModel selectByPrimaryKey(Integer id);

    List<ArticleModel> selectByType(int type, int smallType);
}
