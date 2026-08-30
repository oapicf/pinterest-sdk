package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdPinAnalytics
import model.AdsAnalyticsCampaignTargetingType
import model.BigDecimal
import model.Campaign
import model.CampaignBatchUpdateItem
import model.CampaignBatchWriteResponseModel
import model.CampaignCreateItem
import model.CampaignDeliveryEstimatesCampaign
import model.CampaignDeliveryEstimatesResponse
import model.CampaignsAnalyticsMetrics
import model.CampaignsList200Response
import model.ConversionReportAttributionType
import model.EntityStatus
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse
import model.PaginationOrder
import model.ReportingColumnSync
import model.ReportingTimeZone

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CampaignsApiController @Inject()(cc: ControllerComponents, api: CampaignsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/pins/analytics?campaignId=[value]&pinIds=[value]&startDate=[value]&endDate=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adPinsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdPinAnalytics] = {
      val campaignId = request.getQueryString("campaign_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("campaign_id", "query string")
        }
        
      val pinIds = request.queryString.get("pin_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pin_ids", "query string")
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
        
      api.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/targeting_analytics?campaignIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]&reportingTimezone=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignTargetingAnalyticsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MetricsResponse = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("campaign_ids", "query string")
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
        
      val attributionTypes = request.getQueryString("attribution_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val reportingTimezone = request.getQueryString("reporting_timezone")
        .map(value => )
        
      api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/analytics?startDate=[value]&endDate=[value]&campaignIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&aggregateReportRows=[value]&reportingTimezone=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CampaignsAnalyticsMetrics] = {
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
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("campaign_ids", "query string")
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
        
      val aggregateReportRows = request.getQueryString("aggregate_report_rows")
        .map(value => value.toBoolean)
        
      val reportingTimezone = request.getQueryString("reporting_timezone")
        .map(value => )
        
      api.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/campaigns
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignBatchWriteResponseModel = {
      val campaignCreateItem = request.body.asJson.map(_.as[List[CampaignCreateItem]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignCreateItem")
      }
      api.campaignsCreate(adAccountId, campaignCreateItem)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/:campaignId
    * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path.
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsGet(campaignId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Campaign = {
      api.campaignsGet(campaignId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns?bookmark=[value]&pageSize=[value]&order=[value]&campaignIds=[value]&entityStatuses=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      api.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/campaigns
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignBatchWriteResponseModel = {
      val campaignBatchUpdateItem = request.body.asJson.map(_.as[List[CampaignBatchUpdateItem]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignBatchUpdateItem")
      }
      api.campaignsUpdate(adAccountId, campaignBatchUpdateItem)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/campaigns/delivery_estimates
    * @param adAccountId Unique identifier of an ad account.
    */
  def getCampaignDeliveryEstimates(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignDeliveryEstimatesResponse = {
      val campaignDeliveryEstimatesCampaign = request.body.asJson.map(_.as[List[CampaignDeliveryEstimatesCampaign]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignDeliveryEstimatesCampaign")
      }
      api.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)
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
