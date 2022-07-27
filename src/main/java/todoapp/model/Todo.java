package todoapp.model;

import lombok.*;

import java.util.UUID;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Todo {

    private final UUID id;
    private final UUID userId;
    private final String content;

}
