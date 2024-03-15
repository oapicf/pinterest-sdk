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

import org.openapitools.client.api.AdAccountCreateSubscriptionRequest
import org.openapitools.client.api.AdAccountCreateSubscriptionResponse
import org.openapitools.client.api.AdAccountGetSubscriptionResponse
import org.openapitools.client.api.AdAccountsSubscriptionsGetList200Response
import org.openapitools.client.api.Error

object LeadAdsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsSubscriptionsDelById(host: String, adAccountId: String, subscriptionId: String): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "subscription_id" + "\\}",escape(subscriptionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def adAccountsSubscriptionsGetById(host: String, adAccountId: String, subscriptionId: String): Task[AdAccountGetSubscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountGetSubscriptionResponse] = jsonOf[AdAccountGetSubscriptionResponse]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "subscription_id" + "\\}",escape(subscriptionId.toString))

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
      resp          <- client.expect[AdAccountGetSubscriptionResponse](req)

    } yield resp
  }

  def adAccountsSubscriptionsGetList(host: String, adAccountId: String, pageSize: Integer = 25, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsSubscriptionsGetList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsSubscriptionsGetList200Response] = jsonOf[AdAccountsSubscriptionsGetList200Response]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsSubscriptionsGetList200Response](req)

    } yield resp
  }

  def adAccountsSubscriptionsPost(host: String, adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): Task[AdAccountCreateSubscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountCreateSubscriptionResponse] = jsonOf[AdAccountCreateSubscriptionResponse]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreateSubscriptionRequest)
      resp          <- client.expect[AdAccountCreateSubscriptionResponse](req)

    } yield resp
  }

}

class HttpServiceLeadAdsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String): Task[Unit] = {
    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "subscription_id" + "\\}",escape(subscriptionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String): Task[AdAccountGetSubscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountGetSubscriptionResponse] = jsonOf[AdAccountGetSubscriptionResponse]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "subscription_id" + "\\}",escape(subscriptionId.toString))

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
      resp          <- client.expect[AdAccountGetSubscriptionResponse](req)

    } yield resp
  }

  def adAccountsSubscriptionsGetList(adAccountId: String, pageSize: Integer = 25, bookmark: String)(implicit pageSizeQuery: QueryParam[Integer], bookmarkQuery: QueryParam[String]): Task[AdAccountsSubscriptionsGetList200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountsSubscriptionsGetList200Response] = jsonOf[AdAccountsSubscriptionsGetList200Response]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdAccountsSubscriptionsGetList200Response](req)

    } yield resp
  }

  def adAccountsSubscriptionsPost(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): Task[AdAccountCreateSubscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdAccountCreateSubscriptionResponse] = jsonOf[AdAccountCreateSubscriptionResponse]

    val path = "/ad_accounts/{ad_account_id}/leads/subscriptions".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adAccountCreateSubscriptionRequest)
      resp          <- client.expect[AdAccountCreateSubscriptionResponse](req)

    } yield resp
  }

}
