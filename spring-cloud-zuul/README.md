spring-cloud-zuul api网关
用于转发请求，统一api入口，限流监控等

zuul server 搭建：
    主类注解：@EnableZuulProxy
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
        </dependency>
    yml：
        zuul:
          routes:
            api-a:
              path: /api/a/**
              serviceId: spring-cloud-web-admin-ribbon
            api-b:
              path: /api/b/**
              serviceId: spring-cloud-web-admin-feign