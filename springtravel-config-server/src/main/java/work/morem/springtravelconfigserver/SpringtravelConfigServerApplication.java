package work.morem.springtravelconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringtravelConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtravelConfigServerApplication.class, args);
    }
}
