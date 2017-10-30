package com.chengqj.service.impl;

import com.chengqj.dao.ITArticleDao;
import com.chengqj.model.ArticleModel;
import com.chengqj.service.ITArticleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cheng on 2017/10/30.
 */
@Component
public class TArticleServiceImpl implements ITArticleService {
    @Resource
    private ITArticleDao tArticleDao;
    @Override
    public void insert(ArticleModel model) {
        tArticleDao.insert(model);
    }

    @Override
    public ArticleModel selectByPrimaryKey(Integer id) {
        return tArticleDao.selectByPrimaryKey(id);
    }

    @Override
    public List<ArticleModel> selectByType(int type, int smallType) {
        return tArticleDao.selectByType(type,smallType);
    }
}
