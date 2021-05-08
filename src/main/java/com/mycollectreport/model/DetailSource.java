package com.mycollectreport.model;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class DetailSource {

    private String date;

    private String dataType;

    private int totalCount = 0;

    private int failedCount = 0;

    private int successCount = 0;

    private int errLogCount = 0;

    private int authErrLogCount = 0;

    private int netErrLogCount = 0;

    private Map<String, List<Integer>> hwMaeConf;

    private long[] taskPeriodStatus;

    private Map<Integer, Set<Integer>> repairTime = new HashMap<>();

}