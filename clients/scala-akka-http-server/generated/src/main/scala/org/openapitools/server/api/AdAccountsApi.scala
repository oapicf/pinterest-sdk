package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccount
import org.openapitools.server.model.AdAccountAnalyticsResponseInner
import org.openapitools.server.model.AdAccountCreateRequest
import org.openapitools.server.model.AdAccountsList200Response
import org.openapitools.server.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.server.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.server.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.server.model.AdsAnalyticsTargetingType
import org.openapitools.server.model.ConversionReportAttributionType
import org.openapitools.server.model.CreateMMMReportRequest
import org.openapitools.server.model.CreateMMMReportResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetMMMReportResponse
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.MetricsResponse
import org.openapitools.server.model.TemplatesList200Response


class AdAccountsApi(
    adAccountsService: AdAccountsApiService,
    adAccountsMarshaller: AdAccountsApiMarshaller
) {

  import AdAccountsApiPatterns.adAccountIdPattern
import AdAccountsApiPatterns.templateIdPattern

  import adAccountsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            adAccountsService.adAccountAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "targeting_analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "targeting_types".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "attribution_types".as[String].?) { (startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes) => 
            adAccountsService.adAccountTargetingAnalyticsGet(adAccountId = adAccountId, startDate = startDate, endDate = endDate, targetingTypes = targetingTypes, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, attributionTypes = attributionTypes)
        }
      }
    } ~
    path("ad_accounts") { 
      post {  
            entity(as[AdAccountCreateRequest]){ adAccountCreateRequest =>
              adAccountsService.adAccountsCreate(adAccountCreateRequest = adAccountCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern) { (adAccountId) => 
      get {  
            adAccountsService.adAccountsGet(adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "include_shared_accounts".as[Boolean].?(true)) { (bookmark, pageSize, includeSharedAccounts) => 
            adAccountsService.adAccountsList(bookmark = bookmark, pageSize = pageSize, includeSharedAccounts = includeSharedAccounts)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "mmm_reports") { (adAccountId) => 
      post {  
            entity(as[CreateMMMReportRequest]){ createMMMReportRequest =>
              adAccountsService.analyticsCreateMmmReport(adAccountId = adAccountId, createMMMReportRequest = createMMMReportRequest)
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
    path("ad_accounts" / adAccountIdPattern / "templates" / templateIdPattern / "reports") { (adAccountId, templateId) => 
      post { 
        parameters("start_date".as[String].?, "end_date".as[String].?, "granularity".as[String].?) { (startDate, endDate, granularity) => 
            adAccountsService.analyticsCreateTemplateReport(adAccountId = adAccountId, templateId = templateId, startDate = startDate, endDate = endDate, granularity = granularity)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "mmm_reports") { (adAccountId) => 
      get { 
        parameters("token".as[String]) { (token) => 
            adAccountsService.analyticsGetMmmReport(adAccountId = adAccountId, token = token)
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
    path("ad_accounts" / adAccountIdPattern / "sandbox") { (adAccountId) => 
      delete {  
            adAccountsService.sandboxDelete(adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "templates") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            adAccountsService.templatesList(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    }
}

object AdAccountsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val templateIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AdAccountsApiService {

  def adAccountAnalytics200(responseAdAccountAnalyticsResponseInnerarray: Seq[AdAccountAnalyticsResponseInner])(implicit toEntityMarshallerAdAccountAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdAccountAnalyticsResponseInner]]): Route =
    complete((200, responseAdAccountAnalyticsResponseInnerarray))
  def adAccountAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[AdAccountAnalyticsResponseInner]
   * Code: 400, Message: Invalid ad account analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountAnalytics(adAccountId: String, startDate: String, endDate: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdAccountAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdAccountAnalyticsResponseInner]]): Route

  def adAccountTargetingAnalyticsGet200(responseMetricsResponse: MetricsResponse)(implicit toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route =
    complete((200, responseMetricsResponse))
  def adAccountTargetingAnalyticsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: MetricsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountTargetingAnalyticsGet(adAccountId: String, startDate: String, endDate: String, targetingTypes: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String, attributionTypes: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]): Route

  def adAccountsCreate200(responseAdAccount: AdAccount)(implicit toEntityMarshallerAdAccount: ToEntityMarshaller[AdAccount]): Route =
    complete((200, responseAdAccount))
  def adAccountsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccount
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountsCreate(adAccountCreateRequest: AdAccountCreateRequest)
      (implicit toEntityMarshallerAdAccount: ToEntityMarshaller[AdAccount], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsGet200(responseAdAccount: AdAccount)(implicit toEntityMarshallerAdAccount: ToEntityMarshaller[AdAccount]): Route =
    complete((200, responseAdAccount))
  def adAccountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccount
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountsGet(adAccountId: String)
      (implicit toEntityMarshallerAdAccount: ToEntityMarshaller[AdAccount], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsList200(responseAdAccountsList200Response: AdAccountsList200Response)(implicit toEntityMarshallerAdAccountsList200Response: ToEntityMarshaller[AdAccountsList200Response]): Route =
    complete((200, responseAdAccountsList200Response))
  def adAccountsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: AdAccountsList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountsList(bookmark: Option[String], pageSize: Int, includeSharedAccounts: Boolean)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdAccountsList200Response: ToEntityMarshaller[AdAccountsList200Response]): Route

  def analyticsCreateMmmReport200(responseCreateMMMReportResponse: CreateMMMReportResponse)(implicit toEntityMarshallerCreateMMMReportResponse: ToEntityMarshaller[CreateMMMReportResponse]): Route =
    complete((200, responseCreateMMMReportResponse))
  def analyticsCreateMmmReport400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def analyticsCreateMmmReportDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CreateMMMReportResponse
   * Code: 400, Message: Invalid ad account ads analytics mmm parameters, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def analyticsCreateMmmReport(adAccountId: String, createMMMReportRequest: CreateMMMReportRequest)
      (implicit toEntityMarshallerCreateMMMReportResponse: ToEntityMarshaller[CreateMMMReportResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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

  def analyticsCreateTemplateReport200(responseAdsAnalyticsCreateAsyncResponse: AdsAnalyticsCreateAsyncResponse)(implicit toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse]): Route =
    complete((200, responseAdsAnalyticsCreateAsyncResponse))
  def analyticsCreateTemplateReport400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def analyticsCreateTemplateReportDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdsAnalyticsCreateAsyncResponse
   * Code: 400, Message: Invalid ad account ads analytics template parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: Option[String], endDate: Option[String], granularity: Option[String])
      (implicit toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def analyticsGetMmmReport200(responseGetMMMReportResponse: GetMMMReportResponse)(implicit toEntityMarshallerGetMMMReportResponse: ToEntityMarshaller[GetMMMReportResponse]): Route =
    complete((200, responseGetMMMReportResponse))
  def analyticsGetMmmReport400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def analyticsGetMmmReportDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: GetMMMReportResponse
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def analyticsGetMmmReport(adAccountId: String, token: String)
      (implicit toEntityMarshallerGetMMMReportResponse: ToEntityMarshaller[GetMMMReportResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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

  def sandboxDelete200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  def sandboxDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def sandboxDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def sandboxDelete(adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def templatesList200(responseTemplatesList200Response: TemplatesList200Response)(implicit toEntityMarshallerTemplatesList200Response: ToEntityMarshaller[TemplatesList200Response]): Route =
    complete((200, responseTemplatesList200Response))
  def templatesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def templatesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TemplatesList200Response
   * Code: 400, Message: Invalid ad account template parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def templatesList(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerTemplatesList200Response: ToEntityMarshaller[TemplatesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdAccountsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateMMMReportRequest: FromEntityUnmarshaller[CreateMMMReportRequest]

  implicit def fromEntityUnmarshallerAdsAnalyticsCreateAsyncRequest: FromEntityUnmarshaller[AdsAnalyticsCreateAsyncRequest]

  implicit def fromEntityUnmarshallerAdAccountCreateRequest: FromEntityUnmarshaller[AdAccountCreateRequest]



  implicit def toEntityMarshallerGetMMMReportResponse: ToEntityMarshaller[GetMMMReportResponse]

  implicit def toEntityMarshallerAdsAnalyticsGetAsyncResponse: ToEntityMarshaller[AdsAnalyticsGetAsyncResponse]

  implicit def toEntityMarshallerAdAccount: ToEntityMarshaller[AdAccount]

  implicit def toEntityMarshallerCreateMMMReportResponse: ToEntityMarshaller[CreateMMMReportResponse]

  implicit def toEntityMarshallerTemplatesList200Response: ToEntityMarshaller[TemplatesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdsAnalyticsCreateAsyncResponse: ToEntityMarshaller[AdsAnalyticsCreateAsyncResponse]

  implicit def toEntityMarshallerMetricsResponse: ToEntityMarshaller[MetricsResponse]

  implicit def toEntityMarshallerAdAccountAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[AdAccountAnalyticsResponseInner]]

  implicit def toEntityMarshallerAdAccountsList200Response: ToEntityMarshaller[AdAccountsList200Response]

}

