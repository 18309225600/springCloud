服务1

此服务为众多微服务中的一个微服务，目标是注册在Eureka中

主类上 @EnableEurekaClient 标识是一个EurekaClient，配置文件中配置了Eureka服务端的地址，因此可以找到服务并将自己注册进去