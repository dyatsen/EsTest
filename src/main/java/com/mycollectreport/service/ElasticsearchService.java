package com.mycollectreport.service;

import java.io.IOException;
import java.util.Map;

public interface ElasticsearchService {
    Map<String, Integer> getCounts() throws IOException;
}
