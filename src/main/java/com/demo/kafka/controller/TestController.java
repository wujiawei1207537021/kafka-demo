package com.demo.kafka.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class TestController {

    @Resource
    private KafkaTemplate kafkaTemplate;

    @ApiOperation("数据接入kafka topic")
    @PostMapping("/data-access/topic/{topicName}")
    public void dataAccessTopic(@PathVariable @ApiParam(value = "kafka topic名称,必须已注册", required = true) String topicName,
                                               @RequestBody String payload) {
            kafkaTemplate.send(topicName, payload);
    }


}
