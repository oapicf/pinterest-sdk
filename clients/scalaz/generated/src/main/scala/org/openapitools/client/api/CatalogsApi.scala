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

import org.openapitools.client.api.Catalog
import org.openapitools.client.api.CatalogsAvailableFilterValues
import org.openapitools.client.api.CatalogsCreateRequest
import org.openapitools.client.api.CatalogsList200Response
import org.openapitools.client.api.CatalogsLocale
import org.openapitools.client.api.Country
import org.openapitools.client.api.Error

object CatalogsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsAvailableFilterValues(host: String, catalogId: String, feedId: String, country: Country, language: CatalogsLocale, adAccountId: String)(implicit catalogIdQuery: QueryParam[String], feedIdQuery: QueryParam[String], countryQuery: QueryParam[Country], languageQuery: QueryParam[CatalogsLocale], adAccountIdQuery: QueryParam[String]): Task[CatalogsAvailableFilterValues] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsAvailableFilterValues] = jsonOf[CatalogsAvailableFilterValues]

    val path = "/catalogs/available_filter_values"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("country", Some(countryQuery.toParamString(country))), ("language", Some(languageQuery.toParamString(language))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsAvailableFilterValues](req)

    } yield resp
  }

  def catalogsCreate(host: String, catalogsCreateRequest: CatalogsCreateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Catalog] = {
    implicit val returnTypeDecoder: EntityDecoder[Catalog] = jsonOf[Catalog]

    val path = "/catalogs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsCreateRequest)
      resp          <- client.expect[Catalog](req)

    } yield resp
  }

  def catalogsList(host: String, bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[CatalogsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsList200Response] = jsonOf[CatalogsList200Response]

    val path = "/catalogs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsList200Response](req)

    } yield resp
  }

}

class HttpServiceCatalogsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def catalogsAvailableFilterValues(catalogId: String, feedId: String, country: Country, language: CatalogsLocale, adAccountId: String)(implicit catalogIdQuery: QueryParam[String], feedIdQuery: QueryParam[String], countryQuery: QueryParam[Country], languageQuery: QueryParam[CatalogsLocale], adAccountIdQuery: QueryParam[String]): Task[CatalogsAvailableFilterValues] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsAvailableFilterValues] = jsonOf[CatalogsAvailableFilterValues]

    val path = "/catalogs/available_filter_values"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("catalogId", Some(catalog_idQuery.toParamString(catalog_id))), ("feedId", Some(feed_idQuery.toParamString(feed_id))), ("country", Some(countryQuery.toParamString(country))), ("language", Some(languageQuery.toParamString(language))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsAvailableFilterValues](req)

    } yield resp
  }

  def catalogsCreate(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[Catalog] = {
    implicit val returnTypeDecoder: EntityDecoder[Catalog] = jsonOf[Catalog]

    val path = "/catalogs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsCreateRequest)
      resp          <- client.expect[Catalog](req)

    } yield resp
  }

  def catalogsList(bookmark: String, pageSize: Integer = 25, adAccountId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], adAccountIdQuery: QueryParam[String]): Task[CatalogsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsList200Response] = jsonOf[CatalogsList200Response]

    val path = "/catalogs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsList200Response](req)

    } yield resp
  }

}
