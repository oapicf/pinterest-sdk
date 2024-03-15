package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdsAnalyticsTargetingType
import model.CampaignCreateRequest
import model.CampaignCreateResponse
import model.CampaignResponse
import model.CampaignUpdateRequest
import model.CampaignUpdateResponse
import model.CampaignsAnalyticsResponseInner
import model.CampaignsList200Response
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class CampaignsApiController @Inject()(cc: ControllerComponents, api: CampaignsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/targeting_analytics?campaignIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]
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
        
      api.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/analytics?startDate=[value]&endDate=[value]&campaignIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[CampaignsAnalyticsResponseInner] = {
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
        
      api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
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
    def executeApi(): CampaignCreateResponse = {
      val campaignCreateRequest = request.body.asJson.map(_.as[List[CampaignCreateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignCreateRequest")
      }
      api.campaignsCreate(adAccountId, campaignCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns/:campaignId
    * @param adAccountId Unique identifier of an ad account.
    * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path.
    */
  def campaignsGet(adAccountId: String, campaignId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignResponse = {
      api.campaignsGet(adAccountId, campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/campaigns?campaignIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def campaignsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CampaignsList200Response = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)
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
    def executeApi(): CampaignUpdateResponse = {
      val campaignUpdateRequest = request.body.asJson.map(_.as[List[CampaignUpdateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "campaignUpdateRequest")
      }
      api.campaignsUpdate(adAccountId, campaignUpdateRequest)
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
