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

import org.openapitools.client.api.AdAccountsCatalogsProductGroupsList200Response
import org.openapitools.client.api.Error

object ProductGroupsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsCatalogsProductGroupsList(host: String, adAccountId: String, feedProfileId: String)(implicit feedProfileIdQuery: QueryParam[String]): Task[AdAccountsCatalogsProductGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsCatalogsProductGroupsList200Response] = jsonOf[AdAccountsCatalogsProductGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_groups/catalogs".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedProfileId", Some(feed_profile_idQuery.toParamString(feed_profile_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsCatalogsProductGroupsList200Response](req)

    } yield resp
  }

}

class HttpServiceProductGroupsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsCatalogsProductGroupsList(adAccountId: String, feedProfileId: String)(implicit feedProfileIdQuery: QueryParam[String]): Task[AdAccountsCatalogsProductGroupsList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsCatalogsProductGroupsList200Response] = jsonOf[AdAccountsCatalogsProductGroupsList200Response]

    val path = "/ad_accounts/{ad_account_id}/product_groups/catalogs".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedProfileId", Some(feed_profile_idQuery.toParamString(feed_profile_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsCatalogsProductGroupsList200Response](req)

    } yield resp
  }

}
