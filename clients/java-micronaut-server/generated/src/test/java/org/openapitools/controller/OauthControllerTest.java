package org.openapitools.controller;

import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for OauthController
 */
@MicronautTest
public class OauthControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OauthController controller;

    /**
     * This test is used to validate the implementation of oauthConversionToken() method
     *
     * The method should: Generate OAuth access token for conversion API
     *
     * Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void oauthConversionTokenMethodTest() {
        // given

        // when
        ConversionAccessToken result = controller.oauthConversionToken().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/oauth/conversion_token' to the features of oauthConversionToken() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void oauthConversionTokenClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/oauth/conversion_token").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@121e9621");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionAccessToken.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of oauthToken() method
     *
     * The method should: Generate OAuth access token
     *
     * Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void oauthTokenMethodTest() {
        // given
        TokenGrantType grantType = TokenGrantType.fromValue("authorization_code");
        String code = "example";
        String continuousRefresh = "example";
        String redirectUri = "example";
        String refreshToken = "example";
        String scope = "example";

        // when
        OauthAccessToken result = controller.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/oauth/token' to the features of oauthToken() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void oauthTokenClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("code", "example");
            put("continuous_refresh", "example");
            put("grant_type", TokenGrantType.fromValue("authorization_code"));
            put("redirect_uri", "example");
            put("refresh_token", "example");
            put("scope", "example");
        }};
        String uri = UriTemplate.of("/oauth/token").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@69de34de");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OauthAccessToken.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of tokenRevoke() method
     *
     * The method should: Revoke a token
     *
     * Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void tokenRevokeMethodTest() {
        // given
        String token = "example";
        TokenTypeHint tokenTypeHint = TokenTypeHint.fromValue("access_token");

        // when
        controller.tokenRevoke(token, tokenTypeHint).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/oauth/token/revoke' to the features of tokenRevoke() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void tokenRevokeClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("token", "example");
            put("token_type_hint", TokenTypeHint.fromValue("access_token"));
        }};
        String uri = UriTemplate.of("/oauth/token/revoke").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@33286e3b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
