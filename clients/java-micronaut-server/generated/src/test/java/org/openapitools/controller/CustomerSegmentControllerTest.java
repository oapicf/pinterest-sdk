package org.openapitools.controller;

import org.openapitools.model.CustomerSegment;
import org.openapitools.model.CustomerSegmentCreate;
import org.openapitools.model.CustomerSegmentList200Response;
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
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
 * API tests for CustomerSegmentController
 */
@MicronautTest
public class CustomerSegmentControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CustomerSegmentController controller;

    /**
     * This test is used to validate the implementation of customerSegmentCreate() method
     *
     * The method should: Create customer segments
     *
     * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentCreateMethodTest() {
        // given
        String adAccountId = "example";
        CustomerSegmentCreate customerSegmentCreate = new CustomerSegmentCreate(Arrays.asList("example"), "example");

        // when
        CustomerSegment result = controller.customerSegmentCreate(adAccountId, customerSegmentCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_segments' to the features of customerSegmentCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentCreateClientApiTest() throws IOException {
        // given
        CustomerSegmentCreate body = new CustomerSegmentCreate(Arrays.asList("example"), "example");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_segments").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7d904923");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerSegment.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerSegmentList() method
     *
     * The method should: List customer segments
     *
     * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        Boolean includeSizing = false;
        String searchQuery = "example";

        // when
        CustomerSegmentList200Response result = controller.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_segments' to the features of customerSegmentList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_segments").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2d302ac2");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("include_sizing", String.valueOf(false)) // The query parameter format should be 
            .add("search_query", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CustomerSegmentList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of customerSegmentUpdate() method
     *
     * The method should: Update customer segments
     *
     * Update the customer segment given advertiser ID and customer segment ID
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentUpdateMethodTest() {
        // given
        String adAccountId = "example";
        CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody = new CustomerSegmentUpdateRequestUpdateWithRequiredBody("example", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));

        // when
        controller.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/customer_segments' to the features of customerSegmentUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void customerSegmentUpdateClientApiTest() throws IOException {
        // given
        CustomerSegmentUpdateRequestUpdateWithRequiredBody body = new CustomerSegmentUpdateRequestUpdateWithRequiredBody("example", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/customer_segments").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@584d9bf0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
