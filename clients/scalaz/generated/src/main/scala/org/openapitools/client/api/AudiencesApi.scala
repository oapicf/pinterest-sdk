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

import org.openapitools.client.api.AdAccountsAudience
import org.openapitools.client.api.AdAccountsAudienceCreate
import org.openapitools.client.api.AdAccountsAudienceUpdate
import org.openapitools.client.api.AudienceOwnershipType
import org.openapitools.client.api.AudiencesList200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.PaginationOrder

object AudiencesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audiencesCreate(host: String, adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountsAudienceCreate)
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

  def audiencesGet(host: String, audienceId: String, adAccountId: String): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

  def audiencesList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, ownershipType: AudienceOwnershipType, excludeNca: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], ownershipTypeQuery: QueryParam[AudienceOwnershipType], excludeNcaQuery: QueryParam[Boolean]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("ownershipType", Some(ownership_typeQuery.toParamString(ownership_type))), ("excludeNca", Some(exclude_ncaQuery.toParamString(exclude_nca))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def audiencesUpdate(host: String, audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountsAudienceUpdate)
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

}

class HttpServiceAudiencesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def audiencesCreate(adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountsAudienceCreate)
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

  def audiencesGet(audienceId: String, adAccountId: String): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

  def audiencesList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, ownershipType: AudienceOwnershipType, excludeNca: Boolean = false)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], ownershipTypeQuery: QueryParam[AudienceOwnershipType], excludeNcaQuery: QueryParam[Boolean]): Task[AudiencesList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]

    val path = "/ad_accounts/{ad_account_id}/audiences".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("ownershipType", Some(ownership_typeQuery.toParamString(ownership_type))), ("excludeNca", Some(exclude_ncaQuery.toParamString(exclude_nca))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AudiencesList200Response](req)

    } yield resp
  }

  def audiencesUpdate(audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate): Task[AdAccountsAudience] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsAudience] = jsonOf[AdAccountsAudience]

    val path = "/ad_accounts/{ad_account_id}/audiences/{audience_id}".replaceAll("\\{" + "audience_id" + "\\}",escape(audienceId.toString)).replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountsAudienceUpdate)
      resp          <- client.expect[AdAccountsAudience](req)

    } yield resp
  }

}
