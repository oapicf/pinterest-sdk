package org.openapitools.controller;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
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
 * API tests for ProductTagsController
 */
@MicronautTest
public class ProductTagsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ProductTagsController controller;

    /**
     * This test is used to validate the implementation of productTagsBulkAdd() method
     *
     * The method should: Add product tags to pin
     *
     * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsBulkAddMethodTest() {
        // given
        String pinId = "example";
        ProductTagsBulkAddRequest productTagsBulkAddRequest = new ProductTagsBulkAddRequest(Arrays.asList());

        // when
        ProductTagsResponse result = controller.productTagsBulkAdd(pinId, productTagsBulkAddRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}/product_tags' to the features of productTagsBulkAdd() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsBulkAddClientApiTest() throws IOException {
        // given
        ProductTagsBulkAddRequest body = new ProductTagsBulkAddRequest(Arrays.asList());
        String uri = UriTemplate.of("/pins/{pin_id}/product_tags").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4ec7836c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductTagsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productTagsBulkDelete() method
     *
     * The method should: Delete product tags from pin
     *
     * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsBulkDeleteMethodTest() {
        // given
        String pinId = "example";
        ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = new ProductTagsBulkDeleteRequest(Arrays.asList());

        // when
        controller.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}/product_tags/bulk-delete' to the features of productTagsBulkDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsBulkDeleteClientApiTest() throws IOException {
        // given
        ProductTagsBulkDeleteRequest body = new ProductTagsBulkDeleteRequest(Arrays.asList());
        String uri = UriTemplate.of("/pins/{pin_id}/product_tags/bulk-delete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3e417de7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productTagsList() method
     *
     * The method should: Get product tags for pin
     *
     * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsListMethodTest() {
        // given
        String pinId = "example";

        // when
        ProductTagsResponse result = controller.productTagsList(pinId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}/product_tags' to the features of productTagsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productTagsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pins/{pin_id}/product_tags").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2130710");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProductTagsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
