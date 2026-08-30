package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AssetGroupDeletion
import org.openapitools.server.model.AssetGroupDeletionDelete
import org.openapitools.server.model.AssetGroupInput
import org.openapitools.server.model.AssetGroupInputCreate
import org.openapitools.server.model.AssetGroupModification
import org.openapitools.server.model.AssetGroupModificationReadOrUpdate
import org.openapitools.server.model.AssetPermissionType
import org.openapitools.server.model.AssetSearchBy
import org.openapitools.server.model.AssetSortBy
import org.openapitools.server.model.BusinessAssetMembersGet200Response
import org.openapitools.server.model.BusinessAssetsGet200Response
import org.openapitools.server.model.BusinessMemberAssetsGetResponse
import org.openapitools.server.model.BusinessMembersAssetAccessDeleteBody
import org.openapitools.server.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.server.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.server.model.DeletePartnerAssetAccessBody
import org.openapitools.server.model.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.server.model.Error
import org.openapitools.server.model.NonDraftEntityStatus
import org.openapitools.server.model.PermissionsWithOwner
import org.openapitools.server.model.UpdateMemberAssetAccessBody
import org.openapitools.server.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.server.model.UpdatePartnerAssetAccessBody
import org.openapitools.server.model.UpdatePartnerAssetsResultsResponseArray


