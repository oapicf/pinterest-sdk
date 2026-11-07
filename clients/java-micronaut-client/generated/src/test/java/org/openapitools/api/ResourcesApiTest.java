package org.openapitools.api;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;
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
 * API tests for ResourcesApi
 */
@MicronautTest
public class ResourcesApiTest {

    @Inject
    ResourcesApi api;

    
    /**
     * Get ad accounts countries
     *
     * Get Ad Accounts countries
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountCountriesGetTest() {
        // given

        // when
        AdAccountCountriesGet200Response body = api.adAccountCountriesGet().block();

        // then
        // TODO implement the adAccountCountriesGetTest()
    }

    
    /**
     * Get available metrics&#39; definitions
     *
     * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
     */
    @Test
    @Disabled("Not Implemented")
    public void deliveryMetricsGetTest() {
        // given
        ReportType reportType = ReportType.fromValue("SYNC");

        // when
        DeliveryMetricsGet200Response body = api.deliveryMetricsGet(reportType).block();

        // then
        // TODO implement the deliveryMetricsGetTest()
    }

    
    /**
     * Get interest details
     *
     * Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
     */
    @Test
    @Disabled("Not Implemented")
    public void interestTargetingOptionsGetTest() {
        // given
        String interestId = "example";

        // when
        SingleInterestTargetingOption body = api.interestTargetingOptionsGet(interestId).block();

        // then
        // TODO implement the interestTargetingOptionsGetTest()
    }

    
    /**
     * Get lead form questions
     *
     * Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @Test
    @Disabled("Not Implemented")
    public void leadFormQuestionsGetTest() {
        // given

        // when
        api.leadFormQuestionsGet().block();

        // then
        // TODO implement the leadFormQuestionsGetTest()
    }

    
    /**
     * Get metrics ready state
     *
     * Learn whether conversion or non-conversion metrics are finalized and ready to query.
     */
    @Test
    @Disabled("Not Implemented")
    public void metricsReadyStateGetTest() {
        // given
        String date = "example";

        // when
        BookClosed body = api.metricsReadyStateGet(date).block();

        // then
        // TODO implement the metricsReadyStateGetTest()
    }

    
    /**
     * Get targeting options
     *
     *     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
     */
    @Test
    @Disabled("Not Implemented")
    public void targetingOptionsGetTest() {
        // given
        PublicTargetingType targetingType = PublicTargetingType.fromValue("APPTYPE");
        String adAccountId = "example";
        String clientId = "example";
        String oauthSignature = "example";
        String timestamp = "example";

        // when
        List<Object> body = api.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp).block();

        // then
        // TODO implement the targetingOptionsGetTest()
    }

    
}
