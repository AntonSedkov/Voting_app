package by.anthony.hateoasexample;

import by.anthony.hateoasexample.model.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class AuthUser extends org.springframework.security.core.userdetails.User {
    @NotNull
    private User user;

    public AuthUser(User user) {
        super(user.getEmail(), user.getPassword(), user.getRoles());
        this.user = user;
    }

    public long id() {
        return user.id();
    }
}
