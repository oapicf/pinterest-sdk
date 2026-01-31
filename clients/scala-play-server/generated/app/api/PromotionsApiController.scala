package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.PromotionCreateRequest
import model.PromotionResponse
import model.PromotionUpdateRequest
import model.PromotionsList200Response
import model.PromotionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class PromotionsApiController @Inject()(cc: ControllerComponents, api: PromotionsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionsResponse = {
      val promotionCreateRequest = request.body.asJson.map(_.as[List[PromotionCreateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "promotionCreateRequest")
      }
      api.promotionsCreate(adAccountId, promotionCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/ad_accounts/:adAccountId/promotions/:promotionId
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionId Unique identifier of a promotion
    */
  def promotionsDelete(adAccountId: String, promotionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.promotionsDelete(adAccountId, promotionId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/promotions/:promotionId
    * @param adAccountId Unique identifier of an ad account.
    * @param promotionId Unique identifier of a promotion
    */
  def promotionsGet(adAccountId: String, promotionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionResponse = {
      api.promotionsGet(adAccountId, promotionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/promotions?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def promotionsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): PromotionsList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.promotionsList(adAccountId, pageSize, order, bookmark)
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
      val promotionUpdateRequest = request.body.asJson.map(_.as[List[PromotionUpdateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "promotionUpdateRequest")
      }
      api.promotionsUpdate(adAccountId, promotionUpdateRequest)
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
