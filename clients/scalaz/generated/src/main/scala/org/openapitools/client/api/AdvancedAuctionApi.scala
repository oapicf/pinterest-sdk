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

import org.openapitools.client.api.AdvancedAuctionItems
import org.openapitools.client.api.AdvancedAuctionItemsGetRequest
import org.openapitools.client.api.AdvancedAuctionItemsSubmitRequest
import org.openapitools.client.api.AdvancedAuctionProcessedItems
import org.openapitools.client.api.Error

object AdvancedAuctionApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advancedAuctionItemsGetPost(host: String, advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[AdvancedAuctionItems] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvancedAuctionItems] = jsonOf[AdvancedAuctionItems]

    val path = "/advanced_auction/items/get"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advancedAuctionItemsGetRequest)
      resp          <- client.expect[AdvancedAuctionItems](req)

    } yield resp
  }

  def advancedAuctionItemsSubmitPost(host: String, advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[AdvancedAuctionProcessedItems] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvancedAuctionProcessedItems] = jsonOf[AdvancedAuctionProcessedItems]

    val path = "/advanced_auction/items/submit"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advancedAuctionItemsSubmitRequest)
      resp          <- client.expect[AdvancedAuctionProcessedItems](req)

    } yield resp
  }

}

class HttpServiceAdvancedAuctionApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[AdvancedAuctionItems] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvancedAuctionItems] = jsonOf[AdvancedAuctionItems]

    val path = "/advanced_auction/items/get"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advancedAuctionItemsGetRequest)
      resp          <- client.expect[AdvancedAuctionItems](req)

    } yield resp
  }

  def advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: String)(implicit adAccountIdQuery: QueryParam[String]): Task[AdvancedAuctionProcessedItems] = {
    implicit val returnTypeDecoder: EntityDecoder[AdvancedAuctionProcessedItems] = jsonOf[AdvancedAuctionProcessedItems]

    val path = "/advanced_auction/items/submit"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("adAccountId", Some(ad_account_idQuery.toParamString(ad_account_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(advancedAuctionItemsSubmitRequest)
      resp          <- client.expect[AdvancedAuctionProcessedItems](req)

    } yield resp
  }

}
