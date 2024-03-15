package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionApiResponse
import org.openapitools.server.model.ConversionEvents
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
            entity(as[ConversionEvents]){ conversionEvents =>
              conversionEventsService.eventsCreate(adAccountId = adAccountId, conversionEvents = conversionEvents, test = test)
            }
        }
      }
    }
}

object ConversionEventsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ConversionEventsApiService {

  def eventsCreate200(responseConversionApiResponse: ConversionApiResponse)(implicit toEntityMarshallerConversionApiResponse: ToEntityMarshaller[ConversionApiResponse]): Route =
    complete((200, responseConversionApiResponse))
  def eventsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def eventsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def eventsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def eventsCreate422(responseDetailedError: DetailedError)(implicit toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]): Route =
    complete((422, responseDetailedError))
  def eventsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def eventsCreate503(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((503, responseError))
  def eventsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ConversionApiResponse
   * Code: 400, Message: The request was invalid., DataType: Error
   * Code: 401, Message: Not authorized to send conversion events, DataType: Error
   * Code: 403, Message: Unauthorized access., DataType: Error
   * Code: 422, Message: Not all events were successfully processed., DataType: DetailedError
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window., DataType: Error
   * Code: 503, Message: The endpoint has been ramped down and is currently not accepting any traffic., DataType: Error
   * Code: 0, Message: Unexpected errors, DataType: Error
   */
  def eventsCreate(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean])
      (implicit toEntityMarshallerConversionApiResponse: ToEntityMarshaller[ConversionApiResponse], toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionEventsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionEvents: FromEntityUnmarshaller[ConversionEvents]



  implicit def toEntityMarshallerConversionApiResponse: ToEntityMarshaller[ConversionApiResponse]

  implicit def toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

