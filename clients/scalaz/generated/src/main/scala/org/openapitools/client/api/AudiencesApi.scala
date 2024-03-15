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

import org.openapitools.client.api.Audience
import org.openapitools.client.api.AudienceCreateCustomRequest
import org.openapitools.client.api.AudienceCreateRequest
import org.openapitools.client.api.AudienceUpdateRequest
import org.openapitools.client.api.AudiencesList200Response
import org.openapitools.client.api.Error

object AudiencesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audiencesCreate(host: String, adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceCreateRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesCreateCustom(host: String, adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/custom".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceCreateCustomRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesGet(host: String, adAccountId: String, audienceId: String): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString))

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
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesList(host: String, adAccountId: String, bookmark: String, order: String, pageSize: Integer = 25, ownershipType: String = OWNED)(implicit bookmarkQuery: QueryParam[String], orderQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], ownershipTypeQuery: QueryParam[String]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("order", Some(orderQuery.toParamString(order))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("ownershipType", Some(ownership_typeQuery.toParamString(ownership_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def audiencesUpdate(host: String, adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceUpdateRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

}

class HttpServiceAudiencesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceCreateRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesCreateCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/custom".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceCreateCustomRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesGet(adAccountId: String, audienceId: String): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString))

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
      resp          <- client.expect[Audience](req)

    } yield resp
  }

  def audiencesList(adAccountId: String, bookmark: String, order: String, pageSize: Integer = 25, ownershipType: String = OWNED)(implicit bookmarkQuery: QueryParam[String], orderQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], ownershipTypeQuery: QueryParam[String]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("order", Some(orderQuery.toParamString(order))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("ownershipType", Some(ownership_typeQuery.toParamString(ownership_type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest): Task[Audience] = {
    implicit val returnTypeDecoder: EntityDecoder[Audience] = jsonOf[Audience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(audienceUpdateRequest)
      resp          <- client.expect[Audience](req)

    } yield resp
  }

}
