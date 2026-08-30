package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
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

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BusinessAccessAssetsApiAction @Inject constructor(
) : WebAction {

    @Post("/businesses/{business_id}/asset_groups")
    @Description("Create a new asset group.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun assetGroupCreate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody assetGroupInputCreate: AssetGroupInputCreate
    ): AssetGroupInput {
        TODO()
    }

    @Delete("/businesses/{business_id}/asset_groups")
    @Description("Delete asset groups.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun assetGroupDelete(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody assetGroupDeletionDelete: AssetGroupDeletionDelete
    ): AssetGroupDeletion {
        TODO()
    }

    @Patch("/businesses/{business_id}/asset_groups")
    @Description("Update asset groups.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun assetGroupUpdate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate
    ): AssetGroupModification {
        TODO()
    }

    @Get("/businesses/{business_id}/assets/{asset_id}/members")
    @Description("Get members with access to asset")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessAssetMembersGet(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("asset_id") assetId: kotlin.String, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "fetch_system_users") fetchSystemUsers: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BusinessAssetMembersGet200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/assets/{asset_id}/partners")
    @Description("Get partners with access to asset")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessAssetPartnersGet(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("asset_id") assetId: kotlin.String, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BusinessAssetMembersGet200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/assets")
    @Description("List business assets")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessAssetsGet(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
         @QueryParam(value = "permissions") permissions: kotlin.collections.List<PermissionsWithOwner>?, 
         @QueryParam(value = "child_asset_id") childAssetId: kotlin.String?, 
         @QueryParam(value = "asset_group_id") assetGroupId: kotlin.String?, 
         @QueryParam(value = "asset_type") assetType: kotlin.String, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BusinessAssetsGet200Response {
        TODO()
    }

    @Get("/businesses/{business_id}/members/{member_id}/assets")
    @Description("Get assets assigned to a member")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessMemberAssetsGet(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("member_id") memberId: kotlin.String, 
         @QueryParam(value = "asset_type") assetType: kotlin.String, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "sort_by") sortBy: AssetSortBy?, 
         @QueryParam(value = "sort_ascending") sortAscending: kotlin.Boolean, 
         @QueryParam(value = "search_by") searchBy: AssetSearchBy?, 
         @QueryParam(value = "search_value") searchValue: kotlin.String?, 
         @QueryParam(value = "asset_permission_type") assetPermissionType: AssetPermissionType?, 
         @QueryParam(value = "ad_account_statuses") adAccountStatuses: kotlin.collections.List<NonDraftEntityStatus>?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BusinessMemberAssetsGetResponse {
        TODO()
    }

    @Delete("/businesses/{business_id}/members/assets/access")
    @Description("Delete member access to asset")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessMembersAssetAccessDelete(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody
    ): DeleteMemberAccessResultsResponseArray {
        TODO()
    }

    @Patch("/businesses/{business_id}/members/assets/access")
    @Description("Assign/Update member asset permissions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessMembersAssetAccessUpdate(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody updateMemberAssetAccessBody: UpdateMemberAssetAccessBody
    ): UpdateMemberAssetsResultsResponseArray {
        TODO()
    }

    @Get("/businesses/{business_id}/partners/{partner_id}/assets")
    @Description("Get assets assigned to a partner or assets assigned by a partner")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun businessPartnerAssetAccessGet(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("partner_id") partnerId: kotlin.String, 
         @QueryParam(value = "partner_type") partnerType: kotlin.String, 
         @QueryParam(value = "asset_type") assetType: kotlin.String, 
         @QueryParam(value = "start_index") startIndex: kotlin.Int, 
         @QueryParam(value = "sort_by") sortBy: AssetSortBy?, 
         @QueryParam(value = "sort_ascending") sortAscending: kotlin.Boolean, 
         @QueryParam(value = "search_by") searchBy: AssetSearchBy?, 
         @QueryParam(value = "search_value") searchValue: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BusinessPartnerAssetAccessGet200Response {
        TODO()
    }

    @Delete("/businesses/{business_id}/partners/assets")
    @Description("Delete partner access to asset")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deletePartnerAssetAccessHandlerImpl(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody
    ): DeletePartnerAssetAccessResultsResponseArray {
        TODO()
    }

    @Patch("/businesses/{business_id}/partners/assets")
    @Description("Assign/Update partner asset permissions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun updatePartnerAssetAccessHandlerImpl(
        @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_id") businessId: kotlin.String, 
        @Valid @RequestBody updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody
    ): UpdatePartnerAssetsResultsResponseArray {
        TODO()
    }
}
