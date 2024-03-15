package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class AdsApiServiceImpl implements AdsApi {
    /**
     * Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
     *
     */
    @Override
    public AdPreviewURLResponse adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @Override
    public MetricsResponse adTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     */
    @Override
    public List<AdsAnalyticsResponseInner> adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     *
     */
    @Override
    public AdArrayResponse adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     */
    @Override
    public AdResponse adsGet(String adAccountId, String adId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List ads
     *
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     */
    @Override
    public AdsList200Response adsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<@Pattern(regexp = "^\\d+$")String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update ads
     *
     * Update multiple existing ads
     *
     */
    @Override
    public AdArrayResponse adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
