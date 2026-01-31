package org.openapitools.api;

import org.openapitools.model.EventQualityScore;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SourcePlatformOptions;
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
 * API tests for ConversionEqsApi
 */
@MicronautTest
public class ConversionEqsApiTest {

    @Inject
    ConversionEqsApi api;

    
    /**
     * Get event quality score (EQS)
     *
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionEqsListTest() {
        // given
        LookbackPeriodOptions lookbackPeriod = LookbackPeriodOptions.fromValue("1d");
        String adAccountId = "example";
        SourcePlatformOptions sourcePlatform = SourcePlatformOptions.fromValue("WEB");
        IngestionSourceOptions ingestionSource = IngestionSourceOptions.fromValue("TAG");

        // when
        List<EventQualityScore> body = api.conversionEqsList(lookbackPeriod, adAccountId, sourcePlatform, ingestionSource).block();

        // then
        // TODO implement the conversionEqsListTest()
    }

    
}
