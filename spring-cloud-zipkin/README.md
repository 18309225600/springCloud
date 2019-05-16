spring-cloud-zipkin 分布式链路追踪系统

用于对分布式微服务中调用关系的分析

zipkin server 搭建
    pom：
        <dependency>
            <groupId>io.zipkin.java</groupId>
            <artifactId>zipkin</artifactId>
        </dependency>
        <dependency>
            <groupId>io.zipkin.java</groupId>
            <artifactId>zipkin-server</artifactId>
        </dependency>
        <dependency>
            <groupId>io.zipkin.java</groupId>
            <artifactId>zipkin-autoconfigure-ui</artifactId>
        </dependency>
    yml：
        management:
          metrics:
            web:
              server:
                auto-time-requests: false
zipkin client 搭建
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-zipkin</artifactId>
        </dependency>
    yml：
        spring:
          zipkin:
            base-url: http://localhost:9411