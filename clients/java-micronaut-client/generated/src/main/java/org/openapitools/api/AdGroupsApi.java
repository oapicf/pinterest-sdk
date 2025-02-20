/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface AdGroupsApi {
    /**
     * Get ad group analytics
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned (required)
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @return List&lt;AdGroupsAnalyticsResponseInner&gt;
     */
    @Get(uri="/ad_accounts/{ad_account_id}/ad_groups/analytics")
    @Consumes({"application/json"})
    Mono<List<AdGroupsAnalyticsResponseInner>> adGroupsAnalytics(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="start_date") @NotNull @Format("yyyy-MM-dd") LocalDate startDate, 
        @QueryValue(value="end_date") @NotNull @Format("yyyy-MM-dd") LocalDate endDate, 
        @QueryValue(value="ad_group_ids") @NotNull @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, 
        @QueryValue(value="columns") @NotNull List<String> columns, 
        @QueryValue(value="granularity") @NotNull Granularity granularity, 
        @QueryValue(value="click_window_days", defaultValue="30") @Nullable Integer clickWindowDays, 
        @QueryValue(value="engagement_window_days", defaultValue="30") @Nullable Integer engagementWindowDays, 
        @QueryValue(value="view_window_days", defaultValue="1") @Nullable Integer viewWindowDays, 
        @QueryValue(value="conversion_report_time", defaultValue="TIME_OF_AD_ACTION") @Nullable String conversionReportTime
    );

    /**
     * Get audience sizing
     * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupAudienceSizingRequest  (optional)
     * @return AdGroupAudienceSizingResponse
     */
    @Post(uri="/ad_accounts/{ad_account_id}/ad_groups/audience_sizing")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AdGroupAudienceSizingResponse> adGroupsAudienceSizing(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @Nullable @Valid AdGroupAudienceSizingRequest adGroupAudienceSizingRequest
    );

    /**
     * Get bid floors
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt;  &lt;/ul&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bidFloorRequest Parameters to get bid_floor info (required)
     * @return BidFloor
     */
    @Post(uri="/ad_accounts/{ad_account_id}/bid_floor")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<BidFloor> adGroupsBidFloorGet(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid BidFloorRequest bidFloorRequest
    );

    /**
     * Create ad groups
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt; &lt;strong&gt;Note:&lt;/strong&gt; - &#39;bid_in_micro_currency&#39; and &#39;budget_in_micro_currency&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt;  &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupCreateRequest List of ad groups to create, size limit [1, 30]. (required)
     * @return AdGroupArrayResponse
     */
    @Post(uri="/ad_accounts/{ad_account_id}/ad_groups")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AdGroupArrayResponse> adGroupsCreate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Size(min=1, max=30) List<@Valid AdGroupCreateRequest> adGroupCreateRequest
    );

    /**
     * Get ad group
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupId Unique identifier of an ad group. (required)
     * @return AdGroupResponse
     */
    @Get(uri="/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}")
    @Consumes({"application/json"})
    Mono<AdGroupResponse> adGroupsGet(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @PathVariable(name="ad_group_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adGroupId
    );

    /**
     * List ad groups
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param adGroupIds List of Ad group Ids to use to filter the results. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs. (optional, default to false)
     * @return AdGroupsList200Response
     */
    @Get(uri="/ad_accounts/{ad_account_id}/ad_groups")
    @Consumes({"application/json"})
    Mono<AdGroupsList200Response> adGroupsList(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="campaign_ids") @Nullable @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, 
        @QueryValue(value="ad_group_ids") @Nullable @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")String> adGroupIds, 
        @QueryValue(value="entity_statuses", defaultValue="ACTIVE,PAUSED") @Nullable List<String> entityStatuses, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="order") @Nullable String order, 
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="translate_interests_to_names", defaultValue="false") @Nullable Boolean translateInterestsToNames
    );

    /**
     * Get targeting analytics for ad groups
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned (required)
     * @param granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param attributionTypes List of types of attribution for the conversion report (optional)
     * @return MetricsResponse
     */
    @Get(uri="/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics")
    @Consumes({"application/json"})
    Mono<MetricsResponse> adGroupsTargetingAnalyticsGet(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="ad_group_ids") @NotNull @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, 
        @QueryValue(value="start_date") @NotNull @Format("yyyy-MM-dd") LocalDate startDate, 
        @QueryValue(value="end_date") @NotNull @Format("yyyy-MM-dd") LocalDate endDate, 
        @QueryValue(value="targeting_types") @NotNull @Size(min=1, max=15) List<AdsAnalyticsTargetingType> targetingTypes, 
        @QueryValue(value="columns") @NotNull List<String> columns, 
        @QueryValue(value="granularity") @NotNull Granularity granularity, 
        @QueryValue(value="click_window_days", defaultValue="30") @Nullable Integer clickWindowDays, 
        @QueryValue(value="engagement_window_days", defaultValue="30") @Nullable Integer engagementWindowDays, 
        @QueryValue(value="view_window_days", defaultValue="1") @Nullable Integer viewWindowDays, 
        @QueryValue(value="conversion_report_time", defaultValue="TIME_OF_AD_ACTION") @Nullable String conversionReportTime, 
        @QueryValue(value="attribution_types") @Nullable ConversionReportAttributionType attributionTypes
    );

    /**
     * Update ad groups
     * Update multiple existing ad groups.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupUpdateRequest List of ad groups to update, size limit [1, 30]. (required)
     * @return AdGroupArrayResponse
     */
    @Patch(uri="/ad_accounts/{ad_account_id}/ad_groups")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AdGroupArrayResponse> adGroupsUpdate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Size(min=1, max=30) List<@Valid AdGroupUpdateRequest> adGroupUpdateRequest
    );

}
