package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionMSOTEvents
import org.openapitools.server.model.Error


class MsotEventsApi(
    msotEventsService: MsotEventsApiService,
    msotEventsMarshaller: MsotEventsApiMarshaller
) {

  import MsotEventsApiPatterns.adAccountIdPattern

  import msotEventsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "msot" / "events") { (adAccountId) => 
      post {  
            entity(as[ConversionMSOTEvents]){ conversionMSOTEvents =>
              msotEventsService.msotEventsCreate(adAccountId = adAccountId, conversionMSOTEvents = conversionMSOTEvents)
            }
      }
    }
}

object MsotEventsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait MsotEventsApiService {

  def msotEventsCreate200: Route =
    complete((200, "Success"))
  def msotEventsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def msotEventsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def msotEventsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def msotEventsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def msotEventsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success
   * Code: 400, Message: The request was invalid, DataType: Error
   * Code: 401, Message: Not authorized to send MSOT conversion events, DataType: Error
   * Code: 403, Message: Unauthorized access, DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window., DataType: Error
   * Code: 0, Message: Unexpected errors, DataType: Error
   */
  def msotEventsCreate(adAccountId: String, conversionMSOTEvents: ConversionMSOTEvents)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait MsotEventsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionMSOTEvents: FromEntityUnmarshaller[ConversionMSOTEvents]



  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

