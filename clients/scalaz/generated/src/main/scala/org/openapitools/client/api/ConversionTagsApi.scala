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

import org.openapitools.client.api.ConversionEventResponse
import org.openapitools.client.api.ConversionTagCreate
import org.openapitools.client.api.ConversionTagListResponse
import org.openapitools.client.api.ConversionTagResponse
import org.openapitools.client.api.Error
import org.openapitools.client.api.PageVisitConversionTagsGet200Response

object ConversionTagsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionTagsCreate(host: String, adAccountId: String, conversionTagCreate: ConversionTagCreate): Task[ConversionTagResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagResponse] = jsonOf[ConversionTagResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionTagCreate)
      resp          <- client.expect[ConversionTagResponse](req)

    } yield resp
  }

  def conversionTagsGet(host: String, adAccountId: String, conversionTagId: String): Task[ConversionTagResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagResponse] = jsonOf[ConversionTagResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "conversion_tag_id" + "\\}",escape(conversionTagId.toString))

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
      resp          <- client.expect[ConversionTagResponse](req)

    } yield resp
  }

  def conversionTagsList(host: String, adAccountId: String, filterDeleted: Boolean = false)(implicit filterDeletedQuery: QueryParam[Boolean]): Task[ConversionTagListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagListResponse] = jsonOf[ConversionTagListResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("filterDeleted", Some(filter_deletedQuery.toParamString(filter_deleted))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionTagListResponse](req)

    } yield resp
  }

  def ocpmEligibleConversionTagsGet(host: String, adAccountId: String): Task[Map[String, List[ConversionEventResponse]]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, List[ConversionEventResponse]]] = jsonOf[Map[String, List[ConversionEventResponse]]]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Map[String, List[ConversionEventResponse]]](req)

    } yield resp
  }

  def pageVisitConversionTagsGet(host: String, adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PageVisitConversionTagsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PageVisitConversionTagsGet200Response] = jsonOf[PageVisitConversionTagsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/page_visit".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[PageVisitConversionTagsGet200Response](req)

    } yield resp
  }

}

class HttpServiceConversionTagsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate): Task[ConversionTagResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagResponse] = jsonOf[ConversionTagResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(conversionTagCreate)
      resp          <- client.expect[ConversionTagResponse](req)

    } yield resp
  }

  def conversionTagsGet(adAccountId: String, conversionTagId: String): Task[ConversionTagResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagResponse] = jsonOf[ConversionTagResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "conversion_tag_id" + "\\}",escape(conversionTagId.toString))

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
      resp          <- client.expect[ConversionTagResponse](req)

    } yield resp
  }

  def conversionTagsList(adAccountId: String, filterDeleted: Boolean = false)(implicit filterDeletedQuery: QueryParam[Boolean]): Task[ConversionTagListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ConversionTagListResponse] = jsonOf[ConversionTagListResponse]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("filterDeleted", Some(filter_deletedQuery.toParamString(filter_deleted))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ConversionTagListResponse](req)

    } yield resp
  }

  def ocpmEligibleConversionTagsGet(adAccountId: String): Task[Map[String, List[ConversionEventResponse]]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, List[ConversionEventResponse]]] = jsonOf[Map[String, List[ConversionEventResponse]]]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[Map[String, List[ConversionEventResponse]]](req)

    } yield resp
  }

  def pageVisitConversionTagsGet(adAccountId: String, pageSize: Integer = 25, order: String, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PageVisitConversionTagsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PageVisitConversionTagsGet200Response] = jsonOf[PageVisitConversionTagsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/conversion_tags/page_visit".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[PageVisitConversionTagsGet200Response](req)

    } yield resp
  }

}
