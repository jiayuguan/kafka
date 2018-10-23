/*
 * @fileName: KafkaProducer.java
 * @author: shen_antonio
 * @date: Sep 20, 2018 4:07:16 PM
 * @desc: //模块目的、功能描述      
 * @history: //修改记录
 */
package com.ruimin.ifs.service.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaOperations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

/**
 * @class: KafkaProducer
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: shen_antonio
 * @date: Sep 20, 2018 4:07:16 PM
 * @since: 1.0.0 
 */
@Component
public class KafkaProducer {
  @Autowired
  private KafkaTemplate<String,String> kafkaTemplate;

  public void send() {
      kafkaTemplate.send("topic1","xiaojf");
      kafkaTemplate.sendDefault("xiaojf");
      kafkaTemplate.metrics();
      kafkaTemplate.execute(new KafkaOperations.ProducerCallback<String, String, Object>() {
          @Override
          public Object doInKafka(Producer<String, String> producer) {
              //这里可以编写kafka原生的api操作
              return null;
          }
      });

      //消息发送的监听器，用于回调返回信息
      kafkaTemplate.setProducerListener(new ProducerListener<String, String>() {
          @Override
          public void onSuccess(String topic, Integer partition, String key, String value, RecordMetadata recordMetadata) {

          }
          @Override
          public void onError(String topic, Integer partition, String key, String value, Exception exception) {

          }
          @Override
          public boolean isInterestedInSuccess() {
              return false;
          }
      });
  }
}
