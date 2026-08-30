package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.NotificationPostRequest
import org.openapitools.server.model.NotificationResponse


class NotificationApi(
    notificationService: NotificationApiService,
    notificationMarshaller: NotificationApiMarshaller
) {

  
  import notificationMarshaller._

  lazy val route: Route =
    path("notifications") { 
      post {  
            entity(as[NotificationPostRequest]){ notificationPostRequest =>
              notificationService.notificationPost(notificationPostRequest = notificationPostRequest)
            }
      }
    }
}


trait NotificationApiService {

  def notificationPost200(responseNotificationResponse: NotificationResponse)(implicit toEntityMarshallerNotificationResponse: ToEntityMarshaller[NotificationResponse]): Route =
    complete((200, responseNotificationResponse))
  def notificationPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def notificationPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: NotificationResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def notificationPost(notificationPostRequest: NotificationPostRequest)
      (implicit toEntityMarshallerNotificationResponse: ToEntityMarshaller[NotificationResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait NotificationApiMarshaller {
  implicit def fromEntityUnmarshallerNotificationPostRequest: FromEntityUnmarshaller[NotificationPostRequest]



  implicit def toEntityMarshallerNotificationResponse: ToEntityMarshaller[NotificationResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

