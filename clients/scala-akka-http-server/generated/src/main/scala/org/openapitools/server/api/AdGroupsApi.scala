package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdGroupArrayResponse
import org.openapitools.server.model.AdGroupAudienceSizingRequest
import org.openapitools.server.model.AdGroupAudienceSizingResponse
import org.openapitools.server.model.AdGroupCreateRequest
import org.openapitools.server.model.AdGroupResponse
import org.openapitools.server.model.AdGroupUpdateRequest
import org.openapitools.server.model.AdGroupsAnalyticsResponseInner
import org.openapitools.server.model.AdGroupsList200Response
import org.openapitools.server.model.AdsAnalyticsTargetingType
import org.openapitools.server.model.BidFloor
import org.openapitools.server.model.BidFloorRequest
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse


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
        parameters("start_date".as[String], "end_date".as[String], "ad_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adGroupsService.adGroupsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, adGroupIds = adGroupIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "audience_sizing") { (adAccountId) => 
      post {  
            entity(as[AdGroupAudienceSizingRequest]){ adGroupAudienceSizingRequest =>
              adGroupsService.adGroupsAudienceSizing(adAccountId = adAccountId, adGroupAudienceSizingRequest = adGroupAudienceSizingRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "bid_floor") { (adAccountId) => 
      post {  
            entity(as[BidFloorRequest]){ bidFloorRequest =>
              adGroupsService.adGroupsBidFloorGet(adAccountId = adAccountId, bidFloorRequest = bidFloorRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      post {  
            entity(as[Seq[AdGroupCreateRequest]]){ adGroupCreateRequest =>
              adGroupsService.adGroupsCreate(adAccountId = adAccountId, adGroupCreateRequest = adGroupCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / adGroupIdPattern) { (adAccountId, adGroupId) => 
      get {  
            adGroupsService.adGroupsGet(adAccountId = adAccountId, adGroupId = adGroupId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "ad_group_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?, "translate_interests_to_names".as[Boolean].?(false)) { (campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames) => 
            adGroupsService.adGroupsList(adAccountId = adAccountId, campaignIds = campaignIds, adGroupIds = adGroupIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark, translateInterestsToNames = translateInterestsToNames)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("ad_group_ids".as[String], "start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?) { (adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) => 
            adGroupsService.adGroupsTargetingAnalyticsGet(adAccountId = adAccountId, adGroupIds = adGroupIds, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      patch {  
            entity(as[Seq[AdGroupUpdateRequest]]){ adGroupUpdateRequest =>
              adGroupsService.adGroupsUpdate(adAccountId = adAccountId, adGroupUpdateRequest = adGroupUpdateRequest)
            }
      }
    }
}

object AdGroupsApiPatterns {

    val adGroupIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AdGroupsApiService {

  def adGroupsAnalytics200(responseAdGroupsAnalyticsResponseInnerarray: Seq[AdGroupsAnalyticsResponseInner])(implicit toEntityMarshallerAdGroupsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsResponseInner]]): Route =
    complete((200, responseAdGroupsAnalyticsResponseInnerarray))
  def adGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[AdGroupsAnalyticsResponseInner]
   * Code: 400, Message: Invalid ad account group analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsAnalytics(adAccountId: String, startDate: String, endDate: String, adGroupIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerAdGroupsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsAudienceSizing200(responseAdGroupAudienceSizingResponse: AdGroupAudienceSizingResponse)(implicit toEntityMarshallerAdGroupAudienceSizingResponse: ToEntityMarshaller[AdGroupAudienceSizingResponse]): Route =
    complete((200, responseAdGroupAudienceSizingResponse))
  def adGroupsAudienceSizing400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsAudienceSizing403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adGroupsAudienceSizingDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdGroupAudienceSizingResponse
   * Code: 400, Message: Invalid ad group audience sizing parameters., DataType: Error
   * Code: 403, Message: No access to requested audience list or product group., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsAudienceSizing(adAccountId: String, adGroupAudienceSizingRequest: Option[AdGroupAudienceSizingRequest])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdGroupAudienceSizingResponse: ToEntityMarshaller[AdGroupAudienceSizingResponse]): Route

  def adGroupsBidFloorGet200(responseBidFloor: BidFloor)(implicit toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor]): Route =
    complete((200, responseBidFloor))
  def adGroupsBidFloorGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BidFloor
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsBidFloorGet(adAccountId: String, bidFloorRequest: BidFloorRequest)
      (implicit toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsCreate200(responseAdGroupArrayResponse: AdGroupArrayResponse)(implicit toEntityMarshallerAdGroupArrayResponse: ToEntityMarshaller[AdGroupArrayResponse]): Route =
    complete((200, responseAdGroupArrayResponse))
  def adGroupsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdGroupArrayResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsCreate(adAccountId: String, adGroupCreateRequest: Seq[AdGroupCreateRequest])
      (implicit toEntityMarshallerAdGroupArrayResponse: ToEntityMarshaller[AdGroupArrayResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsGet200(responseAdGroupResponse: AdGroupResponse)(implicit toEntityMarshallerAdGroupResponse: ToEntityMarshaller[AdGroupResponse]): Route =
    complete((200, responseAdGroupResponse))
  def adGroupsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdGroupResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsGet(adAccountId: String, adGroupId: String)
      (implicit toEntityMarshallerAdGroupResponse: ToEntityMarshaller[AdGroupResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsList200(responseAdGroupsList200Response: AdGroupsList200Response)(implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response]): Route =
    complete((200, responseAdGroupsList200Response))
  def adGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdGroupsList200Response
   * Code: 400, Message: Invalid ad account group parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsList(adAccountId: String, campaignIds: Option[String], adGroupIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String], translateInterestsToNames: Boolean)
      (implicit toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def adGroupsTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: MetricsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsTargetingAnalyticsGet(adAccountId: String, adGroupIds: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String, attributionTypes: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def adGroupsUpdate200(responseAdGroupArrayResponse: AdGroupArrayResponse)(implicit toEntityMarshallerAdGroupArrayResponse: ToEntityMarshaller[AdGroupArrayResponse]): Route =
    complete((200, responseAdGroupArrayResponse))
  def adGroupsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdGroupArrayResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsUpdate(adAccountId: String, adGroupUpdateRequest: Seq[AdGroupUpdateRequest])
      (implicit toEntityMarshallerAdGroupArrayResponse: ToEntityMarshaller[AdGroupArrayResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdGroupsApiMarshaller {
  implicit def fromEntityUnmarshallerAdGroupAudienceSizingRequest: FromEntityUnmarshaller[AdGroupAudienceSizingRequest]

  implicit def fromEntityUnmarshallerAdGroupUpdateRequestList: FromEntityUnmarshaller[Seq[AdGroupUpdateRequest]]

  implicit def fromEntityUnmarshallerAdGroupCreateRequestList: FromEntityUnmarshaller[Seq[AdGroupCreateRequest]]

  implicit def fromEntityUnmarshallerBidFloorRequest: FromEntityUnmarshaller[BidFloorRequest]



  implicit def toEntityMarshallerBidFloor: ToEntityMarshaller[BidFloor]

  implicit def toEntityMarshallerAdGroupsAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdGroupsAnalyticsResponseInner]]

  implicit def toEntityMarshallerAdGroupArrayResponse: ToEntityMarshaller[AdGroupArrayResponse]

  implicit def toEntityMarshallerAdGroupResponse: ToEntityMarshaller[AdGroupResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdGroupsList200Response: ToEntityMarshaller[AdGroupsList200Response]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

  implicit def toEntityMarshallerAdGroupAudienceSizingResponse: ToEntityMarshaller[AdGroupAudienceSizingResponse]

}

