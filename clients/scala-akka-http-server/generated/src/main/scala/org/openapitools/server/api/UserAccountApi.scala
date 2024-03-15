package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Account
import org.openapitools.server.model.AnalyticsMetricsResponse
import org.openapitools.server.model.BoardsUserFollowsList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.FollowUserRequest
import org.openapitools.server.model.FollowersList200Response
import org.openapitools.server.model.LinkedBusiness
import java.time.LocalDate
import org.openapitools.server.model.TopPinsAnalyticsResponse
import org.openapitools.server.model.TopVideoPinsAnalyticsResponse
import org.openapitools.server.model.UserAccountFollowedInterests200Response
import org.openapitools.server.model.UserFollowingFeedType
import org.openapitools.server.model.UserFollowingGet200Response
import org.openapitools.server.model.UserSummary
import org.openapitools.server.model.UserWebsiteSummary
import org.openapitools.server.model.UserWebsiteVerificationCode
import org.openapitools.server.model.UserWebsiteVerifyRequest
import org.openapitools.server.model.UserWebsitesGet200Response


class UserAccountApi(
    userAccountService: UserAccountApiService,
    userAccountMarshaller: UserAccountApiMarshaller
) {

  import UserAccountApiPatterns.usernamePattern

  import userAccountMarshaller._

  lazy val route: Route =
    path("user_account" / "following" / "boards") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "explicit_following".as[Boolean].?(false), "ad_account_id".as[String].?) { (bookmark, pageSize, explicitFollowing, adAccountId) => 
            userAccountService.boardsUserFollowsList(bookmark = bookmark, pageSize = pageSize, explicitFollowing = explicitFollowing, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "following" / usernamePattern) { (username) => 
      post {  
            entity(as[FollowUserRequest]){ followUserRequest =>
              userAccountService.followUserUpdate(username = username, followUserRequest = followUserRequest)
            }
      }
    } ~
    path("user_account" / "followers") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            userAccountService.followersList(bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("user_account" / "businesses") { 
      get {  
            userAccountService.linkedBusinessAccountsGet()
      }
    } ~
    path("user_account" / "websites") { 
      delete { 
        parameters("website".as[String]) { (website) => 
            userAccountService.unverifyWebsiteDelete(website = website)
        }
      }
    } ~
    path("user_account" / "analytics") { 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "content_type".as[String].?("ALL"), "source".as[String].?("ALL"), "metric_types".as[String].?, "split_field".as[String].?("NO_SPLIT"), "ad_account_id".as[String].?) { (startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId) => 
            userAccountService.userAccountAnalytics(startDate = startDate, endDate = endDate, fromClaimedContent = fromClaimedContent, pinFormat = pinFormat, appTypes = appTypes, contentType = contentType, source = source, metricTypes = metricTypes, splitField = splitField, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "analytics" / "top_pins") { 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "sort_by".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "content_type".as[String].?("ALL"), "source".as[String].?("ALL"), "metric_types".as[String].?, "num_of_pins".as[Int].?(10), "created_in_last_n_days".as[Int].?, "ad_account_id".as[String].?) { (startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) => 
            userAccountService.userAccountAnalyticsTopPins(startDate = startDate, endDate = endDate, sortBy = sortBy, fromClaimedContent = fromClaimedContent, pinFormat = pinFormat, appTypes = appTypes, contentType = contentType, source = source, metricTypes = metricTypes, numOfPins = numOfPins, createdInLastNDays = createdInLastNDays, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "analytics" / "top_video_pins") { 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "sort_by".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "content_type".as[String].?("ALL"), "source".as[String].?("ALL"), "metric_types".as[String].?, "num_of_pins".as[Int].?(10), "created_in_last_n_days".as[Int].?, "ad_account_id".as[String].?) { (startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) => 
            userAccountService.userAccountAnalyticsTopVideoPins(startDate = startDate, endDate = endDate, sortBy = sortBy, fromClaimedContent = fromClaimedContent, pinFormat = pinFormat, appTypes = appTypes, contentType = contentType, source = source, metricTypes = metricTypes, numOfPins = numOfPins, createdInLastNDays = createdInLastNDays, adAccountId = adAccountId)
        }
      }
    } ~
    path("users" / usernamePattern / "interests" / "follow") { (username) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            userAccountService.userAccountFollowedInterests(username = username, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("user_account") { 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            userAccountService.userAccountGet(adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "following") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "feed_type".as[String].?, "explicit_following".as[Boolean].?(false), "ad_account_id".as[String].?) { (bookmark, pageSize, feedType, explicitFollowing, adAccountId) => 
            userAccountService.userFollowingGet(bookmark = bookmark, pageSize = pageSize, feedType = feedType, explicitFollowing = explicitFollowing, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "websites") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            userAccountService.userWebsitesGet(bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("user_account" / "websites") { 
      post {  
            entity(as[UserWebsiteVerifyRequest]){ userWebsiteVerifyRequest =>
              userAccountService.verifyWebsiteUpdate(userWebsiteVerifyRequest = userWebsiteVerifyRequest)
            }
      }
    } ~
    path("user_account" / "websites" / "verification") { 
      get {  
            userAccountService.websiteVerificationGet()
      }
    }
}

object UserAccountApiPatterns {

    val usernamePattern: PathMatcher1[String] = PathMatcher("(?!^\\d+$)^.+$".r)
}

trait UserAccountApiService {

  def boardsUserFollowsList200(responseBoardsUserFollowsList200Response: BoardsUserFollowsList200Response)(implicit toEntityMarshallerBoardsUserFollowsList200Response: ToEntityMarshaller[BoardsUserFollowsList200Response]): Route =
    complete((200, responseBoardsUserFollowsList200Response))
  def boardsUserFollowsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsUserFollowsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BoardsUserFollowsList200Response
   * Code: 400, Message: Invalid user id, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsUserFollowsList(bookmark: Option[String], pageSize: Int, explicitFollowing: Boolean, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardsUserFollowsList200Response: ToEntityMarshaller[BoardsUserFollowsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def followUserUpdate200(responseUserSummary: UserSummary)(implicit toEntityMarshallerUserSummary: ToEntityMarshaller[UserSummary]): Route =
    complete((200, responseUserSummary))
  def followUserUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def followUserUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UserSummary
   * Code: 404, Message: User not found, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def followUserUpdate(username: String, followUserRequest: FollowUserRequest)
      (implicit toEntityMarshallerUserSummary: ToEntityMarshaller[UserSummary], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def followersList200(responseFollowersList200Response: FollowersList200Response)(implicit toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route =
    complete((200, responseFollowersList200Response))
  def followersList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def followersListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: FollowersList200Response
   * Code: 400, Message: Invalid user id, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def followersList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route

  def linkedBusinessAccountsGet200(responseLinkedBusinessarray: Seq[LinkedBusiness])(implicit toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]): Route =
    complete((200, responseLinkedBusinessarray))
  def linkedBusinessAccountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[LinkedBusiness]
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def linkedBusinessAccountsGet()
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]): Route

  def unverifyWebsiteDelete204: Route =
    complete((204, "Successfully unverified website"))
  def unverifyWebsiteDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def unverifyWebsiteDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Successfully unverified website
   * Code: 404, Message: Website not in user list., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def unverifyWebsiteDelete(website: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalytics200(responseAnalyticsMetricsResponsemap: Map[String, AnalyticsMetricsResponse])(implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]): Route =
    complete((200, responseAnalyticsMetricsResponsemap))
  def userAccountAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Map[String, AnalyticsMetricsResponse]
   * Code: 400, Message: Invalid user accounts analytics parameters., DataType: Error
   * Code: 403, Message: Not authorized to access the user account analytics., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountAnalytics(startDate: String, endDate: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalyticsTopPins200(responseTopPinsAnalyticsResponse: TopPinsAnalyticsResponse)(implicit toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse]): Route =
    complete((200, responseTopPinsAnalyticsResponse))
  def userAccountAnalyticsTopPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsTopPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TopPinsAnalyticsResponse
   * Code: 403, Message: Not authorized to access the user account analytics., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountAnalyticsTopPins(startDate: String, endDate: String, sortBy: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], numOfPins: Int, createdInLastNDays: Option[Int], adAccountId: Option[String])
      (implicit toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalyticsTopVideoPins200(responseTopVideoPinsAnalyticsResponse: TopVideoPinsAnalyticsResponse)(implicit toEntityMarshallerTopVideoPinsAnalyticsResponse: ToEntityMarshaller[TopVideoPinsAnalyticsResponse]): Route =
    complete((200, responseTopVideoPinsAnalyticsResponse))
  def userAccountAnalyticsTopVideoPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsTopVideoPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TopVideoPinsAnalyticsResponse
   * Code: 403, Message: Not authorized to access the user account analytics., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountAnalyticsTopVideoPins(startDate: String, endDate: String, sortBy: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], numOfPins: Int, createdInLastNDays: Option[Int], adAccountId: Option[String])
      (implicit toEntityMarshallerTopVideoPinsAnalyticsResponse: ToEntityMarshaller[TopVideoPinsAnalyticsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountFollowedInterests200(responseUserAccountFollowedInterests200Response: UserAccountFollowedInterests200Response)(implicit toEntityMarshallerUserAccountFollowedInterests200Response: ToEntityMarshaller[UserAccountFollowedInterests200Response]): Route =
    complete((200, responseUserAccountFollowedInterests200Response))
  def userAccountFollowedInterests400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountFollowedInterests401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userAccountFollowedInterests404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userAccountFollowedInterestsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UserAccountFollowedInterests200Response
   * Code: 400, Message: Invalid parameters, DataType: Error
   * Code: 401, Message: Authorization failed, DataType: Error
   * Code: 404, Message: User not found, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountFollowedInterests(username: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerUserAccountFollowedInterests200Response: ToEntityMarshaller[UserAccountFollowedInterests200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountGet200(responseAccount: Account)(implicit toEntityMarshallerAccount: ToEntityMarshaller[Account]): Route =
    complete((200, responseAccount))
  def userAccountGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Account
   * Code: 403, Message: Not authorized to access the user account., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountGet(adAccountId: Option[String])
      (implicit toEntityMarshallerAccount: ToEntityMarshaller[Account], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userFollowingGet200(responseUserFollowingGet200Response: UserFollowingGet200Response)(implicit toEntityMarshallerUserFollowingGet200Response: ToEntityMarshaller[UserFollowingGet200Response]): Route =
    complete((200, responseUserFollowingGet200Response))
  def userFollowingGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: UserFollowingGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userFollowingGet(bookmark: Option[String], pageSize: Int, feedType: Option[String], explicitFollowing: Boolean, adAccountId: Option[String])
      (implicit toEntityMarshallerUserFollowingGet200Response: ToEntityMarshaller[UserFollowingGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userWebsitesGet200(responseUserWebsitesGet200Response: UserWebsitesGet200Response)(implicit toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]): Route =
    complete((200, responseUserWebsitesGet200Response))
  def userWebsitesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userWebsitesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UserWebsitesGet200Response
   * Code: 403, Message: Not authorized to access the user website list., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userWebsitesGet(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]): Route

  def verifyWebsiteUpdate200(responseUserWebsiteSummary: UserWebsiteSummary)(implicit toEntityMarshallerUserWebsiteSummary: ToEntityMarshaller[UserWebsiteSummary]): Route =
    complete((200, responseUserWebsiteSummary))
  def verifyWebsiteUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UserWebsiteSummary
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerUserWebsiteSummary: ToEntityMarshaller[UserWebsiteSummary]): Route

  def websiteVerificationGet200(responseUserWebsiteVerificationCode: UserWebsiteVerificationCode)(implicit toEntityMarshallerUserWebsiteVerificationCode: ToEntityMarshaller[UserWebsiteVerificationCode]): Route =
    complete((200, responseUserWebsiteVerificationCode))
  def websiteVerificationGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def websiteVerificationGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UserWebsiteVerificationCode
   * Code: 403, Message: Not authorized to access the user verification code for website claiming., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def websiteVerificationGet()
      (implicit toEntityMarshallerUserWebsiteVerificationCode: ToEntityMarshaller[UserWebsiteVerificationCode], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait UserAccountApiMarshaller {
  implicit def fromEntityUnmarshallerUserWebsiteVerifyRequest: FromEntityUnmarshaller[UserWebsiteVerifyRequest]

  implicit def fromEntityUnmarshallerFollowUserRequest: FromEntityUnmarshaller[FollowUserRequest]



  implicit def toEntityMarshallerAccount: ToEntityMarshaller[Account]

  implicit def toEntityMarshallerUserSummary: ToEntityMarshaller[UserSummary]

  implicit def toEntityMarshallerUserFollowingGet200Response: ToEntityMarshaller[UserFollowingGet200Response]

  implicit def toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]

  implicit def toEntityMarshallerUserAccountFollowedInterests200Response: ToEntityMarshaller[UserAccountFollowedInterests200Response]

  implicit def toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]

  implicit def toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]

  implicit def toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]

  implicit def toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse]

  implicit def toEntityMarshallerUserWebsiteVerificationCode: ToEntityMarshaller[UserWebsiteVerificationCode]

  implicit def toEntityMarshallerBoardsUserFollowsList200Response: ToEntityMarshaller[BoardsUserFollowsList200Response]

  implicit def toEntityMarshallerTopVideoPinsAnalyticsResponse: ToEntityMarshaller[TopVideoPinsAnalyticsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerUserWebsiteSummary: ToEntityMarshaller[UserWebsiteSummary]

}

