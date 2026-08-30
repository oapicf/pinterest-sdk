package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BrandAccount
import org.openapitools.server.model.BrandAccountCreate
import org.openapitools.server.model.BrandAccountUpdate
import org.openapitools.server.model.BusinessMembershipMember
import org.openapitools.server.model.DeleteBusinessMembership200Response
import org.openapitools.server.model.DeleteBusinessMembershipBody
import org.openapitools.server.model.DeleteBusinessPartners
import org.openapitools.server.model.DeleteBusinessPartnersDelete
import org.openapitools.server.model.Error
import org.openapitools.server.model.GetBusinessEmployers200Response
import org.openapitools.server.model.MemberBusinessRole
import org.openapitools.server.model.PartnerType
import org.openapitools.server.model.SystemUserUpdateWithRequiredBody
import org.openapitools.server.model.UpdateBusinessMembershipsResponse


class BusinessAccessRelationshipsApi(
    businessAccessRelationshipsService: BusinessAccessRelationshipsApiService,
    businessAccessRelationshipsMarshaller: BusinessAccessRelationshipsApiMarshaller
) {

  import BusinessAccessRelationshipsApiPatterns.businessHierarchyIdPattern
import BusinessAccessRelationshipsApiPatterns.businessIdPattern
import BusinessAccessRelationshipsApiPatterns.systemUserIdPattern

  import businessAccessRelationshipsMarshaller._

  lazy val route: Route =
    path("business_access" / "business_hierarchy" / businessHierarchyIdPattern / "brand_accounts") { (businessHierarchyId) => 
      post {  
            entity(as[BrandAccountCreate]){ brandAccountCreate =>
              businessAccessRelationshipsService.brandAccountsCreate(businessHierarchyId = businessHierarchyId, brandAccountCreate = brandAccountCreate)
            }
      }
    } ~
    path("business_access" / "business_hierarchy" / businessHierarchyIdPattern / "brand_accounts" / Segment) { (brandAccountId, businessHierarchyId) => 
      patch {  
            entity(as[BrandAccountUpdate]){ brandAccountUpdate =>
              businessAccessRelationshipsService.brandAccountsUpdate(brandAccountId = brandAccountId, businessHierarchyId = businessHierarchyId, brandAccountUpdate = brandAccountUpdate)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "members") { (businessId) => 
      delete {  
            entity(as[DeleteBusinessMembershipBody]){ deleteBusinessMembershipBody =>
              businessAccessRelationshipsService.deleteBusinessMembership(businessId = businessId, deleteBusinessMembershipBody = deleteBusinessMembershipBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "partners") { (businessId) => 
      delete {  
            entity(as[DeleteBusinessPartnersDelete]){ deleteBusinessPartnersDelete =>
              businessAccessRelationshipsService.deleteBusinessPartners(businessId = businessId, deleteBusinessPartnersDelete = deleteBusinessPartnersDelete)
            }
      }
    } ~
    path("businesses" / "employers") { 
      get { 
        parameters("assets_summary".as[Boolean].?(true), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (assetsSummary, bookmark, pageSize) => 
            businessAccessRelationshipsService.getBusinessEmployers(assetsSummary = assetsSummary, bookmark = bookmark, pageSize = pageSize)
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
        parameters("assets_summary".as[Boolean].?(false), "partner_type".as[String].?, "partner_ids".as[String].?, "start_index".as[Int].?(0), "sort_ascending".as[Boolean].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize) => 
            businessAccessRelationshipsService.getBusinessPartners(businessId = businessId, assetsSummary = assetsSummary, partnerType = partnerType, partnerIds = partnerIds, startIndex = startIndex, sortAscending = sortAscending, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "system_users" / systemUserIdPattern) { (businessId, systemUserId) => 
      patch {  
            entity(as[SystemUserUpdateWithRequiredBody]){ systemUserUpdateWithRequiredBody =>
              businessAccessRelationshipsService.systemUserUpdate(businessId = businessId, systemUserId = systemUserId, systemUserUpdateWithRequiredBody = systemUserUpdateWithRequiredBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "members") { (businessId) => 
      patch {  
            entity(as[Seq[BusinessMembershipMember]]){ businessMembershipMember =>
              businessAccessRelationshipsService.updateBusinessMemberships(businessId = businessId, businessMembershipMember = businessMembershipMember)
            }
      }
    }
}

object BusinessAccessRelationshipsApiPatterns {

    val businessHierarchyIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val businessIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val systemUserIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BusinessAccessRelationshipsApiService {

  def brandAccountsCreate200(responseBrandAccount: BrandAccount)(implicit toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]): Route =
    complete((200, responseBrandAccount))
  def brandAccountsCreate201(responseBrandAccount: BrandAccount)(implicit toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]): Route =
    complete((201, responseBrandAccount))
  def brandAccountsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def brandAccountsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def brandAccountsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def brandAccountsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def brandAccountsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def brandAccountsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BrandAccount
   * Code: 201, Message: Resource create operation completed successfully., DataType: BrandAccount
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def brandAccountsCreate(businessHierarchyId: String, brandAccountCreate: BrandAccountCreate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]): Route

  def brandAccountsUpdate200(responseBrandAccount: BrandAccount)(implicit toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]): Route =
    complete((200, responseBrandAccount))
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
   * Code: 200, Message: The request has succeeded., DataType: BrandAccount
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 409, Message: The request could not be processed because of a conflict in the current state of the resource., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String, brandAccountUpdate: BrandAccountUpdate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]): Route

  def deleteBusinessMembership200(responseDeleteBusinessMembership200Response: DeleteBusinessMembership200Response)(implicit toEntityMarshallerDeleteBusinessMembership200Response: ToEntityMarshaller[DeleteBusinessMembership200Response]): Route =
    complete((200, responseDeleteBusinessMembership200Response))
  def deleteBusinessMembershipDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DeleteBusinessMembership200Response
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def deleteBusinessMembership(businessId: String, deleteBusinessMembershipBody: DeleteBusinessMembershipBody)
      (implicit toEntityMarshallerDeleteBusinessMembership200Response: ToEntityMarshaller[DeleteBusinessMembership200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def deleteBusinessPartners200(responseDeleteBusinessPartners: DeleteBusinessPartners)(implicit toEntityMarshallerDeleteBusinessPartners: ToEntityMarshaller[DeleteBusinessPartners]): Route =
    complete((200, responseDeleteBusinessPartners))
  def deleteBusinessPartners404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def deleteBusinessPartnersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DeleteBusinessPartners
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def deleteBusinessPartners(businessId: String, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete)
      (implicit toEntityMarshallerDeleteBusinessPartners: ToEntityMarshaller[DeleteBusinessPartners], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessEmployers200(responseGetBusinessEmployers200Response: GetBusinessEmployers200Response)(implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]): Route =
    complete((200, responseGetBusinessEmployers200Response))
  def getBusinessEmployers400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getBusinessEmployers401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getBusinessEmployers403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getBusinessEmployers404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getBusinessEmployers429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getBusinessEmployersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: GetBusinessEmployers200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getBusinessEmployers(assetsSummary: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessMembers200(responseGetBusinessEmployers200Response: GetBusinessEmployers200Response)(implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]): Route =
    complete((200, responseGetBusinessEmployers200Response))
  def getBusinessMembers400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getBusinessMembers401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getBusinessMembers403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getBusinessMembers404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getBusinessMembers429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getBusinessMembersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: GetBusinessEmployers200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getBusinessMembers(businessId: String, fetchSystemUsers: Boolean, assetsSummary: Boolean, businessRoles: Option[String], memberIds: Option[String], startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def getBusinessPartners200(responseGetBusinessEmployers200Response: GetBusinessEmployers200Response)(implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]): Route =
    complete((200, responseGetBusinessEmployers200Response))
  def getBusinessPartners400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def getBusinessPartners401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def getBusinessPartners403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def getBusinessPartners404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def getBusinessPartners429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def getBusinessPartnersDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: GetBusinessEmployers200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def getBusinessPartners(businessId: String, assetsSummary: Boolean, partnerType: Option[String], partnerIds: Option[String], startIndex: Int, sortAscending: Option[Boolean], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def systemUserUpdate200: Route =
    complete((200, "The request has succeeded."))
  def systemUserUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def systemUserUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def systemUserUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def systemUserUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def systemUserUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def systemUserUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
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
  def systemUserUpdate(businessId: String, systemUserId: String, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updateBusinessMemberships200(responseUpdateBusinessMembershipsResponse: UpdateBusinessMembershipsResponse)(implicit toEntityMarshallerUpdateBusinessMembershipsResponse: ToEntityMarshaller[UpdateBusinessMembershipsResponse]): Route =
    complete((200, responseUpdateBusinessMembershipsResponse))
  def updateBusinessMemberships400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updateBusinessMemberships401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updateBusinessMemberships403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updateBusinessMemberships404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updateBusinessMemberships429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updateBusinessMembershipsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UpdateBusinessMembershipsResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updateBusinessMemberships(businessId: String, businessMembershipMember: Seq[BusinessMembershipMember])
      (implicit toEntityMarshallerUpdateBusinessMembershipsResponse: ToEntityMarshaller[UpdateBusinessMembershipsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessRelationshipsApiMarshaller {
  implicit def fromEntityUnmarshallerBusinessMembershipMemberList: FromEntityUnmarshaller[Seq[BusinessMembershipMember]]

  implicit def fromEntityUnmarshallerDeleteBusinessPartnersDelete: FromEntityUnmarshaller[DeleteBusinessPartnersDelete]

  implicit def fromEntityUnmarshallerDeleteBusinessMembershipBody: FromEntityUnmarshaller[DeleteBusinessMembershipBody]

  implicit def fromEntityUnmarshallerSystemUserUpdateWithRequiredBody: FromEntityUnmarshaller[SystemUserUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerBrandAccountCreate: FromEntityUnmarshaller[BrandAccountCreate]

  implicit def fromEntityUnmarshallerBrandAccountUpdate: FromEntityUnmarshaller[BrandAccountUpdate]



  implicit def toEntityMarshallerUpdateBusinessMembershipsResponse: ToEntityMarshaller[UpdateBusinessMembershipsResponse]

  implicit def toEntityMarshallerGetBusinessEmployers200Response: ToEntityMarshaller[GetBusinessEmployers200Response]

  implicit def toEntityMarshallerDeleteBusinessMembership200Response: ToEntityMarshaller[DeleteBusinessMembership200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerDeleteBusinessPartners: ToEntityMarshaller[DeleteBusinessPartners]

  implicit def toEntityMarshallerBrandAccount: ToEntityMarshaller[BrandAccount]

}

