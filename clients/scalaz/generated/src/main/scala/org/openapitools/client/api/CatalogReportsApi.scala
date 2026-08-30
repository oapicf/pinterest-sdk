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

import org.openapitools.client.api.CatalogsCreateReportResponse
import org.openapitools.client.api.CatalogsReport
import org.openapitools.client.api.CatalogsReportParameters
import org.openapitools.client.api.CatalogsReportStatsParameters
import org.openapitools.client.api.Error
import org.openapitools.client.api.ReportsStats200Response

object CatalogReportsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def reportsCreate(host: String, catalogsReportParameters: CatalogsReportParameters, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsCreateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsCreateReportResponse] = jsonOf[CatalogsCreateReportResponse]

    val path = "/catalogs/reports"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsReportParameters)
      resp          <- client.expect[CatalogsCreateReportResponse](req)

    } yield resp
  }

  def reportsGet(host: String, token: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String], tokenQuery: QueryParam[String]): Task[CatalogsReport] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsReport] = jsonOf[CatalogsReport]

    val path = "/catalogs/reports"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsReport](req)

    } yield resp
  }

  def reportsStats(host: String, parameters: CatalogsReportStatsParameters, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit adAccountIdQuery: QueryParam[String], parametersQuery: QueryParam[CatalogsReportStatsParameters], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[ReportsStats200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ReportsStats200Response] = jsonOf[ReportsStats200Response]

    val path = "/catalogs/reports/stats"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("parameters", Some(parametersQuery.toParamString(parameters))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ReportsStats200Response](req)

    } yield resp
  }

}

class HttpServiceCatalogReportsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsCreateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsCreateReportResponse] = jsonOf[CatalogsCreateReportResponse]

    val path = "/catalogs/reports"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsReportParameters)
      resp          <- client.expect[CatalogsCreateReportResponse](req)

    } yield resp
  }

  def reportsGet(token: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String], tokenQuery: QueryParam[String]): Task[CatalogsReport] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsReport] = jsonOf[CatalogsReport]

    val path = "/catalogs/reports"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("token", Some(tokenQuery.toParamString(token))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsReport](req)

    } yield resp
  }

  def reportsStats(parameters: CatalogsReportStatsParameters, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit adAccountIdQuery: QueryParam[String], parametersQuery: QueryParam[CatalogsReportStatsParameters], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[ReportsStats200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[ReportsStats200Response] = jsonOf[ReportsStats200Response]

    val path = "/catalogs/reports/stats"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))), ("parameters", Some(parametersQuery.toParamString(parameters))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ReportsStats200Response](req)

    } yield resp
  }

}
