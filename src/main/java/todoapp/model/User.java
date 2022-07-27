package todoapp.model;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class User {

    private final UUID id;
    private final String email;
    private final String username;
    private final String password;

    public User clone(String email, String username, String password) {
        return User.builder()
                .id(this.id)
                .email(email)
                .username(username)
                .password(password)
                .build();
    }
}
