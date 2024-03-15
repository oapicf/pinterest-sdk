package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.TermsOfService;
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
 * API tests for TermsOfServiceController
 */
@MicronautTest
public class TermsOfServiceControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    TermsOfServiceController controller;

    /**
     * This test is used to validate the implementation of termsOfServiceGet() method
     *
     * The method should: Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void termsOfServiceGetMethodTest() {
        // given
        String adAccountId = "example";
        Boolean includeHtml = false;
        String tosType = "example";

        // when
        TermsOfService result = controller.termsOfServiceGet(adAccountId, includeHtml, tosType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/terms_of_service' to the features of termsOfServiceGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void termsOfServiceGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/terms_of_service").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("include_html", String.valueOf(false)) // The query parameter format should be 
            .add("tos_type", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TermsOfService.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
