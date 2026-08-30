package api

import play.api.libs.json._
import model.AdGroup
import model.AdGroupAudienceSizing
import model.AdGroupAudienceSizingCreate
import model.AdGroupCreateCreate
import model.AdGroupUpdateBatchUpdate
import model.AdGroupsAnalyticsMetrics
import model.AdGroupsCreate200Response
import model.AdGroupsList200Response
import model.AdsAnalyticsAdGroupTargetingType
import model.BidFloor
import model.BidFloorCreate
import model.BigDecimal
import model.ConversionReportAttributionType
import model.DynamicTitlesDownloadCSV
import model.DynamicTitlesGetStatus
import model.DynamicTitlesProcessCSV
import model.DynamicTitlesProcessCSVCreate
import model.DynamicTitlesUploadURL
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait AdGroupsApi {
  /**
    * Get ad group analytics
    * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param adGroupIds List of Ad group Ids to use to filter the results.
    * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    * @param adAccountId Unique identifier of an ad account.
    * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * @param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
    * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
  def adGroupsAnalytics(startDate: LocalDate, endDate: LocalDate, adGroupIds: List[String], columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], aggregateReportRows: Option[Boolean], reportingTimezone: Option[ReportingTimeZone]): List[AdGroupsAnalyticsMetrics]

  /**
    * Get audience sizing
    * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate): AdGroupAudienceSizing

  /**
    * Get bid floors
    * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsBidFloorGet(adAccountId: String, bidFloorCreate: BidFloorCreate): BidFloor

  /**
    * Create ad groups
    * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsCreate(adAccountId: String, adGroupCreateCreate: List[AdGroupCreateCreate]): AdGroupsCreate200Response

  /**
    * Get dynamic titles CSV download URL
    * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String): DynamicTitlesDownloadCSV

  /**
    * Get dynamic titles status
    * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String): DynamicTitlesGetStatus

  /**
    * Get dynamic titles upload URL
    * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String): DynamicTitlesUploadURL

  /**
    * Process dynamic titles CSV
    * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate): DynamicTitlesProcessCSV

  /**
    * Get ad group
    * Get a specific ad group given the ad group ID.
    * @param adGroupId Ad group ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsGet(adGroupId: String, adAccountId: String): AdGroup

  /**
    * List ad groups
    * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param campaignIds List of Campaign Ids to use to filter the results.
    * @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
    * @param entityStatuses Entity status
    * @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
    */
  def adGroupsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], campaignIds: Option[List[String]], adGroupIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]], translateInterestsToNames: Option[Boolean]): AdGroupsList200Response

  /**
    * Get targeting analytics for ad groups
    * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupIds List of Ad group Ids to use to filter the results.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users.
    * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * @param attributionTypes List of types of attribution for the conversion report
    * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    * @param sortColumns Sort Columns.
    * @param sortAscending Sort ascending.
    */
  def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdGroupTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone], sortColumns: Option[List[String]], sortAscending: Option[Boolean]): MetricsResponse

  /**
    * Update ad groups
    * Update multiple existing ad groups.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsUpdate(adAccountId: String, adGroupUpdateBatchUpdate: List[AdGroupUpdateBatchUpdate]): AdGroupsCreate200Response

  /**
    * List of ad groups using promotions IDs.
    *   Get a list of ad groups that are associated with those promotion ids
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionIds List of Promotion IDs to use to filter the results.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    */
  def getAdGroupsByPromotionIdsList(adAccountId: String, promotionIds: List[String], bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): AdGroupsList200Response
}
