package com.example.demo.commons.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean(name = "MasterDataSource")
    @ConfigurationProperties(prefix = "demo.datasource")
    DataSource getMasterDataSource() {

        return DataSourceBuilder.create().build();
    }

}
