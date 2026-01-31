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

import org.openapitools.client.api.CatalogsItems
import org.openapitools.client.api.CatalogsItemsBatch
import org.openapitools.client.api.CatalogsItemsRequest
import org.openapitools.client.api.Error
import org.openapitools.client.api.ItemsBatchPostRequest

object CatalogItemsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def itemsBatchGet(host: String, batchId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsBatchPost(host: String, itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(itemsBatchPostRequest)
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsPost(host: String, catalogsItemsRequest: CatalogsItemsRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItems] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItems] = jsonOf[CatalogsItems]

    val path = "/catalogs/items"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsItemsRequest)
      resp          <- client.expect[CatalogsItems](req)

    } yield resp
  }

}

class HttpServiceCatalogItemsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def itemsBatchGet(batchId: String, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItemsBatch] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]

    val path = "/catalogs/items/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(itemsBatchPostRequest)
      resp          <- client.expect[CatalogsItemsBatch](req)

    } yield resp
  }

  def itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[CatalogsItems] = {
    implicit val returnTypeDecoder: EntityDecoder[CatalogsItems] = jsonOf[CatalogsItems]

    val path = "/catalogs/items"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(catalogsItemsRequest)
      resp          <- client.expect[CatalogsItems](req)

    } yield resp
  }

}
