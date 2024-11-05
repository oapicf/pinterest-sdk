package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import java.time.LocalDate
import org.openapitools.server.model.Pin
import org.openapitools.server.model.PinAnalyticsMetricsResponse
import org.openapitools.server.model.PinCreate
import org.openapitools.server.model.PinUpdate
import org.openapitools.server.model.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.server.model.PinsList200Response
import org.openapitools.server.model.PinsSaveRequest


class PinsApi(
    pinsService: PinsApiService,
    pinsMarshaller: PinsApiMarshaller
) {

  
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
    path("pins" / Segment) { (pinId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            pinsService.pinsDelete(pinId = pinId, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins" / Segment) { (pinId) => 
      get { 
        parameters("pin_metrics".as[Boolean].?(false), "ad_account_id".as[String].?) { (pinMetrics, adAccountId) => 
            pinsService.pinsGet(pinId = pinId, pinMetrics = pinMetrics, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "pin_filter".as[String].?, "include_protected_pins".as[Boolean].?(false), "pin_type".as[String].?, "creative_types".as[String].?, "ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false)) { (bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics) => 
            pinsService.pinsList(bookmark = bookmark, pageSize = pageSize, pinFilter = pinFilter, includeProtectedPins = includeProtectedPins, pinType = pinType, creativeTypes = creativeTypes, adAccountId = adAccountId, pinMetrics = pinMetrics)
        }
      }
    } ~
    path("pins" / Segment / "save") { (pinId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[PinsSaveRequest]){ pinsSaveRequest =>
              pinsService.pinsSave(pinId = pinId, pinsSaveRequest = pinsSaveRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("pins" / Segment) { (pinId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[PinUpdate]){ pinUpdate =>
              pinsService.pinsUpdate(pinId = pinId, pinUpdate = pinUpdate, adAccountId = adAccountId)
            }
        }
      }
    }
}


trait PinsApiService {

  def multiPinsAnalytics200(responseMapmap: Map[String, Map[String, PinAnalyticsMetricsResponse]])(implicit toEntityMarshallerMapmap: ToEntityMarshaller[Map[String, Map[String, PinAnalyticsMetricsResponse]]]): Route =
    complete((200, responseMapmap))
  def multiPinsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def multiPinsAnalytics401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def multiPinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def multiPinsAnalytics429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def multiPinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Map[String, Map[String, PinAnalyticsMetricsResponse]]
   * Code: 400, Message: Invalid pins analytics parameters., DataType: Error
   * Code: 401, Message: Not authorized to access board or Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def multiPinsAnalytics(pinIds: String, startDate: String, endDate: String, metricTypes: String, appTypes: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsAnalytics200(responsePinAnalyticsMetricsResponsemap: Map[String, PinAnalyticsMetricsResponse])(implicit toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]]): Route =
    complete((200, responsePinAnalyticsMetricsResponsemap))
  def pinsAnalytics400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Map[String, PinAnalyticsMetricsResponse]
   * Code: 400, Message: Invalid pins analytics parameters., DataType: Error
   * Code: 403, Message: Not authorized to access board or Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsAnalytics(pinId: String, startDate: String, endDate: String, metricTypes: String, appTypes: String, splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsCreate201(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((201, responsePin))
  def pinsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Successful pin creation., DataType: Pin
   * Code: 400, Message: Invalid Pin parameters response, DataType: Error
   * Code: 403, Message: The Pin&#39;s image is too small, too large or is broken, DataType: Error
   * Code: 404, Message: Board or section not found, DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsCreate(pinCreate: PinCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsDelete204: Route =
    complete((204, "Successfully deleted Pin"))
  def pinsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Successfully deleted Pin
   * Code: 403, Message: Not authorized to access board or Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsDelete(pinId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsGet200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Pin
   * Code: 403, Message: Not authorized to access board or Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsGet(pinId: String, pinMetrics: Boolean, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsList200(responsePinsList200Response: PinsList200Response)(implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]): Route =
    complete((200, responsePinsList200Response))
  def pinsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def pinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PinsList200Response
   * Code: 400, Message: Invalid pin filter value, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsList(bookmark: Option[String], pageSize: Int, pinFilter: Option[String], includeProtectedPins: Boolean, pinType: Option[String], creativeTypes: Option[String], adAccountId: Option[String], pinMetrics: Boolean)
      (implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsSave201(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((201, responsePin))
  def pinsSave403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsSave404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsSaveDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Successfully saved pin., DataType: Pin
   * Code: 403, Message: Not authorized to access Board or Pin., DataType: Error
   * Code: 404, Message: Board or Pin not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def pinsUpdate200(responsePin: Pin)(implicit toEntityMarshallerPin: ToEntityMarshaller[Pin]): Route =
    complete((200, responsePin))
  def pinsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def pinsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Pin
   * Code: 403, Message: Not authorized to update Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait PinsApiMarshaller {
  implicit def fromEntityUnmarshallerPinCreate: FromEntityUnmarshaller[PinCreate]

  implicit def fromEntityUnmarshallerPinsSaveRequest: FromEntityUnmarshaller[PinsSaveRequest]

  implicit def fromEntityUnmarshallerPinUpdate: FromEntityUnmarshaller[PinUpdate]



  implicit def toEntityMarshallerPinAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, PinAnalyticsMetricsResponse]]

  implicit def toEntityMarshallerPin: ToEntityMarshaller[Pin]

  implicit def toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

