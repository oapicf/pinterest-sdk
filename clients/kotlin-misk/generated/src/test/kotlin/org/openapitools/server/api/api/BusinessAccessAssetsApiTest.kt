package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.AssetGroupDeletion
import org.openapitools.server.api.model.AssetGroupDeletionDelete
import org.openapitools.server.api.model.AssetGroupInput
import org.openapitools.server.api.model.AssetGroupInputCreate
import org.openapitools.server.api.model.AssetGroupModification
import org.openapitools.server.api.model.AssetGroupModificationReadOrUpdate
import org.openapitools.server.api.model.AssetPermissionType
import org.openapitools.server.api.model.AssetSearchBy
import org.openapitools.server.api.model.AssetSortBy
import org.openapitools.server.api.model.BusinessAssetMembersGet200Response
import org.openapitools.server.api.model.BusinessAssetsGet200Response
import org.openapitools.server.api.model.BusinessMemberAssetsGetResponse
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteBody
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody
import org.openapitools.server.api.model.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.server.api.model.NonDraftEntityStatus
import org.openapitools.server.api.model.PermissionsWithOwner
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray

@MiskTest(startService = true)
internal class BusinessAccessAssetsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var businessAccessAssetsApi: BusinessAccessAssetsApiAction

    /**
     * To test BusinessAccessAssetsApiAction.assetGroupCreate
     */
    @Test
    fun `should handle assetGroupCreate`() {
        val businessId = TODO()
        val assetGroupInputCreate = TODO()
        val response: AssetGroupInput = businessAccessAssetsApi.assetGroupCreate(businessId, assetGroupInputCreate)
    }

    /**
     * To test BusinessAccessAssetsApiAction.assetGroupDelete
     */
    @Test
    fun `should handle assetGroupDelete`() {
        val businessId = TODO()
        val assetGroupDeletionDelete = TODO()
        val response: AssetGroupDeletion = businessAccessAssetsApi.assetGroupDelete(businessId, assetGroupDeletionDelete)
    }

    /**
     * To test BusinessAccessAssetsApiAction.assetGroupUpdate
     */
    @Test
    fun `should handle assetGroupUpdate`() {
        val businessId = TODO()
        val assetGroupModificationReadOrUpdate = TODO()
        val response: AssetGroupModification = businessAccessAssetsApi.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessAssetMembersGet
     */
    @Test
    fun `should handle businessAssetMembersGet`() {
        val businessId = TODO()
        val assetId = TODO()
        val startIndex = TODO()
        val fetchSystemUsers = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BusinessAssetMembersGet200Response = businessAccessAssetsApi.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessAssetPartnersGet
     */
    @Test
    fun `should handle businessAssetPartnersGet`() {
        val businessId = TODO()
        val assetId = TODO()
        val startIndex = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BusinessAssetMembersGet200Response = businessAccessAssetsApi.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessAssetsGet
     */
    @Test
    fun `should handle businessAssetsGet`() {
        val businessId = TODO()
        val permissions = TODO()
        val childAssetId = TODO()
        val assetGroupId = TODO()
        val assetType = TODO()
        val startIndex = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BusinessAssetsGet200Response = businessAccessAssetsApi.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessMemberAssetsGet
     */
    @Test
    fun `should handle businessMemberAssetsGet`() {
        val businessId = TODO()
        val memberId = TODO()
        val assetType = TODO()
        val startIndex = TODO()
        val sortBy = TODO()
        val sortAscending = TODO()
        val searchBy = TODO()
        val searchValue = TODO()
        val assetPermissionType = TODO()
        val adAccountStatuses = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BusinessMemberAssetsGetResponse = businessAccessAssetsApi.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessMembersAssetAccessDelete
     */
    @Test
    fun `should handle businessMembersAssetAccessDelete`() {
        val businessId = TODO()
        val businessMembersAssetAccessDeleteBody = TODO()
        val response: DeleteMemberAccessResultsResponseArray = businessAccessAssetsApi.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessMembersAssetAccessUpdate
     */
    @Test
    fun `should handle businessMembersAssetAccessUpdate`() {
        val businessId = TODO()
        val updateMemberAssetAccessBody = TODO()
        val response: UpdateMemberAssetsResultsResponseArray = businessAccessAssetsApi.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)
    }

    /**
     * To test BusinessAccessAssetsApiAction.businessPartnerAssetAccessGet
     */
    @Test
    fun `should handle businessPartnerAssetAccessGet`() {
        val businessId = TODO()
        val partnerId = TODO()
        val partnerType = TODO()
        val assetType = TODO()
        val startIndex = TODO()
        val sortBy = TODO()
        val sortAscending = TODO()
        val searchBy = TODO()
        val searchValue = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BusinessPartnerAssetAccessGet200Response = businessAccessAssetsApi.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessAssetsApiAction.deletePartnerAssetAccessHandlerImpl
     */
    @Test
    fun `should handle deletePartnerAssetAccessHandlerImpl`() {
        val businessId = TODO()
        val deletePartnerAssetAccessBody = TODO()
        val response: DeletePartnerAssetAccessResultsResponseArray = businessAccessAssetsApi.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)
    }

    /**
     * To test BusinessAccessAssetsApiAction.updatePartnerAssetAccessHandlerImpl
     */
    @Test
    fun `should handle updatePartnerAssetAccessHandlerImpl`() {
        val businessId = TODO()
        val updatePartnerAssetAccessBody = TODO()
        val response: UpdatePartnerAssetsResultsResponseArray = businessAccessAssetsApi.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)
    }
}
