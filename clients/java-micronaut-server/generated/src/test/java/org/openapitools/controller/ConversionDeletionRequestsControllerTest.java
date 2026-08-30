package org.openapitools.controller;

import org.openapitools.model.ConversionDeletionRequest;
import org.openapitools.model.ConversionDeletionRequestCreate;
import org.openapitools.model.ConversionDeletionRequestList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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
 * API tests for ConversionDeletionRequestsController
 */
@MicronautTest
public class ConversionDeletionRequestsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ConversionDeletionRequestsController controller;

    /**
     * This test is used to validate the implementation of conversionDeletionRequestCreate() method
     *
     * The method should: Create a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestCreateMethodTest() {
        // given
        String adAccountId = "example";
        ConversionDeletionRequestCreate conversionDeletionRequestCreate = new ConversionDeletionRequestCreate(null);

        // when
        ConversionDeletionRequest result = controller.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/conversion_deletion_requests' to the features of conversionDeletionRequestCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestCreateClientApiTest() throws IOException {
        // given
        ConversionDeletionRequestCreate body = new ConversionDeletionRequestCreate(null);
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/conversion_deletion_requests").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2d1d1b2e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionDeletionRequest.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of conversionDeletionRequestDelete() method
     *
     * The method should: Delete a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestDeleteMethodTest() {
        // given
        String requestId = "example";
        String adAccountId = "example";

        // when
        ConversionDeletionRequest result = controller.conversionDeletionRequestDelete(requestId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}' to the features of conversionDeletionRequestDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("request_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@217f837a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionDeletionRequest.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of conversionDeletionRequestGet() method
     *
     * The method should: Get a single conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestGetMethodTest() {
        // given
        String requestId = "example";
        String adAccountId = "example";

        // when
        ConversionDeletionRequest result = controller.conversionDeletionRequestGet(requestId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}' to the features of conversionDeletionRequestGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("request_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@63ce22f0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionDeletionRequest.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of conversionDeletionRequestList() method
     *
     * The method should: List conversion deletion requests
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        ConversionDeletionRequestList200Response result = controller.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/conversion_deletion_requests' to the features of conversionDeletionRequestList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionDeletionRequestListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/conversion_deletion_requests").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@67c24580");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionDeletionRequestList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
