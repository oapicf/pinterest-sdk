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
import org.openapitools.client.api.Error
import java.time.LocalDate

object UserAccountApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def userAccountAnalytics(host: String, startDate: LocalDate, endDate: LocalDate, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, metricTypes: List[String] = List.empty[String] , splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/user_account/analytics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

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

}

class HttpServiceUserAccountApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: String = BOTH, pinFormat: String = ALL, appTypes: String = ALL, metricTypes: List[String] = List.empty[String] , splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], fromClaimedContentQuery: QueryParam[String], pinFormatQuery: QueryParam[String], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/user_account/analytics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("fromClaimedContent", Some(from_claimed_contentQuery.toParamString(from_claimed_content))), ("pinFormat", Some(pin_formatQuery.toParamString(pin_format))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

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

}
