/*
 * @Title:  LRU.java
 * @Description:
 * @Author: youfeng
 * @Date:   2020-09-14 11:25
 * @Version V1.0
 * @Copyright: 2020 Shenzhen Hive Box Technology Co.,Ltd All rights reserved.
 * @Note: This content is limited to the internal circulation of Hive Box, and it is prohibited to leak or used for other commercial purposes.
 */
package com.darius.lzz.experiment;

import com.google.common.collect.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    public static void main(String[] args) {

        // 创建链表Map
        Map<String, String> map = Maps.newLinkedHashMap();

        System.out.println("LRU实验");
    }
}
