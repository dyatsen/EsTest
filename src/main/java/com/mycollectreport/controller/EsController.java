package com.mycollectreport.controller;

import com.mycollectreport.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Map;

@Controller
public class EsController {

    @Autowired
    private ElasticsearchService elasticsearchService;


    @GetMapping("/getCounts")
    public void getCounts() {
        // 接收输入参数并进行预处理
        System.out.println("===========开始===========");
        // 调用service实现类的方法进行处理
        try {
            Map<String, Integer> counts = elasticsearchService.getCounts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("===========结束===========");
    }
}
