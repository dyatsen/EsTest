package com.mycollectreport.Util;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Component;

@Component
public class EsUtil {

    public SearchRequest getAggSearchRequest(AggregationBuilder aggregationBuilder, String... indices) {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices(indices);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.aggregation(aggregationBuilder);
        searchRequest.source(searchSourceBuilder);
        return searchRequest;
    }
}
