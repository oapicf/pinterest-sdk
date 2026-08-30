package org.openapitools.api;

import org.openapitools.model.CustomerSegment;
import org.openapitools.model.CustomerSegmentCreate;
import org.openapitools.model.CustomerSegmentList200Response;
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
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
 * API tests for CustomerSegmentApi
 */
@MicronautTest
public class CustomerSegmentApiTest {

    @Inject
    CustomerSegmentApi api;

    
    /**
     * Create customer segments
     *
     * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerSegmentCreateTest() {
        // given
        String adAccountId = "example";
        CustomerSegmentCreate customerSegmentCreate = new CustomerSegmentCreate(Arrays.asList("example"), "example");

        // when
        CustomerSegment body = api.customerSegmentCreate(adAccountId, customerSegmentCreate).block();

        // then
        // TODO implement the customerSegmentCreateTest()
    }

    
    /**
     * List customer segments
     *
     * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerSegmentListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        Boolean includeSizing = false;
        String searchQuery = "example";

        // when
        CustomerSegmentList200Response body = api.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery).block();

        // then
        // TODO implement the customerSegmentListTest()
    }

    
    /**
     * Update customer segments
     *
     * Update the customer segment given advertiser ID and customer segment ID
     */
    @Test
    @Disabled("Not Implemented")
    public void customerSegmentUpdateTest() {
        // given
        String adAccountId = "example";
        CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody = new CustomerSegmentUpdateRequestUpdateWithRequiredBody("example", org.openapitools.model.AudienceUpdateOperationType.fromValue("UPDATE"));

        // when
        api.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody).block();

        // then
        // TODO implement the customerSegmentUpdateTest()
    }

    
}
