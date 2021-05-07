package com.mycollectreport.service.Impl;

import com.mycollectreport.Util.EsUtil;
import com.mycollectreport.service.ElasticsearchService;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

@Service
public class ElasticsearchServiceImpl implements ElasticsearchService {

    @Autowired
    EsUtil esUtil;

    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Override
    public Map<String, Integer> getCounts() throws IOException {
        TermsAggregationBuilder aggregationBuilder = AggregationBuilders.terms("success_count_No").field("success_count");
        SearchRequest aggSearchRequest = esUtil.getAggSearchRequest(aggregationBuilder,"20210506index");
        SearchResponse searchResponse = restHighLevelClient.search(aggSearchRequest, RequestOptions.DEFAULT);
        Terms terms = searchResponse.getAggregations().get("success_count_No");
        for (Terms.Bucket ele : terms.getBuckets()) {
            System.out.println("Bucket的key是：" + ele.getKeyAsString() + "Bucket的value是：" + ele.getDocCount());
            System.out.println(ele);
        }

        return null;
    }
}
