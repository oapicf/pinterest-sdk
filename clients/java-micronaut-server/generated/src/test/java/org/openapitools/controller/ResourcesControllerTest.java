package org.openapitools.controller;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;
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
 * API tests for ResourcesController
 */
@MicronautTest
public class ResourcesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ResourcesController controller;

    /**
     * This test is used to validate the implementation of adAccountCountriesGet() method
     *
     * The method should: Get ad accounts countries
     *
     * Get Ad Accounts countries
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountCountriesGetMethodTest() {
        // given

        // when
        AdAccountCountriesGet200Response result = controller.adAccountCountriesGet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/ad_account_countries' to the features of adAccountCountriesGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountCountriesGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/ad_account_countries").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@58912c44");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountCountriesGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deliveryMetricsGet() method
     *
     * The method should: Get available metrics&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deliveryMetricsGetMethodTest() {
        // given
        ReportType reportType = ReportType.fromValue("SYNC");

        // when
        DeliveryMetricsGet200Response result = controller.deliveryMetricsGet(reportType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/delivery_metrics' to the features of deliveryMetricsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deliveryMetricsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/delivery_metrics").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@77366ad3");
        request.getParameters()
            .add("report_type", String.valueOf(ReportType.fromValue("SYNC"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeliveryMetricsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of interestTargetingOptionsGet() method
     *
     * The method should: Get interest details
     *
     * Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void interestTargetingOptionsGetMethodTest() {
        // given
        String interestId = "example";

        // when
        SingleInterestTargetingOption result = controller.interestTargetingOptionsGet(interestId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/targeting/interests/{interest_id}' to the features of interestTargetingOptionsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void interestTargetingOptionsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/targeting/interests/{interest_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("interest_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@10bfd589");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SingleInterestTargetingOption.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormQuestionsGet() method
     *
     * The method should: Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormQuestionsGetMethodTest() {
        // given

        // when
        controller.leadFormQuestionsGet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/lead_form_questions' to the features of leadFormQuestionsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadFormQuestionsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/lead_form_questions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@52f7b4df");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of metricsReadyStateGet() method
     *
     * The method should: Get metrics ready state
     *
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void metricsReadyStateGetMethodTest() {
        // given
        String date = "example";

        // when
        BookClosed result = controller.metricsReadyStateGet(date).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/metrics_ready_state' to the features of metricsReadyStateGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void metricsReadyStateGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/metrics_ready_state").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3d551c9");
        request.getParameters()
            .add("date", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BookClosed.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of targetingOptionsGet() method
     *
     * The method should: Get targeting options
     *
     *     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingOptionsGetMethodTest() {
        // given
        PublicTargetingType targetingType = PublicTargetingType.fromValue("APPTYPE");
        String adAccountId = "example";
        String clientId = "example";
        String oauthSignature = "example";
        String timestamp = "example";

        // when
        List<Object> result = controller.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/resources/targeting/{targeting_type}' to the features of targetingOptionsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingOptionsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/resources/targeting/{targeting_type}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("targeting_type", PublicTargetingType.fromValue("APPTYPE"));
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4771c392");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("client_id", "example") // The query parameter format should be 
            .add("oauth_signature", "example") // The query parameter format should be 
            .add("timestamp", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Object.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
