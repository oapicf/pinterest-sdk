package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.PromotionCreateRequest;
import org.openapitools.model.PromotionResponse;
import org.openapitools.model.PromotionUpdateRequest;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;
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
 * API tests for PromotionsController
 */
@MicronautTest
public class PromotionsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    PromotionsController controller;

    /**
     * This test is used to validate the implementation of promotionsCreate() method
     *
     * The method should: Create promotions
     *
     * Create multiple new promotions.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid PromotionCreateRequest> promotionCreateRequest = Arrays.asList();

        // when
        PromotionsResponse result = controller.promotionsCreate(adAccountId, promotionCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotions' to the features of promotionsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsCreateClientApiTest() throws IOException {
        // given
        List<@Valid PromotionCreateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3cbd0cb0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PromotionsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of promotionsDelete() method
     *
     * The method should: Delete promotion by id
     *
     * Delete a promotion within Pinterest.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsDeleteMethodTest() {
        // given
        String adAccountId = "example";
        String promotionId = "example";

        // when
        controller.promotionsDelete(adAccountId, promotionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotions/{promotion_id}' to the features of promotionsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotions/{promotion_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("promotion_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@26f8a3a3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of promotionsGet() method
     *
     * The method should: Get promotion by id
     *
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsGetMethodTest() {
        // given
        String adAccountId = "example";
        String promotionId = "example";

        // when
        PromotionResponse result = controller.promotionsGet(adAccountId, promotionId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotions/{promotion_id}' to the features of promotionsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotions/{promotion_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("promotion_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6a7920c1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PromotionResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of promotionsList() method
     *
     * The method should: Get promotions
     *
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsListMethodTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        PromotionsList200Response result = controller.promotionsList(adAccountId, pageSize, order, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotions' to the features of promotionsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1aaeb86");
        request.getParameters()
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PromotionsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of promotionsUpdate() method
     *
     * The method should: Update promotions
     *
     * Update multiple promotions.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid PromotionUpdateRequest> promotionUpdateRequest = Arrays.asList();

        // when
        PromotionsResponse result = controller.promotionsUpdate(adAccountId, promotionUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotions' to the features of promotionsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void promotionsUpdateClientApiTest() throws IOException {
        // given
        List<@Valid PromotionUpdateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@5526af8f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PromotionsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
