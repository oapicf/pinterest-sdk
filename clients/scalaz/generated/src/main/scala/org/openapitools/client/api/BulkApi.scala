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

import org.openapitools.client.api.BulkDownloadRequest
import org.openapitools.client.api.BulkDownloadResponse
import org.openapitools.client.api.BulkUpsertRequest
import org.openapitools.client.api.BulkUpsertResponse
import org.openapitools.client.api.BulkUpsertStatusResponse
import org.openapitools.client.api.Error

object BulkApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def bulkDownloadCreate(host: String, adAccountId: String, bulkDownloadRequest: BulkDownloadRequest): Task[BulkDownloadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkDownloadResponse] = jsonOf[BulkDownloadResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/download".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bulkDownloadRequest)
      resp          <- client.expect[BulkDownloadResponse](req)

    } yield resp
  }

  def bulkRequestGet(host: String, adAccountId: String, bulkRequestId: String, includeDetails: Boolean = false)(implicit includeDetailsQuery: QueryParam[Boolean]): Task[BulkUpsertStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkUpsertStatusResponse] = jsonOf[BulkUpsertStatusResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "bulk_request_id" + "\\}",escape(bulkRequestId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeDetails", Some(include_detailsQuery.toParamString(include_details))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BulkUpsertStatusResponse](req)

    } yield resp
  }

  def bulkUpsertCreate(host: String, adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): Task[BulkUpsertResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkUpsertResponse] = jsonOf[BulkUpsertResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/upsert".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bulkUpsertRequest)
      resp          <- client.expect[BulkUpsertResponse](req)

    } yield resp
  }

}

class HttpServiceBulkApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def bulkDownloadCreate(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest): Task[BulkDownloadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkDownloadResponse] = jsonOf[BulkDownloadResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/download".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bulkDownloadRequest)
      resp          <- client.expect[BulkDownloadResponse](req)

    } yield resp
  }

  def bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Boolean = false)(implicit includeDetailsQuery: QueryParam[Boolean]): Task[BulkUpsertStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkUpsertStatusResponse] = jsonOf[BulkUpsertStatusResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "bulk_request_id" + "\\}",escape(bulkRequestId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("includeDetails", Some(include_detailsQuery.toParamString(include_details))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BulkUpsertStatusResponse](req)

    } yield resp
  }

  def bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): Task[BulkUpsertResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BulkUpsertResponse] = jsonOf[BulkUpsertResponse]

    val path = "/ad_accounts/{ad_account_id}/bulk/upsert".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(bulkUpsertRequest)
      resp          <- client.expect[BulkUpsertResponse](req)

    } yield resp
  }

}
