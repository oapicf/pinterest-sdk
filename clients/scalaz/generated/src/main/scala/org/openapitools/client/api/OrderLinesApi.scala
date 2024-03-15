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
import org.openapitools.client.api.OrderLine
import org.openapitools.client.api.OrderLinesList200Response

object OrderLinesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def orderLinesGet(host: String, adAccountId: String, orderLineId: String): Task[OrderLine] = {
    implicit val returnTypeDecoder: EntityDecoder[OrderLine] = jsonOf[OrderLine]

    val path = "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "order_line_id" + "\\}",escape(orderLineId.toString))

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
      resp          <- client.expect[OrderLine](req)

    } yield resp
  }

  def orderLinesList(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[OrderLinesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[OrderLinesList200Response] = jsonOf[OrderLinesList200Response]

    val path = "/ad_accounts/{ad_account_id}/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OrderLinesList200Response](req)

    } yield resp
  }

}

class HttpServiceOrderLinesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def orderLinesGet(adAccountId: String, orderLineId: String): Task[OrderLine] = {
    implicit val returnTypeDecoder: EntityDecoder[OrderLine] = jsonOf[OrderLine]

    val path = "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "order_line_id" + "\\}",escape(orderLineId.toString))

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
      resp          <- client.expect[OrderLine](req)

    } yield resp
  }

  def orderLinesList(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[OrderLinesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[OrderLinesList200Response] = jsonOf[OrderLinesList200Response]

    val path = "/ad_accounts/{ad_account_id}/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[OrderLinesList200Response](req)

    } yield resp
  }

}
