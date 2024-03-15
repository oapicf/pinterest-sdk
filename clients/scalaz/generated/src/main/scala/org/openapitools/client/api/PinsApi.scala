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

import org.openapitools.client.api.Error
import java.time.LocalDate
import org.openapitools.client.api.Pin
import org.openapitools.client.api.PinAnalyticsMetricsResponse
import org.openapitools.client.api.PinCreate
import org.openapitools.client.api.PinUpdate
import org.openapitools.client.api.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.client.api.PinsList200Response
import org.openapitools.client.api.PinsSaveRequest

object PinsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def pinsAnalytics(host: String, pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[PinsAnalyticsMetricTypesParameterInner] = List.empty[PinsAnalyticsMetricTypesParameterInner] , appTypes: String = ALL, splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[PinsAnalyticsMetricTypesParameterInner]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, PinAnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, PinAnalyticsMetricsResponse]] = jsonOf[Map[String, PinAnalyticsMetricsResponse]]

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
      resp          <- client.expect[Map[String, PinAnalyticsMetricsResponse]](req)

    } yield resp
  }

  def pinsCreate(host: String, pinCreate: PinCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinCreate)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsDelete(host: String, pinId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def pinsGet(host: String, pinId: String, pinMetrics: Boolean = false, adAccountId: String)(implicit pinMetricsQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsList(host: String, bookmark: String, pageSize: Integer = 25, pinFilter: String, includeProtectedPins: Boolean = false, pinType: String, creativeTypes: List[String] = List.empty[String] , adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], pinFilterQuery: QueryParam[String], includeProtectedPinsQuery: QueryParam[Boolean], pinTypeQuery: QueryParam[String], creativeTypesQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[PinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PinsList200Response] = jsonOf[PinsList200Response]

    val path = "/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("pinFilter", Some(pin_filterQuery.toParamString(pin_filter))), ("includeProtectedPins", Some(include_protected_pinsQuery.toParamString(include_protected_pins))), ("pinType", Some(pin_typeQuery.toParamString(pin_type))), ("creativeTypes", Some(creative_typesQuery.toParamString(creative_types))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PinsList200Response](req)

    } yield resp
  }

  def pinsSave(host: String, pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}/save".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinsSaveRequest)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsUpdate(host: String, pinId: String, pinUpdate: PinUpdate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinUpdate)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

}

class HttpServicePinsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def pinsAnalytics(pinId: String, startDate: LocalDate, endDate: LocalDate, metricTypes: List[PinsAnalyticsMetricTypesParameterInner] = List.empty[PinsAnalyticsMetricTypesParameterInner] , appTypes: String = ALL, splitField: String = NO_SPLIT, adAccountId: String)(implicit startDateQuery: QueryParam[LocalDate], endDateQuery: QueryParam[LocalDate], appTypesQuery: QueryParam[String], metricTypesQuery: QueryParam[List[PinsAnalyticsMetricTypesParameterInner]], splitFieldQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[Map[String, PinAnalyticsMetricsResponse]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, PinAnalyticsMetricsResponse]] = jsonOf[Map[String, PinAnalyticsMetricsResponse]]

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
      resp          <- client.expect[Map[String, PinAnalyticsMetricsResponse]](req)

    } yield resp
  }

  def pinsCreate(pinCreate: PinCreate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinCreate)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsDelete(pinId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def pinsGet(pinId: String, pinMetrics: Boolean = false, adAccountId: String)(implicit pinMetricsQuery: QueryParam[Boolean], adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsList(bookmark: String, pageSize: Integer = 25, pinFilter: String, includeProtectedPins: Boolean = false, pinType: String, creativeTypes: List[String] = List.empty[String] , adAccountId: String, pinMetrics: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], pinFilterQuery: QueryParam[String], includeProtectedPinsQuery: QueryParam[Boolean], pinTypeQuery: QueryParam[String], creativeTypesQuery: QueryParam[List[String]], adAccountIdQuery: QueryParam[String], pinMetricsQuery: QueryParam[Boolean]): Task[PinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PinsList200Response] = jsonOf[PinsList200Response]

    val path = "/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("pinFilter", Some(pin_filterQuery.toParamString(pin_filter))), ("includeProtectedPins", Some(include_protected_pinsQuery.toParamString(include_protected_pins))), ("pinType", Some(pin_typeQuery.toParamString(pin_type))), ("creativeTypes", Some(creative_typesQuery.toParamString(creative_types))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("pinMetrics", Some(pin_metricsQuery.toParamString(pin_metrics))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PinsList200Response](req)

    } yield resp
  }

  def pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}/save".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinsSaveRequest)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

  def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Pin] = {
    implicit val returnTypeDecoder: EntityDecoder[Pin] = jsonOf[Pin]

    val path = "/pins/{pin_id}".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(pinUpdate)
      resp          <- client.expect[Pin](req)

    } yield resp
  }

}
