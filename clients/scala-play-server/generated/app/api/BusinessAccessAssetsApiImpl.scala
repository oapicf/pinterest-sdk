package api

import model.AssetGroupDeletion
import model.AssetGroupDeletionDelete
import model.AssetGroupInput
import model.AssetGroupInputCreate
import model.AssetGroupModification
import model.AssetGroupModificationReadOrUpdate
import model.AssetPermissionType
import model.AssetSearchBy
import model.AssetSortBy
import model.BusinessAssetMembersGet200Response
import model.BusinessAssetsGet200Response
import model.BusinessMemberAssetsGetResponse
import model.BusinessMembersAssetAccessDeleteBody
import model.BusinessPartnerAssetAccessGet200Response
import model.DeleteMemberAccessResultsResponseArray
import model.DeletePartnerAssetAccessBody
import model.DeletePartnerAssetAccessResultsResponseArray
import model.Error
import model.NonDraftEntityStatus
import model.PermissionsWithOwner
import model.UpdateMemberAssetAccessBody
import model.UpdateMemberAssetsResultsResponseArray
import model.UpdatePartnerAssetAccessBody
import model.UpdatePartnerAssetsResultsResponseArray

/**
  * Provides a default implementation for [[BusinessAccessAssetsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class BusinessAccessAssetsApiImpl extends BusinessAccessAssetsApi {
  /**
    * @inheritdoc
    */
  override def assetGroupCreate(businessId: String, assetGroupInputCreate: AssetGroupInputCreate): AssetGroupInput = {
    // TODO: Implement better logic

    AssetGroupInput(None)
  }

  /**
    * @inheritdoc
    */
  override def assetGroupDelete(businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete): AssetGroupDeletion = {
    // TODO: Implement better logic

    AssetGroupDeletion(None, None)
  }

  /**
    * @inheritdoc
    */
  override def assetGroupUpdate(businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate): AssetGroupModification = {
    // TODO: Implement better logic

    AssetGroupModification(None, None)
  }

  /**
    * @inheritdoc
    */
  override def businessAssetMembersGet(businessId: String, assetId: String, startIndex: Option[Int], fetchSystemUsers: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetMembersGet200Response = {
    // TODO: Implement better logic

    BusinessAssetMembersGet200Response(None, List.empty[UserSingleAssetBinding])
  }

  /**
    * @inheritdoc
    */
  override def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetMembersGet200Response = {
    // TODO: Implement better logic

    BusinessAssetMembersGet200Response(None, List.empty[UserSingleAssetBinding])
  }

  /**
    * @inheritdoc
    */
  override def businessAssetsGet(businessId: String, permissions: Option[List[PermissionsWithOwner]], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetsGet200Response = {
    // TODO: Implement better logic

    BusinessAssetsGet200Response(None, List.empty[BusinessAssets])
  }

  /**
    * @inheritdoc
    */
  override def businessMemberAssetsGet(businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], sortBy: Option[AssetSortBy], sortAscending: Option[Boolean], searchBy: Option[AssetSearchBy], searchValue: Option[String], assetPermissionType: Option[AssetPermissionType], adAccountStatuses: Option[List[NonDraftEntityStatus]], bookmark: Option[String], pageSize: Option[Int]): BusinessMemberAssetsGetResponse = {
    // TODO: Implement better logic

    BusinessMemberAssetsGetResponse(None, List.empty[AssetIdPermissions], 0, None)
  }

  /**
    * @inheritdoc
    */
  override def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody): DeleteMemberAccessResultsResponseArray = {
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
  override def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[String], assetType: Option[String], startIndex: Option[Int], sortBy: Option[AssetSortBy], sortAscending: Option[Boolean], searchBy: Option[AssetSearchBy], searchValue: Option[String], bookmark: Option[String], pageSize: Option[Int]): BusinessPartnerAssetAccessGet200Response = {
    // TODO: Implement better logic

    BusinessPartnerAssetAccessGet200Response(None, List.empty[BaseBusinessAssets])
  }

  /**
    * @inheritdoc
    */
  override def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): DeletePartnerAssetAccessResultsResponseArray = {
    // TODO: Implement better logic

    DeletePartnerAssetAccessResultsResponseArray(None)
  }

  /**
    * @inheritdoc
    */
  override def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): UpdatePartnerAssetsResultsResponseArray = {
    // TODO: Implement better logic

    UpdatePartnerAssetsResultsResponseArray(None)
  }
}
