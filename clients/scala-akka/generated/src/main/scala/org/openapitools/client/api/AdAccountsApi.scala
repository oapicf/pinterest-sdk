/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.AdAccount
import org.openapitools.client.model.AdAccountAnalyticsResponseInner
import org.openapitools.client.model.AdAccountCreateRequest
import org.openapitools.client.model.AdAccountsList200Response
import org.openapitools.client.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.client.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.client.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.client.model.AdsAnalyticsTargetingType
import org.openapitools.client.model.ConversionReportAttributionType
import org.openapitools.client.model.CreateMMMReportRequest
import org.openapitools.client.model.CreateMMMReportResponse
import org.openapitools.client.model.Error
import org.openapitools.client.model.GetMMMReportResponse
import org.openapitools.client.model.Granularity
import java.time.LocalDate
import org.openapitools.client.model.MetricsResponse
import org.openapitools.client.model.TemplatesList200Response
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object AdAccountsApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new AdAccountsApi(baseUrl)
}

class AdAccountsApi(baseUrl: String) {

  /**
   * Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
   * 
   * Expected answers:
   *   code 200 : Seq[AdAccountAnalyticsResponseInner] (Success)
   *   code 400 : Error (Invalid ad account analytics parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
   * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   */
  def adAccountAnalytics(adAccountId: String, startDate: LocalDate, endDate: LocalDate, columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int] = None, engagementWindowDays: Option[Int] = None, viewWindowDays: Option[Int] = None, conversionReportTime: Option[String] = None): ApiRequest[Seq[AdAccountAnalyticsResponseInner]] =
    ApiRequest[Seq[AdAccountAnalyticsResponseInner]](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/analytics", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("columns", ArrayValues(columns, CSV))
      .withQueryParam("granularity", granularity)
      .withQueryParam("click_window_days", clickWindowDays)
      .withQueryParam("engagement_window_days", engagementWindowDays)
      .withQueryParam("view_window_days", viewWindowDays)
      .withQueryParam("conversion_report_time", conversionReportTime)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[Seq[AdAccountAnalyticsResponseInner]](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
   * 
   * Expected answers:
   *   code 200 : MetricsResponse (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
   * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
   * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @param attributionTypes List of types of attribution for the conversion report
   */
  def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: LocalDate, endDate: LocalDate, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int] = None, engagementWindowDays: Option[Int] = None, viewWindowDays: Option[Int] = None, conversionReportTime: Option[String] = None, attributionTypes: Option[ConversionReportAttributionType] = None): ApiRequest[MetricsResponse] =
    ApiRequest[MetricsResponse](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/targeting_analytics", "application/json")
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
   * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
   * 
   * Expected answers:
   *   code 200 : AdAccount (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountCreateRequest Ad account to create.
   */
  def adAccountsCreate(adAccountCreateRequest: AdAccountCreateRequest): ApiRequest[AdAccount] =
    ApiRequest[AdAccount](ApiMethods.POST, baseUrl, "/ad_accounts", "application/json")
      .withBody(adAccountCreateRequest)
      .withSuccessResponse[AdAccount](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get an ad account
   * 
   * Expected answers:
   *   code 200 : AdAccount (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   */
  def adAccountsGet(adAccountId: String): ApiRequest[AdAccount] =
    ApiRequest[AdAccount](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}", "application/json")
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[AdAccount](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
   * 
   * Expected answers:
   *   code 200 : AdAccountsList200Response (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
   * @param includeSharedAccounts Include shared ad accounts
   */
  def adAccountsList(bookmark: Option[String] = None, pageSize: Option[Int] = None, includeSharedAccounts: Option[Boolean] = None): ApiRequest[AdAccountsList200Response] =
    ApiRequest[AdAccountsList200Response](ApiMethods.GET, baseUrl, "/ad_accounts", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("include_shared_accounts", includeSharedAccounts)
      .withSuccessResponse[AdAccountsList200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
   * 
   * Expected answers:
   *   code 200 : CreateMMMReportResponse (Success)
   *   code 400 : Error (Invalid ad account ads analytics mmm parameters)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param createMMMReportRequest 
   */
  def analyticsCreateMmmReport(adAccountId: String, createMMMReportRequest: CreateMMMReportRequest): ApiRequest[CreateMMMReportResponse] =
    ApiRequest[CreateMMMReportResponse](ApiMethods.POST, baseUrl, "/ad_accounts/{ad_account_id}/mmm_reports", "application/json")
      .withBody(createMMMReportRequest)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[CreateMMMReportResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
   * 
   * Expected answers:
   *   code 200 : AdsAnalyticsCreateAsyncResponse (Success)
   *   code 400 : Error (Invalid ad account ads analytics parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param adsAnalyticsCreateAsyncRequest 
   */
  def analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): ApiRequest[AdsAnalyticsCreateAsyncResponse] =
    ApiRequest[AdsAnalyticsCreateAsyncResponse](ApiMethods.POST, baseUrl, "/ad_accounts/{ad_account_id}/reports", "application/json")
      .withBody(adsAnalyticsCreateAsyncRequest)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[AdsAnalyticsCreateAsyncResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
   * 
   * Expected answers:
   *   code 200 : AdsAnalyticsCreateAsyncResponse (Success)
   *   code 400 : Error (Invalid ad account ads analytics template parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param templateId Unique identifier of a template.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
   * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   */
  def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: Option[LocalDate] = None, endDate: Option[LocalDate] = None, granularity: Option[Granularity] = None): ApiRequest[AdsAnalyticsCreateAsyncResponse] =
    ApiRequest[AdsAnalyticsCreateAsyncResponse](ApiMethods.POST, baseUrl, "/ad_accounts/{ad_account_id}/templates/{template_id}/reports", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("granularity", granularity)
      .withPathParam("ad_account_id", adAccountId)
      .withPathParam("template_id", templateId)
      .withSuccessResponse[AdsAnalyticsCreateAsyncResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
   * 
   * Expected answers:
   *   code 200 : GetMMMReportResponse (Success)
   *   code 400 : Error (Invalid ad account ads analytics parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param token Token returned from the post request creation call
   */
  def analyticsGetMmmReport(adAccountId: String, token: String): ApiRequest[GetMMMReportResponse] =
    ApiRequest[GetMMMReportResponse](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/mmm_reports", "application/json")
      .withQueryParam("token", token)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[GetMMMReportResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
   * 
   * Expected answers:
   *   code 200 : AdsAnalyticsGetAsyncResponse (Success)
   *   code 400 : Error (Invalid ad account ads analytics parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param token Token returned from the post request creation call
   */
  def analyticsGetReport(adAccountId: String, token: String): ApiRequest[AdsAnalyticsGetAsyncResponse] =
    ApiRequest[AdsAnalyticsGetAsyncResponse](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/reports", "application/json")
      .withQueryParam("token", token)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[AdsAnalyticsGetAsyncResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : Error (Invalid ad account id.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   */
  def sandboxDelete(adAccountId: String): ApiRequest[String] =
    ApiRequest[String](ApiMethods.DELETE, baseUrl, "/ad_accounts/{ad_account_id}/sandbox", "application/json")
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[String](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Gets all Templates associated with an ad account ID.
   * 
   * Expected answers:
   *   code 200 : TemplatesList200Response (Success)
   *   code 400 : Error (Invalid ad account template parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
   * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
   * @param bookmark Cursor used to fetch the next page of items
   */
  def templatesList(adAccountId: String, pageSize: Option[Int] = None, order: Option[String] = None, bookmark: Option[String] = None): ApiRequest[TemplatesList200Response] =
    ApiRequest[TemplatesList200Response](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/templates", "application/json")
      .withQueryParam("page_size", pageSize)
      .withQueryParam("order", order)
      .withQueryParam("bookmark", bookmark)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[TemplatesList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      



}
