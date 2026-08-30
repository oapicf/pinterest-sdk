package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Ad
import org.openapitools.server.model.AdBatchUpdate
import org.openapitools.server.model.AdBatchWriteResponseModel
import org.openapitools.server.model.AdCreate
import org.openapitools.server.model.AdPreviewRequest
import org.openapitools.server.model.AdPreviewURLResponse
import org.openapitools.server.model.AdsAnalytics
import org.openapitools.server.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.model.AdsList200Response
import org.openapitools.server.model.CampaignAdPreview
import org.openapitools.server.model.CampaignAdPreviewCreate
import org.openapitools.server.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.server.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.server.model.ConversionAttributionWindowDays
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.ConversionReportTimeType
import org.openapitools.server.model.EntityStatus
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.ReportingColumnSync
import org.openapitools.server.model.ReportingTimeZone


class AdsApi(
    adsService: AdsApiService,
    adsMarshaller: AdsApiMarshaller
) {

  import AdsApiPatterns.adIdPattern
import AdsApiPatterns.adAccountIdPattern

  import adsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "ad_previews") { (adAccountId) => 
      post {  
            entity(as[AdPreviewRequest]){ adPreviewRequest =>
              adsService.adPreviewsCreate(adAccountId = adAccountId, adPreviewRequest = adPreviewRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("ad_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[String].?, "engagement_window_days".as[String].?, "view_window_days".as[String].?, "conversion_report_time".as[String].?, "attribution_types".as[String].?, "reporting_timezone".as[String].?, "sort_columns".as[String].?, "sort_ascending".as[Boolean].?) { (adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending) => 
            adsService.adTargetingAnalyticsGet(adAccountId = adAccountId, adIds = adIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes, reportingTimezone = reportingTimezone, sortColumns = sortColumns, sortAscending = sortAscending)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / "analytics") { (adAccountId) => 
      get { 
        parameters("pin_ids".as[String].?, "start_date".as[String], "end_date".as[String], "ad_ids".as[String].?, "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "campaign_ids".as[String].?, "reporting_timezone".as[String].?) { (pinIds, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone) => 
            adsService.adsAnalytics(startDate = startDate, endDate = endDate, columns = columns, granularity = granularity, adAccountId = adAccountId, pinIds = pinIds, adIds = adIds, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, campaignIds = campaignIds, reportingTimezone = reportingTimezone)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      post {  
            entity(as[Seq[AdCreate]]){ adCreate =>
              adsService.adsCreate(adAccountId = adAccountId, adCreate = adCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / adIdPattern) { (adId, adAccountId) => 
      get {  
            adsService.adsGet(adId = adId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "campaign_ids".as[String].?, "ad_group_ids".as[String].?, "ad_ids".as[String].?, "entity_statuses".as[String].?) { (bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses) => 
            adsService.adsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, campaignIds = campaignIds, adGroupIds = adGroupIds, adIds = adIds, entityStatuses = entityStatuses)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      patch {  
            entity(as[Seq[AdBatchUpdate]]){ adBatchUpdate =>
              adsService.adsUpdate(adAccountId = adAccountId, adBatchUpdate = adBatchUpdate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaign_ad_preview") { (adAccountId) => 
      post {  
            entity(as[Seq[CampaignAdPreviewCreate]]){ campaignAdPreviewCreate =>
              adsService.campaignAdPreviewCreate(adAccountId = adAccountId, campaignAdPreviewCreate = campaignAdPreviewCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaign_ad_preview") { (adAccountId) => 
      delete { 
        parameters("ad_group_ids".as[String]) { (adGroupIds) => 
            adsService.campaignAdPreviewDelete(adGroupIds = adGroupIds, adAccountId = adAccountId)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaign_ad_preview") { (adAccountId) => 
      get { 
        parameters("ad_group_ids".as[String]) { (adGroupIds) => 
            adsService.campaignAdPreviewRead(adGroupIds = adGroupIds, adAccountId = adAccountId)
        }
      }
    }
}

object AdsApiPatterns {

    val adIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait AdsApiService {

  def adPreviewsCreate200(responseAdPreviewURLResponse: AdPreviewURLResponse)(implicit toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse]): Route =
    complete((200, responseAdPreviewURLResponse))
  def adPreviewsCreate201(responseAdPreviewURLResponse: AdPreviewURLResponse)(implicit toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse]): Route =
    complete((201, responseAdPreviewURLResponse))
  def adPreviewsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adPreviewsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adPreviewsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adPreviewsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adPreviewsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adPreviewsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdPreviewURLResponse
   * Code: 201, Message: Resource create operation completed successfully., DataType: AdPreviewURLResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest)
      (implicit toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def adTargetingAnalyticsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adTargetingAnalyticsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adTargetingAnalyticsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adTargetingAnalyticsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adTargetingAnalyticsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
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
  def adTargetingAnalyticsGet(adAccountId: String, adIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Option[String], engagementWindowDays: Option[String], viewWindowDays: Option[String], conversionReportTime: Option[String], attributionTypes: Option[String], reportingTimezone: Option[String], sortColumns: Option[String], sortAscending: Option[Boolean])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def adsAnalytics200(responseAdsAnalyticsarray: Seq[AdsAnalytics])(implicit toEntityMarshallerAdsAnalyticsarray: ToEntityMarshaller[Seq[AdsAnalytics]]): Route =
    complete((200, responseAdsAnalyticsarray))
  def adsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[AdsAnalytics]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsAnalytics(startDate: String, endDate: String, columns: String, granularity: String, adAccountId: String, pinIds: Option[String], adIds: Option[String], clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, campaignIds: Option[String], reportingTimezone: Option[String])
      (implicit toEntityMarshallerAdsAnalyticsarray: ToEntityMarshaller[Seq[AdsAnalytics]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsCreate200(responseAdBatchWriteResponseModel: AdBatchWriteResponseModel)(implicit toEntityMarshallerAdBatchWriteResponseModel: ToEntityMarshaller[AdBatchWriteResponseModel]): Route =
    complete((200, responseAdBatchWriteResponseModel))
  def adsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdBatchWriteResponseModel
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsCreate(adAccountId: String, adCreate: Seq[AdCreate])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdBatchWriteResponseModel: ToEntityMarshaller[AdBatchWriteResponseModel]): Route

  def adsGet200(responseAd: Ad)(implicit toEntityMarshallerAd: ToEntityMarshaller[Ad]): Route =
    complete((200, responseAd))
  def adsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Ad
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsGet(adId: String, adAccountId: String)
      (implicit toEntityMarshallerAd: ToEntityMarshaller[Ad], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsList200(responseAdsList200Response: AdsList200Response)(implicit toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response]): Route =
    complete((200, responseAdsList200Response))
  def adsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], campaignIds: Option[String], adGroupIds: Option[String], adIds: Option[String], entityStatuses: Option[String])
      (implicit toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsUpdate200(responseAdBatchWriteResponseModel: AdBatchWriteResponseModel)(implicit toEntityMarshallerAdBatchWriteResponseModel: ToEntityMarshaller[AdBatchWriteResponseModel]): Route =
    complete((200, responseAdBatchWriteResponseModel))
  def adsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdBatchWriteResponseModel
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adsUpdate(adAccountId: String, adBatchUpdate: Seq[AdBatchUpdate])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdBatchWriteResponseModel: ToEntityMarshaller[AdBatchWriteResponseModel]): Route

  def campaignAdPreviewCreate200(responseCampaignAdPreviewCreate200ResponseInnerarray: Seq[CampaignAdPreviewCreate200ResponseInner])(implicit toEntityMarshallerCampaignAdPreviewCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewCreate200ResponseInner]]): Route =
    complete((200, responseCampaignAdPreviewCreate200ResponseInnerarray))
  def campaignAdPreviewCreate201(responseCampaignAdPreviewarray: Seq[CampaignAdPreview])(implicit toEntityMarshallerCampaignAdPreviewarray: ToEntityMarshaller[Seq[CampaignAdPreview]]): Route =
    complete((201, responseCampaignAdPreviewarray))
  def campaignAdPreviewCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignAdPreviewCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignAdPreviewCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignAdPreviewCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignAdPreviewCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignAdPreviewCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CampaignAdPreviewCreate200ResponseInner]
   * Code: 201, Message: Resource create operation completed successfully., DataType: Seq[CampaignAdPreview]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignAdPreviewCreate(adAccountId: String, campaignAdPreviewCreate: Seq[CampaignAdPreviewCreate])
      (implicit toEntityMarshallerCampaignAdPreviewCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewCreate200ResponseInner]], toEntityMarshallerCampaignAdPreviewarray: ToEntityMarshaller[Seq[CampaignAdPreview]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignAdPreviewDelete200(responseCampaignAdPreviewDelete200ResponseInnerarray: Seq[CampaignAdPreviewDelete200ResponseInner])(implicit toEntityMarshallerCampaignAdPreviewDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewDelete200ResponseInner]]): Route =
    complete((200, responseCampaignAdPreviewDelete200ResponseInnerarray))
  def campaignAdPreviewDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def campaignAdPreviewDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignAdPreviewDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignAdPreviewDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignAdPreviewDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignAdPreviewDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignAdPreviewDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CampaignAdPreviewDelete200ResponseInner]
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignAdPreviewDelete(adGroupIds: String, adAccountId: String)
      (implicit toEntityMarshallerCampaignAdPreviewDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewDelete200ResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignAdPreviewRead200(responseCampaignAdPreviewarray: Seq[CampaignAdPreview])(implicit toEntityMarshallerCampaignAdPreviewarray: ToEntityMarshaller[Seq[CampaignAdPreview]]): Route =
    complete((200, responseCampaignAdPreviewarray))
  def campaignAdPreviewRead400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignAdPreviewRead401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def campaignAdPreviewRead403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def campaignAdPreviewRead404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def campaignAdPreviewRead429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def campaignAdPreviewReadDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CampaignAdPreview]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def campaignAdPreviewRead(adGroupIds: String, adAccountId: String)
      (implicit toEntityMarshallerCampaignAdPreviewarray: ToEntityMarshaller[Seq[CampaignAdPreview]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdsApiMarshaller {
  implicit def fromEntityUnmarshallerAdCreateList: FromEntityUnmarshaller[Seq[AdCreate]]

  implicit def fromEntityUnmarshallerCampaignAdPreviewCreateList: FromEntityUnmarshaller[Seq[CampaignAdPreviewCreate]]

  implicit def fromEntityUnmarshallerAdPreviewRequest: FromEntityUnmarshaller[AdPreviewRequest]

  implicit def fromEntityUnmarshallerAdBatchUpdateList: FromEntityUnmarshaller[Seq[AdBatchUpdate]]



  implicit def toEntityMarshallerAd: ToEntityMarshaller[Ad]

  implicit def toEntityMarshallerAdsAnalyticsarray: ToEntityMarshaller[Seq[AdsAnalytics]]

  implicit def toEntityMarshallerCampaignAdPreviewCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewCreate200ResponseInner]]

  implicit def toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse]

  implicit def toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response]

  implicit def toEntityMarshallerCampaignAdPreviewarray: ToEntityMarshaller[Seq[CampaignAdPreview]]

  implicit def toEntityMarshallerCampaignAdPreviewDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CampaignAdPreviewDelete200ResponseInner]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

  implicit def toEntityMarshallerAdBatchWriteResponseModel: ToEntityMarshaller[AdBatchWriteResponseModel]

}

