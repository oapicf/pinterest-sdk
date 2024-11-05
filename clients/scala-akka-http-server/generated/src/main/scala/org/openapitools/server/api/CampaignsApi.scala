package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdsAnalyticsCampaignTargetingType
import org.openapitools.server.model.CampaignCreateRequest
import org.openapitools.server.model.CampaignCreateResponse
import org.openapitools.server.model.CampaignResponse
import org.openapitools.server.model.CampaignUpdateRequest
import org.openapitools.server.model.CampaignUpdateResponse
import org.openapitools.server.model.CampaignsAnalyticsResponseInner
import org.openapitools.server.model.CampaignsList200Response
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse


class CampaignsApi(
    campaignsService: CampaignsApiService,
    campaignsMarshaller: CampaignsApiMarshaller
) {

  import CampaignsApiPatterns.adAccountIdPattern
import CampaignsApiPatterns.campaignIdPattern

  import campaignsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?) { (campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) => 
            campaignsService.campaignTargetingAnalyticsGet(adAccountId = adAccountId, campaignIds = campaignIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "campaign_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            campaignsService.campaignsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, campaignIds = campaignIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      post {  
            entity(as[Seq[CampaignCreateRequest]]){ campaignCreateRequest =>
              campaignsService.campaignsCreate(adAccountId = adAccountId, campaignCreateRequest = campaignCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / campaignIdPattern) { (adAccountId, campaignId) => 
      get {  
            campaignsService.campaignsGet(adAccountId = adAccountId, campaignId = campaignId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (campaignIds, entityStatuses, pageSize, order, bookmark) => 
            campaignsService.campaignsList(adAccountId = adAccountId, campaignIds = campaignIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      patch {  
            entity(as[Seq[CampaignUpdateRequest]]){ campaignUpdateRequest =>
              campaignsService.campaignsUpdate(adAccountId = adAccountId, campaignUpdateRequest = campaignUpdateRequest)
            }
      }
    }
}

object CampaignsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val campaignIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CampaignsApiService {

  def campaignTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def campaignTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: MetricsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignTargetingAnalyticsGet(adAccountId: String, campaignIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String, attributionTypes: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def campaignsAnalytics200(responseCampaignsAnalyticsResponseInnerarray: Seq[CampaignsAnalyticsResponseInner])(implicit toEntityMarshallerCampaignsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[CampaignsAnalyticsResponseInner]]): Route =
    complete((200, responseCampaignsAnalyticsResponseInnerarray))
  def campaignsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[CampaignsAnalyticsResponseInner]
   * Code: 400, Message: Invalid ad account campaign analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsAnalytics(adAccountId: String, startDate: String, endDate: String, campaignIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerCampaignsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[CampaignsAnalyticsResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsCreate200(responseCampaignCreateResponse: CampaignCreateResponse)(implicit toEntityMarshallerCampaignCreateResponse: ToEntityMarshaller[CampaignCreateResponse]): Route =
    complete((200, responseCampaignCreateResponse))
  def campaignsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: CampaignCreateResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsCreate(adAccountId: String, campaignCreateRequest: Seq[CampaignCreateRequest])
      (implicit toEntityMarshallerCampaignCreateResponse: ToEntityMarshaller[CampaignCreateResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsGet200(responseCampaignResponse: CampaignResponse)(implicit toEntityMarshallerCampaignResponse: ToEntityMarshaller[CampaignResponse]): Route =
    complete((200, responseCampaignResponse))
  def campaignsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CampaignResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsGet(adAccountId: String, campaignId: String)
      (implicit toEntityMarshallerCampaignResponse: ToEntityMarshaller[CampaignResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsList200(responseCampaignsList200Response: CampaignsList200Response)(implicit toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response]): Route =
    complete((200, responseCampaignsList200Response))
  def campaignsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CampaignsList200Response
   * Code: 400, Message: Invalid ad account campaign parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsList(adAccountId: String, campaignIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsUpdate200(responseCampaignUpdateResponse: CampaignUpdateResponse)(implicit toEntityMarshallerCampaignUpdateResponse: ToEntityMarshaller[CampaignUpdateResponse]): Route =
    complete((200, responseCampaignUpdateResponse))
  def campaignsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: CampaignUpdateResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsUpdate(adAccountId: String, campaignUpdateRequest: Seq[CampaignUpdateRequest])
      (implicit toEntityMarshallerCampaignUpdateResponse: ToEntityMarshaller[CampaignUpdateResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CampaignsApiMarshaller {
  implicit def fromEntityUnmarshallerCampaignCreateRequestList: FromEntityUnmarshaller[Seq[CampaignCreateRequest]]

  implicit def fromEntityUnmarshallerCampaignUpdateRequestList: FromEntityUnmarshaller[Seq[CampaignUpdateRequest]]



  implicit def toEntityMarshallerCampaignResponse: ToEntityMarshaller[CampaignResponse]

  implicit def toEntityMarshallerCampaignCreateResponse: ToEntityMarshaller[CampaignCreateResponse]

  implicit def toEntityMarshallerCampaignsList200Response: ToEntityMarshaller[CampaignsList200Response]

  implicit def toEntityMarshallerCampaignUpdateResponse: ToEntityMarshaller[CampaignUpdateResponse]

  implicit def toEntityMarshallerCampaignsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[CampaignsAnalyticsResponseInner]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

}

