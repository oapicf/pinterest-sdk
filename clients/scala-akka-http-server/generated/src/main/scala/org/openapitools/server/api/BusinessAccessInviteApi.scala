package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AuthRespondInvitesBody
import org.openapitools.server.model.CancelInvitesBody
import org.openapitools.server.model.CreateAssetAccessRequestBody
import org.openapitools.server.model.CreateAssetAccessRequestResponse
import org.openapitools.server.model.CreateAssetInvitesRequest
import org.openapitools.server.model.CreateInvitesResultsResponseArray
import org.openapitools.server.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.model.DeleteInvitesResultsResponseArray
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetInvites200Response
import org.openapitools.server.model.InviteType
import org.openapitools.server.model.RespondToInvitesResponseArray
import org.openapitools.server.model.UpdateInvitesResultsResponseArray


class BusinessAccessInviteApi(
    businessAccessInviteService: BusinessAccessInviteApiService,
    businessAccessInviteMarshaller: BusinessAccessInviteApiMarshaller
) {

  import BusinessAccessInviteApiPatterns.businessIdPattern

  import businessAccessInviteMarshaller._

  lazy val route: Route =
    path("businesses" / businessIdPattern / "requests" / "assets" / "access") { (businessId) => 
      post {  
            entity(as[CreateAssetAccessRequestBody]){ createAssetAccessRequestBody =>
              businessAccessInviteService.assetAccessRequestsCreate(businessId = businessId, createAssetAccessRequestBody = createAssetAccessRequestBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "invites") { (businessId) => 
      delete {  
            entity(as[CancelInvitesBody]){ cancelInvitesBody =>
              businessAccessInviteService.cancelInvitesOrRequests(businessId = businessId, cancelInvitesBody = cancelInvitesBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "invites" / "assets" / "access") { (businessId) => 
      post {  
            entity(as[CreateAssetInvitesRequest]){ createAssetInvitesRequest =>
              businessAccessInviteService.createAssetInvites(businessId = businessId, createAssetInvitesRequest = createAssetInvitesRequest)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "invites") { (businessId) => 
      post {  
            entity(as[CreateMembershipOrPartnershipInvitesBody]){ createMembershipOrPartnershipInvitesBody =>
              businessAccessInviteService.createMembershipOrPartnershipInvites(businessId = businessId, createMembershipOrPartnershipInvitesBody = createMembershipOrPartnershipInvitesBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "invites") { (businessId) => 
      get { 
        parameters("is_member".as[Boolean].?(true), "invite_status".as[String].?, "invite_type".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (isMember, inviteStatus, inviteType, bookmark, pageSize) => 
            businessAccessInviteService.getInvites(businessId = businessId, isMember = isMember, inviteStatus = inviteStatus, inviteType = inviteType, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / "invites") { 
      patch {  
            entity(as[AuthRespondInvitesBody]){ authRespondInvitesBody =>
              businessAccessInviteService.respondBusinessAccessInvites(authRespondInvitesBody = authRespondInvitesBody)
            }
      }
    }
}

object BusinessAccessInviteApiPatterns {

    val businessIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BusinessAccessInviteApiService {

  def assetAccessRequestsCreate200(responseCreateAssetAccessRequestResponse: CreateAssetAccessRequestResponse)(implicit toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse]): Route =
    complete((200, responseCreateAssetAccessRequestResponse))
  def assetAccessRequestsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CreateAssetAccessRequestResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody)
      (implicit toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def cancelInvitesOrRequests200(responseDeleteInvitesResultsResponseArray: DeleteInvitesResultsResponseArray)(implicit toEntityMarshallerDeleteInvitesResultsResponseArray: ToEntityMarshaller[DeleteInvitesResultsResponseArray]): Route =
    complete((200, responseDeleteInvitesResultsResponseArray))
  def cancelInvitesOrRequestsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeleteInvitesResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def cancelInvitesOrRequests(businessId: String, cancelInvitesBody: CancelInvitesBody)
      (implicit toEntityMarshallerDeleteInvitesResultsResponseArray: ToEntityMarshaller[DeleteInvitesResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def createAssetInvites200(responseUpdateInvitesResultsResponseArray: UpdateInvitesResultsResponseArray)(implicit toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray]): Route =
    complete((200, responseUpdateInvitesResultsResponseArray))
  def createAssetInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UpdateInvitesResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest)
      (implicit toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def createMembershipOrPartnershipInvites200(responseCreateInvitesResultsResponseArray: CreateInvitesResultsResponseArray)(implicit toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray]): Route =
    complete((200, responseCreateInvitesResultsResponseArray))
  def createMembershipOrPartnershipInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CreateInvitesResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody)
      (implicit toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getInvites200(responseGetInvites200Response: GetInvites200Response)(implicit toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response]): Route =
    complete((200, responseGetInvites200Response))
  def getInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: GetInvites200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def getInvites(businessId: String, isMember: Boolean, inviteStatus: Option[String], inviteType: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def respondBusinessAccessInvites200(responseRespondToInvitesResponseArray: RespondToInvitesResponseArray)(implicit toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray]): Route =
    complete((200, responseRespondToInvitesResponseArray))
  def respondBusinessAccessInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: RespondToInvitesResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody)
      (implicit toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessInviteApiMarshaller {
  implicit def fromEntityUnmarshallerAuthRespondInvitesBody: FromEntityUnmarshaller[AuthRespondInvitesBody]

  implicit def fromEntityUnmarshallerCreateAssetInvitesRequest: FromEntityUnmarshaller[CreateAssetInvitesRequest]

  implicit def fromEntityUnmarshallerCancelInvitesBody: FromEntityUnmarshaller[CancelInvitesBody]

  implicit def fromEntityUnmarshallerCreateAssetAccessRequestBody: FromEntityUnmarshaller[CreateAssetAccessRequestBody]

  implicit def fromEntityUnmarshallerCreateMembershipOrPartnershipInvitesBody: FromEntityUnmarshaller[CreateMembershipOrPartnershipInvitesBody]



  implicit def toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray]

  implicit def toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray]

  implicit def toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response]

  implicit def toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse]

  implicit def toEntityMarshallerDeleteInvitesResultsResponseArray: ToEntityMarshaller[DeleteInvitesResultsResponseArray]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray]

}

