spring-cloud-config 分布式配置中心
管理分布式服务的所有配置信息

config server搭建：
    主类注解：@EnableConfigServer
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
        </dependency>
    yml：
        spring:
          cloud:
            config:
              label: master                 #git仓库分支
              server:                       #git服务器信息
                git:
                  uri: https://github.com/18309225600/springCloud.git       #git仓库地址
                  search-paths: spring-cloud-config/respo                   #仓库中的文件夹路径
                  username: 18309225600@163.com                             #git的认证信息
                  password: a792197389
config client搭建
    pom：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
    yml：
        spring:
              cloud:
                config:
                  uri: http://localhost:8888        #配置中心的地址
                  name: config-client-bootstrap     #配置中心中对应的配置文件名（环境前的部分）
                  label: master                     #git仓库中的分支
                  profile: dev                      #环境