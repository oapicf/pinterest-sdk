package org.openapitools.api;

import org.openapitools.model.AdGroup;
import org.openapitools.model.AdGroupAudienceSizing;
import org.openapitools.model.AdGroupAudienceSizingCreate;
import org.openapitools.model.AdGroupCreateCreate;
import org.openapitools.model.AdGroupUpdateBatchUpdate;
import org.openapitools.model.AdGroupsAnalyticsMetrics;
import org.openapitools.model.AdGroupsCreate200Response;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.DynamicTitlesDownloadCSV;
import org.openapitools.model.DynamicTitlesGetStatus;
import org.openapitools.model.DynamicTitlesProcessCSV;
import org.openapitools.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.model.DynamicTitlesUploadURL;
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
 * API tests for AdGroupsApi
 */
@MicronautTest
public class AdGroupsApiTest {

    @Inject
    AdGroupsApi api;

    
    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsAnalyticsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
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
        List<AdGroupsAnalyticsMetrics> body = api.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone).block();

        // then
        // TODO implement the adGroupsAnalyticsTest()
    }

    
    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsAudienceSizingTest() {
        // given
        String adAccountId = "example";
        AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = new AdGroupAudienceSizingCreate();

        // when
        AdGroupAudienceSizing body = api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate).block();

        // then
        // TODO implement the adGroupsAudienceSizingTest()
    }

    
    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsBidFloorGetTest() {
        // given
        String adAccountId = "example";
        BidFloorCreate bidFloorCreate = new BidFloorCreate(Arrays.asList());

        // when
        BidFloor body = api.adGroupsBidFloorGet(adAccountId, bidFloorCreate).block();

        // then
        // TODO implement the adGroupsBidFloorGetTest()
    }

    
    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdGroupCreateCreate> adGroupCreateCreate = Arrays.asList();

        // when
        AdGroupsCreate200Response body = api.adGroupsCreate(adAccountId, adGroupCreateCreate).block();

        // then
        // TODO implement the adGroupsCreateTest()
    }

    
    /**
     * Get dynamic titles CSV download URL
     *
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsDynamicTitlesDownloadCsvTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesDownloadCSV body = api.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId).block();

        // then
        // TODO implement the adGroupsDynamicTitlesDownloadCsvTest()
    }

    
    /**
     * Get dynamic titles status
     *
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsDynamicTitlesGetStatusTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesGetStatus body = api.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId).block();

        // then
        // TODO implement the adGroupsDynamicTitlesGetStatusTest()
    }

    
    /**
     * Get dynamic titles upload URL
     *
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsDynamicTitlesGetUploadUrlTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesUploadURL body = api.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId).block();

        // then
        // TODO implement the adGroupsDynamicTitlesGetUploadUrlTest()
    }

    
    /**
     * Process dynamic titles CSV
     *
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsDynamicTitlesProcessCsvTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";
        DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate = new DynamicTitlesProcessCSVCreate("example");

        // when
        DynamicTitlesProcessCSV body = api.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate).block();

        // then
        // TODO implement the adGroupsDynamicTitlesProcessCsvTest()
    }

    
    /**
     * Get ad group
     *
     * Get a specific ad group given the ad group ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsGetTest() {
        // given
        String adGroupId = "example";
        String adAccountId = "example";

        // when
        AdGroup body = api.adGroupsGet(adGroupId, adAccountId).block();

        // then
        // TODO implement the adGroupsGetTest()
    }

    
    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();
        Boolean translateInterestsToNames = false;

        // when
        AdGroupsList200Response body = api.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames).block();

        // then
        // TODO implement the adGroupsListTest()
    }

    
    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsTargetingAnalyticsGetTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsAdGroupTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");
        List<String> sortColumns = Arrays.asList("example");
        Boolean sortAscending = false;

        // when
        MetricsResponse body = api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending).block();

        // then
        // TODO implement the adGroupsTargetingAnalyticsGetTest()
    }

    
    /**
     * Update ad groups
     *
     * Update multiple existing ad groups.
     */
    @Test
    @Disabled("Not Implemented")
    public void adGroupsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate = Arrays.asList();

        // when
        AdGroupsCreate200Response body = api.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate).block();

        // then
        // TODO implement the adGroupsUpdateTest()
    }

    
    /**
     * List of ad groups using promotions IDs.
     *
     *   Get a list of ad groups that are associated with those promotion ids
     */
    @Test
    @Disabled("Not Implemented")
    public void getAdGroupsByPromotionIdsListTest() {
        // given
        String adAccountId = "example";
        List<String> promotionIds = Arrays.asList("example");
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        AdGroupsList200Response body = api.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order).block();

        // then
        // TODO implement the getAdGroupsByPromotionIdsListTest()
    }

    
}
