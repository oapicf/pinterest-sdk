package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AnalyticsMetricsResponse
import org.openapitools.server.model.Error
import java.time.LocalDate
import org.openapitools.server.model.Pin


class PinsApi(
    pinsService: PinsApiService,
    pinsMarshaller: PinsApiMarshaller
) {

  
  import pinsMarshaller._

  lazy val route: Route =
    path("pins" / Segment / "analytics") { (pinId) => 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "app_types".as[String].?("ALL"), "metric_types".as[String], "split_field".as[String].?("NO_SPLIT"), "ad_account_id".as[String].?) { (startDate, endDate, appTypes, metricTypes, splitField, adAccountId) => 
            pinsService.pinsAnalytics(pinId = pinId, startDate = startDate, endDate = endDate, metricTypes = metricTypes, appTypes = appTypes, splitField = splitField, adAccountId = adAccountId)
        }
      }
    } ~
    path("pins") { 
      post {  
            entity(as[Pin]){ pin =>
              pinsService.pinsCreate(pin = pin)
            }
      }
    } ~
    path("pins" / Segment) { (pinId) => 
      delete {  
            pinsService.pinsDelete(pinId = pinId)
      }
    } ~
    path("pins" / Segment) { (pinId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            pinsService.pinsGet(pinId = pinId, adAccountId = adAccountId)
        }
      }
    }
}


trait PinsApiService {

  def pinsAnalytics200(responseAnalyticsMetricsResponsemap: Map[String, AnalyticsMetricsResponse])(implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]): Route =
    complete((200, responseAnalyticsMetricsResponsemap))
  def pinsAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def pinsAnalytics404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def pinsAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Map[String, AnalyticsMetricsResponse]
   * Code: 403, Message: Not authorized to access board or Pin., DataType: Error
   * Code: 404, Message: Pin not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def pinsAnalytics(pinId: String, startDate: String, endDate: String, metricTypes: String, appTypes: String, splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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
  def pinsCreate(pin: Pin)
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
  def pinsDelete(pinId: String)
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
  def pinsGet(pinId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerPin: ToEntityMarshaller[Pin], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait PinsApiMarshaller {
  implicit def fromEntityUnmarshallerPin: FromEntityUnmarshaller[Pin]



  implicit def toEntityMarshallerPin: ToEntityMarshaller[Pin]

  implicit def toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

