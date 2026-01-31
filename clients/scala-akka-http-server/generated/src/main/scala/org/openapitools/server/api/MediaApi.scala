package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.Media
import org.openapitools.server.model.MediaList200Response
import org.openapitools.server.model.MediaUpload
import org.openapitools.server.model.MediaUploadCreate


class MediaApi(
    mediaService: MediaApiService,
    mediaMarshaller: MediaApiMarshaller
) {

  import MediaApiPatterns.mediaIdPattern

  import mediaMarshaller._

  lazy val route: Route =
    path("media") { 
      post {  
            entity(as[MediaUploadCreate]){ mediaUploadCreate =>
              mediaService.mediaCreate(mediaUploadCreate = mediaUploadCreate)
            }
      }
    } ~
    path("media" / mediaIdPattern) { (mediaId) => 
      get {  
            mediaService.mediaGet(mediaId = mediaId)
      }
    } ~
    path("media") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            mediaService.mediaList(bookmark = bookmark, pageSize = pageSize)
        }
      }
    }
}

object MediaApiPatterns {

    val mediaIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait MediaApiService {

  def mediaCreate200(responseMediaUpload: MediaUpload)(implicit toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload]): Route =
    complete((200, responseMediaUpload))
  def mediaCreate201(responseMediaUpload: MediaUpload)(implicit toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload]): Route =
    complete((201, responseMediaUpload))
  def mediaCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def mediaCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def mediaCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def mediaCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def mediaCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def mediaCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: MediaUpload
   * Code: 201, Message: Resource create operation completed successfully., DataType: MediaUpload
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def mediaCreate(mediaUploadCreate: MediaUploadCreate)
      (implicit toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def mediaGet200(responseMedia: Media)(implicit toEntityMarshallerMedia: ToEntityMarshaller[Media]): Route =
    complete((200, responseMedia))
  def mediaGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def mediaGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def mediaGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def mediaGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def mediaGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def mediaGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Media
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def mediaGet(mediaId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerMedia: ToEntityMarshaller[Media]): Route

  def mediaList200(responseMediaList200Response: MediaList200Response)(implicit toEntityMarshallerMediaList200Response: ToEntityMarshaller[MediaList200Response]): Route =
    complete((200, responseMediaList200Response))
  def mediaList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def mediaList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def mediaList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def mediaList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def mediaList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def mediaListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: MediaList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def mediaList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerMediaList200Response: ToEntityMarshaller[MediaList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait MediaApiMarshaller {
  implicit def fromEntityUnmarshallerMediaUploadCreate: FromEntityUnmarshaller[MediaUploadCreate]



  implicit def toEntityMarshallerMediaList200Response: ToEntityMarshaller[MediaList200Response]

  implicit def toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerMedia: ToEntityMarshaller[Media]

}

