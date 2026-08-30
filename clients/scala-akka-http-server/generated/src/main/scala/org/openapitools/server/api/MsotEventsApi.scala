package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionMSOTEventsCreate
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
            entity(as[ConversionMSOTEventsCreate]){ conversionMSOTEventsCreate =>
              msotEventsService.msotEventsCreate(adAccountId = adAccountId, conversionMSOTEventsCreate = conversionMSOTEventsCreate)
            }
      }
    }
}

object MsotEventsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait MsotEventsApiService {

  def msotEventsCreate200: Route =
    complete((200, "The request has succeeded."))
  def msotEventsCreate201(responseAny: Any)(implicit toEntityMarshallerAny: ToEntityMarshaller[Any]): Route =
    complete((201, responseAny))
  def msotEventsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def msotEventsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def msotEventsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def msotEventsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def msotEventsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def msotEventsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded.
   * Code: 201, Message: Resource create operation completed successfully., DataType: Any
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def msotEventsCreate(adAccountId: String, conversionMSOTEventsCreate: ConversionMSOTEventsCreate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait MsotEventsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionMSOTEventsCreate: FromEntityUnmarshaller[ConversionMSOTEventsCreate]



  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

