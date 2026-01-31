package org.openapitools.controller;

import org.openapitools.model.EventQualityScore;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SourcePlatformOptions;
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
 * API tests for ConversionEqsController
 */
@MicronautTest
public class ConversionEqsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ConversionEqsController controller;

    /**
     * This test is used to validate the implementation of conversionEqsList() method
     *
     * The method should: Get event quality score (EQS)
     *
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionEqsListMethodTest() {
        // given
        LookbackPeriodOptions lookbackPeriod = LookbackPeriodOptions.fromValue("1d");
        String adAccountId = "example";
        SourcePlatformOptions sourcePlatform = SourcePlatformOptions.fromValue("WEB");
        IngestionSourceOptions ingestionSource = IngestionSourceOptions.fromValue("TAG");

        // when
        List<EventQualityScore> result = controller.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/conversion_eqs' to the features of conversionEqsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void conversionEqsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/conversion_eqs").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@24576926");
        request.getParameters()
            .add("lookback_period", String.valueOf(LookbackPeriodOptions.fromValue("1d"))) // The query parameter format should be 
            .add("source_platform", String.valueOf(SourcePlatformOptions.fromValue("WEB"))) // The query parameter format should be 
            .add("ingestion_source", String.valueOf(IngestionSourceOptions.fromValue("TAG"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, EventQualityScore.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
