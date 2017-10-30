package com.chengqj.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cheng on 2017/10/19.
 */
@Component
public class ChengqjProperties {
    @Value("${com.chengqj.title}")
    private String title;
    @Value("${com.chengqj.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
