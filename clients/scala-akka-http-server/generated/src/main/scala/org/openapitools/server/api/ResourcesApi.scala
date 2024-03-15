package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountsCountryResponse
import org.openapitools.server.model.BookClosedResponse
import org.openapitools.server.model.DeliveryMetricsResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.SingleInterestTargetingOptionResponse


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
        parameters("client_id".as[String].?, "oauth_signature".as[String].?, "timestamp".as[String].?) { (clientId, oauthSignature, timestamp) => 
            resourcesService.targetingOptionsGet(targetingType = targetingType, clientId = clientId, oauthSignature = oauthSignature, timestamp = timestamp)
        }
      }
    }
}

object ResourcesApiPatterns {

    val interestIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ResourcesApiService {

  def adAccountCountriesGet200(responseAdAccountsCountryResponse: AdAccountsCountryResponse)(implicit toEntityMarshallerAdAccountsCountryResponse: ToEntityMarshaller[AdAccountsCountryResponse]): Route =
    complete((200, responseAdAccountsCountryResponse))
  def adAccountCountriesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountsCountryResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountCountriesGet()
      (implicit toEntityMarshallerAdAccountsCountryResponse: ToEntityMarshaller[AdAccountsCountryResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def deliveryMetricsGet200(responseDeliveryMetricsResponse: DeliveryMetricsResponse)(implicit toEntityMarshallerDeliveryMetricsResponse: ToEntityMarshaller[DeliveryMetricsResponse]): Route =
    complete((200, responseDeliveryMetricsResponse))
  def deliveryMetricsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeliveryMetricsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def deliveryMetricsGet(reportType: Option[String])
      (implicit toEntityMarshallerDeliveryMetricsResponse: ToEntityMarshaller[DeliveryMetricsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def interestTargetingOptionsGet200(responseSingleInterestTargetingOptionResponse: SingleInterestTargetingOptionResponse)(implicit toEntityMarshallerSingleInterestTargetingOptionResponse: ToEntityMarshaller[SingleInterestTargetingOptionResponse]): Route =
    complete((200, responseSingleInterestTargetingOptionResponse))
  def interestTargetingOptionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SingleInterestTargetingOptionResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def interestTargetingOptionsGet(interestId: String)
      (implicit toEntityMarshallerSingleInterestTargetingOptionResponse: ToEntityMarshaller[SingleInterestTargetingOptionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def leadFormQuestionsGet200: Route =
    complete((200, "Success"))
  def leadFormQuestionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def leadFormQuestionsGet()
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def metricsReadyStateGet200(responseBookClosedResponse: BookClosedResponse)(implicit toEntityMarshallerBookClosedResponse: ToEntityMarshaller[BookClosedResponse]): Route =
    complete((200, responseBookClosedResponse))
  def metricsReadyStateGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BookClosedResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def metricsReadyStateGet(date: String)
      (implicit toEntityMarshallerBookClosedResponse: ToEntityMarshaller[BookClosedResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingOptionsGet200(responseAnyarray: Seq[Any])(implicit toEntityMarshallerAnyarray: ToEntityMarshaller[Seq[Any]]): Route =
    complete((200, responseAnyarray))
  def targetingOptionsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Seq[Any]
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def targetingOptionsGet(targetingType: String, clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ResourcesApiMarshaller {


  implicit def toEntityMarshallerAdAccountsCountryResponse: ToEntityMarshaller[AdAccountsCountryResponse]

  implicit def toEntityMarshallerSingleInterestTargetingOptionResponse: ToEntityMarshaller[SingleInterestTargetingOptionResponse]

  implicit def toEntityMarshallerBookClosedResponse: ToEntityMarshaller[BookClosedResponse]

  implicit def toEntityMarshallerDeliveryMetricsResponse: ToEntityMarshaller[DeliveryMetricsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

