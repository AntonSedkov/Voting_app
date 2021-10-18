package by.anthony.hateoasexample;

import by.anthony.hateoasexample.model.Role;
import by.anthony.hateoasexample.model.User;
import by.anthony.hateoasexample.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class VotingApplication implements ApplicationRunner {
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(VotingApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(new User("user@app.ze", "Alex_1", "Great_1", "pass", Set.of(Role.USER)));
        userRepository.save(new User("admin@app.ze", "George_2", "Desp_2", "pass", Set.of(Role.USER, Role.ADMIN)));
        System.out.println(userRepository.findAll());
    }
}
