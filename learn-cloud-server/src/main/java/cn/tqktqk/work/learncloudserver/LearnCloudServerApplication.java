package cn.tqktqk.work.learncloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//注解启动一个服务注册中心提供给其他应用进行对话(在默认设置下，该服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为--yml里面配置)
@EnableEurekaServer
@SpringBootApplication
public class LearnCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnCloudServerApplication.class, args);
    }

}
