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
import org.openapitools.client.api.TargetingTemplate
import org.openapitools.client.api.TargetingTemplateCreate
import org.openapitools.client.api.TargetingTemplateList200Response
import org.openapitools.client.api.TargetingTemplateUpdateRequestReadOrUpdate

object TargetingTemplateApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def targetingTemplateCreate(host: String, adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): Task[TargetingTemplate] = {
    implicit val returnTypeDecoder: EntityDecoder[TargetingTemplate] = jsonOf[TargetingTemplate]

    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(targetingTemplateCreate)
      resp          <- client.expect[TargetingTemplate](req)

    } yield resp
  }

  def targetingTemplateList(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, includeSizing: Boolean = false, searchQuery: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], includeSizingQuery: QueryParam[Boolean], searchQueryQuery: QueryParam[String]): Task[TargetingTemplateList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TargetingTemplateList200Response] = jsonOf[TargetingTemplateList200Response]

    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("includeSizing", Some(include_sizingQuery.toParamString(include_sizing))), ("searchQuery", Some(search_queryQuery.toParamString(search_query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TargetingTemplateList200Response](req)

    } yield resp
  }

  def targetingTemplateUpdate(host: String, adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(targetingTemplateUpdateRequestReadOrUpdate)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}

class HttpServiceTargetingTemplateApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): Task[TargetingTemplate] = {
    implicit val returnTypeDecoder: EntityDecoder[TargetingTemplate] = jsonOf[TargetingTemplate]

    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(targetingTemplateCreate)
      resp          <- client.expect[TargetingTemplate](req)

    } yield resp
  }

  def targetingTemplateList(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, includeSizing: Boolean = false, searchQuery: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], includeSizingQuery: QueryParam[Boolean], searchQueryQuery: QueryParam[String]): Task[TargetingTemplateList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[TargetingTemplateList200Response] = jsonOf[TargetingTemplateList200Response]

    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("includeSizing", Some(include_sizingQuery.toParamString(include_sizing))), ("searchQuery", Some(search_queryQuery.toParamString(search_query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[TargetingTemplateList200Response](req)

    } yield resp
  }

  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/targeting_templates".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(targetingTemplateUpdateRequestReadOrUpdate)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}
