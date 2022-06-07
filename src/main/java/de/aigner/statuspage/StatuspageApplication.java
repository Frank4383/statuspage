package de.aigner.statuspage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StatuspageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatuspageApplication.class, args);
    }

    @GetMapping("/admin")
    public String adminSeite(@RequestParam(value = "meinName", defaultValue = "Admin") String name) {
        return String.format("Hallo %s!", name);
    }

}
