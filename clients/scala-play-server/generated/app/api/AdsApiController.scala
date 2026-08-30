package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Ad
import model.AdBatchUpdate
import model.AdBatchWriteResponseModel
import model.AdCreate
import model.AdPreviewRequest
import model.AdPreviewURLResponse
import model.AdsAnalytics
import model.AdsAnalyticsAdTargetingType
import model.AdsList200Response
import model.BigDecimal
import model.CampaignAdPreview
import model.CampaignAdPreviewCreate
import model.CampaignAdPreviewCreate200ResponseInner
import model.CampaignAdPreviewDelete200ResponseInner
import model.ConversionAttributionWindowDays
import model.ConversionReportAttributionType
import model.ConversionReportTimeType
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
    * GET /v5/ad_accounts/:adAccountId/ads/targeting_analytics?adIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]&reportingTimezone=[value]&sortColumns=[value]&sortAscending=[value]
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
        .map(value => )
        
      val engagementWindowDays = request.getQueryString("engagement_window_days")
        .map(value => )
        
      val viewWindowDays = request.getQueryString("view_window_days")
        .map(value => )
        
      val conversionReportTime = request.getQueryString("conversion_report_time")
        .map(value => )
        
      val attributionTypes = request.getQueryString("attribution_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val reportingTimezone = request.getQueryString("reporting_timezone")
        .map(value => )
        
      val sortColumns = request.queryString.get("sort_columns")
        .map(_.toList)
        
      val sortAscending = request.getQueryString("sort_ascending")
        .map(value => value.toBoolean)
        
      api.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/analytics?pinIds=[value]&startDate=[value]&endDate=[value]&adIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&campaignIds=[value]&reportingTimezone=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdsAnalytics] = {
      val pinIds = request.queryString.get("pin_ids")
        .map(_.toList)
        
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
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val reportingTimezone = request.getQueryString("reporting_timezone")
        .map(value => )
        
      api.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone)
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
    def executeApi(): AdBatchWriteResponseModel = {
      val adCreate = request.body.asJson.map(_.as[List[AdCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adCreate")
      }
      api.adsCreate(adAccountId, adCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads/:adId
    * @param adId The ID of this ad.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsGet(adId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Ad = {
      api.adsGet(adId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ads?bookmark=[value]&pageSize=[value]&order=[value]&campaignIds=[value]&adGroupIds=[value]&adIds=[value]&entityStatuses=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        
      val adIds = request.queryString.get("ad_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      api.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses)
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
    def executeApi(): AdBatchWriteResponseModel = {
      val adBatchUpdate = request.body.asJson.map(_.as[List[AdBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adBatchUpdate")
      }
      api.adsUpdate(adAccountId, adBatchUpdate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/campaign_ad_preview
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CampaignAdPreviewCreate200ResponseInner] = {
      val campaignAdPreviewCreate = request.body.asJson.map(_.as[List[CampaignAdPreviewCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignAdPreviewCreate")
      }
      api.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/ad_accounts/:adAccountId/campaign_ad_preview?adGroupIds=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewDelete(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CampaignAdPreviewDelete200ResponseInner] = {
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_group_ids", "query string")
        }
        
      api.campaignAdPreviewDelete(adGroupIds, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaign_ad_preview?adGroupIds=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignAdPreviewRead(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CampaignAdPreview] = {
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_group_ids", "query string")
        }
        
      api.campaignAdPreviewRead(adGroupIds, adAccountId)
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