class BusinessAccessAssetsApi(
    businessAccessAssetsService: BusinessAccessAssetsApiService,
    businessAccessAssetsMarshaller: BusinessAccessAssetsApiMarshaller
) {

  import BusinessAccessAssetsApiPatterns.businessIdPattern
import BusinessAccessAssetsApiPatterns.partnerIdPattern
import BusinessAccessAssetsApiPatterns.assetIdPattern
import BusinessAccessAssetsApiPatterns.memberIdPattern

  import businessAccessAssetsMarshaller._

  lazy val route: Route =
    path("businesses" / businessIdPattern / "asset_groups") { (businessId) => 
      post {  
            entity(as[AssetGroupInputCreate]){ assetGroupInputCreate =>
              businessAccessAssetsService.assetGroupCreate(businessId = businessId, assetGroupInputCreate = assetGroupInputCreate)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "asset_groups") { (businessId) => 
      delete {  
            entity(as[AssetGroupDeletionDelete]){ assetGroupDeletionDelete =>
              businessAccessAssetsService.assetGroupDelete(businessId = businessId, assetGroupDeletionDelete = assetGroupDeletionDelete)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "asset_groups") { (businessId) => 
      patch {  
            entity(as[AssetGroupModificationReadOrUpdate]){ assetGroupModificationReadOrUpdate =>
              businessAccessAssetsService.assetGroupUpdate(businessId = businessId, assetGroupModificationReadOrUpdate = assetGroupModificationReadOrUpdate)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "assets" / assetIdPattern / "members") { (businessId, assetId) => 
      get { 
        parameters("start_index".as[Int].?(0), "fetch_system_users".as[Boolean].?(false), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (startIndex, fetchSystemUsers, bookmark, pageSize) => 
            businessAccessAssetsService.businessAssetMembersGet(businessId = businessId, assetId = assetId, startIndex = startIndex, fetchSystemUsers = fetchSystemUsers, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "assets" / assetIdPattern / "partners") { (businessId, assetId) => 
      get { 
        parameters("start_index".as[Int].?(0), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (startIndex, bookmark, pageSize) => 
            businessAccessAssetsService.businessAssetPartnersGet(businessId = businessId, assetId = assetId, startIndex = startIndex, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "assets") { (businessId) => 
      get { 
        parameters("permissions".as[String].?, "child_asset_id".as[String].?, "asset_group_id".as[String].?, "asset_type".as[String].?("AD_ACCOUNT"), "start_index".as[Int].?(0), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize) => 
            businessAccessAssetsService.businessAssetsGet(businessId = businessId, permissions = permissions, childAssetId = childAssetId, assetGroupId = assetGroupId, assetType = assetType, startIndex = startIndex, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "members" / memberIdPattern / "assets") { (businessId, memberId) => 
      get { 
        parameters("asset_type".as[String].?("AD_ACCOUNT"), "start_index".as[Int].?(0), "sort_by".as[String].?, "sort_ascending".as[Boolean].?(true), "search_by".as[String].?, "search_value".as[String].?, "asset_permission_type".as[String].?, "ad_account_statuses".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize) => 
            businessAccessAssetsService.businessMemberAssetsGet(businessId = businessId, memberId = memberId, assetType = assetType, startIndex = startIndex, sortBy = sortBy, sortAscending = sortAscending, searchBy = searchBy, searchValue = searchValue, assetPermissionType = assetPermissionType, adAccountStatuses = adAccountStatuses, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "members" / "assets" / "access") { (businessId) => 
      delete {  
            entity(as[BusinessMembersAssetAccessDeleteBody]){ businessMembersAssetAccessDeleteBody =>
              businessAccessAssetsService.businessMembersAssetAccessDelete(businessId = businessId, businessMembersAssetAccessDeleteBody = businessMembersAssetAccessDeleteBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "members" / "assets" / "access") { (businessId) => 
      patch {  
            entity(as[UpdateMemberAssetAccessBody]){ updateMemberAssetAccessBody =>
              businessAccessAssetsService.businessMembersAssetAccessUpdate(businessId = businessId, updateMemberAssetAccessBody = updateMemberAssetAccessBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "partners" / partnerIdPattern / "assets") { (businessId, partnerId) => 
      get { 
        parameters("partner_type".as[String].?("INTERNAL"), "asset_type".as[String].?("AD_ACCOUNT"), "start_index".as[Int].?(0), "sort_by".as[String].?, "sort_ascending".as[Boolean].?(true), "search_by".as[String].?, "search_value".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize) => 
            businessAccessAssetsService.businessPartnerAssetAccessGet(businessId = businessId, partnerId = partnerId, partnerType = partnerType, assetType = assetType, startIndex = startIndex, sortBy = sortBy, sortAscending = sortAscending, searchBy = searchBy, searchValue = searchValue, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "partners" / "assets") { (businessId) => 
      delete {  
            entity(as[DeletePartnerAssetAccessBody]){ deletePartnerAssetAccessBody =>
              businessAccessAssetsService.deletePartnerAssetAccessHandlerImpl(businessId = businessId, deletePartnerAssetAccessBody = deletePartnerAssetAccessBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "partners" / "assets") { (businessId) => 
      patch {  
            entity(as[UpdatePartnerAssetAccessBody]){ updatePartnerAssetAccessBody =>
              businessAccessAssetsService.updatePartnerAssetAccessHandlerImpl(businessId = businessId, updatePartnerAssetAccessBody = updatePartnerAssetAccessBody)
            }
      }
    }
}

object BusinessAccessAssetsApiPatterns {

    val businessIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val partnerIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val assetIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val memberIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BusinessAccessAssetsApiService {

  def assetGroupCreate200(responseAssetGroupInput: AssetGroupInput)(implicit toEntityMarshallerAssetGroupInput: ToEntityMarshaller[AssetGroupInput]): Route =
    complete((200, responseAssetGroupInput))
  def assetGroupCreate201(responseAssetGroupInput: AssetGroupInput)(implicit toEntityMarshallerAssetGroupInput: ToEntityMarshaller[AssetGroupInput]): Route =
    complete((201, responseAssetGroupInput))
  def assetGroupCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetGroupCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def assetGroupCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def assetGroupCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def assetGroupCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def assetGroupCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AssetGroupInput
   * Code: 201, Message: Resource create operation completed successfully., DataType: AssetGroupInput
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def assetGroupCreate(businessId: String, assetGroupInputCreate: AssetGroupInputCreate)
      (implicit toEntityMarshallerAssetGroupInput: ToEntityMarshaller[AssetGroupInput], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def assetGroupDelete200(responseAssetGroupDeletion: AssetGroupDeletion)(implicit toEntityMarshallerAssetGroupDeletion: ToEntityMarshaller[AssetGroupDeletion]): Route =
    complete((200, responseAssetGroupDeletion))
  def assetGroupDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AssetGroupDeletion
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def assetGroupDelete(businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete)
      (implicit toEntityMarshallerAssetGroupDeletion: ToEntityMarshaller[AssetGroupDeletion], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def assetGroupUpdate200(responseAssetGroupModification: AssetGroupModification)(implicit toEntityMarshallerAssetGroupModification: ToEntityMarshaller[AssetGroupModification]): Route =
    complete((200, responseAssetGroupModification))
  def assetGroupUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetGroupUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def assetGroupUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def assetGroupUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def assetGroupUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def assetGroupUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AssetGroupModification
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def assetGroupUpdate(businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate)
      (implicit toEntityMarshallerAssetGroupModification: ToEntityMarshaller[AssetGroupModification], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessAssetMembersGet200(responseBusinessAssetMembersGet200Response: BusinessAssetMembersGet200Response)(implicit toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route =
    complete((200, responseBusinessAssetMembersGet200Response))
  def businessAssetMembersGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessAssetMembersGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessAssetMembersGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessAssetMembersGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessAssetMembersGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessAssetMembersGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessAssetMembersGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessAssetMembersGet(businessId: String, assetId: String, startIndex: Int, fetchSystemUsers: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route

  def businessAssetPartnersGet200(responseBusinessAssetMembersGet200Response: BusinessAssetMembersGet200Response)(implicit toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route =
    complete((200, responseBusinessAssetMembersGet200Response))
  def businessAssetPartnersGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessAssetPartnersGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessAssetPartnersGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessAssetPartnersGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessAssetPartnersGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessAssetPartnersGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessAssetMembersGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route

  def businessAssetsGet200(responseBusinessAssetsGet200Response: BusinessAssetsGet200Response)(implicit toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response]): Route =
    complete((200, responseBusinessAssetsGet200Response))
  def businessAssetsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessAssetsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessAssetsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessAssetsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessAssetsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessAssetsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessAssetsGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessAssetsGet(businessId: String, permissions: Option[String], childAssetId: Option[String], assetGroupId: Option[String], assetType: String, startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessMemberAssetsGet200(responseBusinessMemberAssetsGetResponse: BusinessMemberAssetsGetResponse)(implicit toEntityMarshallerBusinessMemberAssetsGetResponse: ToEntityMarshaller[BusinessMemberAssetsGetResponse]): Route =
    complete((200, responseBusinessMemberAssetsGetResponse))
  def businessMemberAssetsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessMemberAssetsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessMemberAssetsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessMemberAssetsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessMemberAssetsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessMemberAssetsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessMemberAssetsGetResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: String, startIndex: Int, sortBy: Option[String], sortAscending: Boolean, searchBy: Option[String], searchValue: Option[String], assetPermissionType: Option[String], adAccountStatuses: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBusinessMemberAssetsGetResponse: ToEntityMarshaller[BusinessMemberAssetsGetResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessMembersAssetAccessDelete200(responseDeleteMemberAccessResultsResponseArray: DeleteMemberAccessResultsResponseArray)(implicit toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray]): Route =
    complete((200, responseDeleteMemberAccessResultsResponseArray))
  def businessMembersAssetAccessDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DeleteMemberAccessResultsResponseArray
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody)
      (implicit toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessMembersAssetAccessUpdate200(responseUpdateMemberAssetsResultsResponseArray: UpdateMemberAssetsResultsResponseArray)(implicit toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray]): Route =
    complete((200, responseUpdateMemberAssetsResultsResponseArray))
  def businessMembersAssetAccessUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessMembersAssetAccessUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessMembersAssetAccessUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessMembersAssetAccessUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessMembersAssetAccessUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessMembersAssetAccessUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UpdateMemberAssetsResultsResponseArray
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody)
      (implicit toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessPartnerAssetAccessGet200(responseBusinessPartnerAssetAccessGet200Response: BusinessPartnerAssetAccessGet200Response)(implicit toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response]): Route =
    complete((200, responseBusinessPartnerAssetAccessGet200Response))
  def businessPartnerAssetAccessGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def businessPartnerAssetAccessGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def businessPartnerAssetAccessGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def businessPartnerAssetAccessGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def businessPartnerAssetAccessGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def businessPartnerAssetAccessGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BusinessPartnerAssetAccessGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: String, assetType: String, startIndex: Int, sortBy: Option[String], sortAscending: Boolean, searchBy: Option[String], searchValue: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def deletePartnerAssetAccessHandlerImpl200(responseDeletePartnerAssetAccessResultsResponseArray: DeletePartnerAssetAccessResultsResponseArray)(implicit toEntityMarshallerDeletePartnerAssetAccessResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetAccessResultsResponseArray]): Route =
    complete((200, responseDeletePartnerAssetAccessResultsResponseArray))
  def deletePartnerAssetAccessHandlerImplDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: DeletePartnerAssetAccessResultsResponseArray
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody)
      (implicit toEntityMarshallerDeletePartnerAssetAccessResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetAccessResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updatePartnerAssetAccessHandlerImpl200(responseUpdatePartnerAssetsResultsResponseArray: UpdatePartnerAssetsResultsResponseArray)(implicit toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray]): Route =
    complete((200, responseUpdatePartnerAssetsResultsResponseArray))
  def updatePartnerAssetAccessHandlerImpl400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def updatePartnerAssetAccessHandlerImpl401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def updatePartnerAssetAccessHandlerImpl403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def updatePartnerAssetAccessHandlerImpl404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def updatePartnerAssetAccessHandlerImpl429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def updatePartnerAssetAccessHandlerImplDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: UpdatePartnerAssetsResultsResponseArray
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody)
      (implicit toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessAssetsApiMarshaller {
  implicit def fromEntityUnmarshallerAssetGroupInputCreate: FromEntityUnmarshaller[AssetGroupInputCreate]

  implicit def fromEntityUnmarshallerDeletePartnerAssetAccessBody: FromEntityUnmarshaller[DeletePartnerAssetAccessBody]

  implicit def fromEntityUnmarshallerUpdateMemberAssetAccessBody: FromEntityUnmarshaller[UpdateMemberAssetAccessBody]

  implicit def fromEntityUnmarshallerAssetGroupModificationReadOrUpdate: FromEntityUnmarshaller[AssetGroupModificationReadOrUpdate]

  implicit def fromEntityUnmarshallerUpdatePartnerAssetAccessBody: FromEntityUnmarshaller[UpdatePartnerAssetAccessBody]

  implicit def fromEntityUnmarshallerBusinessMembersAssetAccessDeleteBody: FromEntityUnmarshaller[BusinessMembersAssetAccessDeleteBody]

  implicit def fromEntityUnmarshallerAssetGroupDeletionDelete: FromEntityUnmarshaller[AssetGroupDeletionDelete]



  implicit def toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response]

  implicit def toEntityMarshallerBusinessMemberAssetsGetResponse: ToEntityMarshaller[BusinessMemberAssetsGetResponse]

  implicit def toEntityMarshallerAssetGroupDeletion: ToEntityMarshaller[AssetGroupDeletion]

  implicit def toEntityMarshallerAssetGroupModification: ToEntityMarshaller[AssetGroupModification]

  implicit def toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray]

  implicit def toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response]

  implicit def toEntityMarshallerAssetGroupInput: ToEntityMarshaller[AssetGroupInput]

  implicit def toEntityMarshallerDeletePartnerAssetAccessResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetAccessResultsResponseArray]

  implicit def toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray]

  implicit def toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]

}

