package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.Account
import org.openapitools.client.api.AnalyticsMetricsResponse
import org.openapitools.client.api.BoardsUserFollowsList200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.FollowUserRequest
import org.openapitools.client.api.FollowersList200Response
import org.openapitools.client.api.LinkedBusiness
import java.time.LocalDate
import org.openapitools.client.api.TopPinsAnalyticsResponse
import org.openapitools.client.api.TopVideoPinsAnalyticsResponse
import org.openapitools.client.api.UserAccountFollowedInterests200Response
import org.openapitools.client.api.UserFollowingFeedType
import org.openapitools.client.api.UserFollowingGet200Response
import org.openapitools.client.api.UserSummary
import org.openapitools.client.api.UserWebsiteSummary
import org.openapitools.client.api.UserWebsiteVerificationCode
import org.openapitools.client.api.UserWebsiteVerifyRequest
import org.openapitools.client.api.UserWebsitesGet200Response

object UserAccountApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def boardsUserFollowsList(host: String, bookmark: String, pageSize: Integer = 25, explicitFollowing: Boolean = false, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], explicitFollowingQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[BoardsUserFollowsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardsUserFollowsList200Response] = jsonOf[BoardsUserFollowsList200Response]

    val path = "/user_account/following/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("explicitFollowing", Some(explicit_followingQuery.toParamString(explicit_following))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BoardsUserFollowsList200Response](req)

    } yield resp
  }

  def followUserUpdate(host: String, username: String, followUserRequest: FollowUserRequest): Task[UserSummary] = {
    implicit val returnTypeDecoder: EntityDecoder[UserSummary] = jsonOf[UserSummary]

    val path = "/user_account/following/{username}".replaceAll("\\{" + "username" + "\\}",escape(username.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(followUserRequest)
      resp          <- client.expect[UserSummary](req)

    } yield resp
  }

  def followersList(host: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[FollowersList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FollowersList200Response] = jsonOf[FollowersList200Response]

    val path = "/user_account/followers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FollowersList200Response](req)

    } yield resp
  }

  def linkedBusinessAccountsGet(host: String): Task[List[LinkedBusiness]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[LinkedBusiness]] = jsonOf[List[LinkedBusiness]]

    val path = "/user_account/businesses"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[LinkedBusiness]](req)

    } yield resp
  }

  def unverifyWebsiteDelete(host: String, website: String)(implicit websiteQuery: QueryParam[String]): Task[Unit] = {
    val path = "/user_account/websites"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("website", Some(websiteQuery.toParamString(website))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def userAccountAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/user_account/analytics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

    } yield resp
  }

  def userAccountAnalyticsTopPins(host: String, startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , numOfPins: Integer = 10, createdInLastNDays: Integer, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], sortByQuery: QueryParam[String], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], numOfPinsQuery: QueryParam[Integer], createdInLastNDaysQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[TopPinsAnalyticsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TopPinsAnalyticsResponse] = jsonOf[TopPinsAnalyticsResponse]

    val path = "/user_account/analytics/top_pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("numOfPins", Some(num_of_pinsQuery.toParamString(num_of_pins))), ("createdInLastNDays", Some(created_in_last_n_daysQuery.toParamString(created_in_last_n_days))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TopPinsAnalyticsResponse](req)

    } yield resp
  }

  def userAccountAnalyticsTopVideoPins(host: String, startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , numOfPins: Integer = 10, createdInLastNDays: Integer, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], sortByQuery: QueryParam[String], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], numOfPinsQuery: QueryParam[Integer], createdInLastNDaysQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[TopVideoPinsAnalyticsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TopVideoPinsAnalyticsResponse] = jsonOf[TopVideoPinsAnalyticsResponse]

    val path = "/user_account/analytics/top_video_pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("numOfPins", Some(num_of_pinsQuery.toParamString(num_of_pins))), ("createdInLastNDays", Some(created_in_last_n_daysQuery.toParamString(created_in_last_n_days))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TopVideoPinsAnalyticsResponse](req)

    } yield resp
  }

  def userAccountFollowedInterests(host: String, username: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[UserAccountFollowedInterests200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserAccountFollowedInterests200Response] = jsonOf[UserAccountFollowedInterests200Response]

    val path = "/users/{username}/interests/follow".replaceAll("\\{" + "username" + "\\}",escape(username.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserAccountFollowedInterests200Response](req)

    } yield resp
  }

  def userAccountGet(host: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Account] = {
    implicit val returnTypeDecoder: EntityDecoder[Account] = jsonOf[Account]

    val path = "/user_account"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Account](req)

    } yield resp
  }

  def userFollowingGet(host: String, bookmark: String, pageSize: Integer = 25, feedType: UserFollowingFeedType, explicitFollowing: Boolean = false, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], feedTypeQuery: QueryParam[UserFollowingFeedType], explicitFollowingQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[UserFollowingGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserFollowingGet200Response] = jsonOf[UserFollowingGet200Response]

    val path = "/user_account/following"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("feedType", Some(feed_typeQuery.toParamString(feed_type))), ("explicitFollowing", Some(explicit_followingQuery.toParamString(explicit_following))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserFollowingGet200Response](req)

    } yield resp
  }

  def userWebsitesGet(host: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[UserWebsitesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsitesGet200Response] = jsonOf[UserWebsitesGet200Response]

    val path = "/user_account/websites"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserWebsitesGet200Response](req)

    } yield resp
  }

  def verifyWebsiteUpdate(host: String, userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[UserWebsiteSummary] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsiteSummary] = jsonOf[UserWebsiteSummary]

    val path = "/user_account/websites"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(userWebsiteVerifyRequest)
      resp          <- client.expect[UserWebsiteSummary](req)

    } yield resp
  }

  def websiteVerificationGet(host: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[UserWebsiteVerificationCode] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsiteVerificationCode] = jsonOf[UserWebsiteVerificationCode]

    val path = "/user_account/websites/verification"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserWebsiteVerificationCode](req)

    } yield resp
  }

}

class HttpServiceUserAccountApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def boardsUserFollowsList(bookmark: String, pageSize: Integer = 25, explicitFollowing: Boolean = false, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], explicitFollowingQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[BoardsUserFollowsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BoardsUserFollowsList200Response] = jsonOf[BoardsUserFollowsList200Response]

    val path = "/user_account/following/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("explicitFollowing", Some(explicit_followingQuery.toParamString(explicit_following))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BoardsUserFollowsList200Response](req)

    } yield resp
  }

  def followUserUpdate(username: String, followUserRequest: FollowUserRequest): Task[UserSummary] = {
    implicit val returnTypeDecoder: EntityDecoder[UserSummary] = jsonOf[UserSummary]

    val path = "/user_account/following/{username}".replaceAll("\\{" + "username" + "\\}",escape(username.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(followUserRequest)
      resp          <- client.expect[UserSummary](req)

    } yield resp
  }

  def followersList(bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[FollowersList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[FollowersList200Response] = jsonOf[FollowersList200Response]

    val path = "/user_account/followers"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FollowersList200Response](req)

    } yield resp
  }

  def linkedBusinessAccountsGet(): Task[List[LinkedBusiness]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[LinkedBusiness]] = jsonOf[List[LinkedBusiness]]

    val path = "/user_account/businesses"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[LinkedBusiness]](req)

    } yield resp
  }

  def unverifyWebsiteDelete(website: String)(implicit websiteQuery: QueryParam[String]): Task[Unit] = {
    val path = "/user_account/websites"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("website", Some(websiteQuery.toParamString(website))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/user_account/analytics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

    } yield resp
  }

  def userAccountAnalyticsTopPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , numOfPins: Integer = 10, createdInLastNDays: Integer, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], sortByQuery: QueryParam[String], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], numOfPinsQuery: QueryParam[Integer], createdInLastNDaysQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[TopPinsAnalyticsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TopPinsAnalyticsResponse] = jsonOf[TopPinsAnalyticsResponse]

    val path = "/user_account/analytics/top_pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("numOfPins", Some(num_of_pinsQuery.toParamString(num_of_pins))), ("createdInLastNDays", Some(created_in_last_n_daysQuery.toParamString(created_in_last_n_days))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TopPinsAnalyticsResponse](req)

    } yield resp
  }

  def userAccountAnalyticsTopVideoPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, `contentType`: String = ALL, source: String = ALL, metricTypes: List[String] = List.empty[String] , numOfPins: Integer = 10, createdInLastNDays: Integer, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], sortByQuery: QueryParam[String], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], `contentType`Query: QueryParam[String], sourceQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], numOfPinsQuery: QueryParam[Integer], createdInLastNDaysQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[TopVideoPinsAnalyticsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[TopVideoPinsAnalyticsResponse] = jsonOf[TopVideoPinsAnalyticsResponse]

    val path = "/user_account/analytics/top_video_pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("sortBy", Some(sort_byQuery.toParamString(sort_by))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("`contentType`", Some(content_typeQuery.toParamString(content_type))), ("source", Some(sourceQuery.toParamString(source))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("numOfPins", Some(num_of_pinsQuery.toParamString(num_of_pins))), ("createdInLastNDays", Some(created_in_last_n_daysQuery.toParamString(created_in_last_n_days))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TopVideoPinsAnalyticsResponse](req)

    } yield resp
  }

  def userAccountFollowedInterests(username: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[UserAccountFollowedInterests200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserAccountFollowedInterests200Response] = jsonOf[UserAccountFollowedInterests200Response]

    val path = "/users/{username}/interests/follow".replaceAll("\\{" + "username" + "\\}",escape(username.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserAccountFollowedInterests200Response](req)

    } yield resp
  }

  def userAccountGet(adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Account] = {
    implicit val returnTypeDecoder: EntityDecoder[Account] = jsonOf[Account]

    val path = "/user_account"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Account](req)

    } yield resp
  }

  def userFollowingGet(bookmark: String, pageSize: Integer = 25, feedType: UserFollowingFeedType, explicitFollowing: Boolean = false, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], feedTypeQuery: QueryParam[UserFollowingFeedType], explicitFollowingQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[UserFollowingGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserFollowingGet200Response] = jsonOf[UserFollowingGet200Response]

    val path = "/user_account/following"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("feedType", Some(feed_typeQuery.toParamString(feed_type))), ("explicitFollowing", Some(explicit_followingQuery.toParamString(explicit_following))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserFollowingGet200Response](req)

    } yield resp
  }

  def userWebsitesGet(bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[UserWebsitesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsitesGet200Response] = jsonOf[UserWebsitesGet200Response]

    val path = "/user_account/websites"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserWebsitesGet200Response](req)

    } yield resp
  }

  def verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[UserWebsiteSummary] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsiteSummary] = jsonOf[UserWebsiteSummary]

    val path = "/user_account/websites"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(userWebsiteVerifyRequest)
      resp          <- client.expect[UserWebsiteSummary](req)

    } yield resp
  }

  def websiteVerificationGet(adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[UserWebsiteVerificationCode] = {
    implicit val returnTypeDecoder: EntityDecoder[UserWebsiteVerificationCode] = jsonOf[UserWebsiteVerificationCode]

    val path = "/user_account/websites/verification"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserWebsiteVerificationCode](req)

    } yield resp
  }

}
