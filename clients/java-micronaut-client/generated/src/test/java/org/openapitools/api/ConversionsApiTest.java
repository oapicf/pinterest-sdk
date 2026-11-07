package org.openapitools.api;

import org.openapitools.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for ConversionsApi
 */
@MicronautTest
public class ConversionsApiTest {

    @Inject
    ConversionsApi api;

    
    /**
     * Create advertiser defined events
     *
     * Map advertiser defined events to standard events for the given ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void advertiserDefinedEventsCreateTest() {
        // given
        String adAccountId = "example";
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());

        // when
        AdvertiserDefinedEventsCreate200Response body = api.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest).block();

        // then
        // TODO implement the advertiserDefinedEventsCreateTest()
    }

    
    /**
     * Delete advertiser defined events
     *
     * Untrack advertiser defined events for the given ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void advertiserDefinedEventsDeleteTest() {
        // given
        String adAccountId = "example";
        List<String> eventNames = Arrays.asList("example");

        // when
        AdvertiserDefinedEventsCreate200Response body = api.advertiserDefinedEventsDelete(adAccountId, eventNames).block();

        // then
        // TODO implement the advertiserDefinedEventsDeleteTest()
    }

    
    /**
     * Get advertiser defined events
     *
     * Get advertiser defined events for the given ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void advertiserDefinedEventsGetTest() {
        // given
        String adAccountId = "example";

        // when
        AdvertiserDefinedEventsGet200Response body = api.advertiserDefinedEventsGet(adAccountId).block();

        // then
        // TODO implement the advertiserDefinedEventsGetTest()
    }

    
    /**
     * Update advertiser defined events
     *
     * Update advertiser defined event names or mappings for the given ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void advertiserDefinedEventsUpdateTest() {
        // given
        String adAccountId = "example";
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = new AdvertiserDefinedEventsCreateRequest(Arrays.asList());

        // when
        AdvertiserDefinedEventsCreate200Response body = api.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest).block();

        // then
        // TODO implement the advertiserDefinedEventsUpdateTest()
    }

    
}
