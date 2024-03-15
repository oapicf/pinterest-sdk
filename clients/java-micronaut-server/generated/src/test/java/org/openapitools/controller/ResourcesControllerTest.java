package org.openapitools.controller;

import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;
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
        AdAccountsCountryResponse result = controller.adAccountCountriesGet().block();

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
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsCountryResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deliveryMetricsGet() method
     *
     * The method should: Get available metrics&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/content/analytics/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/ads/ad-analytics-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deliveryMetricsGetMethodTest() {
        // given
        String reportType = "example";

        // when
        DeliveryMetricsResponse result = controller.deliveryMetricsGet(reportType).block();

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
            .accept("application/json");
        request.getParameters()
            .add("report_type", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeliveryMetricsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of interestTargetingOptionsGet() method
     *
     * The method should: Get interest details
     *
     * &lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void interestTargetingOptionsGetMethodTest() {
        // given
        String interestId = "example";

        // when
        SingleInterestTargetingOptionResponse result = controller.interestTargetingOptionsGet(interestId).block();

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
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SingleInterestTargetingOptionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadFormQuestionsGet() method
     *
     * The method should: Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
            .accept("application/json");

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
        String date = "2022-07-13";

        // when
        BookClosedResponse result = controller.metricsReadyStateGet(date).block();

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
            .accept("application/json");
        request.getParameters()
            .add("date", "2022-07-13"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BookClosedResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of targetingOptionsGet() method
     *
     * The method should: Get targeting options
     *
     * &lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void targetingOptionsGetMethodTest() {
        // given
        String targetingType = "APPTYPE";
        String clientId = "1094834";
        String oauthSignature = "8209f";
        String timestamp = "1618338184277";

        // when
        List<Object> result = controller.targetingOptionsGet(targetingType, clientId, oauthSignature, timestamp).block();

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
            put("targeting_type", "APPTYPE");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("client_id", "1094834") // The query parameter format should be 
            .add("oauth_signature", "8209f") // The query parameter format should be 
            .add("timestamp", "1618338184277"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Object.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
