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
import org.openapitools.client.api.PinsList200Response
import org.openapitools.client.api.SearchPartnerPins200Response
import org.openapitools.client.api.SearchUserBoardsGet200Response

object SearchApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def searchPartnerPins(host: String, term: String, countryCode: String, bookmark: String, locale: String, limit: Integer = 10)(implicit termQuery: QueryParam[String], countryCodeQuery: QueryParam[String], bookmarkQuery: QueryParam[String], localeQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[SearchPartnerPins200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchPartnerPins200Response] = jsonOf[SearchPartnerPins200Response]

    val path = "/search/partner/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("term", Some(termQuery.toParamString(term))), ("countryCode", Some(country_codeQuery.toParamString(country_code))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("locale", Some(localeQuery.toParamString(locale))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchPartnerPins200Response](req)

    } yield resp
  }

  def searchUserBoardsGet(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, query: String)(implicit adAccountIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], queryQuery: QueryParam[String]): Task[SearchUserBoardsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchUserBoardsGet200Response] = jsonOf[SearchUserBoardsGet200Response]

    val path = "/search/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("query", Some(queryQuery.toParamString(query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchUserBoardsGet200Response](req)

    } yield resp
  }

  def searchUserPinsList(host: String, query: String, adAccountId: String, bookmark: String)(implicit adAccountIdQuery: QueryParam[String], queryQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PinsList200Response] = jsonOf[PinsList200Response]

    val path = "/search/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("query", Some(queryQuery.toParamString(query))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PinsList200Response](req)

    } yield resp
  }

}

class HttpServiceSearchApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def searchPartnerPins(term: String, countryCode: String, bookmark: String, locale: String, limit: Integer = 10)(implicit termQuery: QueryParam[String], countryCodeQuery: QueryParam[String], bookmarkQuery: QueryParam[String], localeQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[SearchPartnerPins200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchPartnerPins200Response] = jsonOf[SearchPartnerPins200Response]

    val path = "/search/partner/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("term", Some(termQuery.toParamString(term))), ("countryCode", Some(country_codeQuery.toParamString(country_code))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("locale", Some(localeQuery.toParamString(locale))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchPartnerPins200Response](req)

    } yield resp
  }

  def searchUserBoardsGet(adAccountId: String, bookmark: String, pageSize: Integer = 25, query: String)(implicit adAccountIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], queryQuery: QueryParam[String]): Task[SearchUserBoardsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchUserBoardsGet200Response] = jsonOf[SearchUserBoardsGet200Response]

    val path = "/search/boards"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("query", Some(queryQuery.toParamString(query))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchUserBoardsGet200Response](req)

    } yield resp
  }

  def searchUserPinsList(query: String, adAccountId: String, bookmark: String)(implicit adAccountIdQuery: QueryParam[String], queryQuery: QueryParam[String], bookmarkQuery: QueryParam[String]): Task[PinsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[PinsList200Response] = jsonOf[PinsList200Response]

    val path = "/search/pins"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("query", Some(queryQuery.toParamString(query))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PinsList200Response](req)

    } yield resp
  }

}
