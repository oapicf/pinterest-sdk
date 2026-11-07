package org.openapitools.api;

import org.openapitools.model.ConversionMSOTEventsCreate;
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
 * API tests for MsotEventsApi
 */
@MicronautTest
public class MsotEventsApiTest {

    @Inject
    MsotEventsApi api;

    
    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
     */
    @Test
    @Disabled("Not Implemented")
    public void msotEventsCreateTest() {
        // given
        String adAccountId = "example";
        ConversionMSOTEventsCreate conversionMSOTEventsCreate = new ConversionMSOTEventsCreate("2680060704746", "eventId0001", org.openapitools.model.MsotEventName.fromValue("add_to_cart"), 1451431341L);

        // when
        api.msotEventsCreate(adAccountId, conversionMSOTEventsCreate).block();

        // then
        // TODO implement the msotEventsCreateTest()
    }

    
}
