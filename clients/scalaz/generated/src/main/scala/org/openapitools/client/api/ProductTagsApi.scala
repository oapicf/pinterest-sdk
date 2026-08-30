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
import org.openapitools.client.api.ProductTagsBulkAddRequest
import org.openapitools.client.api.ProductTagsBulkDeleteRequest
import org.openapitools.client.api.ProductTagsError
import org.openapitools.client.api.ProductTagsResponse

object ProductTagsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productTagsBulkAdd(host: String, pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest): Task[ProductTagsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductTagsResponse] = jsonOf[ProductTagsResponse]

    val path = "/pins/{pin_id}/product_tags".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productTagsBulkAddRequest)
      resp          <- client.expect[ProductTagsResponse](req)

    } yield resp
  }

  def productTagsBulkDelete(host: String, pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest): Task[Unit] = {
    val path = "/pins/{pin_id}/product_tags/bulk-delete".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productTagsBulkDeleteRequest)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def productTagsList(host: String, pinId: String): Task[ProductTagsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductTagsResponse] = jsonOf[ProductTagsResponse]

    val path = "/pins/{pin_id}/product_tags".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

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
      resp          <- client.expect[ProductTagsResponse](req)

    } yield resp
  }

}

class HttpServiceProductTagsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def productTagsBulkAdd(pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest): Task[ProductTagsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductTagsResponse] = jsonOf[ProductTagsResponse]

    val path = "/pins/{pin_id}/product_tags".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productTagsBulkAddRequest)
      resp          <- client.expect[ProductTagsResponse](req)

    } yield resp
  }

  def productTagsBulkDelete(pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest): Task[Unit] = {
    val path = "/pins/{pin_id}/product_tags/bulk-delete".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(productTagsBulkDeleteRequest)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def productTagsList(pinId: String): Task[ProductTagsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProductTagsResponse] = jsonOf[ProductTagsResponse]

    val path = "/pins/{pin_id}/product_tags".replaceAll("\\{" + "pin_id" + "\\}",escape(pinId.toString))

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
      resp          <- client.expect[ProductTagsResponse](req)

    } yield resp
  }

}
