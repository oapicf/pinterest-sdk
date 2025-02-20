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

import org.openapitools.client.model.Account
import org.openapitools.client.model.AnalyticsMetricsResponse
import org.openapitools.client.model.BoardsUserFollowsList200Response
import org.openapitools.client.model.Error
import org.openapitools.client.model.FollowUserRequest
import org.openapitools.client.model.FollowersList200Response
import org.openapitools.client.model.LinkedBusiness
import java.time.LocalDate
import org.openapitools.client.model.TopPinsAnalyticsResponse
import org.openapitools.client.model.TopVideoPinsAnalyticsResponse
import org.openapitools.client.model.UserAccountFollowedInterests200Response
import org.openapitools.client.model.UserFollowingFeedType
import org.openapitools.client.model.UserFollowingGet200Response
import org.openapitools.client.model.UserSummary
import org.openapitools.client.model.UserWebsiteSummary
import org.openapitools.client.model.UserWebsiteVerificationCode
import org.openapitools.client.model.UserWebsiteVerifyRequest
import org.openapitools.client.model.UserWebsitesGet200Response
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object UserAccountApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new UserAccountApi(baseUrl)
}

class UserAccountApi(baseUrl: String) {

  /**
   * Get a list of the boards a user follows. The request returns a board summary object array.
   * 
   * Expected answers:
   *   code 200 : BoardsUserFollowsList200Response (Success)
   *   code 400 : Error (Invalid user id)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
   * @param adAccountId Unique identifier of an ad account.
   */
  def boardsUserFollowsList(bookmark: Option[String] = None, pageSize: Option[Int] = None, explicitFollowing: Option[Boolean] = None, adAccountId: Option[String] = None): ApiRequest[BoardsUserFollowsList200Response] =
    ApiRequest[BoardsUserFollowsList200Response](ApiMethods.GET, baseUrl, "/user_account/following/boards", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("explicit_following", explicitFollowing)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[BoardsUserFollowsList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
   * 
   * Expected answers:
   *   code 200 : UserSummary (Success)
   *   code 404 : Error (User not found)
   *   code 0 : Error (Unexpected error)
   * 
   * @param username A valid username
   * @param followUserRequest Follow a user.
   */
  def followUserUpdate(username: String, followUserRequest: FollowUserRequest): ApiRequest[UserSummary] =
    ApiRequest[UserSummary](ApiMethods.POST, baseUrl, "/user_account/following/{username}", "application/json")
      .withBody(followUserRequest)
      .withPathParam("username", username)
      .withSuccessResponse[UserSummary](200)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of your followers.
   * 
   * Expected answers:
   *   code 200 : FollowersList200Response (Success)
   *   code 400 : Error (Invalid user id)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def followersList(bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[FollowersList200Response] =
    ApiRequest[FollowersList200Response](ApiMethods.GET, baseUrl, "/user_account/followers", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withSuccessResponse[FollowersList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of your linked business accounts.
   * 
   * Expected answers:
   *   code 200 : Seq[LinkedBusiness] (Success)
   *   code 0 : Error (Unexpected error)
   */
  def linkedBusinessAccountsGet(): ApiRequest[Seq[LinkedBusiness]] =
    ApiRequest[Seq[LinkedBusiness]](ApiMethods.GET, baseUrl, "/user_account/businesses", "application/json")
      .withSuccessResponse[Seq[LinkedBusiness]](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Unverifu a website verified by the signed-in user.
   * 
   * Expected answers:
   *   code 204 :  (Successfully unverified website)
   *   code 404 : Error (Website not in user list.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param website Website with path or domain only
   */
  def unverifyWebsiteDelete(website: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/user_account/websites", "application/json")
      .withQueryParam("website", website)
      .withSuccessResponse[Unit](204)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
   * 
   * Expected answers:
   *   code 200 : Map[String, AnalyticsMetricsResponse] (Success)
   *   code 400 : Error (Invalid user accounts analytics parameters.)
   *   code 403 : Error (Not authorized to access the user account analytics.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param fromClaimedContent Filter on Pins that match your claimed domain.
   * @param pinFormat Pin formats to get data for, default is all.
   * @param appTypes Apps or devices to get data for, default is all.
   * @param contentType Filter to paid or organic data. Default is all.
   * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
   * @param metricTypes Metric types to get data for, default is all. 
   * @param splitField How to split the data into groups. Not including this param means data won't be split.
   * @param adAccountId Unique identifier of an ad account.
   */
  def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: Option[String] = None, pinFormat: Option[String] = None, appTypes: Option[String] = None, contentType: Option[String] = None, source: Option[String] = None, metricTypes: Seq[String], splitField: Option[String] = None, adAccountId: Option[String] = None): ApiRequest[Map[String, AnalyticsMetricsResponse]] =
    ApiRequest[Map[String, AnalyticsMetricsResponse]](ApiMethods.GET, baseUrl, "/user_account/analytics", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("from_claimed_content", fromClaimedContent)
      .withQueryParam("pin_format", pinFormat)
      .withQueryParam("app_types", appTypes)
      .withQueryParam("content_type", contentType)
      .withQueryParam("source", source)
      .withQueryParam("metric_types", ArrayValues(metricTypes, CSV))
      .withQueryParam("split_field", splitField)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[Map[String, AnalyticsMetricsResponse]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      

  /**
   * Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
   * 
   * Expected answers:
   *   code 200 : TopPinsAnalyticsResponse (Success)
   *   code 403 : Error (Not authorized to access the user account analytics.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param sortBy Specify sorting order for metrics
   * @param fromClaimedContent Filter on Pins that match your claimed domain.
   * @param pinFormat Pin formats to get data for, default is all.
   * @param appTypes Apps or devices to get data for, default is all.
   * @param contentType Filter to paid or organic data. Default is all.
   * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
   * @param metricTypes Metric types to get data for, default is all. 
   * @param numOfPins Number of pins to include, default is 10. Max is 50.
   * @param createdInLastNDays Get metrics for pins created in the last \"n\" days.
   * @param adAccountId Unique identifier of an ad account.
   */
  def userAccountAnalyticsTopPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String] = None, pinFormat: Option[String] = None, appTypes: Option[String] = None, contentType: Option[String] = None, source: Option[String] = None, metricTypes: Seq[String], numOfPins: Option[Int] = None, createdInLastNDays: Option[Int] = None, adAccountId: Option[String] = None): ApiRequest[TopPinsAnalyticsResponse] =
    ApiRequest[TopPinsAnalyticsResponse](ApiMethods.GET, baseUrl, "/user_account/analytics/top_pins", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("sort_by", sortBy)
      .withQueryParam("from_claimed_content", fromClaimedContent)
      .withQueryParam("pin_format", pinFormat)
      .withQueryParam("app_types", appTypes)
      .withQueryParam("content_type", contentType)
      .withQueryParam("source", source)
      .withQueryParam("metric_types", ArrayValues(metricTypes, CSV))
      .withQueryParam("num_of_pins", numOfPins)
      .withQueryParam("created_in_last_n_days", createdInLastNDays)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[TopPinsAnalyticsResponse](200)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      

  /**
   * Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
   * 
   * Expected answers:
   *   code 200 : TopVideoPinsAnalyticsResponse (Success)
   *   code 403 : Error (Not authorized to access the user account analytics.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
   * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
   * @param sortBy Specify sorting order for video metrics
   * @param fromClaimedContent Filter on Pins that match your claimed domain.
   * @param pinFormat Pin formats to get data for, default is all.
   * @param appTypes Apps or devices to get data for, default is all.
   * @param contentType Filter to paid or organic data. Default is all.
   * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
   * @param metricTypes Metric types to get video data for, default is all. 
   * @param numOfPins Number of pins to include, default is 10. Max is 50.
   * @param createdInLastNDays Get metrics for pins created in the last \"n\" days.
   * @param adAccountId Unique identifier of an ad account.
   */
  def userAccountAnalyticsTopVideoPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String] = None, pinFormat: Option[String] = None, appTypes: Option[String] = None, contentType: Option[String] = None, source: Option[String] = None, metricTypes: Seq[String], numOfPins: Option[Int] = None, createdInLastNDays: Option[Int] = None, adAccountId: Option[String] = None): ApiRequest[TopVideoPinsAnalyticsResponse] =
    ApiRequest[TopVideoPinsAnalyticsResponse](ApiMethods.GET, baseUrl, "/user_account/analytics/top_video_pins", "application/json")
      .withQueryParam("start_date", startDate)
      .withQueryParam("end_date", endDate)
      .withQueryParam("sort_by", sortBy)
      .withQueryParam("from_claimed_content", fromClaimedContent)
      .withQueryParam("pin_format", pinFormat)
      .withQueryParam("app_types", appTypes)
      .withQueryParam("content_type", contentType)
      .withQueryParam("source", source)
      .withQueryParam("metric_types", ArrayValues(metricTypes, CSV))
      .withQueryParam("num_of_pins", numOfPins)
      .withQueryParam("created_in_last_n_days", createdInLastNDays)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[TopVideoPinsAnalyticsResponse](200)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of a user's following interests in one place.
   * 
   * Expected answers:
   *   code 200 : UserAccountFollowedInterests200Response (Success)
   *   code 400 : Error (Invalid parameters)
   *   code 401 : Error (Authorization failed)
   *   code 404 : Error (User not found)
   *   code 0 : Error (Unexpected error)
   * 
   * @param username A valid username
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def userAccountFollowedInterests(username: String, bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[UserAccountFollowedInterests200Response] =
    ApiRequest[UserAccountFollowedInterests200Response](ApiMethods.GET, baseUrl, "/users/{username}/interests/follow", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withPathParam("username", username)
      .withSuccessResponse[UserAccountFollowedInterests200Response](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
   * 
   * Expected answers:
   *   code 200 : Account (response)
   *   code 403 : Error (Not authorized to access the user account.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   */
  def userAccountGet(adAccountId: Option[String] = None): ApiRequest[Account] =
    ApiRequest[Account](ApiMethods.GET, baseUrl, "/user_account", "application/json")
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[Account](200)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of who a certain user follows.
   * 
   * Expected answers:
   *   code 200 : UserFollowingGet200Response (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
   * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
   * @param adAccountId Unique identifier of an ad account.
   */
  def userFollowingGet(bookmark: Option[String] = None, pageSize: Option[Int] = None, feedType: Option[UserFollowingFeedType] = None, explicitFollowing: Option[Boolean] = None, adAccountId: Option[String] = None): ApiRequest[UserFollowingGet200Response] =
    ApiRequest[UserFollowingGet200Response](ApiMethods.GET, baseUrl, "/user_account/following", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("feed_type", feedType)
      .withQueryParam("explicit_following", explicitFollowing)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[UserFollowingGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get user websites, claimed or not
   * 
   * Expected answers:
   *   code 200 : UserWebsitesGet200Response (Success)
   *   code 403 : Error (Not authorized to access the user website list.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def userWebsitesGet(bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[UserWebsitesGet200Response] =
    ApiRequest[UserWebsitesGet200Response](ApiMethods.GET, baseUrl, "/user_account/websites", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withSuccessResponse[UserWebsitesGet200Response](200)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      

  /**
   * Verify a website as a signed-in user.
   * 
   * Expected answers:
   *   code 200 : UserWebsiteSummary (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param userWebsiteVerifyRequest Verify a website.
   * @param adAccountId Unique identifier of an ad account.
   */
  def verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: Option[String] = None): ApiRequest[UserWebsiteSummary] =
    ApiRequest[UserWebsiteSummary](ApiMethods.POST, baseUrl, "/user_account/websites", "application/json")
      .withBody(userWebsiteVerifyRequest)
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[UserWebsiteSummary](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get verification code for user to install on the website to claim it.
   * 
   * Expected answers:
   *   code 200 : UserWebsiteVerificationCode (Success)
   *   code 403 : Error (Not authorized to access the user verification code for website claiming.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   */
  def websiteVerificationGet(adAccountId: Option[String] = None): ApiRequest[UserWebsiteVerificationCode] =
    ApiRequest[UserWebsiteVerificationCode](ApiMethods.GET, baseUrl, "/user_account/websites/verification", "application/json")
      .withQueryParam("ad_account_id", adAccountId)
      .withSuccessResponse[UserWebsiteVerificationCode](200)
      .withErrorResponse[Error](403)
      .withDefaultErrorResponse[Error]
      



}

