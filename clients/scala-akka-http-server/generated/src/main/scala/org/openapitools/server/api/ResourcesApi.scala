package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountCountriesGet200Response
import org.openapitools.server.model.BookClosed
import org.openapitools.server.model.DeliveryMetricsGet200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PublicTargetingType
import org.openapitools.server.model.ReportType
import org.openapitools.server.model.SingleInterestTargetingOption


class ResourcesApi(
    resourcesService: ResourcesApiService,
    resourcesMarshaller: ResourcesApiMarshaller
) {

  import ResourcesApiPatterns.interestIdPattern

  import resourcesMarshaller._

  lazy val route: Route =
    path("resources" / "ad_account_countries") { 
      get {  
            resourcesService.adAccountCountriesGet()
      }
    } ~
    path("resources" / "delivery_metrics") { 
      get { 
        parameters("report_type".as[String].?) { (reportType) => 
            resourcesService.deliveryMetricsGet(reportType = reportType)
        }
      }
    } ~
    path("resources" / "targeting" / "interests" / interestIdPattern) { (interestId) => 
      get {  
            resourcesService.interestTargetingOptionsGet(interestId = interestId)
      }
    } ~
    path("resources" / "lead_form_questions") { 
      get {  
            resourcesService.leadFormQuestionsGet()
      }
    } ~
    path("resources" / "metrics_ready_state") { 
      get { 
        parameters("date".as[String]) { (date) => 
            resourcesService.metricsReadyStateGet(date = date)
        }
      }
    } ~
    path("resources" / "targeting" / Segment) { (targetingType) => 
      get { 
        parameters("ad_account_id".as[String].?, "client_id".as[String].?, "oauth_signature".as[String].?, "timestamp".as[String].?) { (adAccountId, clientId, oauthSignature, timestamp) => 
            resourcesService.targetingOptionsGet(targetingType = targetingType, adAccountId = adAccountId, clientId = clientId, oauthSignature = oauthSignature, timestamp = timestamp)
        }
      }
    }
}

object ResourcesApiPatterns {

    val interestIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ResourcesApiService {

  def adAccountCountriesGet200(responseAdAccountCountriesGet200Response: AdAccountCountriesGet200Response)(implicit toEntityMarshallerAdAccountCountriesGet200Response: ToEntityMarshaller[AdAccountCountriesGet200Response]): Route =
    complete((200, responseAdAccountCountriesGet200Response))
  def adAccountCountriesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountCountriesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountCountriesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountCountriesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountCountriesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adAccountCountriesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountCountriesGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountCountriesGet()
      (implicit toEntityMarshallerAdAccountCountriesGet200Response: ToEntityMarshaller[AdAccountCountriesGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def deliveryMetricsGet200(responseDeliveryMetricsGet200Response: DeliveryMetricsGet200Response)(implicit toEntityMarshallerDeliveryMetricsGet200Response: ToEntityMarshaller[DeliveryMetricsGet200Response]): Route =
    complete((200, responseDeliveryMetricsGet200Response))
  def deliveryMetricsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def deliveryMetricsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def deliveryMetricsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def deliveryMetricsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def deliveryMetricsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def deliveryMetricsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DeliveryMetricsGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def deliveryMetricsGet(reportType: Option[String])
      (implicit toEntityMarshallerDeliveryMetricsGet200Response: ToEntityMarshaller[DeliveryMetricsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def interestTargetingOptionsGet200(responseSingleInterestTargetingOption: SingleInterestTargetingOption)(implicit toEntityMarshallerSingleInterestTargetingOption: ToEntityMarshaller[SingleInterestTargetingOption]): Route =
    complete((200, responseSingleInterestTargetingOption))
  def interestTargetingOptionsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def interestTargetingOptionsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def interestTargetingOptionsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def interestTargetingOptionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def interestTargetingOptionsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def interestTargetingOptionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SingleInterestTargetingOption
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def interestTargetingOptionsGet(interestId: String)
      (implicit toEntityMarshallerSingleInterestTargetingOption: ToEntityMarshaller[SingleInterestTargetingOption], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormQuestionsGet200: Route =
    complete((200, "The request has succeeded."))
  def leadFormQuestionsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def leadFormQuestionsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def leadFormQuestionsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def leadFormQuestionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def leadFormQuestionsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def leadFormQuestionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def leadFormQuestionsGet()
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def metricsReadyStateGet200(responseBookClosed: BookClosed)(implicit toEntityMarshallerBookClosed: ToEntityMarshaller[BookClosed]): Route =
    complete((200, responseBookClosed))
  def metricsReadyStateGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def metricsReadyStateGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def metricsReadyStateGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def metricsReadyStateGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def metricsReadyStateGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def metricsReadyStateGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BookClosed
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def metricsReadyStateGet(date: String)
      (implicit toEntityMarshallerBookClosed: ToEntityMarshaller[BookClosed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingOptionsGet200(responseAnyarray: Seq[Any])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Any]]): Route =
    complete((200, responseAnyarray))
  def targetingOptionsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingOptionsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def targetingOptionsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def targetingOptionsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def targetingOptionsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def targetingOptionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[Any]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def targetingOptionsGet(targetingType: String, adAccountId: Option[String], clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ResourcesApiMarshaller {


  implicit def toEntityMarshallerAdAccountCountriesGet200Response: ToEntityMarshaller[AdAccountCountriesGet200Response]

  implicit def toEntityMarshallerBookClosed: ToEntityMarshaller[BookClosed]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerDeliveryMetricsGet200Response: ToEntityMarshaller[DeliveryMetricsGet200Response]

  implicit def toEntityMarshallerSingleInterestTargetingOption: ToEntityMarshaller[SingleInterestTargetingOption]

}

