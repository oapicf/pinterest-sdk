package org.openapitools.api;

import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
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
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
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
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";
        ConversionReportAttributionType attributionTypes = ConversionReportAttributionType.fromValue("INDIVIDUAL");

        // when
        MetricsResponse body = api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes).block();

        // then
        // TODO implement the adTargetingAnalyticsGetTest()
    }

    
    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adsAnalyticsTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<@Pattern(regexp = "^\\d+$")String> pinIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");

        // when
        List<AdsAnalyticsResponseInner> body = api.adsAnalytics(adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds).block();

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
        List<@Valid AdCreateRequest> adCreateRequest = Arrays.asList();

        // when
        AdArrayResponse body = api.adsCreate(adAccountId, adCreateRequest).block();

        // then
        // TODO implement the adsCreateTest()
    }

    
    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void adsGetTest() {
        // given
        String adAccountId = "example";
        String adId = "example";

        // when
        AdResponse body = api.adsGet(adAccountId, adId).block();

        // then
        // TODO implement the adsGetTest()
    }

    
    /**
     * List ads
     *
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void adsListTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        AdsList200Response body = api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark).block();

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
        List<@Valid AdUpdateRequest> adUpdateRequest = Arrays.asList();

        // when
        AdArrayResponse body = api.adsUpdate(adAccountId, adUpdateRequest).block();

        // then
        // TODO implement the adsUpdateTest()
    }

    
}
