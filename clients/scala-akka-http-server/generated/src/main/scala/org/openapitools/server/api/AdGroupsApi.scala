package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdGroup
import org.openapitools.server.model.AdGroupAudienceSizing
import org.openapitools.server.model.AdGroupAudienceSizingCreate
import org.openapitools.server.model.AdGroupCreateCreate
import org.openapitools.server.model.AdGroupUpdateBatchUpdate
import org.openapitools.server.model.AdGroupsAnalyticsMetrics
import org.openapitools.server.model.AdGroupsCreate200Response
import org.openapitools.server.model.AdGroupsList200Response
import org.openapitools.server.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.server.model.BidFloor
import org.openapitools.server.model.BidFloorCreate
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.DynamicTitlesDownloadCSV
import org.openapitools.server.model.DynamicTitlesGetStatus
import org.openapitools.server.model.DynamicTitlesProcessCSV
import org.openapitools.server.model.DynamicTitlesProcessCSVCreate
import org.openapitools.server.model.DynamicTitlesUploadURL
import org.openapitools.server.model.EntityStatus
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.ReportingColumnSync
import org.openapitools.server.model.ReportingTimeZone


class AdGroupsApi(
    adGroupsService: AdGroupsApiService,
    adGroupsMarshaller: AdGroupsApiMarshaller
) {

  import AdGroupsApiPatterns.adGroupIdPattern
import AdGroupsApiPatterns.adAccountIdPattern

  import adGroupsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "ad_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "aggregate_report_rows".as[Boolean].?(false), "reporting_timezone".as[String].?) { (startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone) => 
            adGroupsService.adGroupsAnalytics(startDate = startDate, endDate = endDate, adGroupIds = adGroupIds, columns = columns, granularity = granularity, adAccountId = adAccountId, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, aggregateReportRows = aggregateReportRows, reportingTimezone = reportingTimezone)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "audience_sizing") { (adAccountId) => 
      post {  
            entity(as[AdGroupAudienceSizingCreate]){ adGroupAudienceSizingCreate =>
              adGroupsService.adGroupsAudienceSizing(adAccountId = adAccountId, adGroupAudienceSizingCreate = adGroupAudienceSizingCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "bid_floor") { (adAccountId) => 
      post {  
            entity(as[BidFloorCreate]){ bidFloorCreate =>
              adGroupsService.adGroupsBidFloorGet(adAccountId = adAccountId, bidFloorCreate = bidFloorCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      post {  
            entity(as[Seq[AdGroupCreateCreate]]){ adGroupCreateCreate =>
              adGroupsService.adGroupsCreate(adAccountId = adAccountId, adGroupCreateCreate = adGroupCreateCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern / "dynamic_titles" / "csv") { (adAccountId, adGroupId) => 
      get {  
            adGroupsService.adGroupsDynamicTitlesDownloadCsv(adAccountId = adAccountId, adGroupId = adGroupId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern / "dynamic_titles" / "status") { (adAccountId, adGroupId) => 
      get {  
            adGroupsService.adGroupsDynamicTitlesGetStatus(adAccountId = adAccountId, adGroupId = adGroupId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern / "dynamic_titles" / "uploads") { (adAccountId, adGroupId) => 
      get {  
            adGroupsService.adGroupsDynamicTitlesGetUploadUrl(adAccountId = adAccountId, adGroupId = adGroupId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern / "dynamic_titles") { (adAccountId, adGroupId) => 
      post {  
            entity(as[DynamicTitlesProcessCSVCreate]){ dynamicTitlesProcessCSVCreate =>
              adGroupsService.adGroupsDynamicTitlesProcessCsv(adAccountId = adAccountId, adGroupId = adGroupId, dynamicTitlesProcessCSVCreate = dynamicTitlesProcessCSVCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern) { (adGroupId, adAccountId) => 
      get {  
            adGroupsService.adGroupsGet(adGroupId = adGroupId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "campaign_ids".as[String].?, "ad_group_ids".as[String].?, "entity_statuses".as[String].?, "translate_interests_to_names".as[Boolean].?(false)) { (bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames) => 
            adGroupsService.adGroupsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, campaignIds = campaignIds, adGroupIds = adGroupIds, entityStatuses = entityStatuses, translateInterestsToNames = translateInterestsToNames)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("ad_group_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?, "reporting_timezone".as[String].?, "sort_columns".as[String].?, "sort_ascending".as[Boolean].?) { (adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending) => 
            adGroupsService.adGroupsTargetingAnalyticsGet(adAccountId = adAccountId, adGroupIds = adGroupIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes, reportingTimezone = reportingTimezone, sortColumns = sortColumns, sortAscending = sortAscending)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      patch {  
            entity(as[Seq[AdGroupUpdateBatchUpdate]]){ adGroupUpdateBatchUpdate =>
              adGroupsService.adGroupsUpdate(adAccountId = adAccountId, adGroupUpdateBatchUpdate = adGroupUpdateBatchUpdate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "promotion_applied_entities") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "promotion_ids".as[String]) { (bookmark, pageSize, order, promotionIds) => 
            adGroupsService.getAdGroupsByPromotionIdsList(adAccountId = adAccountId, promotionIds = promotionIds, bookmark = bookmark, pageSize = pageSize, order = order)
        }
      }
    }
}

object AdGroupsApiPatterns {

    val adGroupIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait AdGroupsApiService {

  def adGroupsAnalytics200(responseAdGroupsAnalyticsMetricsarray: Seq[AdGroupsAnalyticsMetrics])(implicit toEntityMarshallerAdGroupsAnalyticsMetricsarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsMetrics]]): Route =
    complete((200, responseAdGroupsAnalyticsMetricsarray))
  def adGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[AdGroupsAnalyticsMetrics]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsAnalytics(startDate: String, endDate: String, adGroupIds: String, columns: String, granularity: String, adAccountId: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, aggregateReportRows: Boolean, reportingTimezone: Option[String])
      (implicit toEntityMarshallerAdGroupsAnalyticsMetricsarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsMetrics]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsAudienceSizing200(responseAdGroupAudienceSizing: AdGroupAudienceSizing)(implicit toEntityMarshallerAdGroupAudienceSizing: ToEntityMarshaller[AdGroupAudienceSizing]): Route =
    complete((200, responseAdGroupAudienceSizing))
  def adGroupsAudienceSizing201(responseAdGroupAudienceSizing: AdGroupAudienceSizing)(implicit toEntityMarshallerAdGroupAudienceSizing: ToEntityMarshaller[AdGroupAudienceSizing]): Route =
    complete((201, responseAdGroupAudienceSizing))
  def adGroupsAudienceSizing400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsAudienceSizing401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsAudienceSizing403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsAudienceSizing404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsAudienceSizing429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsAudienceSizingDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroupAudienceSizing
   * Code: 201, Message: Resource create operation completed successfully., DataType: AdGroupAudienceSizing
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingCreate: AdGroupAudienceSizingCreate)
      (implicit toEntityMarshallerAdGroupAudienceSizing: ToEntityMarshaller[AdGroupAudienceSizing], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsBidFloorGet200(responseBidFloor: BidFloor)(implicit toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor]): Route =
    complete((200, responseBidFloor))
  def adGroupsBidFloorGet201(responseBidFloor: BidFloor)(implicit toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor]): Route =
    complete((201, responseBidFloor))
  def adGroupsBidFloorGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsBidFloorGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsBidFloorGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsBidFloorGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsBidFloorGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsBidFloorGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BidFloor
   * Code: 201, Message: Resource create operation completed successfully., DataType: BidFloor
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsBidFloorGet(adAccountId: String, bidFloorCreate: BidFloorCreate)
      (implicit toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsCreate200(responseAdGroupsCreate200Response: AdGroupsCreate200Response)(implicit toEntityMarshallerAdGroupsCreate200Response: ToEntityMarshaller[AdGroupsCreate200Response]): Route =
    complete((200, responseAdGroupsCreate200Response))
  def adGroupsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroupsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsCreate(adAccountId: String, adGroupCreateCreate: Seq[AdGroupCreateCreate])
      (implicit toEntityMarshallerAdGroupsCreate200Response: ToEntityMarshaller[AdGroupsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsDynamicTitlesDownloadCsv200(responseDynamicTitlesDownloadCSV: DynamicTitlesDownloadCSV)(implicit toEntityMarshallerDynamicTitlesDownloadCSV: ToEntityMarshaller[DynamicTitlesDownloadCSV]): Route =
    complete((200, responseDynamicTitlesDownloadCSV))
  def adGroupsDynamicTitlesDownloadCsv400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsDynamicTitlesDownloadCsv401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsDynamicTitlesDownloadCsv403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsDynamicTitlesDownloadCsv404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsDynamicTitlesDownloadCsv429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsDynamicTitlesDownloadCsvDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DynamicTitlesDownloadCSV
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsDynamicTitlesDownloadCsv(adAccountId: String, adGroupId: String)
      (implicit toEntityMarshallerDynamicTitlesDownloadCSV: ToEntityMarshaller[DynamicTitlesDownloadCSV], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsDynamicTitlesGetStatus200(responseDynamicTitlesGetStatus: DynamicTitlesGetStatus)(implicit toEntityMarshallerDynamicTitlesGetStatus: ToEntityMarshaller[DynamicTitlesGetStatus]): Route =
    complete((200, responseDynamicTitlesGetStatus))
  def adGroupsDynamicTitlesGetStatus400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsDynamicTitlesGetStatus401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsDynamicTitlesGetStatus403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsDynamicTitlesGetStatus404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsDynamicTitlesGetStatus429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsDynamicTitlesGetStatusDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DynamicTitlesGetStatus
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsDynamicTitlesGetStatus(adAccountId: String, adGroupId: String)
      (implicit toEntityMarshallerDynamicTitlesGetStatus: ToEntityMarshaller[DynamicTitlesGetStatus], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsDynamicTitlesGetUploadUrl200(responseDynamicTitlesUploadURL: DynamicTitlesUploadURL)(implicit toEntityMarshallerDynamicTitlesUploadURL: ToEntityMarshaller[DynamicTitlesUploadURL]): Route =
    complete((200, responseDynamicTitlesUploadURL))
  def adGroupsDynamicTitlesGetUploadUrl400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsDynamicTitlesGetUploadUrl401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsDynamicTitlesGetUploadUrl403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsDynamicTitlesGetUploadUrl404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsDynamicTitlesGetUploadUrl429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsDynamicTitlesGetUploadUrlDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DynamicTitlesUploadURL
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsDynamicTitlesGetUploadUrl(adAccountId: String, adGroupId: String)
      (implicit toEntityMarshallerDynamicTitlesUploadURL: ToEntityMarshaller[DynamicTitlesUploadURL], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsDynamicTitlesProcessCsv200(responseDynamicTitlesProcessCSV: DynamicTitlesProcessCSV)(implicit toEntityMarshallerDynamicTitlesProcessCSV: ToEntityMarshaller[DynamicTitlesProcessCSV]): Route =
    complete((200, responseDynamicTitlesProcessCSV))
  def adGroupsDynamicTitlesProcessCsv201(responseDynamicTitlesProcessCSV: DynamicTitlesProcessCSV)(implicit toEntityMarshallerDynamicTitlesProcessCSV: ToEntityMarshaller[DynamicTitlesProcessCSV]): Route =
    complete((201, responseDynamicTitlesProcessCSV))
  def adGroupsDynamicTitlesProcessCsv400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsDynamicTitlesProcessCsv401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsDynamicTitlesProcessCsv403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsDynamicTitlesProcessCsv404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsDynamicTitlesProcessCsv429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsDynamicTitlesProcessCsvDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DynamicTitlesProcessCSV
   * Code: 201, Message: Resource create operation completed successfully., DataType: DynamicTitlesProcessCSV
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsDynamicTitlesProcessCsv(adAccountId: String, adGroupId: String, dynamicTitlesProcessCSVCreate: DynamicTitlesProcessCSVCreate)
      (implicit toEntityMarshallerDynamicTitlesProcessCSV: ToEntityMarshaller[DynamicTitlesProcessCSV], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsGet200(responseAdGroup: AdGroup)(implicit toEntityMarshallerAdGroup: ToEntityMarshaller[AdGroup]): Route =
    complete((200, responseAdGroup))
  def adGroupsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroup
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsGet(adGroupId: String, adAccountId: String)
      (implicit toEntityMarshallerAdGroup: ToEntityMarshaller[AdGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsList200(responseAdGroupsList200Response: AdGroupsList200Response)(implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response]): Route =
    complete((200, responseAdGroupsList200Response))
  def adGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroupsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], campaignIds: Option[String], adGroupIds: Option[String], entityStatuses: Option[String], translateInterestsToNames: Boolean)
      (implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def adGroupsTargetingAnalyticsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsTargetingAnalyticsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsTargetingAnalyticsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsTargetingAnalyticsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsTargetingAnalyticsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: MetricsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, attributionTypes: Option[String], reportingTimezone: Option[String], sortColumns: Option[String], sortAscending: Option[Boolean])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def adGroupsUpdate200(responseAdGroupsCreate200Response: AdGroupsCreate200Response)(implicit toEntityMarshallerAdGroupsCreate200Response: ToEntityMarshaller[AdGroupsCreate200Response]): Route =
    complete((200, responseAdGroupsCreate200Response))
  def adGroupsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adGroupsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adGroupsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adGroupsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroupsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adGroupsUpdate(adAccountId: String, adGroupUpdateBatchUpdate: Seq[AdGroupUpdateBatchUpdate])
      (implicit toEntityMarshallerAdGroupsCreate200Response: ToEntityMarshaller[AdGroupsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getAdGroupsByPromotionIdsList200(responseAdGroupsList200Response: AdGroupsList200Response)(implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response]): Route =
    complete((200, responseAdGroupsList200Response))
  def getAdGroupsByPromotionIdsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getAdGroupsByPromotionIdsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getAdGroupsByPromotionIdsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getAdGroupsByPromotionIdsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getAdGroupsByPromotionIdsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getAdGroupsByPromotionIdsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdGroupsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getAdGroupsByPromotionIdsList(adAccountId: String, promotionIds: String, bookmark: Option[String], pageSize: Int, order: Option[String])
      (implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdGroupsApiMarshaller {
  implicit def fromEntityUnmarshallerAdGroupAudienceSizingCreate: FromEntityUnmarshaller[AdGroupAudienceSizingCreate]

  implicit def fromEntityUnmarshallerAdGroupUpdateBatchUpdateList: FromEntityUnmarshaller[Seq[AdGroupUpdateBatchUpdate]]

  implicit def fromEntityUnmarshallerDynamicTitlesProcessCSVCreate: FromEntityUnmarshaller[DynamicTitlesProcessCSVCreate]

  implicit def fromEntityUnmarshallerBidFloorCreate: FromEntityUnmarshaller[BidFloorCreate]

  implicit def fromEntityUnmarshallerAdGroupCreateCreateList: FromEntityUnmarshaller[Seq[AdGroupCreateCreate]]



  implicit def toEntityMarshallerAdGroupsCreate200Response: ToEntityMarshaller[AdGroupsCreate200Response]

  implicit def toEntityMarshallerDynamicTitlesDownloadCSV: ToEntityMarshaller[DynamicTitlesDownloadCSV]

  implicit def toEntityMarshallerAdGroupsAnalyticsMetricsarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsMetrics]]

  implicit def toEntityMarshallerAdGroupAudienceSizing: ToEntityMarshaller[AdGroupAudienceSizing]

  implicit def toEntityMarshallerDynamicTitlesGetStatus: ToEntityMarshaller[DynamicTitlesGetStatus]

  implicit def toEntityMarshallerDynamicTitlesUploadURL: ToEntityMarshaller[DynamicTitlesUploadURL]

  implicit def toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor]

  implicit def toEntityMarshallerAdGroup: ToEntityMarshaller[AdGroup]

  implicit def toEntityMarshallerDynamicTitlesProcessCSV: ToEntityMarshaller[DynamicTitlesProcessCSV]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

}

