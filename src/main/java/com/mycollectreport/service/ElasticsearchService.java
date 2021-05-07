package com.mycollectreport.service;

import java.io.IOException;
import java.util.Map;

public interface ElasticsearchService {
    Map<String, Long> getCounts() throws IOException;
}
