package org.openapitools.controller;

import org.openapitools.model.ConversionApiResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
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
 * API tests for ConversionEventsController
 */
@MicronautTest
public class ConversionEventsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ConversionEventsController controller;

    /**
     * This test is used to validate the implementation of eventsCreate() method
     *
     * The method should: Send conversions
     *
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/conversions/conversions/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void eventsCreateMethodTest() {
        // given
        String adAccountId = "example";
        ConversionEvents conversionEvents = new ConversionEvents(Arrays.asList());
        Boolean test = false;

        // when
        ConversionApiResponse result = controller.eventsCreate(adAccountId, conversionEvents, test).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/events' to the features of eventsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void eventsCreateClientApiTest() throws IOException {
        // given
        ConversionEvents body = new ConversionEvents(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/events").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("test", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
