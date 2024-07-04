package gift.authentication;

import gift.core.domain.authentication.Token;

public interface TokenProvider {

    Token generateAccessToken(Long userId);

    Long extractUserId(String token);

}
