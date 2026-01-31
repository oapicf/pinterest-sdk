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
import org.openapitools.client.api.EventQualityScore
import org.openapitools.client.api.IngestionSourceOptions
import org.openapitools.client.api.LookbackPeriodOptions
import org.openapitools.client.api.SourcePlatformOptions

object ConversionEqsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionEqsList(host: String, lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: SourcePlatformOptions, ingestionSource: IngestionSourceOptions)(implicit lookbackPeriodQuery: QueryParam[LookbackPeriodOptions], sourcePlatformQuery: QueryParam[SourcePlatformOptions], ingestionSourceQuery: QueryParam[IngestionSourceOptions]): Task[List[EventQualityScore]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[EventQualityScore]] = jsonOf[List[EventQualityScore]]

    val path = "/ad_accounts/{ad_account_id}/conversion_eqs".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("lookbackPeriod", Some(lookback_periodQuery.toParamString(lookback_period))), ("sourcePlatform", Some(source_platformQuery.toParamString(source_platform))), ("ingestionSource", Some(ingestion_sourceQuery.toParamString(ingestion_source))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[EventQualityScore]](req)

    } yield resp
  }

}

class HttpServiceConversionEqsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: String, sourcePlatform: SourcePlatformOptions, ingestionSource: IngestionSourceOptions)(implicit lookbackPeriodQuery: QueryParam[LookbackPeriodOptions], sourcePlatformQuery: QueryParam[SourcePlatformOptions], ingestionSourceQuery: QueryParam[IngestionSourceOptions]): Task[List[EventQualityScore]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[EventQualityScore]] = jsonOf[List[EventQualityScore]]

    val path = "/ad_accounts/{ad_account_id}/conversion_eqs".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("lookbackPeriod", Some(lookback_periodQuery.toParamString(lookback_period))), ("sourcePlatform", Some(source_platformQuery.toParamString(source_platform))), ("ingestionSource", Some(ingestion_sourceQuery.toParamString(ingestion_source))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[EventQualityScore]](req)

    } yield resp
  }

}
