package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreativeType
import org.openapitools.server.model.Error
import java.time.LocalDate
import org.openapitools.server.model.MultiPinsAnalyticsMetricTypesItem
import org.openapitools.server.model.Pin
import org.openapitools.server.model.PinAnalyticsMetricsResponse
import org.openapitools.server.model.PinCreate
import org.openapitools.server.model.PinFilter
import org.openapitools.server.model.PinType
import org.openapitools.server.model.PinUpdate
import org.openapitools.server.model.PinsList200Response
import org.openapitools.server.model.PinsSaveRequestCreate
import org.openapitools.server.model.QuerypinanalyticsmetrictypesItems


class PinsApi(
    pinsService: PinsApiService,
    pinsMarshaller: PinsApiMarshaller
) {

  import PinsApiPatterns.pinIdPattern

  import pinsMarshaller._

  lazy val route: Route =
    path("pins" / "analytics") { 
      get { 
        parameters("pin_ids".as[String], "start_date".as[String], "end_date".as[String], "app_types".as[String].?("ALL"), "metric_types".as[String], "ad_account_id".as[String].?) { (pinIds, startDate, endDate, appTypes, metricTypes, adAccountId) => 
            pinsService.multiPinsAnalytics(pinIds = pinIds, startDate = startDate, endDate = endDate, metricTypes = metricTypes, appTypes = appTypes, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins" / Segment / "analytics") { (pinId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "app_types".as[String].?("ALL"), "metric_types".as[String], "split_field".as[String].?("NO_SPLIT"), "ad_account_id".as[String].?) { (startDate, endDate, appTypes, metricTypes, splitField, adAccountId) => 
            pinsService.pinsAnalytics(pinId = pinId, startDate = startDate, endDate = endDate, metricTypes = metricTypes, appTypes = appTypes, splitField = splitField, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[PinCreate]){ pinCreate =>
              pinsService.pinsCreate(pinCreate = pinCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("pins" / pinIdPattern) { (pinId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            pinsService.pinsDelete(pinId = pinId, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins" / pinIdPattern) { (pinId) => 
      get { 
        parameters("ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false)) { (adAccountId, pinMetrics) => 
            pinsService.pinsGet(pinId = pinId, adAccountId = adAccountId, pinMetrics = pinMetrics)
        }
      }
    } ~
    path("pins") { 
      get { 
        parameters("pin_filter".as[String].?, "pin_metrics".as[Boolean].?(false), "include_protected_pins".as[Boolean].?(false), "pin_type".as[String].?, "creative_types".as[String].?, "ad_account_id".as[String].?, "domain".as[String].?, "domains".as[String].?, "include_product_tag_obj".as[Boolean].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize) => 
            pinsService.pinsList(pinFilter = pinFilter, pinMetrics = pinMetrics, includeProtectedPins = includeProtectedPins, pinType = pinType, creativeTypes = creativeTypes, adAccountId = adAccountId, domain = domain, domains = domains, includeProductTagObj = includeProductTagObj, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("pins" / Segment / "save") { (pinId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[PinsSaveRequestCreate]){ pinsSaveRequestCreate =>
              pinsService.pinsSave(pinId = pinId, pinsSaveRequestCreate = pinsSaveRequestCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("pins" / pinIdPattern) { (pinId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[PinUpdate]){ pinUpdate =>
              pinsService.pinsUpdate(pinId = pinId, pinUpdate = pinUpdate, adAccountId = adAccountId)
            }
        }
      }
    }
}

object PinsApiPatterns {

    val pinIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait PinsApiService {

  def multiPinsAnalytics200(responseMapmap: Map[String, Map[String, PinAnalyticsMetricsResponse]])(implicit toEntityMarshallerMapmap: ToEntityMarshaller[Map[String, Map[String, PinAnalyticsMetricsResponse]]]): Route =
    complete((200, responseMapmap))
  def multiPinsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def multiPinsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def multiPinsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def multiPinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def multiPinsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def multiPinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Map[String, Map[String, PinAnalyticsMetricsResponse]]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def multiPinsAnalytics(pinIds: String, startDate: String, endDate: String, metricTypes: String, appTypes: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsAnalytics200(responsePinAnalyticsMetricsResponsemap: Map[String, PinAnalyticsMetricsResponse])(implicit toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]]): Route =
    complete((200, responsePinAnalyticsMetricsResponsemap))
  def pinsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Map[String, PinAnalyticsMetricsResponse]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsAnalytics(pinId: String, startDate: String, endDate: String, metricTypes: String, appTypes: String, splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsCreate200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsCreate201(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((201, responsePin))
  def pinsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Pin
   * Code: 201, Message: Resource create operation completed successfully., DataType: Pin
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsDelete200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def pinsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Pin
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsDelete(pinId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsGet200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Pin
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsGet(pinId: String, adAccountId: Option[String], pinMetrics: Boolean)
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsList200(responsePinsList200Response: PinsList200Response)(implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]): Route =
    complete((200, responsePinsList200Response))
  def pinsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: PinsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsList(pinFilter: Option[String], pinMetrics: Boolean, includeProtectedPins: Boolean, pinType: Option[String], creativeTypes: Option[String], adAccountId: Option[String], domain: Option[String], domains: Option[String], includeProductTagObj: Option[Boolean], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsSave201(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((201, responsePin))
  def pinsSave400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsSave401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsSave403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsSave404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsSave429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsSaveDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: The request has succeeded and a new resource has been created as a result., DataType: Pin
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsSave(pinId: String, pinsSaveRequestCreate: PinsSaveRequestCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsUpdate200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def pinsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Pin
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait PinsApiMarshaller {
  implicit def fromEntityUnmarshallerPinCreate: FromEntityUnmarshaller[PinCreate]

  implicit def fromEntityUnmarshallerPinsSaveRequestCreate: FromEntityUnmarshaller[PinsSaveRequestCreate]

  implicit def fromEntityUnmarshallerPinUpdate: FromEntityUnmarshaller[PinUpdate]



  implicit def toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]]

  implicit def toEntityMarshallerPin: ToEntityMarshaller[Pin]

  implicit def toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

