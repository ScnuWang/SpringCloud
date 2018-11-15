package work.morem.springtravel_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringtravelEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtravelEurekaServerApplication.class, args);
    }
}
