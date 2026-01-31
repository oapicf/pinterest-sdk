package org.openapitools.api;

import org.openapitools.model.ConversionAccessTokenResponse;
import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for OauthApi
 */
@MicronautTest
public class OauthApiTest {

    @Inject
    OauthApi api;

    
    /**
     * Generate OAuth access token for conversion API
     *
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     */
    @Test
    @Disabled("Not Implemented")
    public void oauthConversionTokenTest() {
        // given

        // when
        ConversionAccessTokenResponse body = api.oauthConversionToken().block();

        // then
        // TODO implement the oauthConversionTokenTest()
    }

    
    /**
     * Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.
     */
    @Test
    @Disabled("Not Implemented")
    public void oauthTokenTest() {
        // given
        String grantType = "example";

        // when
        OauthAccessTokenResponse body = api.oauthToken(grantType).block();

        // then
        // TODO implement the oauthTokenTest()
    }

    
    /**
     * Revoke a token
     *
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     */
    @Test
    @Disabled("Not Implemented")
    public void tokenRevokeTest() {
        // given
        String token = "example";
        String tokenTypeHint = "example";

        // when
        api.tokenRevoke(token, tokenTypeHint).block();

        // then
        // TODO implement the tokenRevokeTest()
    }

    
}
