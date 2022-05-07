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
import org.openapitools.server.model.MediaUpload
import org.openapitools.server.model.MediaUploadDetails
import org.openapitools.server.model.MediaUploadRequest
import org.openapitools.server.model.Paginated


class MediaApi(
    mediaService: MediaApiService,
    mediaMarshaller: MediaApiMarshaller
) {

  import MediaApiPatterns.mediaIdPattern

  import mediaMarshaller._

  lazy val route: Route =
    path("media") { 
      post {  
            entity(as[MediaUploadRequest]){ mediaUploadRequest =>
              mediaService.mediaCreate(mediaUploadRequest = mediaUploadRequest)
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

  def mediaCreate201(responseMediaUpload: MediaUpload)(implicit toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload]): Route =
    complete((201, responseMediaUpload))
  def mediaCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: response, DataType: MediaUpload
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def mediaCreate(mediaUploadRequest: MediaUploadRequest)
      (implicit toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def mediaGet200(responseMediaUploadDetails: MediaUploadDetails)(implicit toEntityMarshallerMediaUploadDetails: ToEntityMarshaller[MediaUploadDetails]): Route =
    complete((200, responseMediaUploadDetails))
  def mediaGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def mediaGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: MediaUploadDetails
   * Code: 404, Message: Media upload not found, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def mediaGet(mediaId: String)
      (implicit toEntityMarshallerMediaUploadDetails: ToEntityMarshaller[MediaUploadDetails], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def mediaList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def mediaListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Paginated
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def mediaList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait MediaApiMarshaller {
  implicit def fromEntityUnmarshallerMediaUploadRequest: FromEntityUnmarshaller[MediaUploadRequest]



  implicit def toEntityMarshallerMediaUpload: ToEntityMarshaller[MediaUpload]

  implicit def toEntityMarshallerMediaUploadDetails: ToEntityMarshaller[MediaUploadDetails]

  implicit def toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

