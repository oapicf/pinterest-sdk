package org.openapitools.controller;

import org.openapitools.model.ConversionMSOTEventsCreate;
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
 * API tests for MsotEventsController
 */
@MicronautTest
public class MsotEventsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    MsotEventsController controller;

    /**
     * This test is used to validate the implementation of msotEventsCreate() method
     *
     * The method should: Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void msotEventsCreateMethodTest() {
        // given
        String adAccountId = "example";
        ConversionMSOTEventsCreate conversionMSOTEventsCreate = new ConversionMSOTEventsCreate("2680060704746", "eventId0001", org.openapitools.model.MsotEventName.fromValue("add_to_cart"), 1451431341L);

        // when
        controller.msotEventsCreate(adAccountId, conversionMSOTEventsCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/msot/events' to the features of msotEventsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void msotEventsCreateClientApiTest() throws IOException {
        // given
        ConversionMSOTEventsCreate body = new ConversionMSOTEventsCreate("2680060704746", "eventId0001", org.openapitools.model.MsotEventName.fromValue("add_to_cart"), 1451431341L);
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/msot/events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1e2bc7ab");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
