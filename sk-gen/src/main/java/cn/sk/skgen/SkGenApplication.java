package cn.sk.skgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.sk"})
public class SkGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkGenApplication.class, args);
    }

}
