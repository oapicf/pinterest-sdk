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

import org.openapitools.client.api.DetailedError
import org.openapitools.client.api.Error
import org.openapitools.client.api.IntegrationLogsRequest
import org.openapitools.client.api.IntegrationLogsSuccessResponse
import org.openapitools.client.api.IntegrationMetadata
import org.openapitools.client.api.IntegrationRecord
import org.openapitools.client.api.IntegrationRequest
import org.openapitools.client.api.IntegrationRequestPatch
import org.openapitools.client.api.IntegrationsGetList200Response

object IntegrationsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def integrationsCommerceDel(host: String, externalBusinessId: String): Task[Unit] = {
    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

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

  def integrationsCommerceGet(host: String, externalBusinessId: String): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

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
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsCommercePatch(host: String, externalBusinessId: String, integrationRequestPatch: IntegrationRequestPatch): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationRequestPatch)
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsCommercePost(host: String, integrationRequest: IntegrationRequest): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationRequest)
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsGetById(host: String, id: String): Task[IntegrationRecord] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationRecord] = jsonOf[IntegrationRecord]

    val path = "/integrations/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[IntegrationRecord](req)

    } yield resp
  }

  def integrationsGetList(host: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[IntegrationsGetList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationsGetList200Response] = jsonOf[IntegrationsGetList200Response]

    val path = "/integrations"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[IntegrationsGetList200Response](req)

    } yield resp
  }

  def integrationsLogsPost(host: String, integrationLogsRequest: IntegrationLogsRequest): Task[IntegrationLogsSuccessResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationLogsSuccessResponse] = jsonOf[IntegrationLogsSuccessResponse]

    val path = "/integrations/logs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationLogsRequest)
      resp          <- client.expect[IntegrationLogsSuccessResponse](req)

    } yield resp
  }

}

class HttpServiceIntegrationsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def integrationsCommerceDel(externalBusinessId: String): Task[Unit] = {
    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

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

  def integrationsCommerceGet(externalBusinessId: String): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

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
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsCommercePatch(externalBusinessId: String, integrationRequestPatch: IntegrationRequestPatch): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce/{external_business_id}".replaceAll("\\{" + "external_business_id" + "\\}",escape(externalBusinessId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationRequestPatch)
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsCommercePost(integrationRequest: IntegrationRequest): Task[IntegrationMetadata] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]

    val path = "/integrations/commerce"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationRequest)
      resp          <- client.expect[IntegrationMetadata](req)

    } yield resp
  }

  def integrationsGetById(id: String): Task[IntegrationRecord] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationRecord] = jsonOf[IntegrationRecord]

    val path = "/integrations/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

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
      resp          <- client.expect[IntegrationRecord](req)

    } yield resp
  }

  def integrationsGetList(bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[IntegrationsGetList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationsGetList200Response] = jsonOf[IntegrationsGetList200Response]

    val path = "/integrations"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[IntegrationsGetList200Response](req)

    } yield resp
  }

  def integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest): Task[IntegrationLogsSuccessResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[IntegrationLogsSuccessResponse] = jsonOf[IntegrationLogsSuccessResponse]

    val path = "/integrations/logs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(integrationLogsRequest)
      resp          <- client.expect[IntegrationLogsSuccessResponse](req)

    } yield resp
  }

}
