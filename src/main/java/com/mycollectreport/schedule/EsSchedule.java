package com.mycollectreport.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EsSchedule {

    // @Scheduled(cron = "0 0/1 * * * ?")
    public void scheduleTest() {
        System.out.println("执行了scheduleTest");
    }

    /**
     * 5分钟一个周期，去es中捞取数据生成报表，合并到缓存中
     */
    @Scheduled(cron = "30 0/5 * * * ?")
    public void scheduled() {

    }

}
