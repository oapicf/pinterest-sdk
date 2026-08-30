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

import org.openapitools.client.api.ConversionDeletionRequest
import org.openapitools.client.api.ConversionDeletionRequestCreate
import org.openapitools.client.api.ConversionDeletionRequestList200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.PaginationOrder

object ConversionDeletionRequestsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionDeletionRequestCreate(host: String, adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionDeletionRequestCreate)
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestDelete(host: String, requestId: String, adAccountId: String): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".replaceAll("\\{" + "request_id" + "\\}",escape(requestId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestGet(host: String, requestId: String, adAccountId: String): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".replaceAll("\\{" + "request_id" + "\\}",escape(requestId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[ConversionDeletionRequestList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequestList200Response] = jsonOf[ConversionDeletionRequestList200Response]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequestList200Response](req)

    } yield resp
  }

}

class HttpServiceConversionDeletionRequestsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionDeletionRequestCreate(adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionDeletionRequestCreate)
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestDelete(requestId: String, adAccountId: String): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".replaceAll("\\{" + "request_id" + "\\}",escape(requestId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestGet(requestId: String, adAccountId: String): Task[ConversionDeletionRequest] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequest] = jsonOf[ConversionDeletionRequest]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".replaceAll("\\{" + "request_id" + "\\}",escape(requestId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequest](req)

    } yield resp
  }

  def conversionDeletionRequestList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder]): Task[ConversionDeletionRequestList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionDeletionRequestList200Response] = jsonOf[ConversionDeletionRequestList200Response]

    val path = "/ad_accounts/{ad_account_id}/conversion_deletion_requests".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[ConversionDeletionRequestList200Response](req)

    } yield resp
  }

}
