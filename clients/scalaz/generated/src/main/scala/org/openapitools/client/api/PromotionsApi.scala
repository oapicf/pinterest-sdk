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
import org.openapitools.client.api.PromotionCreateRequest
import org.openapitools.client.api.PromotionResponse
import org.openapitools.client.api.PromotionUpdateRequest
import org.openapitools.client.api.PromotionsList200Response
import org.openapitools.client.api.PromotionsResponse

object PromotionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def promotionsCreate(host: String, adAccountId: String, promotionCreateRequest: List[PromotionCreateRequest]): Task[PromotionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsResponse] = jsonOf[PromotionsResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionCreateRequest)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

  def promotionsDelete(host: String, adAccountId: String, promotionId: String): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString))

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

  def promotionsGet(host: String, adAccountId: String, promotionId: String): Task[PromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionResponse] = jsonOf[PromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString))

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
      resp          <- client.expect[PromotionResponse](req)

    } yield resp
  }

  def promotionsList(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsList200Response] = jsonOf[PromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[PromotionsList200Response](req)

    } yield resp
  }

  def promotionsUpdate(host: String, adAccountId: String, promotionUpdateRequest: List[PromotionUpdateRequest]): Task[PromotionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsResponse] = jsonOf[PromotionsResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionUpdateRequest)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

}

class HttpServicePromotionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def promotionsCreate(adAccountId: String, promotionCreateRequest: List[PromotionCreateRequest]): Task[PromotionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsResponse] = jsonOf[PromotionsResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionCreateRequest)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

  def promotionsDelete(adAccountId: String, promotionId: String): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString))

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

  def promotionsGet(adAccountId: String, promotionId: String): Task[PromotionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionResponse] = jsonOf[PromotionResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString))

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
      resp          <- client.expect[PromotionResponse](req)

    } yield resp
  }

  def promotionsList(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsList200Response] = jsonOf[PromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[PromotionsList200Response](req)

    } yield resp
  }

  def promotionsUpdate(adAccountId: String, promotionUpdateRequest: List[PromotionUpdateRequest]): Task[PromotionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsResponse] = jsonOf[PromotionsResponse]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionUpdateRequest)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

}
