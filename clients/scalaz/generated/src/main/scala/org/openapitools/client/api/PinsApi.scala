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

import org.openapitools.client.api.AnalyticsMetricsResponse
import org.openapitools.client.api.Error
import java.time.LocalDate
import org.openapitools.client.api.Pin

object PinsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def pinsAnalytics(host: String, pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[String] = List.empty[String] , appTypes: String = ALL, splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/pins/{pin_id}/analytics".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

    } yield resp
  }

  def pinsCreate(host: String, pin: Pin): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pin)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsDelete(host: String, pinId: String): Task[Unit] = {
    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def pinsGet(host: String, pinId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

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
      resp          <- client.expect[Pin](req)

    } yield resp
  }

}

class HttpServicePinsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[String] = List.empty[String] , appTypes: String = ALL, splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[String]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, AnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, AnalyticsMetricsResponse]] = jsonOf[Map[String, AnalyticsMetricsResponse]]

    val path = "/pins/{pin_id}/analytics".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("appTypes", Some(app_typesQuery.toParamString(app_types))), ("metricTypes", Some(metric_typesQuery.toParamString(metric_types))), ("splitField", Some(split_fieldQuery.toParamString(split_field))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Map[String, AnalyticsMetricsResponse]](req)

    } yield resp
  }

  def pinsCreate(pin: Pin): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pin)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsDelete(pinId: String): Task[Unit] = {
    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def pinsGet(pinId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

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
      resp          <- client.expect[Pin](req)

    } yield resp
  }

}
