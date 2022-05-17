package co.simplon.whatstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class WhatstreamApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(WhatstreamApiApplication.class, args);
    }

}
