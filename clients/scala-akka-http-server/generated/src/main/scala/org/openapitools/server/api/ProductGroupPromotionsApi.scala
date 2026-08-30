package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.EntityStatus
import org.openapitools.server.model.Error
import org.openapitools.server.model.Granularity
import java.time.LocalDate
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.ProductGroupAnalyticsItems
import org.openapitools.server.model.ProductGroupPromotion
import org.openapitools.server.model.ProductGroupPromotions
import org.openapitools.server.model.ProductGroupPromotionsCreate
import org.openapitools.server.model.ProductGroupPromotionsList200Response
import org.openapitools.server.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.server.model.ReportingColumnSync
import org.openapitools.server.model.ReportingTimeZone


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
            entity(as[ProductGroupPromotionsCreate]){ productGroupPromotionsCreate =>
              productGroupPromotionsService.productGroupPromotionsCreate(adAccountId = adAccountId, productGroupPromotionsCreate = productGroupPromotionsCreate)
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
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "product_group_promotion_ids".as[String].?, "entity_statuses".as[String].?, "ad_group_id".as[String].?) { (bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId) => 
            productGroupPromotionsService.productGroupPromotionsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, productGroupPromotionIds = productGroupPromotionIds, entityStatuses = entityStatuses, adGroupId = adGroupId)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_group_promotions") { (adAccountId) => 
      patch {  
            entity(as[ProductGroupPromotionsUpdateWithRequiredBody]){ productGroupPromotionsUpdateWithRequiredBody =>
              productGroupPromotionsService.productGroupPromotionsUpdate(adAccountId = adAccountId, productGroupPromotionsUpdateWithRequiredBody = productGroupPromotionsUpdateWithRequiredBody)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "product_groups" / "analytics") { (adAccountId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "product_group_ids".as[String], "columns".as[String], "granularity".as[String], "click_window_days".as[Double].?(30), "engagement_window_days".as[Double].?(30), "view_window_days".as[Double].?(1), "conversion_report_time".as[String].?("TIME_OF_AD_ACTION"), "reporting_timezone".as[String].?) { (startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone) => 
            productGroupPromotionsService.productGroupsAnalytics(startDate = startDate, endDate = endDate, productGroupIds = productGroupIds, columns = columns, granularity = granularity, adAccountId = adAccountId, clickWindowDays = clickWindowDays, engagementWindowDays = engagementWindowDays, viewWindowDays = viewWindowDays, conversionReportTime = conversionReportTime, reportingTimezone = reportingTimezone)
        }
      }
    }
}

object ProductGroupPromotionsApiPatterns {

    val productGroupPromotionIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ProductGroupPromotionsApiService {

  def productGroupPromotionsCreate200(responseProductGroupPromotions: ProductGroupPromotions)(implicit toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions]): Route =
    complete((200, responseProductGroupPromotions))
  def productGroupPromotionsCreate201(responseProductGroupPromotions: ProductGroupPromotions)(implicit toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions]): Route =
    complete((201, responseProductGroupPromotions))
  def productGroupPromotionsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupPromotionsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productGroupPromotionsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productGroupPromotionsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productGroupPromotionsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productGroupPromotionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductGroupPromotions
   * Code: 201, Message: Resource create operation completed successfully., DataType: ProductGroupPromotions
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productGroupPromotionsCreate(adAccountId: String, productGroupPromotionsCreate: ProductGroupPromotionsCreate)
      (implicit toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsGet200(responseProductGroupPromotion: ProductGroupPromotion)(implicit toEntityMarshallerProductGroupPromotion: ToEntityMarshaller[ProductGroupPromotion]): Route =
    complete((200, responseProductGroupPromotion))
  def productGroupPromotionsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupPromotionsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productGroupPromotionsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productGroupPromotionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productGroupPromotionsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productGroupPromotionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductGroupPromotion
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String)
      (implicit toEntityMarshallerProductGroupPromotion: ToEntityMarshaller[ProductGroupPromotion], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsList200(responseProductGroupPromotionsList200Response: ProductGroupPromotionsList200Response)(implicit toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response]): Route =
    complete((200, responseProductGroupPromotionsList200Response))
  def productGroupPromotionsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupPromotionsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productGroupPromotionsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productGroupPromotionsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productGroupPromotionsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productGroupPromotionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductGroupPromotionsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productGroupPromotionsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], productGroupPromotionIds: Option[String], entityStatuses: Option[String], adGroupId: Option[String])
      (implicit toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupPromotionsUpdate200(responseProductGroupPromotions: ProductGroupPromotions)(implicit toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions]): Route =
    complete((200, responseProductGroupPromotions))
  def productGroupPromotionsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupPromotionsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productGroupPromotionsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productGroupPromotionsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productGroupPromotionsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productGroupPromotionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductGroupPromotions
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody)
      (implicit toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productGroupsAnalytics200(responseProductGroupAnalyticsItemsarray: Seq[ProductGroupAnalyticsItems])(implicit toEntityMarshallerProductGroupAnalyticsItemsarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsItems]]): Route =
    complete((200, responseProductGroupAnalyticsItemsarray))
  def productGroupsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productGroupsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productGroupsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productGroupsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productGroupsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productGroupsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[ProductGroupAnalyticsItems]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productGroupsAnalytics(startDate: String, endDate: String, productGroupIds: String, columns: String, granularity: String, adAccountId: String, clickWindowDays: Double, engagementWindowDays: Double, viewWindowDays: Double, conversionReportTime: String, reportingTimezone: Option[String])
      (implicit toEntityMarshallerProductGroupAnalyticsItemsarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsItems]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ProductGroupPromotionsApiMarshaller {
  implicit def fromEntityUnmarshallerProductGroupPromotionsUpdateWithRequiredBody: FromEntityUnmarshaller[ProductGroupPromotionsUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerProductGroupPromotionsCreate: FromEntityUnmarshaller[ProductGroupPromotionsCreate]



  implicit def toEntityMarshallerProductGroupPromotion: ToEntityMarshaller[ProductGroupPromotion]

  implicit def toEntityMarshallerProductGroupPromotionsList200Response: ToEntityMarshaller[ProductGroupPromotionsList200Response]

  implicit def toEntityMarshallerProductGroupAnalyticsItemsarray: ToEntityMarshaller[Seq[ProductGroupAnalyticsItems]]

  implicit def toEntityMarshallerProductGroupPromotions: ToEntityMarshaller[ProductGroupPromotions]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

