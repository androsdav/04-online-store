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
        User user1 = new User("11111", "11111", "11111", "11111");
        User user2 = new User("22222", "22222", "22222", "22222");
        User user3 = new User("33333", "33333", "33333", "33333");
        User user4 = new User("44444", "44444", "44444", "44444");
        this.userRepository.save(user1);
        this.userRepository.save(user2);
        this.userRepository.save(user3);
        this.userRepository.save(user4);
        System.out.println("Find all user: " + this.userRepository.findAll());
    }

}