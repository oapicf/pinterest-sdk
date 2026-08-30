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
import org.openapitools.server.model.BoardsList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.FollowUser
import org.openapitools.server.model.FollowUserCreate
import org.openapitools.server.model.FollowersList200Response
import org.openapitools.server.model.LinkedBusiness
import java.time.LocalDate
import org.openapitools.server.model.QuerymetrictypesItems
import org.openapitools.server.model.QueryvideopinmetrictypesItems
import org.openapitools.server.model.TopPinsAnalyticsResponse
import org.openapitools.server.model.TopPinsSortBy
import org.openapitools.server.model.TopVideoPinsAnalyticsResponse
import org.openapitools.server.model.TopVideoPinsSortBy
import org.openapitools.server.model.UserAccountFollowedInterests200Response
import org.openapitools.server.model.UserFollowingFeedType
import org.openapitools.server.model.UserWebsite
import org.openapitools.server.model.UserWebsiteCreate
import org.openapitools.server.model.UserWebsiteVerification
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
        parameters("ad_account_id".as[String].?, "explicit_following".as[Boolean].?(false), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, explicitFollowing, bookmark, pageSize) => 
            userAccountService.boardsUserFollowsList(adAccountId = adAccountId, explicitFollowing = explicitFollowing, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("user_account" / "following" / usernamePattern) { (username) => 
      post {  
            entity(as[FollowUserCreate]){ followUserCreate =>
              userAccountService.followUserUpdate(username = username, followUserCreate = followUserCreate)
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
        parameters("start_date".as[String], "end_date".as[String], "sort_by".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "content_type".as[String].?("ALL"), "source".as[String].?("ALL"), "metric_types".as[String].?, "num_of_pins".as[Int].?(10), "created_in_last_n_days".as[Double].?, "ad_account_id".as[String].?) { (startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) => 
            userAccountService.userAccountAnalyticsTopPins(startDate = startDate, endDate = endDate, sortBy = sortBy, fromClaimedContent = fromClaimedContent, pinFormat = pinFormat, appTypes = appTypes, contentType = contentType, source = source, metricTypes = metricTypes, numOfPins = numOfPins, createdInLastNDays = createdInLastNDays, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account" / "analytics" / "top_video_pins") { 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "sort_by".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "content_type".as[String].?("ALL"), "source".as[String].?("ALL"), "metric_types".as[String].?, "num_of_pins".as[Int].?(10), "created_in_last_n_days".as[Double].?, "ad_account_id".as[String].?) { (startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId) => 
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
        parameters("ad_account_id".as[String].?, "explicit_following".as[Boolean].?(false), "feed_type".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, explicitFollowing, feedType, bookmark, pageSize) => 
            userAccountService.userFollowingGet(adAccountId = adAccountId, explicitFollowing = explicitFollowing, feedType = feedType, bookmark = bookmark, pageSize = pageSize)
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
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[UserWebsiteCreate]){ userWebsiteCreate =>
              userAccountService.verifyWebsiteUpdate(userWebsiteCreate = userWebsiteCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("user_account" / "websites" / "verification") { 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            userAccountService.websiteVerificationGet(adAccountId = adAccountId)
        }
      }
    }
}

object UserAccountApiPatterns {

    val usernamePattern: PathMatcher1[String] = PathMatcher("""(?!^\\d+$)^.+$""".r)
}

trait UserAccountApiService {

  def boardsUserFollowsList200(responseBoardsList200Response: BoardsList200Response)(implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]): Route =
    complete((200, responseBoardsList200Response))
  def boardsUserFollowsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsUserFollowsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsUserFollowsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsUserFollowsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsUserFollowsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsUserFollowsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsUserFollowsList(adAccountId: Option[String], explicitFollowing: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def followUserUpdate200(responseFollowUser: FollowUser)(implicit toEntityMarshallerFollowUser: ToEntityMarshaller[FollowUser]): Route =
    complete((200, responseFollowUser))
  def followUserUpdate201(responseFollowUser: FollowUser)(implicit toEntityMarshallerFollowUser: ToEntityMarshaller[FollowUser]): Route =
    complete((201, responseFollowUser))
  def followUserUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def followUserUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def followUserUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def followUserUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def followUserUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def followUserUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: FollowUser
   * Code: 201, Message: Resource create operation completed successfully., DataType: FollowUser
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def followUserUpdate(username: String, followUserCreate: FollowUserCreate)
      (implicit toEntityMarshallerFollowUser: ToEntityMarshaller[FollowUser], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def followersList200(responseFollowersList200Response: FollowersList200Response)(implicit toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route =
    complete((200, responseFollowersList200Response))
  def followersList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def followersList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def followersList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def followersList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def followersList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def followersListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: FollowersList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def followersList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route

  def linkedBusinessAccountsGet200(responseLinkedBusinessarray: Seq[LinkedBusiness])(implicit toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]): Route =
    complete((200, responseLinkedBusinessarray))
  def linkedBusinessAccountsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def linkedBusinessAccountsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def linkedBusinessAccountsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def linkedBusinessAccountsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def linkedBusinessAccountsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def linkedBusinessAccountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[LinkedBusiness]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def linkedBusinessAccountsGet()
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]): Route

  def unverifyWebsiteDelete200(responseUserWebsite: UserWebsite)(implicit toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite]): Route =
    complete((200, responseUserWebsite))
  def unverifyWebsiteDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def unverifyWebsiteDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def unverifyWebsiteDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def unverifyWebsiteDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def unverifyWebsiteDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def unverifyWebsiteDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def unverifyWebsiteDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UserWebsite
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def unverifyWebsiteDelete(website: String)
      (implicit toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalytics200(responseAnalyticsMetricsResponsemap: Map[String, AnalyticsMetricsResponse])(implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]): Route =
    complete((200, responseAnalyticsMetricsResponsemap))
  def userAccountAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userAccountAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userAccountAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userAccountAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Map[String, AnalyticsMetricsResponse]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userAccountAnalytics(startDate: String, endDate: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalyticsTopPins200(responseTopPinsAnalyticsResponse: TopPinsAnalyticsResponse)(implicit toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse]): Route =
    complete((200, responseTopPinsAnalyticsResponse))
  def userAccountAnalyticsTopPins400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountAnalyticsTopPins401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userAccountAnalyticsTopPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsTopPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userAccountAnalyticsTopPins429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userAccountAnalyticsTopPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TopPinsAnalyticsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userAccountAnalyticsTopPins(startDate: String, endDate: String, sortBy: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], numOfPins: Int, createdInLastNDays: Option[Double], adAccountId: Option[String])
      (implicit toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountAnalyticsTopVideoPins200(responseTopVideoPinsAnalyticsResponse: TopVideoPinsAnalyticsResponse)(implicit toEntityMarshallerTopVideoPinsAnalyticsResponse: ToEntityMarshaller[TopVideoPinsAnalyticsResponse]): Route =
    complete((200, responseTopVideoPinsAnalyticsResponse))
  def userAccountAnalyticsTopVideoPins400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountAnalyticsTopVideoPins401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userAccountAnalyticsTopVideoPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsTopVideoPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userAccountAnalyticsTopVideoPins429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userAccountAnalyticsTopVideoPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TopVideoPinsAnalyticsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userAccountAnalyticsTopVideoPins(startDate: String, endDate: String, sortBy: String, fromClaimedContent: String, pinFormat: String, appTypes: String, contentType: String, source: String, metricTypes: Option[String], numOfPins: Int, createdInLastNDays: Option[Double], adAccountId: Option[String])
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
   * Code: 200, Message: The request has succeeded., DataType: UserAccountFollowedInterests200Response
   * Code: 400, Message: The server could not understand the request due to invalid syntax., DataType: Error
   * Code: 401, Message: Access is unauthorized., DataType: Error
   * Code: 404, Message: The server cannot find the requested resource., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountFollowedInterests(username: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerUserAccountFollowedInterests200Response: ToEntityMarshaller[UserAccountFollowedInterests200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountGet200(responseAccount: Account)(implicit toEntityMarshallerAccount: ToEntityMarshaller[Account]): Route =
    complete((200, responseAccount))
  def userAccountGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userAccountGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userAccountGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userAccountGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userAccountGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Account
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userAccountGet(adAccountId: Option[String])
      (implicit toEntityMarshallerAccount: ToEntityMarshaller[Account], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userFollowingGet200(responseFollowersList200Response: FollowersList200Response)(implicit toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route =
    complete((200, responseFollowersList200Response))
  def userFollowingGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userFollowingGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userFollowingGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userFollowingGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userFollowingGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userFollowingGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: FollowersList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userFollowingGet(adAccountId: Option[String], explicitFollowing: Boolean, feedType: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]): Route

  def userWebsitesGet200(responseUserWebsitesGet200Response: UserWebsitesGet200Response)(implicit toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]): Route =
    complete((200, responseUserWebsitesGet200Response))
  def userWebsitesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def userWebsitesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def userWebsitesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userWebsitesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def userWebsitesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def userWebsitesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UserWebsitesGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def userWebsitesGet(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]): Route

  def verifyWebsiteUpdate200(responseUserWebsite: UserWebsite)(implicit toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite]): Route =
    complete((200, responseUserWebsite))
  def verifyWebsiteUpdate201(responseUserWebsite: UserWebsite)(implicit toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite]): Route =
    complete((201, responseUserWebsite))
  def verifyWebsiteUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def verifyWebsiteUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def verifyWebsiteUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def verifyWebsiteUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def verifyWebsiteUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def verifyWebsiteUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UserWebsite
   * Code: 201, Message: Resource create operation completed successfully., DataType: UserWebsite
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def verifyWebsiteUpdate(userWebsiteCreate: UserWebsiteCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def websiteVerificationGet200(responseUserWebsiteVerification: UserWebsiteVerification)(implicit toEntityMarshallerUserWebsiteVerification: ToEntityMarshaller[UserWebsiteVerification]): Route =
    complete((200, responseUserWebsiteVerification))
  def websiteVerificationGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def websiteVerificationGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def websiteVerificationGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def websiteVerificationGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def websiteVerificationGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def websiteVerificationGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UserWebsiteVerification
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def websiteVerificationGet(adAccountId: Option[String])
      (implicit toEntityMarshallerUserWebsiteVerification: ToEntityMarshaller[UserWebsiteVerification], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait UserAccountApiMarshaller {
  implicit def fromEntityUnmarshallerUserWebsiteCreate: FromEntityUnmarshaller[UserWebsiteCreate]

  implicit def fromEntityUnmarshallerFollowUserCreate: FromEntityUnmarshaller[FollowUserCreate]



  implicit def toEntityMarshallerAccount: ToEntityMarshaller[Account]

  implicit def toEntityMarshallerFollowUser: ToEntityMarshaller[FollowUser]

  implicit def toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]

  implicit def toEntityMarshallerUserWebsite: ToEntityMarshaller[UserWebsite]

  implicit def toEntityMarshallerUserAccountFollowedInterests200Response: ToEntityMarshaller[UserAccountFollowedInterests200Response]

  implicit def toEntityMarshallerUserWebsitesGet200Response: ToEntityMarshaller[UserWebsitesGet200Response]

  implicit def toEntityMarshallerFollowersList200Response: ToEntityMarshaller[FollowersList200Response]

  implicit def toEntityMarshallerLinkedBusinessarray: ToEntityMarshaller[Seq[LinkedBusiness]]

  implicit def toEntityMarshallerTopPinsAnalyticsResponse: ToEntityMarshaller[TopPinsAnalyticsResponse]

  implicit def toEntityMarshallerUserWebsiteVerification: ToEntityMarshaller[UserWebsiteVerification]

  implicit def toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]

  implicit def toEntityMarshallerTopVideoPinsAnalyticsResponse: ToEntityMarshaller[TopVideoPinsAnalyticsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

