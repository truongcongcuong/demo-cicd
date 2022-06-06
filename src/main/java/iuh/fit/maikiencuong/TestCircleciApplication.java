package iuh.fit.maikiencuong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
@RequestMapping("/test")
public class TestCircleciApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCircleciApplication.class, args);
    }

    @GetMapping
    public String test() throws UnknownHostException {
        return String.format("<h4>code ploy with ecs blue green</h4> " +
                "<br> " +
                "<h4>Host name: %s</>", InetAddress.getLocalHost().getHostName());
    }

}
