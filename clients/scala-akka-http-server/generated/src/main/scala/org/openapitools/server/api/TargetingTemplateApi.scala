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
import org.openapitools.server.model.PaginationOrder
import org.openapitools.server.model.TargetingTemplate
import org.openapitools.server.model.TargetingTemplateCreate
import org.openapitools.server.model.TargetingTemplateList200Response
import org.openapitools.server.model.TargetingTemplateUpdateRequestReadOrUpdate


class TargetingTemplateApi(
    targetingTemplateService: TargetingTemplateApiService,
    targetingTemplateMarshaller: TargetingTemplateApiMarshaller
) {

  import TargetingTemplateApiPatterns.adAccountIdPattern

  import targetingTemplateMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "targeting_templates") { (adAccountId) => 
      post {  
            entity(as[TargetingTemplateCreate]){ targetingTemplateCreate =>
              targetingTemplateService.targetingTemplateCreate(adAccountId = adAccountId, targetingTemplateCreate = targetingTemplateCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "targeting_templates") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "include_sizing".as[Boolean].?(false), "search_query".as[String].?) { (bookmark, pageSize, order, includeSizing, searchQuery) => 
            targetingTemplateService.targetingTemplateList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, includeSizing = includeSizing, searchQuery = searchQuery)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "targeting_templates") { (adAccountId) => 
      patch {  
            entity(as[TargetingTemplateUpdateRequestReadOrUpdate]){ targetingTemplateUpdateRequestReadOrUpdate =>
              targetingTemplateService.targetingTemplateUpdate(adAccountId = adAccountId, targetingTemplateUpdateRequestReadOrUpdate = targetingTemplateUpdateRequestReadOrUpdate)
            }
      }
    }
}

object TargetingTemplateApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait TargetingTemplateApiService {

  def targetingTemplateCreate200(responseTargetingTemplate: TargetingTemplate)(implicit toEntityMarshallerTargetingTemplate: ToEntityMarshaller[TargetingTemplate]): Route =
    complete((200, responseTargetingTemplate))
  def targetingTemplateCreate201(responseTargetingTemplate: TargetingTemplate)(implicit toEntityMarshallerTargetingTemplate: ToEntityMarshaller[TargetingTemplate]): Route =
    complete((201, responseTargetingTemplate))
  def targetingTemplateCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def targetingTemplateCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def targetingTemplateCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def targetingTemplateCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def targetingTemplateCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TargetingTemplate
   * Code: 201, Message: Resource create operation completed successfully., DataType: TargetingTemplate
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate)
      (implicit toEntityMarshallerTargetingTemplate: ToEntityMarshaller[TargetingTemplate], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingTemplateList200(responseTargetingTemplateList200Response: TargetingTemplateList200Response)(implicit toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response]): Route =
    complete((200, responseTargetingTemplateList200Response))
  def targetingTemplateList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def targetingTemplateList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def targetingTemplateList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def targetingTemplateList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def targetingTemplateListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: TargetingTemplateList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def targetingTemplateList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], includeSizing: Boolean, searchQuery: Option[String])
      (implicit toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingTemplateUpdate200: Route =
    complete((200, "The request has succeeded."))
  def targetingTemplateUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def targetingTemplateUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def targetingTemplateUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def targetingTemplateUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def targetingTemplateUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TargetingTemplateApiMarshaller {
  implicit def fromEntityUnmarshallerTargetingTemplateCreate: FromEntityUnmarshaller[TargetingTemplateCreate]

  implicit def fromEntityUnmarshallerTargetingTemplateUpdateRequestReadOrUpdate: FromEntityUnmarshaller[TargetingTemplateUpdateRequestReadOrUpdate]



  implicit def toEntityMarshallerTargetingTemplate: ToEntityMarshaller[TargetingTemplate]

  implicit def toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

