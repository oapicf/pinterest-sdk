package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdPinAnalytics
import org.openapitools.server.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.server.model.Campaign
import org.openapitools.server.model.CampaignBatchUpdateItem
import org.openapitools.server.model.CampaignBatchWriteResponseModel
import org.openapitools.server.model.CampaignCreateItem
import org.openapitools.server.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.server.model.CampaignDeliveryEstimatesResponse
import org.openapitools.server.model.CampaignsAnalyticsMetrics
import org.openapitools.server.model.CampaignsList200Response
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.EntityStatus
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.ReportingColumnSync
import org.openapitools.server.model.ReportingTimeZone


class CampaignsApi(
    campaignsService: CampaignsApiService,
    campaignsMarshaller: CampaignsApiMarshaller
) {

  import CampaignsApiPatterns.adAccountIdPattern
import CampaignsApiPatterns.campaignIdPattern

  import campaignsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "pins" / "analytics") { (adAccountId) => 
      get { 
        parameters("campaign_id".as[String], "pin_ids".as[String], "start_date".as[String], "end_date".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (campaignId, pinIds, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            campaignsService.adPinsAnalytics(campaignId = campaignId, pinIds = pinIds, startDate = startDate, endDate = endDate, columns = columns, granularity = granularity, adAccountId = adAccountId, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?, "reporting_timezone".as[String].?) { (campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone) => 
            campaignsService.campaignTargetingAnalyticsGet(adAccountId = adAccountId, campaignIds = campaignIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes, reportingTimezone = reportingTimezone)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "campaign_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "aggregate_report_rows".as[Boolean].?(false), "reporting_timezone".as[String].?) { (startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone) => 
            campaignsService.campaignsAnalytics(startDate = startDate, endDate = endDate, campaignIds = campaignIds, columns = columns, granularity = granularity, adAccountId = adAccountId, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, aggregateReportRows = aggregateReportRows, reportingTimezone = reportingTimezone)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      post {  
            entity(as[Seq[CampaignCreateItem]]){ campaignCreateItem =>
              campaignsService.campaignsCreate(adAccountId = adAccountId, campaignCreateItem = campaignCreateItem)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / campaignIdPattern) { (campaignId, adAccountId) => 
      get {  
            campaignsService.campaignsGet(campaignId = campaignId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "campaign_ids".as[String].?, "entity_statuses".as[String].?) { (bookmark, pageSize, order, campaignIds, entityStatuses) => 
            campaignsService.campaignsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, campaignIds = campaignIds, entityStatuses = entityStatuses)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      patch {  
            entity(as[Seq[CampaignBatchUpdateItem]]){ campaignBatchUpdateItem =>
              campaignsService.campaignsUpdate(adAccountId = adAccountId, campaignBatchUpdateItem = campaignBatchUpdateItem)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "delivery_estimates") { (adAccountId) => 
      post {  
            entity(as[Seq[CampaignDeliveryEstimatesCampaign]]){ campaignDeliveryEstimatesCampaign =>
              campaignsService.getCampaignDeliveryEstimates(adAccountId = adAccountId, campaignDeliveryEstimatesCampaign = campaignDeliveryEstimatesCampaign)
            }
      }
    }
}

object CampaignsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val campaignIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CampaignsApiService {

  def adPinsAnalytics200(responseAdPinAnalyticsarray: Seq[AdPinAnalytics])(implicit toEntityMarshallerAdPinAnalyticsarray: ToEntityMarshaller[Seq[AdPinAnalytics]]): Route =
    complete((200, responseAdPinAnalyticsarray))
  def adPinsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adPinsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adPinsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adPinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adPinsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adPinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[AdPinAnalytics]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adPinsAnalytics(campaignId: String, pinIds: String, startDate: String, endDate: String, columns: String, granularity: String, adAccountId: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String)
      (implicit toEntityMarshallerAdPinAnalyticsarray: ToEntityMarshaller[Seq[AdPinAnalytics]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def campaignTargetingAnalyticsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignTargetingAnalyticsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignTargetingAnalyticsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignTargetingAnalyticsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignTargetingAnalyticsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
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
  def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, attributionTypes: Option[String], reportingTimezone: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def campaignsAnalytics200(responseCampaignsAnalyticsMetricsarray: Seq[CampaignsAnalyticsMetrics])(implicit toEntityMarshallerCampaignsAnalyticsMetricsarray: ToEntityMarshaller[Seq[CampaignsAnalyticsMetrics]]): Route =
    complete((200, responseCampaignsAnalyticsMetricsarray))
  def campaignsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CampaignsAnalyticsMetrics]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignsAnalytics(startDate: String, endDate: String, campaignIds: String, columns: String, granularity: String, adAccountId: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, aggregateReportRows: Boolean, reportingTimezone: Option[String])
      (implicit toEntityMarshallerCampaignsAnalyticsMetricsarray: ToEntityMarshaller[Seq[CampaignsAnalyticsMetrics]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsCreate200(responseCampaignBatchWriteResponseModel: CampaignBatchWriteResponseModel)(implicit toEntityMarshallerCampaignBatchWriteResponseModel: ToEntityMarshaller[CampaignBatchWriteResponseModel]): Route =
    complete((200, responseCampaignBatchWriteResponseModel))
  def campaignsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CampaignBatchWriteResponseModel
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignsCreate(adAccountId: String, campaignCreateItem: Seq[CampaignCreateItem])
      (implicit toEntityMarshallerCampaignBatchWriteResponseModel: ToEntityMarshaller[CampaignBatchWriteResponseModel], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsGet200(responseCampaign: Campaign)(implicit toEntityMarshallerCampaign: ToEntityMarshaller[Campaign]): Route =
    complete((200, responseCampaign))
  def campaignsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Campaign
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignsGet(campaignId: String, adAccountId: String)
      (implicit toEntityMarshallerCampaign: ToEntityMarshaller[Campaign], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsList200(responseCampaignsList200Response: CampaignsList200Response)(implicit toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response]): Route =
    complete((200, responseCampaignsList200Response))
  def campaignsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CampaignsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], campaignIds: Option[String], entityStatuses: Option[String])
      (implicit toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsUpdate200(responseCampaignBatchWriteResponseModel: CampaignBatchWriteResponseModel)(implicit toEntityMarshallerCampaignBatchWriteResponseModel: ToEntityMarshaller[CampaignBatchWriteResponseModel]): Route =
    complete((200, responseCampaignBatchWriteResponseModel))
  def campaignsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CampaignBatchWriteResponseModel
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignsUpdate(adAccountId: String, campaignBatchUpdateItem: Seq[CampaignBatchUpdateItem])
      (implicit toEntityMarshallerCampaignBatchWriteResponseModel: ToEntityMarshaller[CampaignBatchWriteResponseModel], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getCampaignDeliveryEstimates200(responseCampaignDeliveryEstimatesResponse: CampaignDeliveryEstimatesResponse)(implicit toEntityMarshallerCampaignDeliveryEstimatesResponse: ToEntityMarshaller[CampaignDeliveryEstimatesResponse]): Route =
    complete((200, responseCampaignDeliveryEstimatesResponse))
  def getCampaignDeliveryEstimates400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getCampaignDeliveryEstimates401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getCampaignDeliveryEstimates403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getCampaignDeliveryEstimates404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getCampaignDeliveryEstimates429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getCampaignDeliveryEstimates503(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((503, responseError))
  def getCampaignDeliveryEstimatesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CampaignDeliveryEstimatesResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 503, Message: The service is temporarily unavailable., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getCampaignDeliveryEstimates(adAccountId: String, campaignDeliveryEstimatesCampaign: Seq[CampaignDeliveryEstimatesCampaign])
      (implicit toEntityMarshallerCampaignDeliveryEstimatesResponse: ToEntityMarshaller[CampaignDeliveryEstimatesResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CampaignsApiMarshaller {
  implicit def fromEntityUnmarshallerCampaignCreateItemList: FromEntityUnmarshaller[Seq[CampaignCreateItem]]

  implicit def fromEntityUnmarshallerCampaignBatchUpdateItemList: FromEntityUnmarshaller[Seq[CampaignBatchUpdateItem]]

  implicit def fromEntityUnmarshallerCampaignDeliveryEstimatesCampaignList: FromEntityUnmarshaller[Seq[CampaignDeliveryEstimatesCampaign]]



  implicit def toEntityMarshallerCampaignsAnalyticsMetricsarray: ToEntityMarshaller[Seq[CampaignsAnalyticsMetrics]]

  implicit def toEntityMarshallerAdPinAnalyticsarray: ToEntityMarshaller[Seq[AdPinAnalytics]]

  implicit def toEntityMarshallerCampaignDeliveryEstimatesResponse: ToEntityMarshaller[CampaignDeliveryEstimatesResponse]

  implicit def toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCampaignBatchWriteResponseModel: ToEntityMarshaller[CampaignBatchWriteResponseModel]

  implicit def toEntityMarshallerCampaign: ToEntityMarshaller[Campaign]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

}

