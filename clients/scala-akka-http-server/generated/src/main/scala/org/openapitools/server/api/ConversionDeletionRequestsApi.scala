package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ConversionDeletionRequest
import org.openapitools.server.model.ConversionDeletionRequestCreate
import org.openapitools.server.model.ConversionDeletionRequestList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder


class ConversionDeletionRequestsApi(
    conversionDeletionRequestsService: ConversionDeletionRequestsApiService,
    conversionDeletionRequestsMarshaller: ConversionDeletionRequestsApiMarshaller
) {

  import ConversionDeletionRequestsApiPatterns.requestIdPattern
import ConversionDeletionRequestsApiPatterns.adAccountIdPattern

  import conversionDeletionRequestsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "conversion_deletion_requests") { (adAccountId) => 
      post {  
            entity(as[ConversionDeletionRequestCreate]){ conversionDeletionRequestCreate =>
              conversionDeletionRequestsService.conversionDeletionRequestCreate(adAccountId = adAccountId, conversionDeletionRequestCreate = conversionDeletionRequestCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_deletion_requests" / requestIdPattern) { (requestId, adAccountId) => 
      delete {  
            conversionDeletionRequestsService.conversionDeletionRequestDelete(requestId = requestId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_deletion_requests" / requestIdPattern) { (requestId, adAccountId) => 
      get {  
            conversionDeletionRequestsService.conversionDeletionRequestGet(requestId = requestId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "conversion_deletion_requests") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?) { (bookmark, pageSize, order) => 
            conversionDeletionRequestsService.conversionDeletionRequestList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order)
        }
      }
    }
}

object ConversionDeletionRequestsApiPatterns {

    val requestIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ConversionDeletionRequestsApiService {

  def conversionDeletionRequestCreate200(responseConversionDeletionRequest: ConversionDeletionRequest)(implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest]): Route =
    complete((200, responseConversionDeletionRequest))
  def conversionDeletionRequestCreate201(responseConversionDeletionRequest: ConversionDeletionRequest)(implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest]): Route =
    complete((201, responseConversionDeletionRequest))
  def conversionDeletionRequestCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionDeletionRequestCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionDeletionRequestCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionDeletionRequestCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionDeletionRequestCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionDeletionRequestCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionDeletionRequest
   * Code: 201, Message: Resource create operation completed successfully., DataType: ConversionDeletionRequest
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionDeletionRequestCreate(adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate)
      (implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionDeletionRequestDelete200(responseConversionDeletionRequest: ConversionDeletionRequest)(implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest]): Route =
    complete((200, responseConversionDeletionRequest))
  def conversionDeletionRequestDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def conversionDeletionRequestDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionDeletionRequestDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionDeletionRequestDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionDeletionRequestDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionDeletionRequestDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionDeletionRequestDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionDeletionRequest
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionDeletionRequestDelete(requestId: String, adAccountId: String)
      (implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionDeletionRequestGet200(responseConversionDeletionRequest: ConversionDeletionRequest)(implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest]): Route =
    complete((200, responseConversionDeletionRequest))
  def conversionDeletionRequestGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionDeletionRequestGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionDeletionRequestGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionDeletionRequestGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionDeletionRequestGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionDeletionRequestGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionDeletionRequest
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionDeletionRequestGet(requestId: String, adAccountId: String)
      (implicit toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def conversionDeletionRequestList200(responseConversionDeletionRequestList200Response: ConversionDeletionRequestList200Response)(implicit toEntityMarshallerConversionDeletionRequestList200Response: ToEntityMarshaller[ConversionDeletionRequestList200Response]): Route =
    complete((200, responseConversionDeletionRequestList200Response))
  def conversionDeletionRequestList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionDeletionRequestList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionDeletionRequestList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionDeletionRequestList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionDeletionRequestList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionDeletionRequestListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ConversionDeletionRequestList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionDeletionRequestList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String])
      (implicit toEntityMarshallerConversionDeletionRequestList200Response: ToEntityMarshaller[ConversionDeletionRequestList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionDeletionRequestsApiMarshaller {
  implicit def fromEntityUnmarshallerConversionDeletionRequestCreate: FromEntityUnmarshaller[ConversionDeletionRequestCreate]



  implicit def toEntityMarshallerConversionDeletionRequestList200Response: ToEntityMarshaller[ConversionDeletionRequestList200Response]

  implicit def toEntityMarshallerConversionDeletionRequest: ToEntityMarshaller[ConversionDeletionRequest]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

