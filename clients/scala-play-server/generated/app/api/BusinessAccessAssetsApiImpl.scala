package api

import model.BusinessAssetMembersGet200Response
import model.BusinessAssetPartnersGet200Response
import model.BusinessAssetsGet200Response
import model.BusinessMemberAssetsGet200Response
import model.BusinessMembersAssetAccessDeleteRequest
import model.BusinessPartnerAssetAccessGet200Response
import model.CreateAssetGroupBody
import model.CreateAssetGroupResponse
import model.DeleteAssetGroupBody
import model.DeleteAssetGroupResponse
import model.DeleteMemberAccessResultsResponseArray
import model.DeletePartnerAssetAccessBody
import model.DeletePartnerAssetsResultsResponseArray
import model.Error
import model.PartnerType
import model.PermissionsWithOwner
import model.UpdateAssetGroupBody
import model.UpdateAssetGroupResponse
import model.UpdateMemberAssetAccessBody
import model.UpdateMemberAssetsResultsResponseArray
import model.UpdatePartnerAssetAccessBody
import model.UpdatePartnerAssetsResultsResponseArray

/**
  * Provides a default implementation for [[BusinessAccessAssetsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class BusinessAccessAssetsApiImpl extends BusinessAccessAssetsApi {
  /**
    * @inheritdoc
    */
  override def assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody): CreateAssetGroupResponse = {
    // TODO: Implement better logic

    CreateAssetGroupResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): DeleteAssetGroupResponse = {
    // TODO: Implement better logic

    DeleteAssetGroupResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): UpdateAssetGroupResponse = {
    // TODO: Implement better logic

    UpdateAssetGroupResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def businessAssetMembersGet(businessId: String, assetId: String, bookmark: Option[String], pageSize: Option[Int], startIndex: Option[Int]): BusinessAssetMembersGet200Response = {
    // TODO: Implement better logic

    BusinessAssetMembersGet200Response(List.empty[UserSingleAssetBinding], None)
  }

  /**
    * @inheritdoc
    */
  override def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetPartnersGet200Response = {
    // TODO: Implement better logic

    BusinessAssetPartnersGet200Response(List.empty[UserSingleAssetBinding], None)
  }

  /**
    * @inheritdoc
    */
  override def businessAssetsGet(businessId: String, permissions: Option[List[PermissionsWithOwner]], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetsGet200Response = {
    // TODO: Implement better logic

    BusinessAssetsGet200Response(List.empty[GetBusinessAssetsResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def businessMemberAssetsGet(businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessMemberAssetsGet200Response = {
    // TODO: Implement better logic

    BusinessMemberAssetsGet200Response(List.empty[AssetIdPermissions], None)
  }

  /**
    * @inheritdoc
    */
  override def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): DeleteMemberAccessResultsResponseArray = {
    // TODO: Implement better logic

    DeleteMemberAccessResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): UpdateMemberAssetsResultsResponseArray = {
    // TODO: Implement better logic

    UpdateMemberAssetsResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[PartnerType], assetType: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): BusinessPartnerAssetAccessGet200Response = {
    // TODO: Implement better logic

    BusinessPartnerAssetAccessGet200Response(List.empty[GetPartnerAssetsResponse], None)
  }

  /**
    * @inheritdoc
    */
  override def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): DeletePartnerAssetsResultsResponseArray = {
    // TODO: Implement better logic

    DeletePartnerAssetsResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): UpdatePartnerAssetsResultsResponseArray = {
    // TODO: Implement better logic

    UpdatePartnerAssetsResultsResponseArray(None)
  }
}
