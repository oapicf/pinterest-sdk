package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdsCreditRedeemRequest
import org.openapitools.server.model.AdsCreditRedeemResponse
import org.openapitools.server.model.AdsCreditsDiscountsGet200Response
import org.openapitools.server.model.BillingProfilesGet200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.SSIOAccountResponse
import org.openapitools.server.model.SSIOCreateInsertionOrderRequest
import org.openapitools.server.model.SSIOCreateInsertionOrderResponse
import org.openapitools.server.model.SSIOEditInsertionOrderRequest
import org.openapitools.server.model.SSIOEditInsertionOrderResponse
import org.openapitools.server.model.SSIOInsertionOrderStatusResponse
import org.openapitools.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.server.model.SsioOrderLinesGetByAdAccount200Response


class BillingApi(
    billingService: BillingApiService,
    billingMarshaller: BillingApiMarshaller
) {

  import BillingApiPatterns.adAccountIdPattern

  import billingMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "ads_credit" / "redeem") { (adAccountId) => 
      post {  
            entity(as[AdsCreditRedeemRequest]){ adsCreditRedeemRequest =>
              billingService.adsCreditRedeem(adAccountId = adAccountId, adsCreditRedeemRequest = adsCreditRedeemRequest)
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
    path("ad_accounts" / adAccountIdPattern / "billing_profiles") { (adAccountId) => 
      get { 
        parameters("is_active".as[Boolean], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (isActive, bookmark, pageSize) => 
            billingService.billingProfilesGet(adAccountId = adAccountId, isActive = isActive, bookmark = bookmark, pageSize = pageSize)
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
            entity(as[SSIOCreateInsertionOrderRequest]){ sSIOCreateInsertionOrderRequest =>
              billingService.ssioInsertionOrderCreate(adAccountId = adAccountId, sSIOCreateInsertionOrderRequest = sSIOCreateInsertionOrderRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ssio" / "insertion_orders") { (adAccountId) => 
      patch {  
            entity(as[SSIOEditInsertionOrderRequest]){ sSIOEditInsertionOrderRequest =>
              billingService.ssioInsertionOrderEdit(adAccountId = adAccountId, sSIOEditInsertionOrderRequest = sSIOEditInsertionOrderRequest)
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
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "pin_order_id".as[String].?) { (bookmark, pageSize, pinOrderId) => 
            billingService.ssioOrderLinesGetByAdAccount(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, pinOrderId = pinOrderId)
        }
      }
    }
}

object BillingApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BillingApiService {

  def adsCreditRedeem200(responseAdsCreditRedeemResponse: AdsCreditRedeemResponse)(implicit toEntityMarshallerAdsCreditRedeemResponse: ToEntityMarshaller[AdsCreditRedeemResponse]): Route =
    complete((200, responseAdsCreditRedeemResponse))
  def adsCreditRedeem400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsCreditRedeemDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Successfully redeemed ad credits., DataType: AdsCreditRedeemResponse
   * Code: 400, Message: Error thrown when unable to redeem offer code., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsCreditRedeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdsCreditRedeemResponse: ToEntityMarshaller[AdsCreditRedeemResponse]): Route

  def adsCreditsDiscountsGet200(responseAdsCreditsDiscountsGet200Response: AdsCreditsDiscountsGet200Response)(implicit toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response]): Route =
    complete((200, responseAdsCreditsDiscountsGet200Response))
  def adsCreditsDiscountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdsCreditsDiscountsGet200Response
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adsCreditsDiscountsGet(adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def billingProfilesGet200(responseBillingProfilesGet200Response: BillingProfilesGet200Response)(implicit toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response]): Route =
    complete((200, responseBillingProfilesGet200Response))
  def billingProfilesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BillingProfilesGet200Response
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def billingProfilesGet(adAccountId: String, isActive: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioAccountsGet200(responseSSIOAccountResponse: SSIOAccountResponse)(implicit toEntityMarshallerSSIOAccountResponse: ToEntityMarshaller[SSIOAccountResponse]): Route =
    complete((200, responseSSIOAccountResponse))
  def ssioAccountsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioAccountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SSIOAccountResponse
   * Code: 400, Message: Invalid request parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioAccountsGet(adAccountId: String)
      (implicit toEntityMarshallerSSIOAccountResponse: ToEntityMarshaller[SSIOAccountResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrderCreate200(responseSSIOCreateInsertionOrderResponse: SSIOCreateInsertionOrderResponse)(implicit toEntityMarshallerSSIOCreateInsertionOrderResponse: ToEntityMarshaller[SSIOCreateInsertionOrderResponse]): Route =
    complete((200, responseSSIOCreateInsertionOrderResponse))
  def ssioInsertionOrderCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrderCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SSIOCreateInsertionOrderResponse
   * Code: 400, Message: Invalid request., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioInsertionOrderCreate(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest)
      (implicit toEntityMarshallerSSIOCreateInsertionOrderResponse: ToEntityMarshaller[SSIOCreateInsertionOrderResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrderEdit200(responseSSIOEditInsertionOrderResponse: SSIOEditInsertionOrderResponse)(implicit toEntityMarshallerSSIOEditInsertionOrderResponse: ToEntityMarshaller[SSIOEditInsertionOrderResponse]): Route =
    complete((200, responseSSIOEditInsertionOrderResponse))
  def ssioInsertionOrderEdit400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrderEditDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SSIOEditInsertionOrderResponse
   * Code: 400, Message: Invalid request., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioInsertionOrderEdit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest)
      (implicit toEntityMarshallerSSIOEditInsertionOrderResponse: ToEntityMarshaller[SSIOEditInsertionOrderResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioInsertionOrdersStatusGetByAdAccount200(responseSsioInsertionOrdersStatusGetByAdAccount200Response: SsioInsertionOrdersStatusGetByAdAccount200Response)(implicit toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]): Route =
    complete((200, responseSsioInsertionOrdersStatusGetByAdAccount200Response))
  def ssioInsertionOrdersStatusGetByAdAccount400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrdersStatusGetByAdAccountDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SsioInsertionOrdersStatusGetByAdAccount200Response
   * Code: 400, Message: Invalid request parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]): Route

  def ssioInsertionOrdersStatusGetByPinOrderId200(responseSSIOInsertionOrderStatusResponse: SSIOInsertionOrderStatusResponse)(implicit toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse]): Route =
    complete((200, responseSSIOInsertionOrderStatusResponse))
  def ssioInsertionOrdersStatusGetByPinOrderId400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioInsertionOrdersStatusGetByPinOrderIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SSIOInsertionOrderStatusResponse
   * Code: 400, Message: Invalid request parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String)
      (implicit toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def ssioOrderLinesGetByAdAccount200(responseSsioOrderLinesGetByAdAccount200Response: SsioOrderLinesGetByAdAccount200Response)(implicit toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response]): Route =
    complete((200, responseSsioOrderLinesGetByAdAccount200Response))
  def ssioOrderLinesGetByAdAccount400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def ssioOrderLinesGetByAdAccountDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SsioOrderLinesGetByAdAccount200Response
   * Code: 400, Message: Invalid request parameter., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def ssioOrderLinesGetByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Int, pinOrderId: Option[String])
      (implicit toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BillingApiMarshaller {
  implicit def fromEntityUnmarshallerSSIOCreateInsertionOrderRequest: FromEntityUnmarshaller[SSIOCreateInsertionOrderRequest]

  implicit def fromEntityUnmarshallerAdsCreditRedeemRequest: FromEntityUnmarshaller[AdsCreditRedeemRequest]

  implicit def fromEntityUnmarshallerSSIOEditInsertionOrderRequest: FromEntityUnmarshaller[SSIOEditInsertionOrderRequest]



  implicit def toEntityMarshallerSSIOAccountResponse: ToEntityMarshaller[SSIOAccountResponse]

  implicit def toEntityMarshallerSSIOEditInsertionOrderResponse: ToEntityMarshaller[SSIOEditInsertionOrderResponse]

  implicit def toEntityMarshallerAdsCreditsDiscountsGet200Response: ToEntityMarshaller[AdsCreditsDiscountsGet200Response]

  implicit def toEntityMarshallerSsioOrderLinesGetByAdAccount200Response: ToEntityMarshaller[SsioOrderLinesGetByAdAccount200Response]

  implicit def toEntityMarshallerBillingProfilesGet200Response: ToEntityMarshaller[BillingProfilesGet200Response]

  implicit def toEntityMarshallerSSIOCreateInsertionOrderResponse: ToEntityMarshaller[SSIOCreateInsertionOrderResponse]

  implicit def toEntityMarshallerSSIOInsertionOrderStatusResponse: ToEntityMarshaller[SSIOInsertionOrderStatusResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerSsioInsertionOrdersStatusGetByAdAccount200Response: ToEntityMarshaller[SsioInsertionOrdersStatusGetByAdAccount200Response]

  implicit def toEntityMarshallerAdsCreditRedeemResponse: ToEntityMarshaller[AdsCreditRedeemResponse]

}

