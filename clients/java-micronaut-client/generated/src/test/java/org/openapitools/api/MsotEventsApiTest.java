package org.openapitools.api;

import org.openapitools.model.ConversionMSOTEvents;
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
 * API tests for MsotEventsApi
 */
@MicronautTest
public class MsotEventsApiTest {

    @Inject
    MsotEventsApi api;

    
    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
     */
    @Test
    @Disabled("Not Implemented")
    public void msotEventsCreateTest() {
        // given
        String adAccountId = "example";
        ConversionMSOTEvents conversionMSOTEvents = new ConversionMSOTEvents("2680060704746", "click", "eventId0001", "add_to_cart", 1451431341L);

        // when
        api.msotEventsCreate(adAccountId, conversionMSOTEvents).block();

        // then
        // TODO implement the msotEventsCreateTest()
    }

    
}
