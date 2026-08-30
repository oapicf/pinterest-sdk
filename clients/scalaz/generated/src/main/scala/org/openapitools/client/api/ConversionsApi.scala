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

import org.openapitools.client.api.AdvertiserDefinedEventsCreate200Response
import org.openapitools.client.api.AdvertiserDefinedEventsCreateRequest
import org.openapitools.client.api.AdvertiserDefinedEventsGet200Response
import org.openapitools.client.api.Error

object ConversionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advertiserDefinedEventsCreate(host: String, adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advertiserDefinedEventsCreateRequest)
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsDelete(host: String, adAccountId: String, eventNames: List[String] = List.empty[String] )(implicit eventNamesQuery: QueryParam[List[String]]): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("eventNames", Some(event_namesQuery.toParamString(event_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsGet(host: String, adAccountId: String): Task[AdvertiserDefinedEventsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsGet200Response] = jsonOf[AdvertiserDefinedEventsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdvertiserDefinedEventsGet200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsUpdate(host: String, adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advertiserDefinedEventsCreateRequest)
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

}

class HttpServiceConversionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advertiserDefinedEventsCreate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advertiserDefinedEventsCreateRequest)
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsDelete(adAccountId: String, eventNames: List[String] = List.empty[String] )(implicit eventNamesQuery: QueryParam[List[String]]): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("eventNames", Some(event_namesQuery.toParamString(event_names))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsGet(adAccountId: String): Task[AdvertiserDefinedEventsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsGet200Response] = jsonOf[AdvertiserDefinedEventsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdvertiserDefinedEventsGet200Response](req)

    } yield resp
  }

  def advertiserDefinedEventsUpdate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest): Task[AdvertiserDefinedEventsCreate200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]

    val path = "/ad_accounts/{ad_account_id}/advertiser_defined_events".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advertiserDefinedEventsCreateRequest)
      resp          <- client.expect[AdvertiserDefinedEventsCreate200Response](req)

    } yield resp
  }

}
