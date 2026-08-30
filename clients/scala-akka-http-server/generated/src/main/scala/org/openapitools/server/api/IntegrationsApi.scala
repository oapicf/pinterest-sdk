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
import org.openapitools.server.model.IntegrationLogsInvalidLogResponse
import org.openapitools.server.model.IntegrationLogsRequestCreate
import org.openapitools.server.model.IntegrationLogsSuccessResponse
import org.openapitools.server.model.IntegrationMetadata
import org.openapitools.server.model.IntegrationMetadataCreate
import org.openapitools.server.model.IntegrationMetadataUpdate
import org.openapitools.server.model.IntegrationRecord
import org.openapitools.server.model.IntegrationsGetList200Response


class IntegrationsApi(
    integrationsService: IntegrationsApiService,
    integrationsMarshaller: IntegrationsApiMarshaller
) {

  import IntegrationsApiPatterns.idPattern

  import integrationsMarshaller._

  lazy val route: Route =
    path("integrations" / "commerce" / Segment) { (externalBusinessId) => 
      delete {  
            integrationsService.integrationsCommerceDel(externalBusinessId = externalBusinessId)
      }
    } ~
    path("integrations" / "commerce" / Segment) { (externalBusinessId) => 
      get {  
            integrationsService.integrationsCommerceGet(externalBusinessId = externalBusinessId)
      }
    } ~
    path("integrations" / "commerce" / Segment) { (externalBusinessId) => 
      patch {  
            entity(as[IntegrationMetadataUpdate]){ integrationMetadataUpdate =>
              integrationsService.integrationsCommercePatch(externalBusinessId = externalBusinessId, integrationMetadataUpdate = integrationMetadataUpdate)
            }
      }
    } ~
    path("integrations" / "commerce") { 
      post {  
            entity(as[IntegrationMetadataCreate]){ integrationMetadataCreate =>
              integrationsService.integrationsCommercePost(integrationMetadataCreate = integrationMetadataCreate)
            }
      }
    } ~
    path("integrations" / idPattern) { (id) => 
      get {  
            integrationsService.integrationsGetById(id = id)
      }
    } ~
    path("integrations") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            integrationsService.integrationsGetList(bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("integrations" / "logs") { 
      post {  
            entity(as[IntegrationLogsRequestCreate]){ integrationLogsRequestCreate =>
              integrationsService.integrationsLogsPost(integrationLogsRequestCreate = integrationLogsRequestCreate)
            }
      }
    }
}

object IntegrationsApiPatterns {

    val idPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait IntegrationsApiService {

  def integrationsCommerceDel200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommerceDel204: Route =
    complete((204, "Resource deleted successfully."))
  def integrationsCommerceDel400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsCommerceDel401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsCommerceDel403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsCommerceDel404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommerceDel429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsCommerceDelDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationMetadata
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsCommerceDel(externalBusinessId: String)
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommerceGet200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommerceGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsCommerceGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsCommerceGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsCommerceGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommerceGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsCommerceGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationMetadata
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsCommerceGet(externalBusinessId: String)
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommercePatch200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommercePatch400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsCommercePatch401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsCommercePatch403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsCommercePatch404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommercePatch429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsCommercePatchDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationMetadata
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsCommercePatch(externalBusinessId: String, integrationMetadataUpdate: IntegrationMetadataUpdate)
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommercePost200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommercePost201(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((201, responseIntegrationMetadata))
  def integrationsCommercePost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsCommercePost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsCommercePost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsCommercePost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommercePost429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsCommercePostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationMetadata
   * Code: 201, Message: Resource create operation completed successfully., DataType: IntegrationMetadata
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsCommercePost(integrationMetadataCreate: IntegrationMetadataCreate)
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsGetById200(responseIntegrationRecord: IntegrationRecord)(implicit toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord]): Route =
    complete((200, responseIntegrationRecord))
  def integrationsGetById400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsGetById401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsGetById403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsGetById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsGetById429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsGetByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationRecord
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsGetById(id: String)
      (implicit toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsGetList200(responseIntegrationsGetList200Response: IntegrationsGetList200Response)(implicit toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response]): Route =
    complete((200, responseIntegrationsGetList200Response))
  def integrationsGetList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def integrationsGetList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsGetList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsGetList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsGetList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsGetListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationsGetList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsGetList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsLogsPost200(responseIntegrationLogsSuccessResponse: IntegrationLogsSuccessResponse)(implicit toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse]): Route =
    complete((200, responseIntegrationLogsSuccessResponse))
  def integrationsLogsPost400(responseIntegrationLogsInvalidLogResponse: IntegrationLogsInvalidLogResponse)(implicit toEntityMarshallerIntegrationLogsInvalidLogResponse: ToEntityMarshaller[IntegrationLogsInvalidLogResponse]): Route =
    complete((400, responseIntegrationLogsInvalidLogResponse))
  def integrationsLogsPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def integrationsLogsPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def integrationsLogsPost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsLogsPost429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def integrationsLogsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: IntegrationLogsSuccessResponse
   * Code: 400, Message: The server could not understand the request due to invalid syntax., DataType: IntegrationLogsInvalidLogResponse
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def integrationsLogsPost(integrationLogsRequestCreate: IntegrationLogsRequestCreate)
      (implicit toEntityMarshallerIntegrationLogsInvalidLogResponse: ToEntityMarshaller[IntegrationLogsInvalidLogResponse], toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait IntegrationsApiMarshaller {
  implicit def fromEntityUnmarshallerIntegrationMetadataCreate: FromEntityUnmarshaller[IntegrationMetadataCreate]

  implicit def fromEntityUnmarshallerIntegrationMetadataUpdate: FromEntityUnmarshaller[IntegrationMetadataUpdate]

  implicit def fromEntityUnmarshallerIntegrationLogsRequestCreate: FromEntityUnmarshaller[IntegrationLogsRequestCreate]



  implicit def toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]

  implicit def toEntityMarshallerIntegrationLogsInvalidLogResponse: ToEntityMarshaller[IntegrationLogsInvalidLogResponse]

  implicit def toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response]

  implicit def toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse]

  implicit def toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

