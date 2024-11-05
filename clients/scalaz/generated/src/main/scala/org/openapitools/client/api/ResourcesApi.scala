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

import org.openapitools.client.api.AdAccountsCountryResponse
import org.openapitools.client.api.BookClosedResponse
import org.openapitools.client.api.DeliveryMetricsResponse
import org.openapitools.client.api.Error
import org.openapitools.client.api.SingleInterestTargetingOptionResponse

object ResourcesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountCountriesGet(host: String): Task[AdAccountsCountryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsCountryResponse] = jsonOf[AdAccountsCountryResponse]

    val path = "/resources/ad_account_countries"

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
      resp          <- client.expect[AdAccountsCountryResponse](req)

    } yield resp
  }

  def deliveryMetricsGet(host: String, reportType: String)(implicit reportTypeQuery: QueryParam[String]): Task[DeliveryMetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeliveryMetricsResponse] = jsonOf[DeliveryMetricsResponse]

    val path = "/resources/delivery_metrics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("reportType", Some(report_typeQuery.toParamString(report_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeliveryMetricsResponse](req)

    } yield resp
  }

  def interestTargetingOptionsGet(host: String, interestId: String): Task[SingleInterestTargetingOptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SingleInterestTargetingOptionResponse] = jsonOf[SingleInterestTargetingOptionResponse]

    val path = "/resources/targeting/interests/{interest_id}".replaceAll("\\{" + "interest_id" + "\\}",escape(interestId.toString))

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
      resp          <- client.expect[SingleInterestTargetingOptionResponse](req)

    } yield resp
  }

  def leadFormQuestionsGet(host: String): Task[Unit] = {
    val path = "/resources/lead_form_questions"

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metricsReadyStateGet(host: String, date: String)(implicit dateQuery: QueryParam[String]): Task[BookClosedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BookClosedResponse] = jsonOf[BookClosedResponse]

    val path = "/resources/metrics_ready_state"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BookClosedResponse](req)

    } yield resp
  }

  def targetingOptionsGet(host: String, targetingType: String, clientId: String, oauthSignature: String, timestamp: String, adAccountId: String)(implicit clientIdQuery: QueryParam[String], oauthSignatureQuery: QueryParam[String], timestampQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/resources/targeting/{targeting_type}".replaceAll("\\{" + "targeting_type" + "\\}",escape(targetingType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientId", Some(client_idQuery.toParamString(client_id))), ("oauthSignature", Some(oauth_signatureQuery.toParamString(oauth_signature))), ("timestamp", Some(timestampQuery.toParamString(timestamp))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }

}

class HttpServiceResourcesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountCountriesGet(): Task[AdAccountsCountryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsCountryResponse] = jsonOf[AdAccountsCountryResponse]

    val path = "/resources/ad_account_countries"

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
      resp          <- client.expect[AdAccountsCountryResponse](req)

    } yield resp
  }

  def deliveryMetricsGet(reportType: String)(implicit reportTypeQuery: QueryParam[String]): Task[DeliveryMetricsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeliveryMetricsResponse] = jsonOf[DeliveryMetricsResponse]

    val path = "/resources/delivery_metrics"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("reportType", Some(report_typeQuery.toParamString(report_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeliveryMetricsResponse](req)

    } yield resp
  }

  def interestTargetingOptionsGet(interestId: String): Task[SingleInterestTargetingOptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SingleInterestTargetingOptionResponse] = jsonOf[SingleInterestTargetingOptionResponse]

    val path = "/resources/targeting/interests/{interest_id}".replaceAll("\\{" + "interest_id" + "\\}",escape(interestId.toString))

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
      resp          <- client.expect[SingleInterestTargetingOptionResponse](req)

    } yield resp
  }

  def leadFormQuestionsGet(): Task[Unit] = {
    val path = "/resources/lead_form_questions"

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metricsReadyStateGet(date: String)(implicit dateQuery: QueryParam[String]): Task[BookClosedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BookClosedResponse] = jsonOf[BookClosedResponse]

    val path = "/resources/metrics_ready_state"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BookClosedResponse](req)

    } yield resp
  }

  def targetingOptionsGet(targetingType: String, clientId: String, oauthSignature: String, timestamp: String, adAccountId: String)(implicit clientIdQuery: QueryParam[String], oauthSignatureQuery: QueryParam[String], timestampQuery: QueryParam[String], adAccountIdQuery: QueryParam[String]): Task[List[Any]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Any]] = jsonOf[List[Any]]

    val path = "/resources/targeting/{targeting_type}".replaceAll("\\{" + "targeting_type" + "\\}",escape(targetingType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("clientId", Some(client_idQuery.toParamString(client_id))), ("oauthSignature", Some(oauth_signatureQuery.toParamString(oauth_signature))), ("timestamp", Some(timestampQuery.toParamString(timestamp))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[Any]](req)

    } yield resp
  }

}
