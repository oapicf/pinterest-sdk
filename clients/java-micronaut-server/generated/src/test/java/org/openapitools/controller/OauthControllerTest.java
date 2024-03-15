package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.OauthAccessTokenResponse;
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
     * This test is used to validate the implementation of oauthToken() method
     *
     * The method should: Generate OAuth access token
     *
     * Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void oauthTokenMethodTest() {
        // given
        String grantType = "example";

        // when
        OauthAccessTokenResponse result = controller.oauthToken(grantType).block();

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
            put("grant_type", "example");
        }};
        String uri = UriTemplate.of("/oauth/token").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OauthAccessTokenResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
