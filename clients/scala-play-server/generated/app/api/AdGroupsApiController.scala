package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdGroupArrayResponse
import model.AdGroupAudienceSizingRequest
import model.AdGroupAudienceSizingResponse
import model.AdGroupCreateRequest
import model.AdGroupResponse
import model.AdGroupUpdateRequest
import model.AdGroupsAnalyticsResponseInner
import model.AdGroupsList200Response
import model.AdsAnalyticsTargetingType
import model.BidFloor
import model.BidFloorRequest
import model.ConversionReportAttributionType
import model.Error
import model.Granularity
import java.time.LocalDate
import model.MetricsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class AdGroupsApiController @Inject()(cc: ControllerComponents, api: AdGroupsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/analytics?startDate=[value]&endDate=[value]&adGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdGroupsAnalyticsResponseInner] = {
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
        
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_group_ids", "query string")
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
        
      api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/ad_groups/audience_sizing
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsAudienceSizing(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupAudienceSizingResponse = {
      val adGroupAudienceSizingRequest = request.body.asJson.map(_.as[AdGroupAudienceSizingRequest])
      api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/bid_floor
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsBidFloorGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BidFloor = {
      val bidFloorRequest = request.body.asJson.map(_.as[BidFloorRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "bidFloorRequest")
      }
      api.adGroupsBidFloorGet(adAccountId, bidFloorRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/ad_groups
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupArrayResponse = {
      val adGroupCreateRequest = request.body.asJson.map(_.as[List[AdGroupCreateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adGroupCreateRequest")
      }
      api.adGroupsCreate(adAccountId, adGroupCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Unique identifier of an ad group.
    */
  def adGroupsGet(adAccountId: String, adGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupResponse = {
      api.adGroupsGet(adAccountId, adGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups?campaignIds=[value]&adGroupIds=[value]&entityStatuses=[value]&pageSize=[value]&order=[value]&bookmark=[value]&translateInterestsToNames=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupsList200Response = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      val translateInterestsToNames = request.getQueryString("translate_interests_to_names")
        .map(value => value.toBoolean)
        
      api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/targeting_analytics?adGroupIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsTargetingAnalyticsGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MetricsResponse = {
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ad_group_ids", "query string")
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
        
      api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/ad_groups
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupArrayResponse = {
      val adGroupUpdateRequest = request.body.asJson.map(_.as[List[AdGroupUpdateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adGroupUpdateRequest")
      }
      api.adGroupsUpdate(adAccountId, adGroupUpdateRequest)
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
