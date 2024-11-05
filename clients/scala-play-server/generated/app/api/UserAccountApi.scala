package api

import play.api.libs.json._
import model.Account
import model.AnalyticsMetricsResponse
import model.BoardsUserFollowsList200Response
import model.Error
import model.FollowUserRequest
import model.FollowersList200Response
import model.LinkedBusiness
import java.time.LocalDate
import model.TopPinsAnalyticsResponse
import model.TopVideoPinsAnalyticsResponse
import model.UserAccountFollowedInterests200Response
import model.UserFollowingFeedType
import model.UserFollowingGet200Response
import model.UserSummary
import model.UserWebsiteSummary
import model.UserWebsiteVerificationCode
import model.UserWebsiteVerifyRequest
import model.UserWebsitesGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait UserAccountApi {
  /**
    * List following boards
    * Get a list of the boards a user follows. The request returns a board summary object array.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardsUserFollowsList(bookmark: Option[String], pageSize: Option[Int], explicitFollowing: Option[Boolean], adAccountId: Option[String]): BoardsUserFollowsList200Response

  /**
    * Follow user
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
    * @param username A valid username
    * @param followUserRequest Follow a user.
    */
  def followUserUpdate(username: String, followUserRequest: FollowUserRequest): UserSummary

  /**
    * List followers
    * Get a list of your followers.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def followersList(bookmark: Option[String], pageSize: Option[Int]): FollowersList200Response

  /**
    * List linked businesses
    * Get a list of your linked business accounts.
    */
  def linkedBusinessAccountsGet(): List[LinkedBusiness]

  /**
    * Unverify website
    * Unverifu a website verified by the signed-in user.
    * @param website Website with path or domain only
    */
  def unverifyWebsiteDelete(website: String): Unit

  /**
    * Get user account analytics
    * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
    * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    * @param fromClaimedContent Filter on Pins that match your claimed domain.
    * @param pinFormat Pin formats to get data for, default is all.
    * @param appTypes Apps or devices to get data for, default is all.
    * @param contentType Filter to paid or organic data. Default is all.
    * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    * @param metricTypes Metric types to get data for, default is all. 
    * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], splitField: Option[String], adAccountId: Option[String]): Map[String, AnalyticsMetricsResponse]

  /**
    * Get user account top pins analytics
    * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
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
    * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountAnalyticsTopPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): TopPinsAnalyticsResponse

  /**
    * Get user account top video pins analytics
    * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
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
    * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountAnalyticsTopVideoPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): TopVideoPinsAnalyticsResponse

  /**
    * List following interests
    * Get a list of a user&#39;s following interests in one place.
    * @param username A valid username
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def userAccountFollowedInterests(username: String, bookmark: Option[String], pageSize: Option[Int]): UserAccountFollowedInterests200Response

  /**
    * Get user account
    * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userAccountGet(adAccountId: Option[String]): Account

  /**
    * List following
    * Get a list of who a certain user follows.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
    * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    * @param adAccountId Unique identifier of an ad account.
    */
  def userFollowingGet(bookmark: Option[String], pageSize: Option[Int], feedType: Option[UserFollowingFeedType], explicitFollowing: Option[Boolean], adAccountId: Option[String]): UserFollowingGet200Response

  /**
    * Get user websites
    * Get user websites, claimed or not
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def userWebsitesGet(bookmark: Option[String], pageSize: Option[Int]): UserWebsitesGet200Response

  /**
    * Verify website
    * Verify a website as a signed-in user.
    * @param userWebsiteVerifyRequest Verify a website.
    * @param adAccountId Unique identifier of an ad account.
    */
  def verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: Option[String]): UserWebsiteSummary

  /**
    * Get user verification code for website claiming
    * Get verification code for user to install on the website to claim it.
    * @param adAccountId Unique identifier of an ad account.
    */
  def websiteVerificationGet(adAccountId: Option[String]): UserWebsiteVerificationCode
}
