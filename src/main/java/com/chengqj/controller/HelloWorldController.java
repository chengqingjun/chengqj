package com.chengqj.controller;

import com.chengqj.dao.ITArticleDao;
import com.chengqj.model.ArticleModel;
import com.chengqj.service.ITArticleService;
import com.chengqj.util.ChengqjProperties;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

/**
 * Created by cheng on 2017/10/16.
 */
@RestController
public class HelloWorldController {
    @Resource
    private ChengqjProperties properties;
    @Resource
    private ITArticleService tArticleService;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index(@RequestBody ArticleModel model) {
        tArticleService.insert(model);
        return "Hello World";
    }
    @RequestMapping(value="/selectById/{id}",method = RequestMethod.GET)
    public ArticleModel selectById(@PathVariable Integer id) {
        return tArticleService.selectByPrimaryKey(id);
    }
    @RequestMapping("/selectList/{type}/{smallType}")
    public List<ArticleModel> selectList(@PathVariable Integer type,@PathVariable Integer smallType) {
        return tArticleService.selectByType(type,smallType);
    }
}
