package api

import play.api.libs.json._
import model.Ad
import model.AdBatchUpdate
import model.AdBatchWriteResponseModel
import model.AdCreate
import model.AdPreviewRequest
import model.AdPreviewURLResponse
import model.AdsAnalytics
import model.AdsAnalyticsAdTargetingType
import model.AdsList200Response
import model.BigDecimal
import model.CampaignAdPreview
import model.CampaignAdPreviewCreate
import model.CampaignAdPreviewCreate200ResponseInner
import model.CampaignAdPreviewDelete200ResponseInner
import model.ConversionAttributionWindowDays
import model.ConversionReportAttributionType
import model.ConversionReportTimeType
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait AdsApi {
  /**
    * Create ad preview with pin or image
    * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest): AdPreviewURLResponse

  /**
    * Get targeting analytics for ads
    * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * @param adAccountId Unique identifier of an ad account.
    * @param adIds List of Ad Ids to use to filter the results.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
    * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * @param attributionTypes List of types of attribution for the conversion report
    * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    * @param sortColumns Sort Columns.
    * @param sortAscending Sort ascending.
    */
  def adTargetingAnalyticsGet(adAccountId: String, adIds: List[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: List[AdsAnalyticsAdTargetingType], columns: List[ReportingColumnSync], granularity: Granularity, clickWindowDays: Option[ConversionAttributionWindowDays], engagementWindowDays: Option[ConversionAttributionWindowDays], viewWindowDays: Option[ConversionAttributionWindowDays], conversionReportTime: Option[ConversionReportTimeType], attributionTypes: Option[List[ConversionReportAttributionType]], reportingTimezone: Option[ReportingTimeZone], sortColumns: Option[List[String]], sortAscending: Option[Boolean]): MetricsResponse

  /**
    * Get ad analytics
    *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    * @param adAccountId Unique identifier of an ad account.
    * @param pinIds List of Pin IDs.
    * @param adIds List of Ad Ids to use to filter the results.
    * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * @param campaignIds List of Campaign Ids to use to filter the results.
    * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
  def adsAnalytics(startDate: LocalDate, endDate: LocalDate, columns: List[ReportingColumnSync], granularity: Granularity, adAccountId: String, pinIds: Option[List[String]], adIds: Option[List[String]], clickWindowDays: Option[BigDecimal], engagementWindowDays: Option[BigDecimal], viewWindowDays: Option[BigDecimal], conversionReportTime: Option[String], campaignIds: Option[List[String]], reportingTimezone: Option[ReportingTimeZone]): List[AdsAnalytics]

  /**
    * Create ads
    * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreate(adAccountId: String, adCreate: List[AdCreate]): AdBatchWriteResponseModel

  /**
    * Get ad
    * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
    * @param adId The ID of this ad.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsGet(adId: String, adAccountId: String): Ad

  /**
    * List ads
    * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param campaignIds List of Campaign Ids to use to filter the results.
    * @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
    * @param adIds List of Ad Ids to use to filter the results.
    * @param entityStatuses Entity status
    */
  def adsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], campaignIds: Option[List[String]], adGroupIds: Option[List[String]], adIds: Option[List[String]], entityStatuses: Option[List[EntityStatus]]): AdsList200Response

  /**
    * Update ads
    * Update multiple existing ads
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsUpdate(adAccountId: String, adBatchUpdate: List[AdBatchUpdate]): AdBatchWriteResponseModel

  /**
    * Create ad preview records for one or more ad groups
    * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewCreate(adAccountId: String, campaignAdPreviewCreate: List[CampaignAdPreviewCreate]): List[CampaignAdPreviewCreate200ResponseInner]

  /**
    * Delete ad preview records for one or more ad groups
    * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
    * @param adGroupIds List of Ad group Ids to use to filter the results.
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewDelete(adGroupIds: List[String], adAccountId: String): List[CampaignAdPreviewDelete200ResponseInner]

  /**
    * Fetch ad preview records for one or more ad groups
    * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
    * @param adGroupIds List of Ad group Ids to use to filter the results.
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewRead(adGroupIds: List[String], adAccountId: String): List[CampaignAdPreview]
}
