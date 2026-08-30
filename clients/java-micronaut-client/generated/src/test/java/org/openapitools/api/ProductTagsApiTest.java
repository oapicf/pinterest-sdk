package org.openapitools.api;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ProductTagsApi
 */
@MicronautTest
public class ProductTagsApiTest {

    @Inject
    ProductTagsApi api;

    
    /**
     * Add product tags to pin
     *
     * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
     */
    @Test
    @Disabled("Not Implemented")
    public void productTagsBulkAddTest() {
        // given
        String pinId = "example";
        ProductTagsBulkAddRequest productTagsBulkAddRequest = new ProductTagsBulkAddRequest(Arrays.asList());

        // when
        ProductTagsResponse body = api.productTagsBulkAdd(pinId, productTagsBulkAddRequest).block();

        // then
        // TODO implement the productTagsBulkAddTest()
    }

    
    /**
     * Delete product tags from pin
     *
     * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
     */
    @Test
    @Disabled("Not Implemented")
    public void productTagsBulkDeleteTest() {
        // given
        String pinId = "example";
        ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = new ProductTagsBulkDeleteRequest(Arrays.asList());

        // when
        api.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest).block();

        // then
        // TODO implement the productTagsBulkDeleteTest()
    }

    
    /**
     * Get product tags for pin
     *
     * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
     */
    @Test
    @Disabled("Not Implemented")
    public void productTagsListTest() {
        // given
        String pinId = "example";

        // when
        ProductTagsResponse body = api.productTagsList(pinId).block();

        // then
        // TODO implement the productTagsListTest()
    }

    
}
