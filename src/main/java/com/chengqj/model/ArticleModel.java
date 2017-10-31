package com.chengqj.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by cheng on 2017/10/30.
 */
@Document(collection = "article")
public class ArticleModel implements Serializable{
    @Id
    private int id;
    private String title;
    @Field(value = "create_date")
    private Date createDate;
    private String author;
    private int type;
    @Field(value = "small_type")
    private int smallType;
    @Field(value = "publish_date")
    private Date publishDate;
    @Field(value = "read_num")
    private int readNum;
    @Field(value = "out_image_url")
    private String outImageUrl;
    @Field(value = "in_image_url")
    private String inImageUrl;
    private String context;
    @Field(value = "key_context")
    private String keyContext;
    @Field(value = "key_index")
    private String keyIndex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSmallType() {
        return smallType;
    }

    public void setSmallType(int smallType) {
        this.smallType = smallType;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public String getOutImageUrl() {
        return outImageUrl;
    }

    public void setOutImageUrl(String outImageUrl) {
        this.outImageUrl = outImageUrl;
    }

    public String getInImageUrl() {
        return inImageUrl;
    }

    public void setInImageUrl(String inImageUrl) {
        this.inImageUrl = inImageUrl;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getKeyContext() {
        return keyContext;
    }

    public void setKeyContext(String keyContext) {
        this.keyContext = keyContext;
    }

    public String getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(String keyIndex) {
        this.keyIndex = keyIndex;
    }

}
