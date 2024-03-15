package org.openapitools.controller;

import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
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
 * API tests for LeadAdsController
 */
@MicronautTest
public class LeadAdsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    LeadAdsController controller;

    /**
     * This test is used to validate the implementation of adAccountsSubscriptionsDelById() method
     *
     * The method should: Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsDelByIdMethodTest() {
        // given
        String adAccountId = "example";
        String subscriptionId = "example";

        // when
        controller.adAccountsSubscriptionsDelById(adAccountId, subscriptionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}' to the features of adAccountsSubscriptionsDelById() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsDelByIdClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("subscription_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsSubscriptionsGetById() method
     *
     * The method should: Get lead ads subscription
     *
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsGetByIdMethodTest() {
        // given
        String adAccountId = "example";
        String subscriptionId = "example";

        // when
        AdAccountGetSubscriptionResponse result = controller.adAccountsSubscriptionsGetById(adAccountId, subscriptionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}' to the features of adAccountsSubscriptionsGetById() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsGetByIdClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("subscription_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountGetSubscriptionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsSubscriptionsGetList() method
     *
     * The method should: Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsGetListMethodTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        AdAccountsSubscriptionsGetList200Response result = controller.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads/subscriptions' to the features of adAccountsSubscriptionsGetList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsGetListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads/subscriptions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsSubscriptionsGetList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsSubscriptionsPost() method
     *
     * The method should: Create lead ads subscription
     *
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsPostMethodTest() {
        // given
        String adAccountId = "example";
        AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = new AdAccountCreateSubscriptionRequest("https://webhook.example.com/xyz");

        // when
        AdAccountCreateSubscriptionResponse result = controller.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads/subscriptions' to the features of adAccountsSubscriptionsPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsSubscriptionsPostClientApiTest() throws IOException {
        // given
        AdAccountCreateSubscriptionRequest body = new AdAccountCreateSubscriptionRequest("https://webhook.example.com/xyz");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads/subscriptions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountCreateSubscriptionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
