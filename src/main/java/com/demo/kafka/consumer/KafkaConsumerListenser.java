package com.demo.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 监听kafka 消息队列
 */
@Component
@EnableKafka
public class KafkaConsumerListenser {


    /**
     *
     * @param records
     */
    @KafkaListener(groupId = "groupA", topics = "topicA")
    void listener(String records) {
        List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
        String tabliName = null;
        System.out.println(records);
    }


    @KafkaListener(groupId = "wujiawei", concurrency = "100", topics = {"kafka_test"})
    public void processMessage(ConsumerRecord<String, String> record) throws IOException {
        System.out.println(record.value());
    }
}


