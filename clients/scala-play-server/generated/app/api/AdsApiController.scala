package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdArrayResponse
import model.AdCreateRequest
import model.AdPreviewRequest
import model.AdPreviewURLResponse
import model.AdResponse
import model.AdUpdateRequest
import model.AdsAnalyticsAdTargetingType
import model.AdsAnalyticsResponseInner
import model.AdsList200Response
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class AdsApiController @Inject()(cc: ControllerComponents, api: AdsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/ad_previews
    * @param adAccountId Unique identifier of an ad account.
    */
  def adPreviewsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdPreviewURLResponse = {
      val adPreviewRequest = request.body.asJson.map(_.as[AdPreviewRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adPreviewRequest")
      }
      api.adPreviewsCreate(adAccountId, adPreviewRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/targeting_analytics?adIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adTargetingAnalyticsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MetricsResponse = {
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_ids", "query string")
        }
        
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
        
      val targetingTypes = request.getQueryString("targeting_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("targeting_types", "query string")
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
        
      val attributionTypes = request.getQueryString("attribution_types")
        .map(value => )
        
      api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/analytics?startDate=[value]&endDate=[value]&adIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&pinIds=[value]&campaignIds=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdsAnalyticsResponseInner] = {
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
        
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
        
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
        
      val pinIds = request.queryString.get("pin_ids")
        .map(_.toList)
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      api.adsAnalytics(adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/ads
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdArrayResponse = {
      val adCreateRequest = request.body.asJson.map(_.as[List[AdCreateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adCreateRequest")
      }
      api.adsCreate(adAccountId, adCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/:adId
    * @param adAccountId Unique identifier of an ad account.
    * @param adId Unique identifier of an ad.
    */
  def adsGet(adAccountId: String, adId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdResponse = {
      api.adsGet(adAccountId, adId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads?campaignIds=[value]&adGroupIds=[value]&adIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsList200Response = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/ads
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdArrayResponse = {
      val adUpdateRequest = request.body.asJson.map(_.as[List[AdUpdateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adUpdateRequest")
      }
      api.adsUpdate(adAccountId, adUpdateRequest)
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
