package com.aurelius.gateway.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.aurelius.gateway.filters.pre.PreFilter;

@EnableZuulProxy
public class GatewayConfiguration {

    @Bean
    public PreFilter preFilter() {
	return new PreFilter();
    }
}
