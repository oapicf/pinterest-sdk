package org.openapitools.controller;

import org.openapitools.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for ConversionsController
 */
@MicronautTest
public class ConversionsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ConversionsController controller;

    /**
     * This test is used to validate the implementation of advertiserDefinedEventsCreate() method
     *
     * The method should: Create advertiser defined events
     *
     * Map advertiser defined events to standard events for the given ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsCreateMethodTest() {
        // given
        String adAccountId = "example";
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());

        // when
        AdvertiserDefinedEventsCreate200Response result = controller.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/advertiser_defined_events' to the features of advertiserDefinedEventsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsCreateClientApiTest() throws IOException {
        // given
        AdvertiserDefinedEventsCreateRequest body = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/advertiser_defined_events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@421407b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvertiserDefinedEventsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of advertiserDefinedEventsDelete() method
     *
     * The method should: Delete advertiser defined events
     *
     * Untrack advertiser defined events for the given ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsDeleteMethodTest() {
        // given
        String adAccountId = "example";
        List<String> eventNames = Arrays.asList("example");

        // when
        AdvertiserDefinedEventsCreate200Response result = controller.advertiserDefinedEventsDelete(adAccountId, eventNames).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/advertiser_defined_events' to the features of advertiserDefinedEventsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/advertiser_defined_events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@361fb6");
        request.getParameters()
            .add("event_names", String.valueOf(Arrays.asList("example"))); // The query parameter format should be csv

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvertiserDefinedEventsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of advertiserDefinedEventsGet() method
     *
     * The method should: Get advertiser defined events
     *
     * Get advertiser defined events for the given ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        AdvertiserDefinedEventsGet200Response result = controller.advertiserDefinedEventsGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/advertiser_defined_events' to the features of advertiserDefinedEventsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/advertiser_defined_events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7fc9aaad");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvertiserDefinedEventsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of advertiserDefinedEventsUpdate() method
     *
     * The method should: Update advertiser defined events
     *
     * Update advertiser defined event names or mappings for the given ad account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());

        // when
        AdvertiserDefinedEventsCreate200Response result = controller.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/advertiser_defined_events' to the features of advertiserDefinedEventsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void advertiserDefinedEventsUpdateClientApiTest() throws IOException {
        // given
        AdvertiserDefinedEventsCreateRequest body = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/advertiser_defined_events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@5358db9f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdvertiserDefinedEventsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
