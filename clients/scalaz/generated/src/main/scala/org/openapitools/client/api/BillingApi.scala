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

import org.openapitools.client.api.AdsCreditRedeem
import org.openapitools.client.api.AdsCreditRedeemCreate
import org.openapitools.client.api.AdsCreditsDiscountsGet200Response
import org.openapitools.client.api.BillingInvoiceDocumentType
import org.openapitools.client.api.BillingInvoiceDownloadResponse
import org.openapitools.client.api.BillingInvoiceSortField
import org.openapitools.client.api.BillingInvoiceStatus
import org.openapitools.client.api.BillingInvoicesGet200Response
import org.openapitools.client.api.BillingProfilesGet200Response
import org.openapitools.client.api.Error
import java.time.LocalDate
import org.openapitools.client.api.PaginationOrder
import org.openapitools.client.api.SSIOAccount
import org.openapitools.client.api.SSIOInsertionOrder
import org.openapitools.client.api.SSIOInsertionOrderCreate
import org.openapitools.client.api.SSIOInsertionOrderStatusResponse
import org.openapitools.client.api.SSIOInsertionOrderUpdate
import org.openapitools.client.api.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.client.api.SsioOrderLinesGetByAdAccount200Response

object BillingApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adsCreditRedeem(host: String, adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate): Task[AdsCreditRedeem] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditRedeem] = jsonOf[AdsCreditRedeem]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsCreditRedeemCreate)
      resp          <- client.expect[AdsCreditRedeem](req)

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

  def billingInvoiceDownloadGet(host: String, adAccountId: String, billingInvoiceId: String): Task[BillingInvoiceDownloadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingInvoiceDownloadResponse] = jsonOf[BillingInvoiceDownloadResponse]

    val path = "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "billing_invoice_id" + "\\}",escape(billingInvoiceId.toString))

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
      resp          <- client.expect[BillingInvoiceDownloadResponse](req)

    } yield resp
  }

  def billingInvoicesGet(host: String, adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, sort: BillingInvoiceSortField, status: BillingInvoiceStatus, documentType: BillingInvoiceDocumentType, startDueDate: LocalDate, endDueDate: LocalDate)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], sortQuery: QueryParam[BillingInvoiceSortField], statusQuery: QueryParam[BillingInvoiceStatus], documentTypeQuery: QueryParam[BillingInvoiceDocumentType], startDueDateQuery: QueryParam[LocalDate], endDueDateQuery: QueryParam[LocalDate]): Task[BillingInvoicesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingInvoicesGet200Response] = jsonOf[BillingInvoicesGet200Response]

    val path = "/ad_accounts/{ad_account_id}/billing_invoices".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("sort", Some(sortQuery.toParamString(sort))), ("status", Some(statusQuery.toParamString(status))), ("documentType", Some(document_typeQuery.toParamString(document_type))), ("startDueDate", Some(start_due_dateQuery.toParamString(start_due_date))), ("endDueDate", Some(end_due_dateQuery.toParamString(end_due_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BillingInvoicesGet200Response](req)

    } yield resp
  }

  def billingProfilesGet(host: String, isActive: Boolean, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit isActiveQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BillingProfilesGet200Response] = {
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

  def ssioAccountsGet(host: String, adAccountId: String): Task[SSIOAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOAccount] = jsonOf[SSIOAccount]

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
      resp          <- client.expect[SSIOAccount](req)

    } yield resp
  }

  def ssioInsertionOrderCreate(host: String, adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate): Task[SSIOInsertionOrder] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrder] = jsonOf[SSIOInsertionOrder]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOInsertionOrderCreate)
      resp          <- client.expect[SSIOInsertionOrder](req)

    } yield resp
  }

  def ssioInsertionOrderEdit(host: String, adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate): Task[SSIOInsertionOrder] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrder] = jsonOf[SSIOInsertionOrder]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOInsertionOrderUpdate)
      resp          <- client.expect[SSIOInsertionOrder](req)

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

  def ssioOrderLinesGetByAdAccount(host: String, adAccountId: String, pinOrderId: String, bookmark: String, pageSize: Integer = 25)(implicit pinOrderIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SsioOrderLinesGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioOrderLinesGetByAdAccount200Response] = jsonOf[SsioOrderLinesGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinOrderId", Some(pin_order_idQuery.toParamString(pin_order_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

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

  def adsCreditRedeem(adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate): Task[AdsCreditRedeem] = {
    implicit val returnTypeDecoder: EntityDecoder[AdsCreditRedeem] = jsonOf[AdsCreditRedeem]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adsCreditRedeemCreate)
      resp          <- client.expect[AdsCreditRedeem](req)

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

  def billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String): Task[BillingInvoiceDownloadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingInvoiceDownloadResponse] = jsonOf[BillingInvoiceDownloadResponse]

    val path = "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString)).replaceAll("\\{" + "billing_invoice_id" + "\\}",escape(billingInvoiceId.toString))

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
      resp          <- client.expect[BillingInvoiceDownloadResponse](req)

    } yield resp
  }

  def billingInvoicesGet(adAccountId: String, bookmark: String, pageSize: Integer = 25, order: PaginationOrder, sort: BillingInvoiceSortField, status: BillingInvoiceStatus, documentType: BillingInvoiceDocumentType, startDueDate: LocalDate, endDueDate: LocalDate)(implicit bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer], orderQuery: QueryParam[PaginationOrder], sortQuery: QueryParam[BillingInvoiceSortField], statusQuery: QueryParam[BillingInvoiceStatus], documentTypeQuery: QueryParam[BillingInvoiceDocumentType], startDueDateQuery: QueryParam[LocalDate], endDueDateQuery: QueryParam[LocalDate]): Task[BillingInvoicesGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[BillingInvoicesGet200Response] = jsonOf[BillingInvoicesGet200Response]

    val path = "/ad_accounts/{ad_account_id}/billing_invoices".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("order", Some(orderQuery.toParamString(order))), ("sort", Some(sortQuery.toParamString(sort))), ("status", Some(statusQuery.toParamString(status))), ("documentType", Some(document_typeQuery.toParamString(document_type))), ("startDueDate", Some(start_due_dateQuery.toParamString(start_due_date))), ("endDueDate", Some(end_due_dateQuery.toParamString(end_due_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BillingInvoicesGet200Response](req)

    } yield resp
  }

  def billingProfilesGet(isActive: Boolean, adAccountId: String, bookmark: String, pageSize: Integer = 25)(implicit isActiveQuery: QueryParam[Boolean], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[BillingProfilesGet200Response] = {
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

  def ssioAccountsGet(adAccountId: String): Task[SSIOAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOAccount] = jsonOf[SSIOAccount]

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
      resp          <- client.expect[SSIOAccount](req)

    } yield resp
  }

  def ssioInsertionOrderCreate(adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate): Task[SSIOInsertionOrder] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrder] = jsonOf[SSIOInsertionOrder]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOInsertionOrderCreate)
      resp          <- client.expect[SSIOInsertionOrder](req)

    } yield resp
  }

  def ssioInsertionOrderEdit(adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate): Task[SSIOInsertionOrder] = {
    implicit val returnTypeDecoder: EntityDecoder[SSIOInsertionOrder] = jsonOf[SSIOInsertionOrder]

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
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sSIOInsertionOrderUpdate)
      resp          <- client.expect[SSIOInsertionOrder](req)

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

  def ssioOrderLinesGetByAdAccount(adAccountId: String, pinOrderId: String, bookmark: String, pageSize: Integer = 25)(implicit pinOrderIdQuery: QueryParam[String], bookmarkQuery: QueryParam[String], pageSizeQuery: QueryParam[Integer]): Task[SsioOrderLinesGetByAdAccount200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[SsioOrderLinesGetByAdAccount200Response] = jsonOf[SsioOrderLinesGetByAdAccount200Response]

    val path = "/ad_accounts/{ad_account_id}/ssio/order_lines".replaceAll("\\{" + "ad_account_id" + "\\}",escape(adAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pinOrderId", Some(pin_order_idQuery.toParamString(pin_order_id))), ("bookmark", Some(bookmarkQuery.toParamString(bookmark))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SsioOrderLinesGetByAdAccount200Response](req)

    } yield resp
  }

}
