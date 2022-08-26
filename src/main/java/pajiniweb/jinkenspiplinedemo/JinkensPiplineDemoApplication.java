package pajiniweb.jinkenspiplinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@SpringBootApplication
public class JinkensPiplineDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinkensPiplineDemoApplication.class, args);
    }

    @GetMapping("hello")
    public  String hello(){
        return  "hello , I am  jenkins app Demo my host is  "+ InetAddress.getLoopbackAddress();
    }
}
