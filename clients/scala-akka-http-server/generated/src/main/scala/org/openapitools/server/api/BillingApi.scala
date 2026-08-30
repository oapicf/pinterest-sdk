package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdsCreditRedeem
import org.openapitools.server.model.AdsCreditRedeemCreate
import org.openapitools.server.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.model.BillingInvoiceDocumentType
import org.openapitools.server.model.BillingInvoiceDownloadResponse
import org.openapitools.server.model.BillingInvoiceSortField
import org.openapitools.server.model.BillingInvoiceStatus
import org.openapitools.server.model.BillingInvoicesGet200Response
import org.openapitools.server.model.BillingProfilesGet200Response
import org.openapitools.server.model.Error
import java.time.LocalDate
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.SSIOAccount
import org.openapitools.server.model.SSIOInsertionOrder
import org.openapitools.server.model.SSIOInsertionOrderCreate
import org.openapitools.server.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.model.SSIOInsertionOrderUpdate
import org.openapitools.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.model.SsioOrderLinesGetByAdAccount200Response


class BillingApi(
    billingService: BillingApiService,
    billingMarshaller: BillingApiMarshaller
) {

  import BillingApiPatterns.billingInvoiceIdPattern
import BillingApiPatterns.adAccountIdPattern

  import billingMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "ads_credit" / "redeem") { (adAccountId) => 
      post {  
            entity(as[AdsCreditRedeemCreate]){ adsCreditRedeemCreate =>
              billingService.adsCreditRedeem(adAccountId = adAccountId, adsCreditRedeemCreate = adsCreditRedeemCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads_credit" / "discounts") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            billingService.adsCreditsDiscountsGet(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "billing_invoice" / billingInvoiceIdPattern / "download") { (adAccountId, billingInvoiceId) => 
      get {  
            billingService.billingInvoiceDownloadGet(adAccountId = adAccountId, billingInvoiceId = billingInvoiceId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "billing_invoices") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "sort".as[String].?, "status".as[String].?, "document_type".as[String].?, "start_due_date".as[String].?, "end_due_date".as[String].?) { (bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate) => 
            billingService.billingInvoicesGet(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, sort = sort, status = status, documentType = documentType, startDueDate = startDueDate, endDueDate = endDueDate)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "billing_profiles") { (adAccountId) => 
      get { 
        parameters("is_active".as[Boolean], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (isActive, bookmark, pageSize) => 
            billingService.billingProfilesGet(isActive = isActive, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "accounts") { (adAccountId) => 
      get {  
            billingService.ssioAccountsGet(adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "insertion_orders") { (adAccountId) => 
      post {  
            entity(as[SSIOInsertionOrderCreate]){ sSIOInsertionOrderCreate =>
              billingService.ssioInsertionOrderCreate(adAccountId = adAccountId, sSIOInsertionOrderCreate = sSIOInsertionOrderCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "insertion_orders") { (adAccountId) => 
      patch {  
            entity(as[SSIOInsertionOrderUpdate]){ sSIOInsertionOrderUpdate =>
              billingService.ssioInsertionOrderEdit(adAccountId = adAccountId, sSIOInsertionOrderUpdate = sSIOInsertionOrderUpdate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "insertion_orders" / "status") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            billingService.ssioInsertionOrdersStatusGetByAdAccount(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "insertion_orders" / Segment / "status") { (adAccountId, pinOrderId) => 
      get {  
            billingService.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId = adAccountId, pinOrderId = pinOrderId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "order_lines") { (adAccountId) => 
      get { 
        parameters("pin_order_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (pinOrderId, bookmark, pageSize) => 
            billingService.ssioOrderLinesGetByAdAccount(adAccountId = adAccountId, pinOrderId = pinOrderId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    }
}

object BillingApiPatterns {

    val billingInvoiceIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BillingApiService {

  def adsCreditRedeem200(responseAdsCreditRedeem: AdsCreditRedeem)(implicit toEntityMarshallerAdsCreditRedeem: ToEntityMarshaller[AdsCreditRedeem]): Route =
    complete((200, responseAdsCreditRedeem))
  def adsCreditRedeem201(responseAdsCreditRedeem: AdsCreditRedeem)(implicit toEntityMarshallerAdsCreditRedeem: ToEntityMarshaller[AdsCreditRedeem]): Route =
    complete((201, responseAdsCreditRedeem))
  def adsCreditRedeem400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsCreditRedeem401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsCreditRedeem403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsCreditRedeem404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsCreditRedeem429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsCreditRedeemDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdsCreditRedeem
   * Code: 201, Message: Resource create operation completed successfully., DataType: AdsCreditRedeem
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsCreditRedeem(adAccountId: String, adsCreditRedeemCreate: AdsCreditRedeemCreate)
      (implicit toEntityMarshallerAdsCreditRedeem: ToEntityMarshaller[AdsCreditRedeem], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsCreditsDiscountsGet200(responseAdsCreditsDiscountsGet200Response: AdsCreditsDiscountsGet200Response)(implicit toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response]): Route =
    complete((200, responseAdsCreditsDiscountsGet200Response))
  def adsCreditsDiscountsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsCreditsDiscountsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsCreditsDiscountsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsCreditsDiscountsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsCreditsDiscountsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsCreditsDiscountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdsCreditsDiscountsGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsCreditsDiscountsGet(adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def billingInvoiceDownloadGet200(responseBillingInvoiceDownloadResponse: BillingInvoiceDownloadResponse)(implicit toEntityMarshallerBillingInvoiceDownloadResponse: ToEntityMarshaller[BillingInvoiceDownloadResponse]): Route =
    complete((200, responseBillingInvoiceDownloadResponse))
  def billingInvoiceDownloadGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def billingInvoiceDownloadGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def billingInvoiceDownloadGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def billingInvoiceDownloadGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def billingInvoiceDownloadGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def billingInvoiceDownloadGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BillingInvoiceDownloadResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String)
      (implicit toEntityMarshallerBillingInvoiceDownloadResponse: ToEntityMarshaller[BillingInvoiceDownloadResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def billingInvoicesGet200(responseBillingInvoicesGet200Response: BillingInvoicesGet200Response)(implicit toEntityMarshallerBillingInvoicesGet200Response: ToEntityMarshaller[BillingInvoicesGet200Response]): Route =
    complete((200, responseBillingInvoicesGet200Response))
  def billingInvoicesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def billingInvoicesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def billingInvoicesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def billingInvoicesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def billingInvoicesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def billingInvoicesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BillingInvoicesGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def billingInvoicesGet(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], sort: Option[String], status: Option[String], documentType: Option[String], startDueDate: Option[String], endDueDate: Option[String])
      (implicit toEntityMarshallerBillingInvoicesGet200Response: ToEntityMarshaller[BillingInvoicesGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def billingProfilesGet200(responseBillingProfilesGet200Response: BillingProfilesGet200Response)(implicit toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response]): Route =
    complete((200, responseBillingProfilesGet200Response))
  def billingProfilesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def billingProfilesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def billingProfilesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def billingProfilesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def billingProfilesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def billingProfilesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BillingProfilesGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def billingProfilesGet(isActive: Boolean, adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioAccountsGet200(responseSSIOAccount: SSIOAccount)(implicit toEntityMarshallerSSIOAccount: ToEntityMarshaller[SSIOAccount]): Route =
    complete((200, responseSSIOAccount))
  def ssioAccountsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioAccountsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioAccountsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioAccountsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioAccountsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioAccountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SSIOAccount
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioAccountsGet(adAccountId: String)
      (implicit toEntityMarshallerSSIOAccount: ToEntityMarshaller[SSIOAccount], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrderCreate200(responseSSIOInsertionOrder: SSIOInsertionOrder)(implicit toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder]): Route =
    complete((200, responseSSIOInsertionOrder))
  def ssioInsertionOrderCreate201(responseSSIOInsertionOrder: SSIOInsertionOrder)(implicit toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder]): Route =
    complete((201, responseSSIOInsertionOrder))
  def ssioInsertionOrderCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrderCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioInsertionOrderCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioInsertionOrderCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioInsertionOrderCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioInsertionOrderCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SSIOInsertionOrder
   * Code: 201, Message: Resource create operation completed successfully., DataType: SSIOInsertionOrder
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioInsertionOrderCreate(adAccountId: String, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate)
      (implicit toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrderEdit200(responseSSIOInsertionOrder: SSIOInsertionOrder)(implicit toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder]): Route =
    complete((200, responseSSIOInsertionOrder))
  def ssioInsertionOrderEdit400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrderEdit401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioInsertionOrderEdit403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioInsertionOrderEdit404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioInsertionOrderEdit429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioInsertionOrderEditDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SSIOInsertionOrder
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioInsertionOrderEdit(adAccountId: String, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate)
      (implicit toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrdersStatusGetByAdAccount200(responseSsioInsertionOrdersStatusGetByAdAccount200Response: SsioInsertionOrdersStatusGetByAdAccount200Response)(implicit toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]): Route =
    complete((200, responseSsioInsertionOrdersStatusGetByAdAccount200Response))
  def ssioInsertionOrdersStatusGetByAdAccount400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrdersStatusGetByAdAccount401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioInsertionOrdersStatusGetByAdAccount403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioInsertionOrdersStatusGetByAdAccount404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioInsertionOrdersStatusGetByAdAccount429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioInsertionOrdersStatusGetByAdAccountDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SsioInsertionOrdersStatusGetByAdAccount200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]): Route

  def ssioInsertionOrdersStatusGetByPinOrderId200(responseSSIOInsertionOrderStatusResponse: SSIOInsertionOrderStatusResponse)(implicit toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse]): Route =
    complete((200, responseSSIOInsertionOrderStatusResponse))
  def ssioInsertionOrdersStatusGetByPinOrderId400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderId401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderId403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderId404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderId429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SSIOInsertionOrderStatusResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String)
      (implicit toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioOrderLinesGetByAdAccount200(responseSsioOrderLinesGetByAdAccount200Response: SsioOrderLinesGetByAdAccount200Response)(implicit toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response]): Route =
    complete((200, responseSsioOrderLinesGetByAdAccount200Response))
  def ssioOrderLinesGetByAdAccount400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioOrderLinesGetByAdAccount401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def ssioOrderLinesGetByAdAccount403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def ssioOrderLinesGetByAdAccount404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def ssioOrderLinesGetByAdAccount429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def ssioOrderLinesGetByAdAccountDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SsioOrderLinesGetByAdAccount200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def ssioOrderLinesGetByAdAccount(adAccountId: String, pinOrderId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BillingApiMarshaller {
  implicit def fromEntityUnmarshallerAdsCreditRedeemCreate: FromEntityUnmarshaller[AdsCreditRedeemCreate]

  implicit def fromEntityUnmarshallerSSIOInsertionOrderCreate: FromEntityUnmarshaller[SSIOInsertionOrderCreate]

  implicit def fromEntityUnmarshallerSSIOInsertionOrderUpdate: FromEntityUnmarshaller[SSIOInsertionOrderUpdate]



  implicit def toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response]

  implicit def toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response]

  implicit def toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response]

  implicit def toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse]

  implicit def toEntityMarshallerBillingInvoicesGet200Response: ToEntityMarshaller[BillingInvoicesGet200Response]

  implicit def toEntityMarshallerSSIOAccount: ToEntityMarshaller[SSIOAccount]

  implicit def toEntityMarshallerAdsCreditRedeem: ToEntityMarshaller[AdsCreditRedeem]

  implicit def toEntityMarshallerBillingInvoiceDownloadResponse: ToEntityMarshaller[BillingInvoiceDownloadResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerSSIOInsertionOrder: ToEntityMarshaller[SSIOInsertionOrder]

  implicit def toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]

}

