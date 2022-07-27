package todoapp.model;

import lombok.*;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class User {

    private final String email;
    private final String username;
    private final String password;

}
