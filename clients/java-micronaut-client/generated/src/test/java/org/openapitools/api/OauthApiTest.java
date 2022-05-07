package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OauthApi
 */
@MicronautTest
public class OauthApiTest {

    @Inject
    OauthApi api;

    
    /**
     * Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
     */
    @Test
    public void oauthTokenTest() {
        String grantType = null;
        // OauthAccessTokenResponse response = api.oauthToken(grantType).block();
        // Mono<OauthAccessTokenResponse> asyncResponse = api.oauthToken(grantType);
        // TODO: test validations
    }

    
}
