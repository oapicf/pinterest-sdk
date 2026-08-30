package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdGroup
import model.AdGroupAudienceSizing
import model.AdGroupAudienceSizingCreate
import model.AdGroupCreateCreate
import model.AdGroupUpdateBatchUpdate
import model.AdGroupsAnalyticsMetrics
import model.AdGroupsCreate200Response
import model.AdGroupsList200Response
import model.AdsAnalyticsAdGroupTargetingType
import model.BidFloor
import model.BidFloorCreate
import model.BigDecimal
import model.ConversionReportAttributionType
import model.DynamicTitlesDownloadCSV
import model.DynamicTitlesGetStatus
import model.DynamicTitlesProcessCSV
import model.DynamicTitlesProcessCSVCreate
import model.DynamicTitlesUploadURL
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
class AdGroupsApiController @Inject()(cc: ControllerComponents, api: AdGroupsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/analytics?startDate=[value]&endDate=[value]&adGroupIds=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&aggregateReportRows=[value]&reportingTimezone=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsAnalytics(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[AdGroupsAnalyticsMetrics] = {
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
        
      api.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)
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
    def executeApi(): AdGroupAudienceSizing = {
      val adGroupAudienceSizingCreate = request.body.asJson.map(_.as[AdGroupAudienceSizingCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adGroupAudienceSizingCreate")
      }
      api.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate)
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
      val bidFloorCreate = request.body.asJson.map(_.as[BidFloorCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "bidFloorCreate")
      }
      api.adGroupsBidFloorGet(adAccountId, bidFloorCreate)
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
    def executeApi(): AdGroupsCreate200Response = {
      val adGroupCreateCreate = request.body.asJson.map(_.as[List[AdGroupCreateCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adGroupCreateCreate")
      }
      api.adGroupsCreate(adAccountId, adGroupCreateCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId/dynamic_titles/csv
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DynamicTitlesDownloadCSV = {
      api.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId/dynamic_titles/status
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DynamicTitlesGetStatus = {
      api.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId/dynamic_titles/uploads
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DynamicTitlesUploadURL = {
      api.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId/dynamic_titles
    * @param adAccountId Unique identifier of an ad account.
    * @param adGroupId Ad group ID.
    */
  def adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DynamicTitlesProcessCSV = {
      val dynamicTitlesProcessCSVCreate = request.body.asJson.map(_.as[DynamicTitlesProcessCSVCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "dynamicTitlesProcessCSVCreate")
      }
      api.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/:adGroupId
    * @param adGroupId Ad group ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsGet(adGroupId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroup = {
      api.adGroupsGet(adGroupId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups?bookmark=[value]&pageSize=[value]&order=[value]&campaignIds=[value]&adGroupIds=[value]&entityStatuses=[value]&translateInterestsToNames=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adGroupsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val adGroupIds = request.queryString.get("ad_group_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      val translateInterestsToNames = request.getQueryString("translate_interests_to_names")
        .map(value => value.toBoolean)
        
      api.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/ad_groups/targeting_analytics?adGroupIds=[value]&startDate=[value]&endDate=[value]&targetingTypes=[value]&columns=[value]&granularity=[value]&clickWindowDays=[value]&engagementWindowDays=[value]&viewWindowDays=[value]&conversionReportTime=[value]&attributionTypes=[value]&reportingTimezone=[value]&sortColumns=[value]&sortAscending=[value]
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
        
      val sortColumns = request.queryString.get("sort_columns")
        .map(_.toList)
        
      val sortAscending = request.getQueryString("sort_ascending")
        .map(value => value.toBoolean)
        
      api.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending)
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
    def executeApi(): AdGroupsCreate200Response = {
      val adGroupUpdateBatchUpdate = request.body.asJson.map(_.as[List[AdGroupUpdateBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adGroupUpdateBatchUpdate")
      }
      api.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/promotion_applied_entities?bookmark=[value]&pageSize=[value]&order=[value]&promotionIds=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def getAdGroupsByPromotionIdsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdGroupsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val promotionIds = request.queryString.get("promotion_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("promotion_ids", "query string")
        }
        
      api.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order)
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
