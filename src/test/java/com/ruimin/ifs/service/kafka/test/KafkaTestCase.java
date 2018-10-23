/*
 * @fileName: KafkaTestCase.java
 * 
 * @author: shen_antonio
 * 
 * @date: Sep 20, 2018 4:48:48 PM
 * 
 * @desc: //模块目的、功能描述
 * 
 * @history: //修改记录
 */
package com.ruimin.ifs.service.kafka.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ruimin.ifs.boot.SnowBoot;
import com.ruimin.ifs.service.kafka.KafkaProducer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @class: KafkaTestCase
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: shen_antonio
 * @date: Sep 20, 2018 4:48:48 PM
 * @since: 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SnowBoot.class)
@Slf4j
@Data
public class KafkaTestCase {

  @Autowired
  private KafkaProducer kp;

  @Test
  public void product() throws InterruptedException {
    kp.send();
    Thread.currentThread().sleep(10*1000L);
  }

}
