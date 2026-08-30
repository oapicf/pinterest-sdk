package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountsAudience
import org.openapitools.server.model.AdAccountsAudienceCreate
import org.openapitools.server.model.AdAccountsAudienceUpdate
import org.openapitools.server.model.AudienceOwnershipType
import org.openapitools.server.model.AudiencesList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder


class AudiencesApi(
    audiencesService: AudiencesApiService,
    audiencesMarshaller: AudiencesApiMarshaller
) {

  import AudiencesApiPatterns.audienceIdPattern
import AudiencesApiPatterns.adAccountIdPattern

  import audiencesMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "audiences") { (adAccountId) => 
      post {  
            entity(as[AdAccountsAudienceCreate]){ adAccountsAudienceCreate =>
              audiencesService.audiencesCreate(adAccountId = adAccountId, adAccountsAudienceCreate = adAccountsAudienceCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / audienceIdPattern) { (audienceId, adAccountId) => 
      get {  
            audiencesService.audiencesGet(audienceId = audienceId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "ownership_type".as[String].?, "exclude_nca".as[Boolean].?(false)) { (bookmark, pageSize, order, ownershipType, excludeNca) => 
            audiencesService.audiencesList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, ownershipType = ownershipType, excludeNca = excludeNca)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / audienceIdPattern) { (audienceId, adAccountId) => 
      patch {  
            entity(as[AdAccountsAudienceUpdate]){ adAccountsAudienceUpdate =>
              audiencesService.audiencesUpdate(audienceId = audienceId, adAccountId = adAccountId, adAccountsAudienceUpdate = adAccountsAudienceUpdate)
            }
      }
    }
}

object AudiencesApiPatterns {

    val audienceIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait AudiencesApiService {

  def audiencesCreate200(responseAdAccountsAudience: AdAccountsAudience)(implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience]): Route =
    complete((200, responseAdAccountsAudience))
  def audiencesCreate201(responseAdAccountsAudience: AdAccountsAudience)(implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience]): Route =
    complete((201, responseAdAccountsAudience))
  def audiencesCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audiencesCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audiencesCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audiencesCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audiencesCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audiencesCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsAudience
   * Code: 201, Message: Resource create operation completed successfully., DataType: AdAccountsAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audiencesCreate(adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate)
      (implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesGet200(responseAdAccountsAudience: AdAccountsAudience)(implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience]): Route =
    complete((200, responseAdAccountsAudience))
  def audiencesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audiencesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audiencesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audiencesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audiencesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audiencesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audiencesGet(audienceId: String, adAccountId: String)
      (implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesList200(responseAudiencesList200Response: AudiencesList200Response)(implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]): Route =
    complete((200, responseAudiencesList200Response))
  def audiencesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audiencesList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audiencesList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audiencesList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audiencesList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audiencesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AudiencesList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audiencesList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], ownershipType: Option[String], excludeNca: Boolean)
      (implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesUpdate200(responseAdAccountsAudience: AdAccountsAudience)(implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience]): Route =
    complete((200, responseAdAccountsAudience))
  def audiencesUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audiencesUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audiencesUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audiencesUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audiencesUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audiencesUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsAudience
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audiencesUpdate(audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate)
      (implicit toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AudiencesApiMarshaller {
  implicit def fromEntityUnmarshallerAdAccountsAudienceUpdate: FromEntityUnmarshaller[AdAccountsAudienceUpdate]

  implicit def fromEntityUnmarshallerAdAccountsAudienceCreate: FromEntityUnmarshaller[AdAccountsAudienceCreate]



  implicit def toEntityMarshallerAdAccountsAudience: ToEntityMarshaller[AdAccountsAudience]

  implicit def toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

