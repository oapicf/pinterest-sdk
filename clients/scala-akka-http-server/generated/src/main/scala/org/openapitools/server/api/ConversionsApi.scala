package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.server.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.server.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.server.model.Error


class ConversionsApi(
    conversionsService: ConversionsApiService,
    conversionsMarshaller: ConversionsApiMarshaller
) {

  import ConversionsApiPatterns.adAccountIdPattern

  import conversionsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "advertiser_defined_events") { (adAccountId) => 
      post {  
            entity(as[AdvertiserDefinedEventsCreateRequest]){ advertiserDefinedEventsCreateRequest =>
              conversionsService.advertiserDefinedEventsCreate(adAccountId = adAccountId, advertiserDefinedEventsCreateRequest = advertiserDefinedEventsCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "advertiser_defined_events") { (adAccountId) => 
      delete { 
        parameters("event_names".as[String]) { (eventNames) => 
            conversionsService.advertiserDefinedEventsDelete(adAccountId = adAccountId, eventNames = eventNames)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "advertiser_defined_events") { (adAccountId) => 
      get {  
            conversionsService.advertiserDefinedEventsGet(adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "advertiser_defined_events") { (adAccountId) => 
      patch {  
            entity(as[AdvertiserDefinedEventsCreateRequest]){ advertiserDefinedEventsCreateRequest =>
              conversionsService.advertiserDefinedEventsUpdate(adAccountId = adAccountId, advertiserDefinedEventsCreateRequest = advertiserDefinedEventsCreateRequest)
            }
      }
    }
}

object ConversionsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ConversionsApiService {

  def advertiserDefinedEventsCreate200(responseAdvertiserDefinedEventsCreate200Response: AdvertiserDefinedEventsCreate200Response)(implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response]): Route =
    complete((200, responseAdvertiserDefinedEventsCreate200Response))
  def advertiserDefinedEventsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advertiserDefinedEventsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advertiserDefinedEventsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advertiserDefinedEventsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advertiserDefinedEventsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advertiserDefinedEventsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvertiserDefinedEventsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advertiserDefinedEventsCreate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest)
      (implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def advertiserDefinedEventsDelete200(responseAdvertiserDefinedEventsCreate200Response: AdvertiserDefinedEventsCreate200Response)(implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response]): Route =
    complete((200, responseAdvertiserDefinedEventsCreate200Response))
  def advertiserDefinedEventsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advertiserDefinedEventsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advertiserDefinedEventsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advertiserDefinedEventsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advertiserDefinedEventsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advertiserDefinedEventsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvertiserDefinedEventsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advertiserDefinedEventsDelete(adAccountId: String, eventNames: String)
      (implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def advertiserDefinedEventsGet200(responseAdvertiserDefinedEventsGet200Response: AdvertiserDefinedEventsGet200Response)(implicit toEntityMarshallerAdvertiserDefinedEventsGet200Response: ToEntityMarshaller[AdvertiserDefinedEventsGet200Response]): Route =
    complete((200, responseAdvertiserDefinedEventsGet200Response))
  def advertiserDefinedEventsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advertiserDefinedEventsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advertiserDefinedEventsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advertiserDefinedEventsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advertiserDefinedEventsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advertiserDefinedEventsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvertiserDefinedEventsGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advertiserDefinedEventsGet(adAccountId: String)
      (implicit toEntityMarshallerAdvertiserDefinedEventsGet200Response: ToEntityMarshaller[AdvertiserDefinedEventsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def advertiserDefinedEventsUpdate200(responseAdvertiserDefinedEventsCreate200Response: AdvertiserDefinedEventsCreate200Response)(implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response]): Route =
    complete((200, responseAdvertiserDefinedEventsCreate200Response))
  def advertiserDefinedEventsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advertiserDefinedEventsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advertiserDefinedEventsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advertiserDefinedEventsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advertiserDefinedEventsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advertiserDefinedEventsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvertiserDefinedEventsCreate200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advertiserDefinedEventsUpdate(adAccountId: String, advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest)
      (implicit toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionsApiMarshaller {
  implicit def fromEntityUnmarshallerAdvertiserDefinedEventsCreateRequest: FromEntityUnmarshaller[AdvertiserDefinedEventsCreateRequest]



  implicit def toEntityMarshallerAdvertiserDefinedEventsCreate200Response: ToEntityMarshaller[AdvertiserDefinedEventsCreate200Response]

  implicit def toEntityMarshallerAdvertiserDefinedEventsGet200Response: ToEntityMarshaller[AdvertiserDefinedEventsGet200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

