package org.openapitools.api;

import org.openapitools.model.AdvertiserDefinedEventsResponse;
import org.openapitools.model.Error;
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
     * Get advertiser defined events
     *
     * &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void advertiserDefinedEventsGetTest() {
        // given
        String adAccountId = "example";

        // when
        AdvertiserDefinedEventsResponse body = api.advertiserDefinedEventsGet(adAccountId).block();

        // then
        // TODO implement the advertiserDefinedEventsGetTest()
    }

    
}
