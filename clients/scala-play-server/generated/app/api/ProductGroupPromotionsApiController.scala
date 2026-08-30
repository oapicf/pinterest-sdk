package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.PaginationOrder
import model.ProductGroupAnalyticsItems
import model.ProductGroupPromotion
import model.ProductGroupPromotions
import model.ProductGroupPromotionsCreate
import model.ProductGroupPromotionsList200Response
import model.ProductGroupPromotionsUpdateWithRequiredBody
import model.ReportingColumnSync
import model.ReportingTimeZone

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ProductGroupPromotionsApiController @Inject()(cc: ControllerComponents, api: ProductGroupPromotionsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/product_group_promotions
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotions = {
      val productGroupPromotionsCreate = request.body.asJson.map(_.as[ProductGroupPromotionsCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productGroupPromotionsCreate")
      }
      api.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate)
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
    def executeApi(): ProductGroupPromotion = {
      api.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_group_promotions?bookmark=[value]&pageSize=[value]&order=[value]&productGroupPromotionIds=[value]&entityStatuses=[value]&adGroupId=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupPromotionsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProductGroupPromotionsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val productGroupPromotionIds = request.queryString.get("product_group_promotion_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      val adGroupId = request.getQueryString("ad_group_id")
        
      api.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId)
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
    def executeApi(): ProductGroupPromotions = {
      val productGroupPromotionsUpdateWithRequiredBody = request.body.asJson.map(_.as[ProductGroupPromotionsUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "productGroupPromotionsUpdateWithRequiredBody")
      }
      api.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/product_groups/analytics?startDate=[value]&endDate=[value]&productGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&reportingTimezone=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def productGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[ProductGroupAnalyticsItems] = {
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
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("columns", "query string")
        }
        
      val granularity = request.getQueryString("granularity")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("granularity", "query string")
        }
        
      val clickWindowDays = request.getQueryString("click_window_days")
        .map(value => BigDecimal(value))
        
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => BigDecimal(value))
        
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => BigDecimal(value))
        
      val conversionReportTime = request.getQueryString("conversion_report_time")
        
      val reportingTimezone = request.getQueryString("reporting_timezone")
        .map(value => )
        
      api.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)
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
