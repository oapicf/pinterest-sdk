package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.PaginationOrder
import model.Promotion
import model.PromotionBatchUpdate
import model.PromotionCreate
import model.PromotionsList200Response
import model.PromotionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class PromotionsApiController @Inject()(cc: ControllerComponents, api: PromotionsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionsResponse = {
      val promotionCreate = request.body.asJson.map(_.as[List[PromotionCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "promotionCreate")
      }
      api.promotionsCreate(adAccountId, promotionCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/ad_accounts/:adAccountId/promotions/:promotionId
    * @param promotionId Promotion ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsDelete(promotionId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Promotion = {
      api.promotionsDelete(promotionId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/promotions/:promotionId
    * @param promotionId Promotion ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsGet(promotionId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Promotion = {
      api.promotionsGet(promotionId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/promotions?bookmark=[value]&pageSize=[value]&order=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      api.promotionsList(adAccountId, bookmark, pageSize, order)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionsResponse = {
      val promotionBatchUpdate = request.body.asJson.map(_.as[List[PromotionBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "promotionBatchUpdate")
      }
      api.promotionsUpdate(adAccountId, promotionBatchUpdate)
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
