/**
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
package org.openapitools.client.api

import org.openapitools.client.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.client.model.CampaignCreateRequest
import org.openapitools.client.model.CampaignCreateResponse
import org.openapitools.client.model.CampaignResponse
import org.openapitools.client.model.CampaignUpdateRequest
import org.openapitools.client.model.CampaignUpdateResponse
import org.openapitools.client.model.CampaignsAnalyticsResponseInner
import org.openapitools.client.model.CampaignsList200Response
import org.openapitools.client.model.ConversionReportAttributionType
import org.openapitools.client.model.Error
import org.openapitools.client.model.Granularity
import java.time.LocalDate
import org.openapitools.client.model.MetricsResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object CampaignsApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new CampaignsApi(baseUrl)
}

class CampaignsApi(baseUrl: String) {

  /**
   * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
   * 
   * Expected answers:
   *   code 200 : MetricsResponse (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param campaignIds List of Campaign Ids to use to filter the results.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
   * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
   * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @param attributionTypes List of types of attribution for the conversion report
   */
  def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: Seq[String], startDate: LocalDate, endDate: LocalDate, targetingTypes: Seq[AdsAnalyticsCampaignTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int] = None, engagementWindowDays: Option[Int] = None, viewWindowDays: Option[Int] = None, conversionReportTime: Option[String] = None, attributionTypes: Option[ConversionReportAttributionType] = None): ApiRequest[MetricsResponse] =
    ApiRequest[MetricsResponse](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics", "application/json")
      .withQueryParam("campaign_ids", ArrayValues(campaignIds, MULTI))
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("targeting_types", ArrayValues(targetingTypes, CSV))
      .withQueryParam("columns", ArrayValues(columns, CSV))
      .withQueryParam("granularity", granularity)
      .withQueryParam("click_window_days", clickWindowDays)
      .withQueryParam("engagement_window_days", engagementWindowDays)
      .withQueryParam("view_window_days", viewWindowDays)
      .withQueryParam("conversion_report_time", conversionReportTime)
      .withQueryParam("attribution_types", attributionTypes)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[MetricsResponse](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
   * 
   * Expected answers:
   *   code 200 : Seq[CampaignsAnalyticsResponseInner] (Success)
   *   code 400 : Error (Invalid ad account campaign analytics parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param campaignIds List of Campaign Ids to use to filter the results.
   * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
   * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   */
  def campaignsAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, campaignIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int] = None, engagementWindowDays: Option[Int] = None, viewWindowDays: Option[Int] = None, conversionReportTime: Option[String] = None): ApiRequest[Seq[CampaignsAnalyticsResponseInner]] =
    ApiRequest[Seq[CampaignsAnalyticsResponseInner]](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/campaigns/analytics", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("campaign_ids", ArrayValues(campaignIds, MULTI))
      .withQueryParam("columns", ArrayValues(columns, CSV))
      .withQueryParam("granularity", granularity)
      .withQueryParam("click_window_days", clickWindowDays)
      .withQueryParam("engagement_window_days", engagementWindowDays)
      .withQueryParam("view_window_days", viewWindowDays)
      .withQueryParam("conversion_report_time", conversionReportTime)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[Seq[CampaignsAnalyticsResponseInner]](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>  <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
   * 
   * Expected answers:
   *   code 200 : CampaignCreateResponse (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param campaignCreateRequest Array of campaigns.
   */
  def campaignsCreate(adAccountId: String, campaignCreateRequest: Seq[CampaignCreateRequest]): ApiRequest[CampaignCreateResponse] =
    ApiRequest[CampaignCreateResponse](ApiMethods.POST, baseUrl, "/ad_accounts/{ad_account_id}/campaigns", "application/json")
      .withBody(campaignCreateRequest)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[CampaignCreateResponse](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a specific campaign given the campaign ID.
   * 
   * Expected answers:
   *   code 200 : CampaignResponse (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path.
   */
  def campaignsGet(adAccountId: String, campaignId: String): ApiRequest[CampaignResponse] =
    ApiRequest[CampaignResponse](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}", "application/json")
      .withPathParam("ad_account_id", adAccountId)
      .withPathParam("campaign_id", campaignId)
      .withSuccessResponse[CampaignResponse](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
   * 
   * Expected answers:
   *   code 200 : CampaignsList200Response (Success)
   *   code 400 : Error (Invalid ad account campaign parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param campaignIds List of Campaign Ids to use to filter the results.
   * @param entityStatuses Entity status
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
   * @param bookmark Cursor used to fetch the next page of items
   */
  def campaignsList(adAccountId: String, campaignIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int] = None, order: Option[String] = None, bookmark: Option[String] = None): ApiRequest[CampaignsList200Response] =
    ApiRequest[CampaignsList200Response](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/campaigns", "application/json")
      .withQueryParam("campaign_ids", ArrayValues(campaignIds, MULTI))
      .withQueryParam("entity_statuses", ArrayValues(entityStatuses, MULTI))
      .withQueryParam("page_size", pageSize)
      .withQueryParam("order", order)
      .withQueryParam("bookmark", bookmark)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[CampaignsList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/>  - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
   * 
   * Expected answers:
   *   code 200 : CampaignUpdateResponse (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param campaignUpdateRequest Array of campaigns.
   */
  def campaignsUpdate(adAccountId: String, campaignUpdateRequest: Seq[CampaignUpdateRequest]): ApiRequest[CampaignUpdateResponse] =
    ApiRequest[CampaignUpdateResponse](ApiMethods.PATCH, baseUrl, "/ad_accounts/{ad_account_id}/campaigns", "application/json")
      .withBody(campaignUpdateRequest)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[CampaignUpdateResponse](200)
      .withDefaultErrorResponse[Error]
      



}

