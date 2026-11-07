package org.openapitools.api;

import org.openapitools.model.AdPinAnalytics;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import org.openapitools.model.Campaign;
import org.openapitools.model.CampaignBatchUpdateItem;
import org.openapitools.model.CampaignBatchWriteResponseModel;
import org.openapitools.model.CampaignCreateItem;
import org.openapitools.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.model.CampaignsAnalyticsMetrics;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
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
 * API tests for CampaignsApi
 */
@MicronautTest
public class CampaignsApiTest {

    @Inject
    CampaignsApi api;

    
    /**
     * Get pins analytics
     *
     * Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
     */
    @Test
    @Disabled("Not Implemented")
    public void adPinsAnalyticsTest() {
        // given
        String campaignId = "example";
        List<@Pattern(regexp = "^\\d+$")String> pinIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<AdPinAnalytics> body = api.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        // TODO implement the adPinsAnalyticsTest()
    }

    
    /**
     * Get targeting analytics for campaigns
     *
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignTargetingAnalyticsGetTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsCampaignTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        MetricsResponse body = api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone).block();

        // then
        // TODO implement the campaignTargetingAnalyticsGetTest()
    }

    
    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignsAnalyticsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        Boolean aggregateReportRows = false;
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<CampaignsAnalyticsMetrics> body = api.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone).block();

        // then
        // TODO implement the campaignsAnalyticsTest()
    }

    
    /**
     * Create campaigns
     *
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignCreateItem> campaignCreateItem = Arrays.asList();

        // when
        CampaignBatchWriteResponseModel body = api.campaignsCreate(adAccountId, campaignCreateItem).block();

        // then
        // TODO implement the campaignsCreateTest()
    }

    
    /**
     * Get campaign
     *
     * Get a specific campaign given the campaign ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignsGetTest() {
        // given
        String campaignId = "example";
        String adAccountId = "example";

        // when
        Campaign body = api.campaignsGet(campaignId, adAccountId).block();

        // then
        // TODO implement the campaignsGetTest()
    }

    
    /**
     * List campaigns
     *
     * Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();

        // when
        CampaignsList200Response body = api.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses).block();

        // then
        // TODO implement the campaignsListTest()
    }

    
    /**
     * Update campaigns
     *
     * Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignBatchUpdateItem> campaignBatchUpdateItem = Arrays.asList();

        // when
        CampaignBatchWriteResponseModel body = api.campaignsUpdate(adAccountId, campaignBatchUpdateItem).block();

        // then
        // TODO implement the campaignsUpdateTest()
    }

    
    /**
     * Get campaign delivery estimates
     *
     * Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignDeliveryEstimatesTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign = Arrays.asList();

        // when
        CampaignDeliveryEstimatesResponse body = api.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign).block();

        // then
        // TODO implement the getCampaignDeliveryEstimatesTest()
    }

    
}
