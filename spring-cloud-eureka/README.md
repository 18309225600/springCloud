服务发现组建

所有的服务都将注册到Eureka组建上。

主类上增加 @EnableEurekaServer表示启用Eureka
配置文件中：eureka.client.registerWithEureka:false 和 fetchRegistry:false  表示是一个Eureka服务端，不是客户端