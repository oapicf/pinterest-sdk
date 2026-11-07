package org.openapitools.api;

import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsights;
import org.openapitools.model.AudienceInsightsScopeAndTypeGet200Response;
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
 * API tests for AudienceInsightsApi
 */
@MicronautTest
public class AudienceInsightsApiTest {

    @Inject
    AudienceInsightsApi api;

    
    /**
     * Get audience insights
     *
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
     */
    @Test
    @Disabled("Not Implemented")
    public void audienceInsightsGetTest() {
        // given
        String adAccountId = "example";
        AudienceInsightType audienceInsightType = AudienceInsightType.fromValue("YOUR_TOTAL_AUDIENCE");

        // when
        AudienceInsights body = api.audienceInsightsGet(adAccountId, audienceInsightType).block();

        // then
        // TODO implement the audienceInsightsGetTest()
    }

    
    /**
     * Get audience insights scope and type
     *
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     */
    @Test
    @Disabled("Not Implemented")
    public void audienceInsightsScopeAndTypeGetTest() {
        // given
        String adAccountId = "example";

        // when
        AudienceInsightsScopeAndTypeGet200Response body = api.audienceInsightsScopeAndTypeGet(adAccountId).block();

        // then
        // TODO implement the audienceInsightsScopeAndTypeGetTest()
    }

    
}
