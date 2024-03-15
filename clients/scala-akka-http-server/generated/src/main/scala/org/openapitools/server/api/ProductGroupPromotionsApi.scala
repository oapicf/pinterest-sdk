package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.ProductGroupAnalyticsResponseInner
import org.openapitools.server.model.ProductGroupPromotionCreateRequest
import org.openapitools.server.model.ProductGroupPromotionResponse
import org.openapitools.server.model.ProductGroupPromotionUpdateRequest
import org.openapitools.server.model.ProductGroupPromotionsList200Response


class ProductGroupPromotionsApi(
    productGroupPromotionsService: ProductGroupPromotionsApiService,
    productGroupPromotionsMarshaller: ProductGroupPromotionsApiMarshaller
) {

  import ProductGroupPromotionsApiPatterns.productGroupPromotionIdPattern
import ProductGroupPromotionsApiPatterns.adAccountIdPattern

  import productGroupPromotionsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "product_group_promotions") { (adAccountId) => 
      post {  
            entity(as[ProductGroupPromotionCreateRequest]){ productGroupPromotionCreateRequest =>
              productGroupPromotionsService.productGroupPromotionsCreate(adAccountId = adAccountId, productGroupPromotionCreateRequest = productGroupPromotionCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_group_promotions" / productGroupPromotionIdPattern) { (adAccountId, productGroupPromotionId) => 
      get {  
            productGroupPromotionsService.productGroupPromotionsGet(adAccountId = adAccountId, productGroupPromotionId = productGroupPromotionId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_group_promotions") { (adAccountId) => 
      get { 
        parameters("product_group_promotion_ids".as[String].?, "entity_statuses".as[String].?, "ad_group_id".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark) => 
            productGroupPromotionsService.productGroupPromotionsList(adAccountId = adAccountId, productGroupPromotionIds = productGroupPromotionIds, entityStatuses = entityStatuses, adGroupId = adGroupId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_group_promotions") { (adAccountId) => 
      patch {  
            entity(as[ProductGroupPromotionUpdateRequest]){ productGroupPromotionUpdateRequest =>
              productGroupPromotionsService.productGroupPromotionsUpdate(adAccountId = adAccountId, productGroupPromotionUpdateRequest = productGroupPromotionUpdateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_groups" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "product_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Int].?(30), "engagement_window_days".as[Int].?(30), "view_window_days".as[Int].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION")) { (startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime) => 
            productGroupPromotionsService.productGroupsAnalytics(adAccountId = adAccountId, startDate = startDate, endDate = endDate, productGroupIds = productGroupIds, columns = columns, granularity = granularity, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime)
        }
      }
    }
}

object ProductGroupPromotionsApiPatterns {

    val productGroupPromotionIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ProductGroupPromotionsApiService {

  def productGroupPromotionsCreate200(responseProductGroupPromotionResponse: ProductGroupPromotionResponse)(implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse]): Route =
    complete((200, responseProductGroupPromotionResponse))
  def productGroupPromotionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ProductGroupPromotionResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest)
      (implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsGet200(responseProductGroupPromotionResponse: ProductGroupPromotionResponse)(implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse]): Route =
    complete((200, responseProductGroupPromotionResponse))
  def productGroupPromotionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ProductGroupPromotionResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String)
      (implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsList200(responseProductGroupPromotionsList200Response: ProductGroupPromotionsList200Response)(implicit toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response]): Route =
    complete((200, responseProductGroupPromotionsList200Response))
  def productGroupPromotionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ProductGroupPromotionsList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupPromotionsList(adAccountId: String, productGroupPromotionIds: Option[String], entityStatuses: Option[String], adGroupId: Option[String], pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsUpdate200(responseProductGroupPromotionResponse: ProductGroupPromotionResponse)(implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse]): Route =
    complete((200, responseProductGroupPromotionResponse))
  def productGroupPromotionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ProductGroupPromotionResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest)
      (implicit toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupsAnalytics200(responseProductGroupAnalyticsResponseInnerarray: Seq[ProductGroupAnalyticsResponseInner])(implicit toEntityMarshallerProductGroupAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsResponseInner]]): Route =
    complete((200, responseProductGroupAnalyticsResponseInnerarray))
  def productGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[ProductGroupAnalyticsResponseInner]
   * Code: 400, Message: Invalid ad account ads analytics parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def productGroupsAnalytics(adAccountId: String, startDate: String, endDate: String, productGroupIds: String, columns: String, granularity: String, clickWindowDays: Int, engagementWindowDays: Int, viewWindowDays: Int, conversionReportTime: String)
      (implicit toEntityMarshallerProductGroupAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ProductGroupPromotionsApiMarshaller {
  implicit def fromEntityUnmarshallerProductGroupPromotionCreateRequest: FromEntityUnmarshaller[ProductGroupPromotionCreateRequest]

  implicit def fromEntityUnmarshallerProductGroupPromotionUpdateRequest: FromEntityUnmarshaller[ProductGroupPromotionUpdateRequest]



  implicit def toEntityMarshallerProductGroupAnalyticsResponseInnerarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsResponseInner]]

  implicit def toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response]

  implicit def toEntityMarshallerProductGroupPromotionResponse: ToEntityMarshaller[ProductGroupPromotionResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

