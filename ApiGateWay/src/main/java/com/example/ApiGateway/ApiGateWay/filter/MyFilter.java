package com.example.ApiGateway.ApiGateWay.filter;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Set;

@Component
public class MyFilter implements GlobalFilter {
    Logger logger = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

 logger.info("filter method() exucuted..........");

        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        Set<String> keyset = headers.keySet();
        keyset.forEach(key -> {
            List<String> values =headers.get(key);
            System.out.println(key + "  " + values);
        });
        return chain.filter(exchange);



    }
}
