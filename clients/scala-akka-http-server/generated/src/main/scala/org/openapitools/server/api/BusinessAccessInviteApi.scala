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
import org.openapitools.server.model.CancelInvitesRequest
import org.openapitools.server.model.CancelInvitesResponse
import org.openapitools.server.model.CreateAssetAccessRequestBody
import org.openapitools.server.model.CreateAssetAccessRequestResponse
import org.openapitools.server.model.CreateAssetInvitesRequest
import org.openapitools.server.model.CreateInvitesResultsResponseArray
import org.openapitools.server.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetInvites200Response
import org.openapitools.server.model.InviteFilterStatus
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
            entity(as[CancelInvitesRequest]){ cancelInvitesRequest =>
              businessAccessInviteService.cancelInvitesOrRequests(businessId = businessId, cancelInvitesRequest = cancelInvitesRequest)
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

    val businessIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BusinessAccessInviteApiService {

  def assetAccessRequestsCreate200(responseCreateAssetAccessRequestResponse: CreateAssetAccessRequestResponse)(implicit toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse]): Route =
    complete((200, responseCreateAssetAccessRequestResponse))
  def assetAccessRequestsCreate201(responseCreateAssetAccessRequestResponse: CreateAssetAccessRequestResponse)(implicit toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse]): Route =
    complete((201, responseCreateAssetAccessRequestResponse))
  def assetAccessRequestsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetAccessRequestsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def assetAccessRequestsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def assetAccessRequestsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def assetAccessRequestsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def assetAccessRequestsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CreateAssetAccessRequestResponse
   * Code: 201, Message: Resource create operation completed successfully., DataType: CreateAssetAccessRequestResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def assetAccessRequestsCreate(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody)
      (implicit toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def cancelInvitesOrRequests200(responseCancelInvitesResponse: CancelInvitesResponse)(implicit toEntityMarshallerCancelInvitesResponse: ToEntityMarshaller[CancelInvitesResponse]): Route =
    complete((200, responseCancelInvitesResponse))
  def cancelInvitesOrRequestsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CancelInvitesResponse
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def cancelInvitesOrRequests(businessId: String, cancelInvitesRequest: CancelInvitesRequest)
      (implicit toEntityMarshallerCancelInvitesResponse: ToEntityMarshaller[CancelInvitesResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def createAssetInvites200(responseUpdateInvitesResultsResponseArray: UpdateInvitesResultsResponseArray)(implicit toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray]): Route =
    complete((200, responseUpdateInvitesResultsResponseArray))
  def createAssetInvites201(responseUpdateInvitesResultsResponseArray: UpdateInvitesResultsResponseArray)(implicit toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray]): Route =
    complete((201, responseUpdateInvitesResultsResponseArray))
  def createAssetInvites400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def createAssetInvites401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def createAssetInvites403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def createAssetInvites404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def createAssetInvites429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def createAssetInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UpdateInvitesResultsResponseArray
   * Code: 201, Message: Resource create operation completed successfully., DataType: UpdateInvitesResultsResponseArray
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest)
      (implicit toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def createMembershipOrPartnershipInvites200(responseCreateInvitesResultsResponseArray: CreateInvitesResultsResponseArray)(implicit toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray]): Route =
    complete((200, responseCreateInvitesResultsResponseArray))
  def createMembershipOrPartnershipInvites201(responseCreateInvitesResultsResponseArray: CreateInvitesResultsResponseArray)(implicit toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray]): Route =
    complete((201, responseCreateInvitesResultsResponseArray))
  def createMembershipOrPartnershipInvites400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def createMembershipOrPartnershipInvites401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def createMembershipOrPartnershipInvites403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def createMembershipOrPartnershipInvites404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def createMembershipOrPartnershipInvites429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def createMembershipOrPartnershipInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CreateInvitesResultsResponseArray
   * Code: 201, Message: Resource create operation completed successfully., DataType: CreateInvitesResultsResponseArray
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody)
      (implicit toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getInvites200(responseGetInvites200Response: GetInvites200Response)(implicit toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response]): Route =
    complete((200, responseGetInvites200Response))
  def getInvites400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getInvites401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getInvites403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getInvites404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getInvites429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: GetInvites200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getInvites(businessId: String, isMember: Boolean, inviteStatus: Option[String], inviteType: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def respondBusinessAccessInvites200(responseRespondToInvitesResponseArray: RespondToInvitesResponseArray)(implicit toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray]): Route =
    complete((200, responseRespondToInvitesResponseArray))
  def respondBusinessAccessInvites400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def respondBusinessAccessInvites401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def respondBusinessAccessInvites403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def respondBusinessAccessInvites404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def respondBusinessAccessInvites429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def respondBusinessAccessInvitesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: RespondToInvitesResponseArray
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody)
      (implicit toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessInviteApiMarshaller {
  implicit def fromEntityUnmarshallerCancelInvitesRequest: FromEntityUnmarshaller[CancelInvitesRequest]

  implicit def fromEntityUnmarshallerAuthRespondInvitesBody: FromEntityUnmarshaller[AuthRespondInvitesBody]

  implicit def fromEntityUnmarshallerCreateAssetInvitesRequest: FromEntityUnmarshaller[CreateAssetInvitesRequest]

  implicit def fromEntityUnmarshallerCreateAssetAccessRequestBody: FromEntityUnmarshaller[CreateAssetAccessRequestBody]

  implicit def fromEntityUnmarshallerCreateMembershipOrPartnershipInvitesBody: FromEntityUnmarshaller[CreateMembershipOrPartnershipInvitesBody]



  implicit def toEntityMarshallerUpdateInvitesResultsResponseArray: ToEntityMarshaller[UpdateInvitesResultsResponseArray]

  implicit def toEntityMarshallerCreateInvitesResultsResponseArray: ToEntityMarshaller[CreateInvitesResultsResponseArray]

  implicit def toEntityMarshallerGetInvites200Response: ToEntityMarshaller[GetInvites200Response]

  implicit def toEntityMarshallerCreateAssetAccessRequestResponse: ToEntityMarshaller[CreateAssetAccessRequestResponse]

  implicit def toEntityMarshallerCancelInvitesResponse: ToEntityMarshaller[CancelInvitesResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerRespondToInvitesResponseArray: ToEntityMarshaller[RespondToInvitesResponseArray]

}

