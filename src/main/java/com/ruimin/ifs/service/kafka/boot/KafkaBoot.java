/*
 * @fileName: KafkaBoot.java
 * @author: shen_antonio
 * @date: Sep 20, 2018 3:46:08 PM
 * @desc: //模块目的、功能描述      
 * @history: //修改记录
 */
package com.ruimin.ifs.service.kafka.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.ruimin.ifs.action.module.SpringModuleComponent;

/**
 * @class: KafkaBoot
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: shen_antonio
 * @date: Sep 20, 2018 3:46:08 PM
 * @since: 1.0.0 
 */
@Component("ifs.service.kafka")
@ComponentScan(basePackages="com.ruimin.ifs.service.kafka")
public class KafkaBoot extends SpringModuleComponent {
  
  @Override
  protected String getComponentName() {
      return "ifs.service.kafka";
  }

}
