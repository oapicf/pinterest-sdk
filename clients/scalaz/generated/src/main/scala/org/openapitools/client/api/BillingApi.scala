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

import org.openapitools.client.api.AdsCreditRedeemRequest
import org.openapitools.client.api.AdsCreditRedeemResponse
import org.openapitools.client.api.AdsCreditsDiscountsGet200Response
import org.openapitools.client.api.BillingProfilesGet200Response
import org.openapitools.client.api.Error
import org.openapitools.client.api.SSIOAccountResponse
import org.openapitools.client.api.SSIOCreateInsertionOrderRequest
import org.openapitools.client.api.SSIOCreateInsertionOrderResponse
import org.openapitools.client.api.SSIOEditInsertionOrderRequest
import org.openapitools.client.api.SSIOEditInsertionOrderResponse
import org.openapitools.client.api.SSIOInsertionOrderStatusResponse
import org.openapitools.client.api.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.client.api.SsioOrderLinesGetByAdAccount200Response

object BillingApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adsCreditRedeem(host: String, adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest): Task[AdsCreditRedeemResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditRedeemResponse] = jsonOf[AdsCreditRedeemResponse]

    val path = "/ad_accounts/{ad_account_id}/ads_credit/redeem".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsCreditRedeemRequest)
      resp          <- client.expect[AdsCreditRedeemResponse](req)

    } yield resp
  }

  def adsCreditsDiscountsGet(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdsCreditsDiscountsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditsDiscountsGet200Response] = jsonOf[AdsCreditsDiscountsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/ads_credit/discounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsCreditsDiscountsGet200Response](req)

    } yield resp
  }

  def billingProfilesGet(host: String, adAccountId: String, isActive: Boolean, bookmark: String, pageSize: Integer = 25)(implicit isActiveQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BillingProfilesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingProfilesGet200Response] = jsonOf[BillingProfilesGet200Response]

    val path = "/ad_accounts/{ad_account_id}/billing_profiles".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("isActive", Some(is_activeQuery.toParamString(is_active))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BillingProfilesGet200Response](req)

    } yield resp
  }

  def ssioAccountsGet(host: String, adAccountId: String): Task[SSIOAccountResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOAccountResponse] = jsonOf[SSIOAccountResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[SSIOAccountResponse](req)

    } yield resp
  }

  def ssioInsertionOrderCreate(host: String, adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): Task[SSIOCreateInsertionOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOCreateInsertionOrderResponse] = jsonOf[SSIOCreateInsertionOrderResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOCreateInsertionOrderRequest)
      resp          <- client.expect[SSIOCreateInsertionOrderResponse](req)

    } yield resp
  }

  def ssioInsertionOrderEdit(host: String, adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): Task[SSIOEditInsertionOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOEditInsertionOrderResponse] = jsonOf[SSIOEditInsertionOrderResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOEditInsertionOrderRequest)
      resp          <- client.expect[SSIOEditInsertionOrderResponse](req)

    } yield resp
  }

  def ssioInsertionOrdersStatusGetByAdAccount(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SsioInsertionOrdersStatusGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = jsonOf[SsioInsertionOrdersStatusGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SsioInsertionOrdersStatusGetByAdAccount200Response](req)

    } yield resp
  }

  def ssioInsertionOrdersStatusGetByPinOrderId(host: String, adAccountId: String, pinOrderId: String): Task[SSIOInsertionOrderStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrderStatusResponse] = jsonOf[SSIOInsertionOrderStatusResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "pin_order_id" + "\\}",escape(pinOrderId.toString))

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
      resp          <- client.expect[SSIOInsertionOrderStatusResponse](req)

    } yield resp
  }

  def ssioOrderLinesGetByAdAccount(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, pinOrderId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], pinOrderIdQuery: QueryParam[String]): Task[SsioOrderLinesGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioOrderLinesGetByAdAccount200Response] = jsonOf[SsioOrderLinesGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("pinOrderId", Some(pin_order_idQuery.toParamString(pin_order_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SsioOrderLinesGetByAdAccount200Response](req)

    } yield resp
  }

}

class HttpServiceBillingApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adsCreditRedeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest): Task[AdsCreditRedeemResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditRedeemResponse] = jsonOf[AdsCreditRedeemResponse]

    val path = "/ad_accounts/{ad_account_id}/ads_credit/redeem".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsCreditRedeemRequest)
      resp          <- client.expect[AdsCreditRedeemResponse](req)

    } yield resp
  }

  def adsCreditsDiscountsGet(adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[AdsCreditsDiscountsGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditsDiscountsGet200Response] = jsonOf[AdsCreditsDiscountsGet200Response]

    val path = "/ad_accounts/{ad_account_id}/ads_credit/discounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AdsCreditsDiscountsGet200Response](req)

    } yield resp
  }

  def billingProfilesGet(adAccountId: String, isActive: Boolean, bookmark: String, pageSize: Integer = 25)(implicit isActiveQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BillingProfilesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingProfilesGet200Response] = jsonOf[BillingProfilesGet200Response]

    val path = "/ad_accounts/{ad_account_id}/billing_profiles".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("isActive", Some(is_activeQuery.toParamString(is_active))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BillingProfilesGet200Response](req)

    } yield resp
  }

  def ssioAccountsGet(adAccountId: String): Task[SSIOAccountResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOAccountResponse] = jsonOf[SSIOAccountResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/accounts".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

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
      resp          <- client.expect[SSIOAccountResponse](req)

    } yield resp
  }

  def ssioInsertionOrderCreate(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): Task[SSIOCreateInsertionOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOCreateInsertionOrderResponse] = jsonOf[SSIOCreateInsertionOrderResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOCreateInsertionOrderRequest)
      resp          <- client.expect[SSIOCreateInsertionOrderResponse](req)

    } yield resp
  }

  def ssioInsertionOrderEdit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): Task[SSIOEditInsertionOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOEditInsertionOrderResponse] = jsonOf[SSIOEditInsertionOrderResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOEditInsertionOrderRequest)
      resp          <- client.expect[SSIOEditInsertionOrderResponse](req)

    } yield resp
  }

  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SsioInsertionOrdersStatusGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = jsonOf[SsioInsertionOrdersStatusGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SsioInsertionOrdersStatusGetByAdAccount200Response](req)

    } yield resp
  }

  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String): Task[SSIOInsertionOrderStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrderStatusResponse] = jsonOf[SSIOInsertionOrderStatusResponse]

    val path = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "pin_order_id" + "\\}",escape(pinOrderId.toString))

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
      resp          <- client.expect[SSIOInsertionOrderStatusResponse](req)

    } yield resp
  }

  def ssioOrderLinesGetByAdAccount(adAccountId: String, bookmark: String, pageSize: Integer = 25, pinOrderId: String)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], pinOrderIdQuery: QueryParam[String]): Task[SsioOrderLinesGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioOrderLinesGetByAdAccount200Response] = jsonOf[SsioOrderLinesGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("pinOrderId", Some(pin_order_idQuery.toParamString(pin_order_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SsioOrderLinesGetByAdAccount200Response](req)

    } yield resp
  }

}
