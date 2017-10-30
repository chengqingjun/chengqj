package com.chengqj.dao.impl;

import com.chengqj.dao.ITArticleDao;
import com.chengqj.model.ArticleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cheng on 2017/10/30.
 */
@Component
public class TArticleDaoImpl implements ITArticleDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void insert(ArticleModel model) {
        mongoTemplate.save(model);
    }

    @Override
    public ArticleModel selectByPrimaryKey(Integer id) {
        return mongoTemplate.findById(id,ArticleModel.class);
    }

    @Override
    public List<ArticleModel> selectByType(int type,int smallType) {
        Criteria criatira = new Criteria();
        criatira.andOperator(Criteria.where("type").is(type), Criteria.where("small_type").is(smallType));
        Query query = new Query(criatira);
        return mongoTemplate.find(query,ArticleModel.class);
    }

}
