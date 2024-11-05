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
import org.openapitools.server.model.TargetingTemplateCreate
import org.openapitools.server.model.TargetingTemplateGetResponseData
import org.openapitools.server.model.TargetingTemplateList200Response
import org.openapitools.server.model.TargetingTemplateUpdateRequest


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
        parameters("order".as[String].?, "include_sizing".as[Boolean].?(false), "search_query".as[String].?, "page_size".as[Int].?(25), "bookmark".as[String].?) { (order, includeSizing, searchQuery, pageSize, bookmark) => 
            targetingTemplateService.targetingTemplateList(adAccountId = adAccountId, order = order, includeSizing = includeSizing, searchQuery = searchQuery, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "targeting_templates") { (adAccountId) => 
      patch {  
            entity(as[TargetingTemplateUpdateRequest]){ targetingTemplateUpdateRequest =>
              targetingTemplateService.targetingTemplateUpdate(adAccountId = adAccountId, targetingTemplateUpdateRequest = targetingTemplateUpdateRequest)
            }
      }
    }
}

object TargetingTemplateApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait TargetingTemplateApiService {

  def targetingTemplateCreate200(responseTargetingTemplateGetResponseData: TargetingTemplateGetResponseData)(implicit toEntityMarshallerTargetingTemplateGetResponseData: ToEntityMarshaller[TargetingTemplateGetResponseData]): Route =
    complete((200, responseTargetingTemplateGetResponseData))
  def targetingTemplateCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TargetingTemplateGetResponseData
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate)
      (implicit toEntityMarshallerTargetingTemplateGetResponseData: ToEntityMarshaller[TargetingTemplateGetResponseData], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingTemplateList200(responseTargetingTemplateList200Response: TargetingTemplateList200Response)(implicit toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response]): Route =
    complete((200, responseTargetingTemplateList200Response))
  def targetingTemplateList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: TargetingTemplateList200Response
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def targetingTemplateList(adAccountId: String, order: Option[String], includeSizing: Boolean, searchQuery: Option[String], pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def targetingTemplateUpdate200: Route =
    complete((200, "Success"))
  def targetingTemplateUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def targetingTemplateUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success
   * Code: 400, Message: Invalid ad account id., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait TargetingTemplateApiMarshaller {
  implicit def fromEntityUnmarshallerTargetingTemplateCreate: FromEntityUnmarshaller[TargetingTemplateCreate]

  implicit def fromEntityUnmarshallerTargetingTemplateUpdateRequest: FromEntityUnmarshaller[TargetingTemplateUpdateRequest]



  implicit def toEntityMarshallerTargetingTemplateList200Response: ToEntityMarshaller[TargetingTemplateList200Response]

  implicit def toEntityMarshallerTargetingTemplateGetResponseData: ToEntityMarshaller[TargetingTemplateGetResponseData]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

