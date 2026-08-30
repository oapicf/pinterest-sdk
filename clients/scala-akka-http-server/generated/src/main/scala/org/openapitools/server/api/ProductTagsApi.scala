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
import org.openapitools.server.model.ProductTagsBulkAddRequest
import org.openapitools.server.model.ProductTagsBulkDeleteRequest
import org.openapitools.server.model.ProductTagsError
import org.openapitools.server.model.ProductTagsResponse


class ProductTagsApi(
    productTagsService: ProductTagsApiService,
    productTagsMarshaller: ProductTagsApiMarshaller
) {

  import ProductTagsApiPatterns.pinIdPattern

  import productTagsMarshaller._

  lazy val route: Route =
    path("pins" / pinIdPattern / "product_tags") { (pinId) => 
      post {  
            entity(as[ProductTagsBulkAddRequest]){ productTagsBulkAddRequest =>
              productTagsService.productTagsBulkAdd(pinId = pinId, productTagsBulkAddRequest = productTagsBulkAddRequest)
            }
      }
    } ~
    path("pins" / pinIdPattern / "product_tags" / "bulk-delete") { (pinId) => 
      post {  
            entity(as[ProductTagsBulkDeleteRequest]){ productTagsBulkDeleteRequest =>
              productTagsService.productTagsBulkDelete(pinId = pinId, productTagsBulkDeleteRequest = productTagsBulkDeleteRequest)
            }
      }
    } ~
    path("pins" / pinIdPattern / "product_tags") { (pinId) => 
      get {  
            productTagsService.productTagsList(pinId = pinId)
      }
    }
}

object ProductTagsApiPatterns {

    val pinIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait ProductTagsApiService {

  def productTagsBulkAdd200(responseProductTagsResponse: ProductTagsResponse)(implicit toEntityMarshallerProductTagsResponse: ToEntityMarshaller[ProductTagsResponse]): Route =
    complete((200, responseProductTagsResponse))
  def productTagsBulkAdd400(responseProductTagsError: ProductTagsError)(implicit toEntityMarshallerProductTagsError: ToEntityMarshaller[ProductTagsError]): Route =
    complete((400, responseProductTagsError))
  def productTagsBulkAdd401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productTagsBulkAdd403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productTagsBulkAdd429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productTagsBulkAddDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductTagsResponse
   * Code: 400, Message: The request contains ineligible product tags., DataType: ProductTagsError
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productTagsBulkAdd(pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest)
      (implicit toEntityMarshallerProductTagsError: ToEntityMarshaller[ProductTagsError], toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerProductTagsResponse: ToEntityMarshaller[ProductTagsResponse]): Route

  def productTagsBulkDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def productTagsBulkDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productTagsBulkDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productTagsBulkDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productTagsBulkDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productTagsBulkDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productTagsBulkDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productTagsBulkDelete(pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productTagsList200(responseProductTagsResponse: ProductTagsResponse)(implicit toEntityMarshallerProductTagsResponse: ToEntityMarshaller[ProductTagsResponse]): Route =
    complete((200, responseProductTagsResponse))
  def productTagsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productTagsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productTagsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productTagsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productTagsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productTagsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ProductTagsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productTagsList(pinId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerProductTagsResponse: ToEntityMarshaller[ProductTagsResponse]): Route

}

trait ProductTagsApiMarshaller {
  implicit def fromEntityUnmarshallerProductTagsBulkAddRequest: FromEntityUnmarshaller[ProductTagsBulkAddRequest]

  implicit def fromEntityUnmarshallerProductTagsBulkDeleteRequest: FromEntityUnmarshaller[ProductTagsBulkDeleteRequest]



  implicit def toEntityMarshallerProductTagsError: ToEntityMarshaller[ProductTagsError]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerProductTagsResponse: ToEntityMarshaller[ProductTagsResponse]

}

