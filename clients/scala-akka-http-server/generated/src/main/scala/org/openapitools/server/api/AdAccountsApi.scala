package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.model.AnyType
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.Paginated


class AdAccountsApi(
    adAccountsService: AdAccountsApiService,
    adAccountsMarshaller: AdAccountsApiMarshaller
) {

  import AdAccountsApiPatterns.adAccountIdPattern

  import adAccountsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.adAccountAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "include_shared_accounts".as[Boolean].?(true)) { (bookmark, pageSize, includeSharedAccounts) => 
            adAccountsService.adAccountsList(bookmark = bookmark, pageSize = pageSize, includeSharedAccounts = includeSharedAccounts)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "ad_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.adGroupsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, adGroupIds = adGroupIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ad_groups") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "ad_group_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?, "translate_interests_to_names".as[Boolean].?(false)) { (campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames) => 
            adAccountsService.adGroupsList(adAccountId = adAccountId, campaignIds = campaignIds, adGroupIds = adGroupIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark, translateInterestsToNames = translateInterestsToNames)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "ad_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.adsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, adIds = adIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "ads") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "ad_group_ids".as[String].?, "ad_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark) => 
            adAccountsService.adsList(adAccountId = adAccountId, campaignIds = campaignIds, adGroupIds = adGroupIds, adIds = adIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "reports") { (adAccountId) => 
      post {  
            entity(as[AdsAnalyticsCreateAsyncRequest]){ adsAnalyticsCreateAsyncRequest =>
              adAccountsService.analyticsCreateReport(adAccountId = adAccountId, adsAnalyticsCreateAsyncRequest = adsAnalyticsCreateAsyncRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "reports") { (adAccountId) => 
      get { 
        parameters("token".as[String]) { (token) => 
            adAccountsService.analyticsGetReport(adAccountId = adAccountId, token = token)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "campaign_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.campaignsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, campaignIds = campaignIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "campaigns") { (adAccountId) => 
      get { 
        parameters("campaign_ids".as[String].?, "entity_statuses".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (campaignIds, entityStatuses, pageSize, order, bookmark) => 
            adAccountsService.campaignsList(adAccountId = adAccountId, campaignIds = campaignIds, entityStatuses = entityStatuses, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_groups" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "product_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.productGroupsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, productGroupIds = productGroupIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    }
}

object AdAccountsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AdAccountsApiService {

  def adAccountAnalytics200(responseAnyarray: Seq[Map[String, Any]])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Map[String, Any]]]): Route =
    complete((200, responseAnyarray))
  def adAccountAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Map[String, Any]]
   * Code: 400, Message: Invalid ad account analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountAnalytics(adAccountId: String, startDate: String, endDate: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def adAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Paginated
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountsList(bookmark: Option[String], pageSize: Int, includeSharedAccounts: Boolean)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsAnalytics200(responseAnyarray: Seq[Map[String, Any]])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Map[String, Any]]]): Route =
    complete((200, responseAnyarray))
  def adGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Map[String, Any]]
   * Code: 400, Message: Invalid ad account group analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsAnalytics(adAccountId: String, startDate: String, endDate: String, adGroupIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adGroupsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def adGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid ad account group parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adGroupsList(adAccountId: String, campaignIds: Option[String], adGroupIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String], translateInterestsToNames: Boolean)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsAnalytics200(responseAnyarray: Seq[Map[String, Any]])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Map[String, Any]]]): Route =
    complete((200, responseAnyarray))
  def adsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Map[String, Any]]
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsAnalytics(adAccountId: String, startDate: String, endDate: String, adIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def adsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid ad account ads parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adsList(adAccountId: String, campaignIds: Option[String], adGroupIds: Option[String], adIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def analyticsCreateReport200(responseAdsAnalyticsCreateAsyncResponse: AdsAnalyticsCreateAsyncResponse)(implicit toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse]): Route =
    complete((200, responseAdsAnalyticsCreateAsyncResponse))
  def analyticsCreateReport400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def analyticsCreateReportDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdsAnalyticsCreateAsyncResponse
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest)
      (implicit toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def analyticsGetReport200(responseAdsAnalyticsGetAsyncResponse: AdsAnalyticsGetAsyncResponse)(implicit toEntityMarshallerAdsAnalyticsGetAsyncResponse: ToEntityMarshaller[AdsAnalyticsGetAsyncResponse]): Route =
    complete((200, responseAdsAnalyticsGetAsyncResponse))
  def analyticsGetReport400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def analyticsGetReportDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdsAnalyticsGetAsyncResponse
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def analyticsGetReport(adAccountId: String, token: String)
      (implicit toEntityMarshallerAdsAnalyticsGetAsyncResponse: ToEntityMarshaller[AdsAnalyticsGetAsyncResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsAnalytics200(responseAnyarray: Seq[Map[String, Any]])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Map[String, Any]]]): Route =
    complete((200, responseAnyarray))
  def campaignsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Map[String, Any]]
   * Code: 400, Message: Invalid ad account campaign analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsAnalytics(adAccountId: String, startDate: String, endDate: String, campaignIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def campaignsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def campaignsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def campaignsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid ad account campaign parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def campaignsList(adAccountId: String, campaignIds: Option[String], entityStatuses: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupsAnalytics200(responseAnyarray: Seq[Map[String, Any]])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Map[String, Any]]]): Route =
    complete((200, responseAnyarray))
  def productGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Map[String, Any]]
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupsAnalytics(adAccountId: String, startDate: String, endDate: String, productGroupIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdAccountsApiMarshaller {
  implicit def fromEntityUnmarshallerAdsAnalyticsCreateAsyncRequest: FromEntityUnmarshaller[AdsAnalyticsCreateAsyncRequest]



  implicit def toEntityMarshallerAdsAnalyticsGetAsyncResponse: ToEntityMarshaller[AdsAnalyticsGetAsyncResponse]

  implicit def toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse]

}

