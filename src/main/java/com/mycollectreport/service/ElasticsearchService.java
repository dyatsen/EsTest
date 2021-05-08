package com.mycollectreport.service;

import java.io.IOException;
import java.util.Map;

public interface ElasticsearchService {
    /**
     * 统计 total_count 和 success_count
     * @return 分组的map，即bucket桶
     * @throws IOException
     */
    Map<String, Long> getCounts() throws IOException;

    /**
     * 统计指定时间内 ES 中的日志数据
     */

}
