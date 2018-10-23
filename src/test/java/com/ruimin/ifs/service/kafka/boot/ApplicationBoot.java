package com.ruimin.ifs.service.kafka.boot;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.ruimin.ifs.boot.SnowBoot;

import lombok.extern.slf4j.Slf4j;

@Component("ifs-service-kafka-test-webapp")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan(basePackages = "com.ruimin.**.boot", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {SnowBoot.class})})
@Slf4j
@Configuration
@SpringBootApplication
public class ApplicationBoot {


  @PostConstruct
  public void start() {
    log.info("kafka ApplicationBoot");
  }

}
