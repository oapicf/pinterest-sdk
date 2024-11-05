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
import org.openapitools.client.api.LeadsExportCreateRequest
import org.openapitools.client.api.LeadsExportCreateResponse
import org.openapitools.client.api.LeadsExportResponseData

object LeadsExportApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadsExportCreate(host: String, adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest): Task[LeadsExportCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadsExportCreateResponse] = jsonOf[LeadsExportCreateResponse]

    val path = "/ad_accounts/{ad_account_id}/leads_export".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadsExportCreateRequest)
      resp          <- client.expect[LeadsExportCreateResponse](req)

    } yield resp
  }

  def leadsExportGet(host: String, adAccountId: String, leadsExportId: String): Task[LeadsExportResponseData] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadsExportResponseData] = jsonOf[LeadsExportResponseData]

    val path = "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "leads_export_id" + "\\}",escape(leadsExportId.toString))

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
      resp          <- client.expect[LeadsExportResponseData](req)

    } yield resp
  }

}

class HttpServiceLeadsExportApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def leadsExportCreate(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest): Task[LeadsExportCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadsExportCreateResponse] = jsonOf[LeadsExportCreateResponse]

    val path = "/ad_accounts/{ad_account_id}/leads_export".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(leadsExportCreateRequest)
      resp          <- client.expect[LeadsExportCreateResponse](req)

    } yield resp
  }

  def leadsExportGet(adAccountId: String, leadsExportId: String): Task[LeadsExportResponseData] = {
    implicit val returnTypeDecoder: EntityDecoder[LeadsExportResponseData] = jsonOf[LeadsExportResponseData]

    val path = "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "leads_export_id" + "\\}",escape(leadsExportId.toString))

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
      resp          <- client.expect[LeadsExportResponseData](req)

    } yield resp
  }

}
