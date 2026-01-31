package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BrandAccountsCreate200Response
import org.openapitools.server.model.BrandAccountsCreateRequest
import org.openapitools.server.model.BrandAccountsUpdateRequest
import org.openapitools.server.model.DeletePartnersRequest
import org.openapitools.server.model.DeletePartnersResponse
import org.openapitools.server.model.DeletedMembersResponse
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetBusinessEmployers200Response
import org.openapitools.server.model.GetBusinessMembers200Response
import org.openapitools.server.model.GetBusinessPartners200Response
import org.openapitools.server.model.MemberBusinessRole
import org.openapitools.server.model.MembersToDeleteBody
import org.openapitools.server.model.PartnerType
import org.openapitools.server.model.SystemUserUpdateRequest
import org.openapitools.server.model.UpdateMemberBusinessRoleBody
import org.openapitools.server.model.UpdateMemberResultsResponseArray


class BusinessAccessRelationshipsApi(
    businessAccessRelationshipsService: BusinessAccessRelationshipsApiService,
    businessAccessRelationshipsMarshaller: BusinessAccessRelationshipsApiMarshaller
) {

  import BusinessAccessRelationshipsApiPatterns.businessHierarchyIdPattern
import BusinessAccessRelationshipsApiPatterns.businessIdPattern
import BusinessAccessRelationshipsApiPatterns.systemUserIdPattern
import BusinessAccessRelationshipsApiPatterns.brandAccountIdPattern

  import businessAccessRelationshipsMarshaller._

  lazy val route: Route =
    path("business_access" / "business_hierarchy" / businessHierarchyIdPattern / "brand_accounts") { (businessHierarchyId) => 
      post {  
            entity(as[BrandAccountsCreateRequest]){ brandAccountsCreateRequest =>
              businessAccessRelationshipsService.brandAccountsCreate(businessHierarchyId = businessHierarchyId, brandAccountsCreateRequest = brandAccountsCreateRequest)
            }
      }
    } ~
    path("business_access" / "business_hierarchy" / businessHierarchyIdPattern / "brand_accounts" / brandAccountIdPattern) { (businessHierarchyId, brandAccountId) => 
      patch {  
            entity(as[BrandAccountsUpdateRequest]){ brandAccountsUpdateRequest =>
              businessAccessRelationshipsService.brandAccountsUpdate(businessHierarchyId = businessHierarchyId, brandAccountId = brandAccountId, brandAccountsUpdateRequest = brandAccountsUpdateRequest)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "members") { (businessId) => 
      delete {  
            entity(as[MembersToDeleteBody]){ membersToDeleteBody =>
              businessAccessRelationshipsService.deleteBusinessMembership(businessId = businessId, membersToDeleteBody = membersToDeleteBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "partners") { (businessId) => 
      delete {  
            entity(as[DeletePartnersRequest]){ deletePartnersRequest =>
              businessAccessRelationshipsService.deleteBusinessPartners(businessId = businessId, deletePartnersRequest = deletePartnersRequest)
            }
      }
    } ~
    path("businesses" / "employers") { 
      get { 
        parameters("page_size".as[Int].?(25), "bookmark".as[String].?) { (pageSize, bookmark) => 
            businessAccessRelationshipsService.getBusinessEmployers(pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "members") { (businessId) => 
      get { 
        parameters("fetch_system_users".as[Boolean].?(false), "assets_summary".as[Boolean].?(false), "business_roles".as[String].?, "member_ids".as[String].?, "start_index".as[Int].?(0), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize) => 
            businessAccessRelationshipsService.getBusinessMembers(businessId = businessId, fetchSystemUsers = fetchSystemUsers, assetsSummary = assetsSummary, businessRoles = businessRoles, memberIds = memberIds, startIndex = startIndex, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "partners") { (businessId) => 
      get { 
        parameters("assets_summary".as[Boolean].?(false), "partner_type".as[String].?, "partner_ids".as[String].?, "start_index".as[Int].?(0), "page_size".as[Int].?(25), "bookmark".as[String].?) { (assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark) => 
            businessAccessRelationshipsService.getBusinessPartners(businessId = businessId, assetsSummary = assetsSummary, partnerType = partnerType, partnerIds = partnerIds, startIndex = startIndex, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "system_users" / systemUserIdPattern) { (businessId, systemUserId) => 
      patch {  
            entity(as[SystemUserUpdateRequest]){ systemUserUpdateRequest =>
              businessAccessRelationshipsService.systemUserUpdate(businessId = businessId, systemUserId = systemUserId, systemUserUpdateRequest = systemUserUpdateRequest)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "members") { (businessId) => 
      patch {  
            entity(as[Seq[UpdateMemberBusinessRoleBody]]){ updateMemberBusinessRoleBody =>
              businessAccessRelationshipsService.updateBusinessMemberships(businessId = businessId, updateMemberBusinessRoleBody = updateMemberBusinessRoleBody)
            }
      }
    }
}

object BusinessAccessRelationshipsApiPatterns {

    val businessHierarchyIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val businessIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val systemUserIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val brandAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BusinessAccessRelationshipsApiService {

  def brandAccountsCreate200(responseBrandAccountsCreate200Response: BrandAccountsCreate200Response)(implicit toEntityMarshallerBrandAccountsCreate200Response: ToEntityMarshaller[BrandAccountsCreate200Response]): Route =
    complete((200, responseBrandAccountsCreate200Response))
  def brandAccountsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def brandAccountsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BrandAccountsCreate200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def brandAccountsCreate(businessHierarchyId: String, brandAccountsCreateRequest: BrandAccountsCreateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBrandAccountsCreate200Response: ToEntityMarshaller[BrandAccountsCreate200Response]): Route

  def brandAccountsUpdate200(responseBrandAccountsCreate200Response: BrandAccountsCreate200Response)(implicit toEntityMarshallerBrandAccountsCreate200Response: ToEntityMarshaller[BrandAccountsCreate200Response]): Route =
    complete((200, responseBrandAccountsCreate200Response))
  def brandAccountsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def brandAccountsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def brandAccountsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def brandAccountsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def brandAccountsUpdate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def brandAccountsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def brandAccountsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BrandAccountsCreate200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Not authenticated to update Brand Account, DataType: Error
   * Code: 403, Message: Not authorized to update Brand Account, DataType: Error
   * Code: 404, Message: Brand account not found, DataType: Error
   * Code: 409, Message: This account is not a brand account., DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def brandAccountsUpdate(businessHierarchyId: String, brandAccountId: String, brandAccountsUpdateRequest: BrandAccountsUpdateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBrandAccountsCreate200Response: ToEntityMarshaller[BrandAccountsCreate200Response]): Route

  def deleteBusinessMembership200(responseDeletedMembersResponse: DeletedMembersResponse)(implicit toEntityMarshallerDeletedMembersResponse: ToEntityMarshaller[DeletedMembersResponse]): Route =
    complete((200, responseDeletedMembersResponse))
  def deleteBusinessMembershipDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeletedMembersResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerDeletedMembersResponse: ToEntityMarshaller[DeletedMembersResponse]): Route

  def deleteBusinessPartners200(responseDeletePartnersResponse: DeletePartnersResponse)(implicit toEntityMarshallerDeletePartnersResponse: ToEntityMarshaller[DeletePartnersResponse]): Route =
    complete((200, responseDeletePartnersResponse))
  def deleteBusinessPartners404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def deleteBusinessPartnersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeletePartnersResponse
   * Code: 404, Message: A supplied partner id doesn&#39;t exist, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest)
      (implicit toEntityMarshallerDeletePartnersResponse: ToEntityMarshaller[DeletePartnersResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessEmployers200(responseGetBusinessEmployers200Response: GetBusinessEmployers200Response)(implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]): Route =
    complete((200, responseGetBusinessEmployers200Response))
  def getBusinessEmployersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: GetBusinessEmployers200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def getBusinessEmployers(pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessMembers200(responseGetBusinessMembers200Response: GetBusinessMembers200Response)(implicit toEntityMarshallerGetBusinessMembers200Response: ToEntityMarshaller[GetBusinessMembers200Response]): Route =
    complete((200, responseGetBusinessMembers200Response))
  def getBusinessMembersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: GetBusinessMembers200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def getBusinessMembers(businessId: String, fetchSystemUsers: Boolean, assetsSummary: Boolean, businessRoles: Option[String], memberIds: Option[String], startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetBusinessMembers200Response: ToEntityMarshaller[GetBusinessMembers200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessPartners200(responseGetBusinessPartners200Response: GetBusinessPartners200Response)(implicit toEntityMarshallerGetBusinessPartners200Response: ToEntityMarshaller[GetBusinessPartners200Response]): Route =
    complete((200, responseGetBusinessPartners200Response))
  def getBusinessPartnersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: GetBusinessPartners200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def getBusinessPartners(businessId: String, assetsSummary: Boolean, partnerType: Option[String], partnerIds: Option[String], startIndex: Int, pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerGetBusinessPartners200Response: ToEntityMarshaller[GetBusinessPartners200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def systemUserUpdate200: Route =
    complete((200, "System user updated successfully."))
  def systemUserUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def systemUserUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: System user updated successfully.
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateRequest: SystemUserUpdateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateBusinessMemberships200(responseUpdateMemberResultsResponseArray: UpdateMemberResultsResponseArray)(implicit toEntityMarshallerUpdateMemberResultsResponseArray: ToEntityMarshaller[UpdateMemberResultsResponseArray]): Route =
    complete((200, responseUpdateMemberResultsResponseArray))
  def updateBusinessMembershipsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: UpdateMemberResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updateBusinessMemberships(businessId: String, updateMemberBusinessRoleBody: Seq[UpdateMemberBusinessRoleBody])
      (implicit toEntityMarshallerUpdateMemberResultsResponseArray: ToEntityMarshaller[UpdateMemberResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessRelationshipsApiMarshaller {
  implicit def fromEntityUnmarshallerMembersToDeleteBody: FromEntityUnmarshaller[MembersToDeleteBody]

  implicit def fromEntityUnmarshallerUpdateMemberBusinessRoleBodyList: FromEntityUnmarshaller[Seq[UpdateMemberBusinessRoleBody]]

  implicit def fromEntityUnmarshallerDeletePartnersRequest: FromEntityUnmarshaller[DeletePartnersRequest]

  implicit def fromEntityUnmarshallerBrandAccountsCreateRequest: FromEntityUnmarshaller[BrandAccountsCreateRequest]

  implicit def fromEntityUnmarshallerSystemUserUpdateRequest: FromEntityUnmarshaller[SystemUserUpdateRequest]

  implicit def fromEntityUnmarshallerBrandAccountsUpdateRequest: FromEntityUnmarshaller[BrandAccountsUpdateRequest]



  implicit def toEntityMarshallerDeletePartnersResponse: ToEntityMarshaller[DeletePartnersResponse]

  implicit def toEntityMarshallerGetBusinessPartners200Response: ToEntityMarshaller[GetBusinessPartners200Response]

  implicit def toEntityMarshallerGetBusinessMembers200Response: ToEntityMarshaller[GetBusinessMembers200Response]

  implicit def toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]

  implicit def toEntityMarshallerUpdateMemberResultsResponseArray: ToEntityMarshaller[UpdateMemberResultsResponseArray]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerBrandAccountsCreate200Response: ToEntityMarshaller[BrandAccountsCreate200Response]

  implicit def toEntityMarshallerDeletedMembersResponse: ToEntityMarshaller[DeletedMembersResponse]

}

