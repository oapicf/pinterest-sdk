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

import org.openapitools.client.api.ConversionApiResponse
import org.openapitools.client.api.ConversionEvents
import org.openapitools.client.api.DetailedError
import org.openapitools.client.api.Error

object ConversionEventsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def eventsCreate(host: String, adAccountId: String, conversionEvents: ConversionEvents, test: Boolean)(implicit testQuery: QueryParam[Boolean]): Task[ConversionApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionApiResponse] = jsonOf[ConversionApiResponse]

    val path = "/ad_accounts/{ad_account_id}/events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("test", Some(testQuery.toParamString(test))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionEvents)
      resp          <- client.expect[ConversionApiResponse](req)

    } yield resp
  }

}

class HttpServiceConversionEventsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Boolean)(implicit testQuery: QueryParam[Boolean]): Task[ConversionApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionApiResponse] = jsonOf[ConversionApiResponse]

    val path = "/ad_accounts/{ad_account_id}/events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("test", Some(testQuery.toParamString(test))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionEvents)
      resp          <- client.expect[ConversionApiResponse](req)

    } yield resp
  }

}
