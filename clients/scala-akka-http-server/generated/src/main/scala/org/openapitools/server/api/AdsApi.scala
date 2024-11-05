package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdArrayResponse
import org.openapitools.server.model.AdCreateRequest
import org.openapitools.server.model.AdPreviewRequest
import org.openapitools.server.model.AdPreviewURLResponse
import org.openapitools.server.model.AdResponse
import org.openapitools.server.model.AdUpdateRequest
import org.openapitools.server.model.AdsAnalyticsAdTargetingType
import org.openapitools.server.model.AdsAnalyticsResponseInner
import org.openapitools.server.model.AdsList200Response
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse


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
        parameters("ad_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?) { (adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) => 
            adsService.adTargetingAnalyticsGet(adAccountId = adAccountId, adIds = adIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "ad_ids".as[String].?, "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "pin_ids".as[String].?, "campaign_ids".as[String].?) { (startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds) => 
            adsService.adsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, columns = columns, granularity = granularity, adIds = adIds, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, pinIds = pinIds, campaignIds = campaignIds)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      post {  
            entity(as[Seq[AdCreateRequest]]){ adCreateRequest =>
              adsService.adsCreate(adAccountId = adAccountId, adCreateRequest = adCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / adIdPattern) { (adAccountId, adId) => 
      get {  
            adsService.adsGet(adAccountId = adAccountId, adId = adId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "ad_group_ids".as[String].?, "ad_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark) => 
            adsService.adsList(adAccountId = adAccountId, campaignIds = campaignIds, adGroupIds = adGroupIds, adIds = adIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      patch {  
            entity(as[Seq[AdUpdateRequest]]){ adUpdateRequest =>
              adsService.adsUpdate(adAccountId = adAccountId, adUpdateRequest = adUpdateRequest)
            }
      }
    }
}

object AdsApiPatterns {

    val adIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AdsApiService {

  def adPreviewsCreate200(responseAdPreviewURLResponse: AdPreviewURLResponse)(implicit toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse]): Route =
    complete((200, responseAdPreviewURLResponse))
  def adPreviewsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adPreviewsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Successful ad preview creation., DataType: AdPreviewURLResponse
   * Code: 400, Message: Invalid Pin parameters response, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adPreviewsCreate(adAccountId: String, adPreviewRequest: AdPreviewRequest)
      (implicit toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def adTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: MetricsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adTargetingAnalyticsGet(adAccountId: String, adIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String, attributionTypes: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def adsAnalytics200(responseAdsAnalyticsResponseInnerarray: Seq[AdsAnalyticsResponseInner])(implicit toEntityMarshallerAdsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdsAnalyticsResponseInner]]): Route =
    complete((200, responseAdsAnalyticsResponseInnerarray))
  def adsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[AdsAnalyticsResponseInner]
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsAnalytics(adAccountId: String, startDate: String, endDate: String, columns: String, granularity: String, adIds: Option[String], clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String, pinIds: Option[String], campaignIds: Option[String])
      (implicit toEntityMarshallerAdsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdsAnalyticsResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsCreate200(responseAdArrayResponse: AdArrayResponse)(implicit toEntityMarshallerAdArrayResponse: ToEntityMarshaller[AdArrayResponse]): Route =
    complete((200, responseAdArrayResponse))
  def adsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdArrayResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsCreate(adAccountId: String, adCreateRequest: Seq[AdCreateRequest])
      (implicit toEntityMarshallerAdArrayResponse: ToEntityMarshaller[AdArrayResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsGet200(responseAdResponse: AdResponse)(implicit toEntityMarshallerAdResponse: ToEntityMarshaller[AdResponse]): Route =
    complete((200, responseAdResponse))
  def adsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsGet(adAccountId: String, adId: String)
      (implicit toEntityMarshallerAdResponse: ToEntityMarshaller[AdResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsList200(responseAdsList200Response: AdsList200Response)(implicit toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response]): Route =
    complete((200, responseAdsList200Response))
  def adsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdsList200Response
   * Code: 400, Message: Invalid ad account ads parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsList(adAccountId: String, campaignIds: Option[String], adGroupIds: Option[String], adIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsUpdate200(responseAdArrayResponse: AdArrayResponse)(implicit toEntityMarshallerAdArrayResponse: ToEntityMarshaller[AdArrayResponse]): Route =
    complete((200, responseAdArrayResponse))
  def adsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdArrayResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsUpdate(adAccountId: String, adUpdateRequest: Seq[AdUpdateRequest])
      (implicit toEntityMarshallerAdArrayResponse: ToEntityMarshaller[AdArrayResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdsApiMarshaller {
  implicit def fromEntityUnmarshallerAdCreateRequestList: FromEntityUnmarshaller[Seq[AdCreateRequest]]

  implicit def fromEntityUnmarshallerAdPreviewRequest: FromEntityUnmarshaller[AdPreviewRequest]

  implicit def fromEntityUnmarshallerAdUpdateRequestList: FromEntityUnmarshaller[Seq[AdUpdateRequest]]



  implicit def toEntityMarshallerAdResponse: ToEntityMarshaller[AdResponse]

  implicit def toEntityMarshallerAdPreviewURLResponse: ToEntityMarshaller[AdPreviewURLResponse]

  implicit def toEntityMarshallerAdsList200Response: ToEntityMarshaller[AdsList200Response]

  implicit def toEntityMarshallerAdsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdsAnalyticsResponseInner]]

  implicit def toEntityMarshallerAdArrayResponse: ToEntityMarshaller[AdArrayResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

}

