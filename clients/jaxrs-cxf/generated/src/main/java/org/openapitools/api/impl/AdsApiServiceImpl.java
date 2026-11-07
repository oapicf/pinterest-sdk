package org.openapitools.api.impl;

import org.openapitools.api.*;
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
import org.joda.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


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
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     *
     */
    public AdPreviewURLResponse adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    public MetricsResponse adTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get ad analytics
     *
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    public List<AdsAnalytics> adsAnalytics(LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, List<String> pinIds, List<@Pattern(regexp = "^\\d+$")String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, ReportingTimeZone reportingTimezone) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     *
     */
    public AdBatchWriteResponseModel adsCreate(String adAccountId, List<@Valid AdCreate> adCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     *
     */
    public Ad adsGet(String adId, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List ads
     *
     * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     *
     */
    public AdsList200Response adsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<@Pattern(regexp = "^\\d+$")String> adIds, List<EntityStatus> entityStatuses) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update ads
     *
     * Update multiple existing ads
     *
     */
    public AdBatchWriteResponseModel adsUpdate(String adAccountId, List<@Valid AdBatchUpdate> adBatchUpdate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create ad preview records for one or more ad groups
     *
     * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
     *
     */
    public List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(String adAccountId, List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete ad preview records for one or more ad groups
     *
     * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
     *
     */
    public List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Fetch ad preview records for one or more ad groups
     *
     * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
     *
     */
    public List<CampaignAdPreview> campaignAdPreviewRead(List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, String adAccountId) {
        // TODO: Implement...

        return null;
    }

}
