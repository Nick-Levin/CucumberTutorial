package org.security;

import lombok.*;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Token {

    private final String header;
    private final String payload;
    private final String signature;

}
