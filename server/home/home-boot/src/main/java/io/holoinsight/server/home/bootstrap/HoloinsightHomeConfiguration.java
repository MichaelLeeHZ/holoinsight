/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.home.bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import io.holoinsight.server.common.config.EnvironmentProperties;
import io.holoinsight.server.common.springboot.ConditionalOnRole;

/**
 * @author masaimu
 * @version 2022-12-08 10:39:00
 */
@ComponentScan(basePackages = {"io.holoinsight.server.home"})
@EnableTransactionManagement
@EnableScheduling
@EntityScan(basePackages = "io.holoinsight.server.home.dal.model")
@MapperScan("io.holoinsight.server.home.dal.mapper")
@ConditionalOnRole("home")
@EnableConfigurationProperties({EnvironmentProperties.class})
public class HoloinsightHomeConfiguration {
}
