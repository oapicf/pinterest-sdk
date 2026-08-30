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
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.Promotion
import org.openapitools.client.api.PromotionBatchUpdate
import org.openapitools.client.api.PromotionCreate
import org.openapitools.client.api.PromotionsList200Response
import org.openapitools.client.api.PromotionsResponse

object PromotionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def promotionsCreate(host: String, adAccountId: String, promotionCreate: List[PromotionCreate]): Task[PromotionsResponse] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionCreate)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

  def promotionsDelete(host: String, promotionId: String, adAccountId: String): Task[Promotion] = {
    implicit val returnTypeDecoder: EntityDecoder[Promotion] = jsonOf[Promotion]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Promotion](req)

    } yield resp
  }

  def promotionsGet(host: String, promotionId: String, adAccountId: String): Task[Promotion] = {
    implicit val returnTypeDecoder: EntityDecoder[Promotion] = jsonOf[Promotion]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Promotion](req)

    } yield resp
  }

  def promotionsList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[PromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsList200Response] = jsonOf[PromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PromotionsList200Response](req)

    } yield resp
  }

  def promotionsUpdate(host: String, adAccountId: String, promotionBatchUpdate: List[PromotionBatchUpdate]): Task[PromotionsResponse] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionBatchUpdate)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

}

class HttpServicePromotionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def promotionsCreate(adAccountId: String, promotionCreate: List[PromotionCreate]): Task[PromotionsResponse] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionCreate)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

  def promotionsDelete(promotionId: String, adAccountId: String): Task[Promotion] = {
    implicit val returnTypeDecoder: EntityDecoder[Promotion] = jsonOf[Promotion]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Promotion](req)

    } yield resp
  }

  def promotionsGet(promotionId: String, adAccountId: String): Task[Promotion] = {
    implicit val returnTypeDecoder: EntityDecoder[Promotion] = jsonOf[Promotion]

    val path = "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".replaceAll("\\{" + "promotion_id" + "\\}",escape(promotionId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Promotion](req)

    } yield resp
  }

  def promotionsList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[PromotionsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PromotionsList200Response] = jsonOf[PromotionsList200Response]

    val path = "/ad_accounts/{ad_account_id}/promotions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PromotionsList200Response](req)

    } yield resp
  }

  def promotionsUpdate(adAccountId: String, promotionBatchUpdate: List[PromotionBatchUpdate]): Task[PromotionsResponse] = {
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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(promotionBatchUpdate)
      resp          <- client.expect[PromotionsResponse](req)

    } yield resp
  }

}
