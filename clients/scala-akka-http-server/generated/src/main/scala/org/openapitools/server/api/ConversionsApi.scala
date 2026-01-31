package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdvertiserDefinedEventsResponse
import org.openapitools.server.model.Error


class ConversionsApi(
    conversionsService: ConversionsApiService,
    conversionsMarshaller: ConversionsApiMarshaller
) {

  import ConversionsApiPatterns.adAccountIdPattern

  import conversionsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "advertiser_defined_events") { (adAccountId) => 
      get {  
            conversionsService.advertiserDefinedEventsGet(adAccountId = adAccountId)
      }
    }
}

object ConversionsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ConversionsApiService {

  def advertiserDefinedEventsGet200(responseAdvertiserDefinedEventsResponse: AdvertiserDefinedEventsResponse)(implicit toEntityMarshallerAdvertiserDefinedEventsResponse: ToEntityMarshaller[AdvertiserDefinedEventsResponse]): Route =
    complete((200, responseAdvertiserDefinedEventsResponse))
  def advertiserDefinedEventsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdvertiserDefinedEventsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def advertiserDefinedEventsGet(adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAdvertiserDefinedEventsResponse: ToEntityMarshaller[AdvertiserDefinedEventsResponse]): Route

}

trait ConversionsApiMarshaller {


  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAdvertiserDefinedEventsResponse: ToEntityMarshaller[AdvertiserDefinedEventsResponse]

}

