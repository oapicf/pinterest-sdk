package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Audience
import org.openapitools.server.model.AudienceCreateCustomRequest
import org.openapitools.server.model.AudienceCreateRequest
import org.openapitools.server.model.AudienceUpdateRequest
import org.openapitools.server.model.AudiencesList200Response
import org.openapitools.server.model.Error


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
            entity(as[AudienceCreateRequest]){ audienceCreateRequest =>
              audiencesService.audiencesCreate(adAccountId = adAccountId, audienceCreateRequest = audienceCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / "custom") { (adAccountId) => 
      post {  
            entity(as[AudienceCreateCustomRequest]){ audienceCreateCustomRequest =>
              audiencesService.audiencesCreateCustom(adAccountId = adAccountId, audienceCreateCustomRequest = audienceCreateCustomRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / audienceIdPattern) { (adAccountId, audienceId) => 
      get {  
            audiencesService.audiencesGet(adAccountId = adAccountId, audienceId = audienceId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "order".as[String].?, "page_size".as[Int].?(25), "ownership_type".as[String].?("OWNED")) { (bookmark, order, pageSize, ownershipType) => 
            audiencesService.audiencesList(adAccountId = adAccountId, bookmark = bookmark, order = order, pageSize = pageSize, ownershipType = ownershipType)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "audiences" / audienceIdPattern) { (adAccountId, audienceId) => 
      patch {  
            entity(as[AudienceUpdateRequest]){ audienceUpdateRequest =>
              audiencesService.audiencesUpdate(adAccountId = adAccountId, audienceId = audienceId, audienceUpdateRequest = audienceUpdateRequest)
            }
      }
    }
}

object AudiencesApiPatterns {

    val audienceIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AudiencesApiService {

  def audiencesCreate200(responseAudience: Audience)(implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience]): Route =
    complete((200, responseAudience))
  def audiencesCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Audience
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest)
      (implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesCreateCustom200(responseAudience: Audience)(implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience]): Route =
    complete((200, responseAudience))
  def audiencesCreateCustomDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Audience
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audiencesCreateCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest)
      (implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesGet200(responseAudience: Audience)(implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience]): Route =
    complete((200, responseAudience))
  def audiencesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audiencesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Audience
   * Code: 404, Message: Audience not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def audiencesGet(adAccountId: String, audienceId: String)
      (implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesList200(responseAudiencesList200Response: AudiencesList200Response)(implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]): Route =
    complete((200, responseAudiencesList200Response))
  def audiencesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audiencesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AudiencesList200Response
   * Code: 400, Message: Invalid ad account audience parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audiencesList(adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Int, ownershipType: String)
      (implicit toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audiencesUpdate200(responseAudience: Audience)(implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience]): Route =
    complete((200, responseAudience))
  def audiencesUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Audience
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: Option[AudienceUpdateRequest])
      (implicit toEntityMarshallerAudience: ToEntityMarshaller[Audience], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AudiencesApiMarshaller {
  implicit def fromEntityUnmarshallerAudienceUpdateRequest: FromEntityUnmarshaller[AudienceUpdateRequest]

  implicit def fromEntityUnmarshallerAudienceCreateRequest: FromEntityUnmarshaller[AudienceCreateRequest]

  implicit def fromEntityUnmarshallerAudienceCreateCustomRequest: FromEntityUnmarshaller[AudienceCreateCustomRequest]



  implicit def toEntityMarshallerAudiencesList200Response: ToEntityMarshaller[AudiencesList200Response]

  implicit def toEntityMarshallerAudience: ToEntityMarshaller[Audience]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

