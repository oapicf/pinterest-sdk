package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdsCreditRedeem
import model.AdsCreditRedeemCreate
import model.AdsCreditsDiscountsGet200Response
import model.BillingInvoiceDocumentType
import model.BillingInvoiceDownloadResponse
import model.BillingInvoiceSortField
import model.BillingInvoiceStatus
import model.BillingInvoicesGet200Response
import model.BillingProfilesGet200Response
import model.Error
import java.time.LocalDate
import model.PaginationOrder
import model.SSIOAccount
import model.SSIOInsertionOrder
import model.SSIOInsertionOrderCreate
import model.SSIOInsertionOrderStatusResponse
import model.SSIOInsertionOrderUpdate
import model.SsioInsertionOrdersStatusGetByAdAccount200Response
import model.SsioOrderLinesGetByAdAccount200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class BillingApiController @Inject()(cc: ControllerComponents, api: BillingApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/ads_credit/redeem
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreditRedeem(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsCreditRedeem = {
      val adsCreditRedeemCreate = request.body.asJson.map(_.as[AdsCreditRedeemCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adsCreditRedeemCreate")
      }
      api.adsCreditRedeem(adAccountId, adsCreditRedeemCreate)
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
    * GET /v5/ad_accounts/:adAccountId/billing_invoice/:billingInvoiceId/download
    * @param adAccountId Unique identifier of an ad account.
    * @param billingInvoiceId Unique identifier of a billing invoice.
    */
  def billingInvoiceDownloadGet(adAccountId: String, billingInvoiceId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BillingInvoiceDownloadResponse = {
      api.billingInvoiceDownloadGet(adAccountId, billingInvoiceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/billing_invoices?bookmark=[value]&pageSize=[value]&order=[value]&sort=[value]&status=[value]&documentType=[value]&startDueDate=[value]&endDueDate=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def billingInvoicesGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BillingInvoicesGet200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val sort = request.getQueryString("sort")
        .map(value => )
        
      val status = request.getQueryString("status")
        .map(value => )
        
      val documentType = request.getQueryString("document_type")
        .map(value => )
        
      val startDueDate = request.getQueryString("start_due_date")
        .map(value => LocalDate.parse(value))
        
      val endDueDate = request.getQueryString("end_due_date")
        .map(value => LocalDate.parse(value))
        
      api.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate)
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
        
      api.billingProfilesGet(isActive, adAccountId, bookmark, pageSize)
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
    def executeApi(): SSIOAccount = {
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
    def executeApi(): SSIOInsertionOrder = {
      val sSIOInsertionOrderCreate = request.body.asJson.map(_.as[SSIOInsertionOrderCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sSIOInsertionOrderCreate")
      }
      api.ssioInsertionOrderCreate(adAccountId, sSIOInsertionOrderCreate)
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
    def executeApi(): SSIOInsertionOrder = {
      val sSIOInsertionOrderUpdate = request.body.asJson.map(_.as[SSIOInsertionOrderUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sSIOInsertionOrderUpdate")
      }
      api.ssioInsertionOrderEdit(adAccountId, sSIOInsertionOrderUpdate)
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
    * GET /v5/ad_accounts/:adAccountId/ssio/order_lines?pinOrderId=[value]&bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def ssioOrderLinesGetByAdAccount(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SsioOrderLinesGetByAdAccount200Response = {
      val pinOrderId = request.getQueryString("pin_order_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize)
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
