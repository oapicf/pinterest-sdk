package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BusinessAssetMembersGet200Response
import org.openapitools.server.model.BusinessAssetPartnersGet200Response
import org.openapitools.server.model.BusinessAssetsGet200Response
import org.openapitools.server.model.BusinessMemberAssetsGet200Response
import org.openapitools.server.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.server.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.server.model.CreateAssetGroupBody
import org.openapitools.server.model.CreateAssetGroupResponse
import org.openapitools.server.model.DeleteAssetGroupBody
import org.openapitools.server.model.DeleteAssetGroupResponse
import org.openapitools.server.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.server.model.DeletePartnerAssetAccessBody
import org.openapitools.server.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.server.model.Error
import org.openapitools.server.model.PartnerType
import org.openapitools.server.model.PermissionsWithOwner
import org.openapitools.server.model.UpdateAssetGroupBody
import org.openapitools.server.model.UpdateAssetGroupResponse
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
            entity(as[CreateAssetGroupBody]){ createAssetGroupBody =>
              businessAccessAssetsService.assetGroupCreate(businessId = businessId, createAssetGroupBody = createAssetGroupBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "asset_groups") { (businessId) => 
      delete {  
            entity(as[DeleteAssetGroupBody]){ deleteAssetGroupBody =>
              businessAccessAssetsService.assetGroupDelete(businessId = businessId, deleteAssetGroupBody = deleteAssetGroupBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "asset_groups") { (businessId) => 
      patch {  
            entity(as[UpdateAssetGroupBody]){ updateAssetGroupBody =>
              businessAccessAssetsService.assetGroupUpdate(businessId = businessId, updateAssetGroupBody = updateAssetGroupBody)
            }
      }
    } ~
    path("businesses" / businessIdPattern / "assets" / assetIdPattern / "members") { (businessId, assetId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "start_index".as[Int].?(0)) { (bookmark, pageSize, startIndex) => 
            businessAccessAssetsService.businessAssetMembersGet(businessId = businessId, assetId = assetId, bookmark = bookmark, pageSize = pageSize, startIndex = startIndex)
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
        parameters("asset_type".as[String].?("AD_ACCOUNT"), "start_index".as[Int].?(0), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (assetType, startIndex, bookmark, pageSize) => 
            businessAccessAssetsService.businessMemberAssetsGet(businessId = businessId, memberId = memberId, assetType = assetType, startIndex = startIndex, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / businessIdPattern / "members" / "assets" / "access") { (businessId) => 
      delete {  
            entity(as[BusinessMembersAssetAccessDeleteRequest]){ businessMembersAssetAccessDeleteRequest =>
              businessAccessAssetsService.businessMembersAssetAccessDelete(businessId = businessId, businessMembersAssetAccessDeleteRequest = businessMembersAssetAccessDeleteRequest)
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
        parameters("partner_type".as[String].?, "asset_type".as[String].?("AD_ACCOUNT"), "start_index".as[Int].?(0), "page_size".as[Int].?(25), "bookmark".as[String].?) { (partnerType, assetType, startIndex, pageSize, bookmark) => 
            businessAccessAssetsService.businessPartnerAssetAccessGet(businessId = businessId, partnerId = partnerId, partnerType = partnerType, assetType = assetType, startIndex = startIndex, pageSize = pageSize, bookmark = bookmark)
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

    val businessIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val partnerIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val assetIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val memberIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BusinessAccessAssetsApiService {

  def assetGroupCreate200(responseCreateAssetGroupResponse: CreateAssetGroupResponse)(implicit toEntityMarshallerCreateAssetGroupResponse: ToEntityMarshaller[CreateAssetGroupResponse]): Route =
    complete((200, responseCreateAssetGroupResponse))
  def assetGroupCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetGroupCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CreateAssetGroupResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody)
      (implicit toEntityMarshallerCreateAssetGroupResponse: ToEntityMarshaller[CreateAssetGroupResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def assetGroupDelete200(responseDeleteAssetGroupResponse: DeleteAssetGroupResponse)(implicit toEntityMarshallerDeleteAssetGroupResponse: ToEntityMarshaller[DeleteAssetGroupResponse]): Route =
    complete((200, responseDeleteAssetGroupResponse))
  def assetGroupDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetGroupDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeleteAssetGroupResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerDeleteAssetGroupResponse: ToEntityMarshaller[DeleteAssetGroupResponse]): Route

  def assetGroupUpdate200(responseUpdateAssetGroupResponse: UpdateAssetGroupResponse)(implicit toEntityMarshallerUpdateAssetGroupResponse: ToEntityMarshaller[UpdateAssetGroupResponse]): Route =
    complete((200, responseUpdateAssetGroupResponse))
  def assetGroupUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def assetGroupUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UpdateAssetGroupResponse
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody)
      (implicit toEntityMarshallerUpdateAssetGroupResponse: ToEntityMarshaller[UpdateAssetGroupResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessAssetMembersGet200(responseBusinessAssetMembersGet200Response: BusinessAssetMembersGet200Response)(implicit toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route =
    complete((200, responseBusinessAssetMembersGet200Response))
  def businessAssetMembersGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Sucess, DataType: BusinessAssetMembersGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessAssetMembersGet(businessId: String, assetId: String, bookmark: Option[String], pageSize: Int, startIndex: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]): Route

  def businessAssetPartnersGet200(responseBusinessAssetPartnersGet200Response: BusinessAssetPartnersGet200Response)(implicit toEntityMarshallerBusinessAssetPartnersGet200Response: ToEntityMarshaller[BusinessAssetPartnersGet200Response]): Route =
    complete((200, responseBusinessAssetPartnersGet200Response))
  def businessAssetPartnersGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Sucess, DataType: BusinessAssetPartnersGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBusinessAssetPartnersGet200Response: ToEntityMarshaller[BusinessAssetPartnersGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessAssetsGet200(responseBusinessAssetsGet200Response: BusinessAssetsGet200Response)(implicit toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response]): Route =
    complete((200, responseBusinessAssetsGet200Response))
  def businessAssetsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BusinessAssetsGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessAssetsGet(businessId: String, permissions: Option[String], childAssetId: Option[String], assetGroupId: Option[String], assetType: String, startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessMemberAssetsGet200(responseBusinessMemberAssetsGet200Response: BusinessMemberAssetsGet200Response)(implicit toEntityMarshallerBusinessMemberAssetsGet200Response: ToEntityMarshaller[BusinessMemberAssetsGet200Response]): Route =
    complete((200, responseBusinessMemberAssetsGet200Response))
  def businessMemberAssetsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BusinessMemberAssetsGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: String, startIndex: Int, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBusinessMemberAssetsGet200Response: ToEntityMarshaller[BusinessMemberAssetsGet200Response]): Route

  def businessMembersAssetAccessDelete200(responseDeleteMemberAccessResultsResponseArray: DeleteMemberAccessResultsResponseArray)(implicit toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray]): Route =
    complete((200, responseDeleteMemberAccessResultsResponseArray))
  def businessMembersAssetAccessDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: DeleteMemberAccessResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest)
      (implicit toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessMembersAssetAccessUpdate200(responseUpdateMemberAssetsResultsResponseArray: UpdateMemberAssetsResultsResponseArray)(implicit toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray]): Route =
    complete((200, responseUpdateMemberAssetsResultsResponseArray))
  def businessMembersAssetAccessUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: UpdateMemberAssetsResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody)
      (implicit toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def businessPartnerAssetAccessGet200(responseBusinessPartnerAssetAccessGet200Response: BusinessPartnerAssetAccessGet200Response)(implicit toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response]): Route =
    complete((200, responseBusinessPartnerAssetAccessGet200Response))
  def businessPartnerAssetAccessGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: BusinessPartnerAssetAccessGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[String], assetType: String, startIndex: Int, pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def deletePartnerAssetAccessHandlerImpl200(responseDeletePartnerAssetsResultsResponseArray: DeletePartnerAssetsResultsResponseArray)(implicit toEntityMarshallerDeletePartnerAssetsResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetsResultsResponseArray]): Route =
    complete((200, responseDeletePartnerAssetsResultsResponseArray))
  def deletePartnerAssetAccessHandlerImplDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: DeletePartnerAssetsResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody)
      (implicit toEntityMarshallerDeletePartnerAssetsResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetsResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def updatePartnerAssetAccessHandlerImpl200(responseUpdatePartnerAssetsResultsResponseArray: UpdatePartnerAssetsResultsResponseArray)(implicit toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray]): Route =
    complete((200, responseUpdatePartnerAssetsResultsResponseArray))
  def updatePartnerAssetAccessHandlerImplDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: UpdatePartnerAssetsResultsResponseArray
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody)
      (implicit toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BusinessAccessAssetsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateAssetGroupBody: FromEntityUnmarshaller[CreateAssetGroupBody]

  implicit def fromEntityUnmarshallerDeleteAssetGroupBody: FromEntityUnmarshaller[DeleteAssetGroupBody]

  implicit def fromEntityUnmarshallerDeletePartnerAssetAccessBody: FromEntityUnmarshaller[DeletePartnerAssetAccessBody]

  implicit def fromEntityUnmarshallerBusinessMembersAssetAccessDeleteRequest: FromEntityUnmarshaller[BusinessMembersAssetAccessDeleteRequest]

  implicit def fromEntityUnmarshallerUpdateMemberAssetAccessBody: FromEntityUnmarshaller[UpdateMemberAssetAccessBody]

  implicit def fromEntityUnmarshallerUpdatePartnerAssetAccessBody: FromEntityUnmarshaller[UpdatePartnerAssetAccessBody]

  implicit def fromEntityUnmarshallerUpdateAssetGroupBody: FromEntityUnmarshaller[UpdateAssetGroupBody]



  implicit def toEntityMarshallerBusinessAssetsGet200Response: ToEntityMarshaller[BusinessAssetsGet200Response]

  implicit def toEntityMarshallerDeleteMemberAccessResultsResponseArray: ToEntityMarshaller[DeleteMemberAccessResultsResponseArray]

  implicit def toEntityMarshallerBusinessPartnerAssetAccessGet200Response: ToEntityMarshaller[BusinessPartnerAssetAccessGet200Response]

  implicit def toEntityMarshallerUpdatePartnerAssetsResultsResponseArray: ToEntityMarshaller[UpdatePartnerAssetsResultsResponseArray]

  implicit def toEntityMarshallerUpdateMemberAssetsResultsResponseArray: ToEntityMarshaller[UpdateMemberAssetsResultsResponseArray]

  implicit def toEntityMarshallerDeleteAssetGroupResponse: ToEntityMarshaller[DeleteAssetGroupResponse]

  implicit def toEntityMarshallerBusinessAssetMembersGet200Response: ToEntityMarshaller[BusinessAssetMembersGet200Response]

  implicit def toEntityMarshallerBusinessMemberAssetsGet200Response: ToEntityMarshaller[BusinessMemberAssetsGet200Response]

  implicit def toEntityMarshallerDeletePartnerAssetsResultsResponseArray: ToEntityMarshaller[DeletePartnerAssetsResultsResponseArray]

  implicit def toEntityMarshallerBusinessAssetPartnersGet200Response: ToEntityMarshaller[BusinessAssetPartnersGet200Response]

  implicit def toEntityMarshallerCreateAssetGroupResponse: ToEntityMarshaller[CreateAssetGroupResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerUpdateAssetGroupResponse: ToEntityMarshaller[UpdateAssetGroupResponse]

}

