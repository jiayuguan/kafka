/*
 * @fileName: KafkaConsumer.java
 * 
 * @author: shen_antonio
 * 
 * @date: Sep 20, 2018 4:10:16 PM
 * 
 * @desc: //模块目的、功能描述
 * 
 * @history: //修改记录
 */
package com.ruimin.ifs.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @class: KafkaConsumer
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: shen_antonio
 * @date: Sep 20, 2018 4:10:16 PM
 * @since: 1.0.0
 */
@Component
@Data
@Slf4j
public class KafkaConsumer {
  @KafkaListener(topics = {"my-replicated-topic", "topic1"})
  public void processMessage(String content) {
    log.info(content);
  }
}
