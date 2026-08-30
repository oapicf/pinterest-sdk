package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionEvents
import org.openapitools.server.model.ConversionEventsCreate
import org.openapitools.server.model.DetailedError
import org.openapitools.server.model.Error


class ConversionEventsApi(
    conversionEventsService: ConversionEventsApiService,
    conversionEventsMarshaller: ConversionEventsApiMarshaller
) {

  import ConversionEventsApiPatterns.adAccountIdPattern

  import conversionEventsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "events") { (adAccountId) => 
      post { 
        parameters("test".as[Boolean].?) { (test) => 
            entity(as[ConversionEventsCreate]){ conversionEventsCreate =>
              conversionEventsService.eventsCreate(adAccountId = adAccountId, conversionEventsCreate = conversionEventsCreate, test = test)
            }
        }
      }
    }
}

object ConversionEventsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ConversionEventsApiService {

  def eventsCreate200(responseConversionEvents: ConversionEvents)(implicit toEntityMarshallerConversionEvents: ToEntityMarshaller[ConversionEvents]): Route =
    complete((200, responseConversionEvents))
  def eventsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def eventsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def eventsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def eventsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def eventsCreate422(responseDetailedError: DetailedError)(implicit toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]): Route =
    complete((422, responseDetailedError))
  def eventsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def eventsCreate503(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((503, responseError))
  def eventsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionEvents
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 422, Message: The request was well-formed but was unable to be followed due to semantic errors., DataType: DetailedError
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 503, Message: The server is currently unable to handle the request due to a temporary overload or scheduled maintenance., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def eventsCreate(adAccountId: String, conversionEventsCreate: ConversionEventsCreate, test: Option[Boolean])
      (implicit toEntityMarshallerConversionEvents: ToEntityMarshaller[ConversionEvents], toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionEventsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionEventsCreate: FromEntityUnmarshaller[ConversionEventsCreate]



  implicit def toEntityMarshallerConversionEvents: ToEntityMarshaller[ConversionEvents]

  implicit def toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

