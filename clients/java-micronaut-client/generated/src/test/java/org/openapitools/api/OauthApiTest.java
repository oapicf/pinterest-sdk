package org.openapitools.api;

import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;
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
        ConversionAccessToken body = api.oauthConversionToken().block();

        // then
        // TODO implement the oauthConversionTokenTest()
    }

    
    /**
     * Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
     */
    @Test
    @Disabled("Not Implemented")
    public void oauthTokenTest() {
        // given
        TokenGrantType grantType = TokenGrantType.fromValue("authorization_code");
        String code = "example";
        String continuousRefresh = "example";
        String redirectUri = "example";
        String refreshToken = "example";
        String scope = "example";

        // when
        OauthAccessToken body = api.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope).block();

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
        TokenTypeHint tokenTypeHint = TokenTypeHint.fromValue("access_token");

        // when
        api.tokenRevoke(token, tokenTypeHint).block();

        // then
        // TODO implement the tokenRevokeTest()
    }

    
}
