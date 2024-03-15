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
import org.openapitools.client.api.TermsOfService

object TermsOfServiceApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def termsOfServiceGet(host: String, adAccountId: String, includeHtml: Boolean = false, tosType: String)(implicit includeHtmlQuery: QueryParam[Boolean], tosTypeQuery: QueryParam[String]): Task[TermsOfService] = {
    implicit val returnTypeDecoder: EntityDecoder[TermsOfService] = jsonOf[TermsOfService]

    val path = "/ad_accounts/{ad_account_id}/terms_of_service".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeHtml", Some(include_htmlQuery.toParamString(include_html))), ("tosType", Some(tos_typeQuery.toParamString(tos_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TermsOfService](req)

    } yield resp
  }

}

class HttpServiceTermsOfServiceApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def termsOfServiceGet(adAccountId: String, includeHtml: Boolean = false, tosType: String)(implicit includeHtmlQuery: QueryParam[Boolean], tosTypeQuery: QueryParam[String]): Task[TermsOfService] = {
    implicit val returnTypeDecoder: EntityDecoder[TermsOfService] = jsonOf[TermsOfService]

    val path = "/ad_accounts/{ad_account_id}/terms_of_service".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeHtml", Some(include_htmlQuery.toParamString(include_html))), ("tosType", Some(tos_typeQuery.toParamString(tos_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TermsOfService](req)

    } yield resp
  }

}
