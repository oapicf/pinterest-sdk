package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
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
 * API tests for OrderLinesApi
 */
@MicronautTest
public class OrderLinesApiTest {

    @Inject
    OrderLinesApi api;

    
    /**
     * Get order line
     *
     * Get a specific existing order line associated with an ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void orderLinesGetTest() {
        // given
        String adAccountId = "example";
        String orderLineId = "example";

        // when
        OrderLine body = api.orderLinesGet(adAccountId, orderLineId).block();

        // then
        // TODO implement the orderLinesGetTest()
    }

    
    /**
     * Get order lines
     *
     * List existing order lines associated with an ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void orderLinesListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        OrderLinesList200Response body = api.orderLinesList(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the orderLinesListTest()
    }

    
}
