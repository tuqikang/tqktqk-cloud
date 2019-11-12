package cn.tqktqk.work.learncloudclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LearnCloudClientoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnCloudClientoneApplication.class, args);
    }

}
