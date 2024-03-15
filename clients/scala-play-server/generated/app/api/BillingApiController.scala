package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdsCreditRedeemRequest
import model.AdsCreditRedeemResponse
import model.AdsCreditsDiscountsGet200Response
import model.BillingProfilesGet200Response
import model.Error
import model.SSIOAccountResponse
import model.SSIOCreateInsertionOrderRequest
import model.SSIOCreateInsertionOrderResponse
import model.SSIOEditInsertionOrderRequest
import model.SSIOEditInsertionOrderResponse
import model.SSIOInsertionOrderStatusResponse
import model.SsioInsertionOrdersStatusGetByAdAccount200Response
import model.SsioOrderLinesGetByAdAccount200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class BillingApiController @Inject()(cc: ControllerComponents, api: BillingApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/ads_credit/redeem
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreditRedeem(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsCreditRedeemResponse = {
      val adsCreditRedeemRequest = request.body.asJson.map(_.as[AdsCreditRedeemRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adsCreditRedeemRequest")
      }
      api.adsCreditRedeem(adAccountId, adsCreditRedeemRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads_credit/discounts?bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreditsDiscountsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsCreditsDiscountsGet200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/billing_profiles?isActive=[value]&bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def billingProfilesGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BillingProfilesGet200Response = {
      val isActive = request.getQueryString("is_active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("is_active", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.billingProfilesGet(adAccountId, isActive, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ssio/accounts
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioAccountsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SSIOAccountResponse = {
      api.ssioAccountsGet(adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/ssio/insertion_orders
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioInsertionOrderCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SSIOCreateInsertionOrderResponse = {
      val sSIOCreateInsertionOrderRequest = request.body.asJson.map(_.as[SSIOCreateInsertionOrderRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sSIOCreateInsertionOrderRequest")
      }
      api.ssioInsertionOrderCreate(adAccountId, sSIOCreateInsertionOrderRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/ssio/insertion_orders
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioInsertionOrderEdit(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SSIOEditInsertionOrderResponse = {
      val sSIOEditInsertionOrderRequest = request.body.asJson.map(_.as[SSIOEditInsertionOrderRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sSIOEditInsertionOrderRequest")
      }
      api.ssioInsertionOrderEdit(adAccountId, sSIOEditInsertionOrderRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ssio/insertion_orders/status?bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SsioInsertionOrdersStatusGetByAdAccount200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ssio/insertion_orders/:pinOrderId/status
    * @param adAccountId Unique identifier of an ad account.
    * @param pinOrderId The pin order id associated with the ssio insertion order
    */
  def ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SSIOInsertionOrderStatusResponse = {
      api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ssio/order_lines?bookmark=[value]&pageSize=[value]&pinOrderId=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioOrderLinesGetByAdAccount(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SsioOrderLinesGetByAdAccount200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val pinOrderId = request.getQueryString("pin_order_id")
        
      api.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
