package org.openapitools.api;

import org.openapitools.model.Ad;
import org.openapitools.model.AdBatchUpdate;
import org.openapitools.model.AdBatchWriteResponseModel;
import org.openapitools.model.AdCreate;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdsAnalytics;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
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
 * API tests for AdsApi
 */
@MicronautTest
public class AdsApiTest {

    @Inject
    AdsApi api;

    
    /**
     * Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     */
    @Test
    @Disabled("Not Implemented")
    public void adPreviewsCreateTest() {
        // given
        String adAccountId = "example";
        AdPreviewRequest adPreviewRequest = new AdPreviewRequest();

        // when
        AdPreviewURLResponse body = api.adPreviewsCreate(adAccountId, adPreviewRequest).block();

        // then
        // TODO implement the adPreviewsCreateTest()
    }

    
    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adTargetingAnalyticsGetTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsAdTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionAttributionWindowDays engagementWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionReportTimeType conversionReportTime = ConversionReportTimeType.fromValue("TIME_OF_AD_ACTION");
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");
        List<String> sortColumns = Arrays.asList("example");
        Boolean sortAscending = false;

        // when
        MetricsResponse body = api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending).block();

        // then
        // TODO implement the adTargetingAnalyticsGetTest()
    }

    
    /**
     * Get ad analytics
     *
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adsAnalyticsTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        List<String> pinIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<AdsAnalytics> body = api.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone).block();

        // then
        // TODO implement the adsAnalyticsTest()
    }

    
    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     */
    @Test
    @Disabled("Not Implemented")
    public void adsCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdCreate> adCreate = Arrays.asList();

        // when
        AdBatchWriteResponseModel body = api.adsCreate(adAccountId, adCreate).block();

        // then
        // TODO implement the adsCreateTest()
    }

    
    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     */
    @Test
    @Disabled("Not Implemented")
    public void adsGetTest() {
        // given
        String adId = "example";
        String adAccountId = "example";

        // when
        Ad body = api.adsGet(adId, adAccountId).block();

        // then
        // TODO implement the adsGetTest()
    }

    
    /**
     * List ads
     *
     * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     */
    @Test
    @Disabled("Not Implemented")
    public void adsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();

        // when
        AdsList200Response body = api.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses).block();

        // then
        // TODO implement the adsListTest()
    }

    
    /**
     * Update ads
     *
     * Update multiple existing ads
     */
    @Test
    @Disabled("Not Implemented")
    public void adsUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdBatchUpdate> adBatchUpdate = Arrays.asList();

        // when
        AdBatchWriteResponseModel body = api.adsUpdate(adAccountId, adBatchUpdate).block();

        // then
        // TODO implement the adsUpdateTest()
    }

    
    /**
     * Create ad preview records for one or more ad groups
     *
     * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignAdPreviewCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate = Arrays.asList();

        // when
        List<CampaignAdPreviewCreate200ResponseInner> body = api.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate).block();

        // then
        // TODO implement the campaignAdPreviewCreateTest()
    }

    
    /**
     * Delete ad preview records for one or more ad groups
     *
     * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignAdPreviewDeleteTest() {
        // given
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CampaignAdPreviewDelete200ResponseInner> body = api.campaignAdPreviewDelete(adGroupIds, adAccountId).block();

        // then
        // TODO implement the campaignAdPreviewDeleteTest()
    }

    
    /**
     * Fetch ad preview records for one or more ad groups
     *
     * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
     */
    @Test
    @Disabled("Not Implemented")
    public void campaignAdPreviewReadTest() {
        // given
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CampaignAdPreview> body = api.campaignAdPreviewRead(adGroupIds, adAccountId).block();

        // then
        // TODO implement the campaignAdPreviewReadTest()
    }

    
}
