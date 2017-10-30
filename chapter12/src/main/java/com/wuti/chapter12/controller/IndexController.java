package com.wuti.chapter12.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/30.
 */
@RestController
public class IndexController {
    //logback
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 访问首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.error("记录error错误日志");
        return "index";
    }

    /**
     * Created by Administrator on 2017/10/30.
     */
    public static class TestController {
    }
}
