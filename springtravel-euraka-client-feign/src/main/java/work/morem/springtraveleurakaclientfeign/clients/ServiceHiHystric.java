package work.morem.springtraveleurakaclientfeign.clients;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystric implements ServiceHello{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
