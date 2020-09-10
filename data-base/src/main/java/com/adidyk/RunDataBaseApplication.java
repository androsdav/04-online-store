package com.adidyk;

import com.adidyk.models.pojo.User;
import com.adidyk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

/**
 * Class StartUi.
 */
@SpringBootApplication
public class RunDataBaseApplication {

    private UserRepository userRepository;

    /**
     * RunDataBaseApplication - constructor.
     * @param userRepository - user repository.
     */
    @Autowired
    public RunDataBaseApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * main - main.
     * @param arg - arg.
     */
    public  static void main(String[] arg) {
        SpringApplication.run(RunDataBaseApplication.class, arg);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void testJpaMethods() {
    }

}