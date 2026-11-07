package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class AdGroupsApiServiceImpl implements AdGroupsApi {
    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @Override
    public List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     */
    @Override
    public AdGroupAudienceSizing adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     *
     */
    @Override
    public BidFloor adGroupsBidFloorGet(String adAccountId, BidFloorCreate bidFloorCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     *
     */
    @Override
    public AdGroupsCreate200Response adGroupsCreate(String adAccountId, List<@Valid AdGroupCreateCreate> adGroupCreateCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get dynamic titles CSV download URL
     *
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     *
     */
    @Override
    public DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(String adAccountId, String adGroupId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get dynamic titles status
     *
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     *
     */
    @Override
    public DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(String adAccountId, String adGroupId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get dynamic titles upload URL
     *
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     *
     */
    @Override
    public DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(String adAccountId, String adGroupId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Process dynamic titles CSV
     *
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     *
     */
    @Override
    public DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(String adAccountId, String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get ad group
     *
     * Get a specific ad group given the ad group ID.
     *
     */
    @Override
    public AdGroup adGroupsGet(String adGroupId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     *
     */
    @Override
    public AdGroupsList200Response adGroupsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    @Override
    public MetricsResponse adGroupsTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdGroupTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update ad groups
     *
     * Update multiple existing ad groups.
     *
     */
    @Override
    public AdGroupsCreate200Response adGroupsUpdate(String adAccountId, List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) {
        // TODO: Implement...
        return null;
    }

    /**
     * List of ad groups using promotions IDs.
     *
     *   Get a list of ad groups that are associated with those promotion ids
     *
     */
    @Override
    public AdGroupsList200Response getAdGroupsByPromotionIdsList(String adAccountId, List<String> promotionIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        // TODO: Implement...
        return null;
    }

}
