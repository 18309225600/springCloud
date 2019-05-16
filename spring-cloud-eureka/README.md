spring-cloud-eureka 服务发现组建
用于分布式系统的服务注册中心

eureka server搭建：
    主类注解：@EnableEurekaServer
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
    yml：
        eureka:
          instance:
            hostname: localhost
          client:
            registerWithEureka: false
            fetchRegistry: false
            serviceUrl:
              defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
eureka client搭建：
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
    yml：
        eureka:
          client:
            serviceUrl:
              defaultZone: http://localhost:8761/eureka/

配置文件中：eureka.client.registerWithEureka:false 和 fetchRegistry:false  表示是一个Eureka服务端，不是客户端