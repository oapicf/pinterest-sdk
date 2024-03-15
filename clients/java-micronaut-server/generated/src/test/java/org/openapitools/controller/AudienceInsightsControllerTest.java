package org.openapitools.controller;

import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
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
 * API tests for AudienceInsightsController
 */
@MicronautTest
public class AudienceInsightsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AudienceInsightsController controller;

    /**
     * This test is used to validate the implementation of audienceInsightsGet() method
     *
     * The method should: Get audience insights
     *
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audienceInsightsGetMethodTest() {
        // given
        String adAccountId = "example";
        AudienceInsightType audienceInsightType = AudienceInsightType.fromValue("YOUR_TOTAL_AUDIENCE");

        // when
        AudienceInsightsResponse result = controller.audienceInsightsGet(adAccountId, audienceInsightType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/audience_insights' to the features of audienceInsightsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audienceInsightsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/audience_insights").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("audience_insight_type", String.valueOf(AudienceInsightType.fromValue("YOUR_TOTAL_AUDIENCE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AudienceInsightsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of audienceInsightsScopeAndTypeGet() method
     *
     * The method should: Get audience insights scope and type
     *
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void audienceInsightsScopeAndTypeGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        AudienceDefinitionResponse result = controller.audienceInsightsScopeAndTypeGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/insights/audiences' to the features of audienceInsightsScopeAndTypeGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void audienceInsightsScopeAndTypeGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/insights/audiences").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AudienceDefinitionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
