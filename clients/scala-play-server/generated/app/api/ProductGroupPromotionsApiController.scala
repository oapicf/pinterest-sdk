package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.Granularity
import java.time.LocalDate
import model.ProductGroupAnalyticsResponseInner
import model.ProductGroupPromotionCreateRequest
import model.ProductGroupPromotionResponse
import model.ProductGroupPromotionUpdateRequest
import model.ProductGroupPromotionsList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class ProductGroupPromotionsApiController @Inject()(cc: ControllerComponents, api: ProductGroupPromotionsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/product_group_promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotionResponse = {
      val productGroupPromotionCreateRequest = request.body.asJson.map(_.as[ProductGroupPromotionCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productGroupPromotionCreateRequest")
      }
      api.productGroupPromotionsCreate(adAccountId, productGroupPromotionCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_group_promotions/:productGroupPromotionId
    * @param adAccountId Unique identifier of an ad account.
    * @param productGroupPromotionId Unique identifier of a product group promotion
    */
  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotionResponse = {
      api.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_group_promotions?productGroupPromotionIds=[value]&entityStatuses=[value]&adGroupId=[value]&pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotionsList200Response = {
      val productGroupPromotionIds = request.queryString.get("product_group_promotion_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        
      val adGroupId = request.getQueryString("ad_group_id")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.productGroupPromotionsList(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/product_group_promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotionResponse = {
      val productGroupPromotionUpdateRequest = request.body.asJson.map(_.as[ProductGroupPromotionUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productGroupPromotionUpdateRequest")
      }
      api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_groups/analytics?startDate=[value]&endDate=[value]&productGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[ProductGroupAnalyticsResponseInner] = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val productGroupIds = request.queryString.get("product_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("product_group_ids", "query string")
        }
        
      val columns = request.getQueryString("columns")
        .map(values => splitCollectionParam(values, "csv"))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
        
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
        
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => value.toInt)
        
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => value.toInt)
        
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => value.toInt)
        
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
