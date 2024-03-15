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

import org.openapitools.client.api.AudienceDefinitionResponse
import org.openapitools.client.api.AudienceInsightType
import org.openapitools.client.api.AudienceInsightsResponse
import org.openapitools.client.api.Error

object AudienceInsightsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audienceInsightsGet(host: String, adAccountId: String, audienceInsightType: AudienceInsightType)(implicit audienceInsightTypeQuery: QueryParam[AudienceInsightType]): Task[AudienceInsightsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AudienceInsightsResponse] = jsonOf[AudienceInsightsResponse]

    val path = "/ad_accounts/{ad_account_id}/audience_insights".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceInsightType", Some(audience_insight_typeQuery.toParamString(audience_insight_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudienceInsightsResponse](req)

    } yield resp
  }

  def audienceInsightsScopeAndTypeGet(host: String, adAccountId: String): Task[AudienceDefinitionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AudienceDefinitionResponse] = jsonOf[AudienceDefinitionResponse]

    val path = "/ad_accounts/{ad_account_id}/insights/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AudienceDefinitionResponse](req)

    } yield resp
  }

}

class HttpServiceAudienceInsightsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audienceInsightsGet(adAccountId: String, audienceInsightType: AudienceInsightType)(implicit audienceInsightTypeQuery: QueryParam[AudienceInsightType]): Task[AudienceInsightsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AudienceInsightsResponse] = jsonOf[AudienceInsightsResponse]

    val path = "/ad_accounts/{ad_account_id}/audience_insights".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("audienceInsightType", Some(audience_insight_typeQuery.toParamString(audience_insight_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudienceInsightsResponse](req)

    } yield resp
  }

  def audienceInsightsScopeAndTypeGet(adAccountId: String): Task[AudienceDefinitionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AudienceDefinitionResponse] = jsonOf[AudienceDefinitionResponse]

    val path = "/ad_accounts/{ad_account_id}/insights/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AudienceDefinitionResponse](req)

    } yield resp
  }

}
