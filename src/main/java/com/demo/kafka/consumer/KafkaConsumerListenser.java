package com.demo.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @Description： kafka监听类
 * @Author：panboyang
 * @date:2019/11/8 17:23
 */
@Slf4j
@Component
@EnableKafka
public class KafkaConsumerListenser {


    /**
     * @Description： kafka监听类 ,containerFactory设置为批量接收参数 ,Acknowledgment为偏移量
     * @Author：panboyang
     * @date:2019/11/11 17:23
     */
    @SuppressWarnings("unchecked")
    @KafkaListener(groupId = "groupA", topics = "topicA")
    void listener(String records) {
        List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
        String tabliName = null;
        log.info(records);
    }
}


