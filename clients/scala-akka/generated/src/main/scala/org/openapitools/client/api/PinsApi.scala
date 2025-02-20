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

import org.openapitools.client.model.Error
import java.time.LocalDate
import org.openapitools.client.model.Pin
import org.openapitools.client.model.PinAnalyticsMetricsResponse
import org.openapitools.client.model.PinCreate
import org.openapitools.client.model.PinUpdate
import org.openapitools.client.model.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.client.model.PinsList200Response
import org.openapitools.client.model.PinsSaveRequest
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object PinsApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new PinsApi(baseUrl)
}

class PinsApi(baseUrl: String) {

  /**
   * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   * 
   * Expected answers:
   *   code 200 : Map[String, Map[String, PinAnalyticsMetricsResponse]] (response)
   *   code 400 : Error (Invalid pins analytics parameters.)
   *   code 401 : Error (Not authorized to access board or Pin.)
   *   code 404 : Error (Pin not found.)
   *   code 429 : Error (This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinIds List of Pin IDs.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param metricTypes Pin metric types to get data for.
   * @param appTypes Apps or devices to get data for, default is all.
   * @param adAccountId Unique identifier of an ad account.
   */
  def multiPinsAnalytics(pinIds: Seq[String], startDate: LocalDate, endDate: LocalDate, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String] = None, adAccountId: Option[String] = None): ApiRequest[Map[String, Map[String, PinAnalyticsMetricsResponse]]] =
    ApiRequest[Map[String, Map[String, PinAnalyticsMetricsResponse]]](ApiMethods.GET, baseUrl, "/pins/analytics", "application/json")
      .withQueryParam("pin_ids", ArrayValues(pinIds, MULTI))
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("app_types", appTypes)
      .withQueryParam("metric_types", ArrayValues(metricTypes, CSV))
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[Map[String, Map[String, PinAnalyticsMetricsResponse]]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
      .withErrorResponse[Error](429)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   * 
   * Expected answers:
   *   code 200 : Map[String, PinAnalyticsMetricsResponse] (response)
   *   code 400 : Error (Invalid pins analytics parameters.)
   *   code 403 : Error (Not authorized to access board or Pin.)
   *   code 404 : Error (Pin not found.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinId Unique identifier of a Pin.
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param metricTypes Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
   * @param appTypes Apps or devices to get data for, default is all.
   * @param splitField How to split the data into groups. Not including this param means data won't be split.
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String] = None, splitField: Option[String] = None, adAccountId: Option[String] = None): ApiRequest[Map[String, PinAnalyticsMetricsResponse]] =
    ApiRequest[Map[String, PinAnalyticsMetricsResponse]](ApiMethods.GET, baseUrl, "/pins/{pin_id}/analytics", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("app_types", appTypes)
      .withQueryParam("metric_types", ArrayValues(metricTypes, CSV))
      .withQueryParam("split_field", splitField)
      .withQueryParam("ad_account_id", adAccountId)
      .withPathParam("pin_id", pinId)
      .withSuccessResponse[Map[String, PinAnalyticsMetricsResponse]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/web-features/add-ons-overview/'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/api-features/content-overview/'>Content App Solutions Guide</a>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
   * 
   * Expected answers:
   *   code 201 : Pin (Successful pin creation.)
   *   code 400 : Error (Invalid Pin parameters response)
   *   code 403 : Error (The Pin's image is too small, too large or is broken)
   *   code 404 : Error (Board or section not found)
   *   code 429 : Error (This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinCreate Create a new Pin.
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String] = None): ApiRequest[Pin] =
    ApiRequest[Pin](ApiMethods.POST, baseUrl, "/pins", "application/json")
      .withBody(pinCreate)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[Pin](201)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withErrorResponse[Error](429)
      .withDefaultErrorResponse[Error]
      

  /**
   * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
   * 
   * Expected answers:
   *   code 204 :  (Successfully deleted Pin)
   *   code 403 : Error (Not authorized to access board or Pin.)
   *   code 404 : Error (Pin not found.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinId Unique identifier of a Pin.
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsDelete(pinId: String, adAccountId: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/pins/{pin_id}", "application/json")
      .withQueryParam("ad_account_id", adAccountId)
      .withPathParam("pin_id", pinId)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
   * 
   * Expected answers:
   *   code 200 : Pin (response)
   *   code 403 : Error (Not authorized to access board or Pin.)
   *   code 404 : Error (Pin not found.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinId Unique identifier of a Pin.
   * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsGet(pinId: String, pinMetrics: Option[Boolean] = None, adAccountId: Option[String] = None): ApiRequest[Pin] =
    ApiRequest[Pin](ApiMethods.GET, baseUrl, "/pins/{pin_id}", "application/json")
      .withQueryParam("pin_metrics", pinMetrics)
      .withQueryParam("ad_account_id", adAccountId)
      .withPathParam("pin_id", pinId)
      .withSuccessResponse[Pin](200)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href='/docs/api/v5/#operation/boards/list_pins'>GET List Pins on Board</a>.
   * 
   * Expected answers:
   *   code 200 : PinsList200Response (Success)
   *   code 400 : Error (Invalid pin filter value)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param pinFilter Pin filter.
   * @param includeProtectedPins Specify if return pins from protected boards
   * @param pinType The type of pins to return, currently only enabled for private pins
   * @param creativeTypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   * @param adAccountId Unique identifier of an ad account.
   * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
   */
  def pinsList(bookmark: Option[String] = None, pageSize: Option[Int] = None, pinFilter: Option[String] = None, includeProtectedPins: Option[Boolean] = None, pinType: Option[String] = None, creativeTypes: Seq[String], adAccountId: Option[String] = None, pinMetrics: Option[Boolean] = None): ApiRequest[PinsList200Response] =
    ApiRequest[PinsList200Response](ApiMethods.GET, baseUrl, "/pins", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("pin_filter", pinFilter)
      .withQueryParam("include_protected_pins", includeProtectedPins)
      .withQueryParam("pin_type", pinType)
      .withQueryParam("creative_types", ArrayValues(creativeTypes, MULTI))
      .withQueryParam("ad_account_id", adAccountId)
      .withQueryParam("pin_metrics", pinMetrics)
      .withSuccessResponse[PinsList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
   * 
   * Expected answers:
   *   code 201 : Pin (Successfully saved pin.)
   *   code 403 : Error (Not authorized to access Board or Pin.)
   *   code 404 : Error (Board or Pin not found.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinId Unique identifier of a Pin.
   * @param pinsSaveRequest Request object used to save an existing pin
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String] = None): ApiRequest[Pin] =
    ApiRequest[Pin](ApiMethods.POST, baseUrl, "/pins/{pin_id}/save", "application/json")
      .withBody(pinsSaveRequest)
      .withQueryParam("ad_account_id", adAccountId)
      .withPathParam("pin_id", pinId)
      .withSuccessResponse[Pin](201)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
   * 
   * Expected answers:
   *   code 200 : Pin (response)
   *   code 403 : Error (Not authorized to update Pin.)
   *   code 404 : Error (Pin not found.)
   *   code 429 : Error (This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param pinId Unique identifier of a Pin.
   * @param pinUpdate 
   * @param adAccountId Unique identifier of an ad account.
   */
  def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String] = None): ApiRequest[Pin] =
    ApiRequest[Pin](ApiMethods.PATCH, baseUrl, "/pins/{pin_id}", "application/json")
      .withBody(pinUpdate)
      .withQueryParam("ad_account_id", adAccountId)
      .withPathParam("pin_id", pinId)
      .withSuccessResponse[Pin](200)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      .withErrorResponse[Error](429)
      .withDefaultErrorResponse[Error]
      



}

