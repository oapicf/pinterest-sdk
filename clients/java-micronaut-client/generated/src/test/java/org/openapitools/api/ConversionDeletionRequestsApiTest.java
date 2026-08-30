package org.openapitools.api;

import org.openapitools.model.ConversionDeletionRequest;
import org.openapitools.model.ConversionDeletionRequestCreate;
import org.openapitools.model.ConversionDeletionRequestList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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
 * API tests for ConversionDeletionRequestsApi
 */
@MicronautTest
public class ConversionDeletionRequestsApiTest {

    @Inject
    ConversionDeletionRequestsApi api;

    
    /**
     * Create a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionDeletionRequestCreateTest() {
        // given
        String adAccountId = "example";
        ConversionDeletionRequestCreate conversionDeletionRequestCreate = new ConversionDeletionRequestCreate(null);

        // when
        ConversionDeletionRequest body = api.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate).block();

        // then
        // TODO implement the conversionDeletionRequestCreateTest()
    }

    
    /**
     * Delete a conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionDeletionRequestDeleteTest() {
        // given
        String requestId = "example";
        String adAccountId = "example";

        // when
        ConversionDeletionRequest body = api.conversionDeletionRequestDelete(requestId, adAccountId).block();

        // then
        // TODO implement the conversionDeletionRequestDeleteTest()
    }

    
    /**
     * Get a single conversion deletion request
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionDeletionRequestGetTest() {
        // given
        String requestId = "example";
        String adAccountId = "example";

        // when
        ConversionDeletionRequest body = api.conversionDeletionRequestGet(requestId, adAccountId).block();

        // then
        // TODO implement the conversionDeletionRequestGetTest()
    }

    
    /**
     * List conversion deletion requests
     *
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionDeletionRequestListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        ConversionDeletionRequestList200Response body = api.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order).block();

        // then
        // TODO implement the conversionDeletionRequestListTest()
    }

    
}
