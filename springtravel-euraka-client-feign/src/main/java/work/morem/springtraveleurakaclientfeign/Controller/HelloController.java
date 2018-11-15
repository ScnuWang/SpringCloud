package work.morem.springtraveleurakaclientfeign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.morem.springtraveleurakaclientfeign.clients.ServiceHello;

@RestController
public class HelloController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    ServiceHello serviceHello;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return serviceHello.sayHiFromClientOne(name);
    }
}
