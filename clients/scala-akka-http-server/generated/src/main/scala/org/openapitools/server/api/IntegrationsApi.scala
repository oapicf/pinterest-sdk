package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.DetailedError
import org.openapitools.server.model.Error
import org.openapitools.server.model.IntegrationLogsRequest
import org.openapitools.server.model.IntegrationLogsSuccessResponse
import org.openapitools.server.model.IntegrationMetadata
import org.openapitools.server.model.IntegrationRecord
import org.openapitools.server.model.IntegrationRequest
import org.openapitools.server.model.IntegrationRequestPatch
import org.openapitools.server.model.IntegrationsGetList200Response


class IntegrationsApi(
    integrationsService: IntegrationsApiService,
    integrationsMarshaller: IntegrationsApiMarshaller
) {

  
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
            entity(as[IntegrationRequestPatch]){ integrationRequestPatch =>
              integrationsService.integrationsCommercePatch(externalBusinessId = externalBusinessId, integrationRequestPatch = integrationRequestPatch)
            }
      }
    } ~
    path("integrations" / "commerce") { 
      post {  
            entity(as[IntegrationRequest]){ integrationRequest =>
              integrationsService.integrationsCommercePost(integrationRequest = integrationRequest)
            }
      }
    } ~
    path("integrations" / Segment) { (id) => 
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
            entity(as[IntegrationLogsRequest]){ integrationLogsRequest =>
              integrationsService.integrationsLogsPost(integrationLogsRequest = integrationLogsRequest)
            }
      }
    }
}


trait IntegrationsApiService {

  def integrationsCommerceDel204: Route =
    complete((204, "Commerce Integration deleted successfully"))
  def integrationsCommerceDelDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Commerce Integration deleted successfully
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsCommerceDel(externalBusinessId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommerceGet200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommerceGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommerceGet409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def integrationsCommerceGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: IntegrationMetadata
   * Code: 404, Message: Integration not found., DataType: Error
   * Code: 409, Message: Can&#39;t access this integration metadata., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsCommerceGet(externalBusinessId: String)
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommercePatch200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommercePatch404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommercePatch409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def integrationsCommercePatchDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: IntegrationMetadata
   * Code: 404, Message: Integration not found., DataType: Error
   * Code: 409, Message: Can&#39;t access this integration metadata., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsCommercePatch(externalBusinessId: String, integrationRequestPatch: Option[IntegrationRequestPatch])
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsCommercePost200(responseIntegrationMetadata: IntegrationMetadata)(implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]): Route =
    complete((200, responseIntegrationMetadata))
  def integrationsCommercePost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsCommercePost409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def integrationsCommercePostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: IntegrationMetadata
   * Code: 404, Message: Integration not found., DataType: Error
   * Code: 409, Message: Can&#39;t access this integration metadata., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsCommercePost(integrationRequest: Option[IntegrationRequest])
      (implicit toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsGetById200(responseIntegrationRecord: IntegrationRecord)(implicit toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord]): Route =
    complete((200, responseIntegrationRecord))
  def integrationsGetById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def integrationsGetByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: IntegrationRecord
   * Code: 404, Message: Integration not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsGetById(id: String)
      (implicit toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsGetList200(responseIntegrationsGetList200Response: IntegrationsGetList200Response)(implicit toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response]): Route =
    complete((200, responseIntegrationsGetList200Response))
  def integrationsGetListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: IntegrationsGetList200Response
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def integrationsGetList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def integrationsLogsPost200(responseIntegrationLogsSuccessResponse: IntegrationLogsSuccessResponse)(implicit toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse]): Route =
    complete((200, responseIntegrationLogsSuccessResponse))
  def integrationsLogsPost400(responseDetailedError: DetailedError)(implicit toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]): Route =
    complete((400, responseDetailedError))
  def integrationsLogsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success., DataType: IntegrationLogsSuccessResponse
   * Code: 400, Message: Bad request., DataType: DetailedError
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def integrationsLogsPost(integrationLogsRequest: IntegrationLogsRequest)
      (implicit toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError], toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait IntegrationsApiMarshaller {
  implicit def fromEntityUnmarshallerIntegrationRequestPatch: FromEntityUnmarshaller[IntegrationRequestPatch]

  implicit def fromEntityUnmarshallerIntegrationLogsRequest: FromEntityUnmarshaller[IntegrationLogsRequest]

  implicit def fromEntityUnmarshallerIntegrationRequest: FromEntityUnmarshaller[IntegrationRequest]



  implicit def toEntityMarshallerIntegrationMetadata: ToEntityMarshaller[IntegrationMetadata]

  implicit def toEntityMarshallerDetailedError: ToEntityMarshaller[DetailedError]

  implicit def toEntityMarshallerIntegrationsGetList200Response: ToEntityMarshaller[IntegrationsGetList200Response]

  implicit def toEntityMarshallerIntegrationLogsSuccessResponse: ToEntityMarshaller[IntegrationLogsSuccessResponse]

  implicit def toEntityMarshallerIntegrationRecord: ToEntityMarshaller[IntegrationRecord]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

