package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AssetGroupDeletion;
import org.openapitools.vertxweb.server.model.AssetGroupDeletionDelete;
import org.openapitools.vertxweb.server.model.AssetGroupInput;
import org.openapitools.vertxweb.server.model.AssetGroupInputCreate;
import org.openapitools.vertxweb.server.model.AssetGroupModification;
import org.openapitools.vertxweb.server.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.vertxweb.server.model.AssetPermissionType;
import org.openapitools.vertxweb.server.model.AssetSearchBy;
import org.openapitools.vertxweb.server.model.AssetSortBy;
import org.openapitools.vertxweb.server.model.BusinessAssetMembersGet200Response;
import org.openapitools.vertxweb.server.model.BusinessAssetsGet200Response;
import org.openapitools.vertxweb.server.model.BusinessMemberAssetsGetResponse;
import org.openapitools.vertxweb.server.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.vertxweb.server.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.vertxweb.server.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetAccessBody;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetAccessResultsResponseArray;
import org.openapitools.vertxweb.server.model.NonDraftEntityStatus;
import org.openapitools.vertxweb.server.model.PermissionsWithOwner;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetAccessBody;
import org.openapitools.vertxweb.server.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.vertxweb.server.model.UpdatePartnerAssetAccessBody;
import org.openapitools.vertxweb.server.model.UpdatePartnerAssetsResultsResponseArray;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BusinessAccessAssetsApi  {
    Future<ApiResponse<AssetGroupInput>> assetGroupCreate(String businessId, AssetGroupInputCreate assetGroupInputCreate);
    Future<ApiResponse<AssetGroupDeletion>> assetGroupDelete(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete);
    Future<ApiResponse<AssetGroupModification>> assetGroupUpdate(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate);
    Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetMembersGet(String businessId, String assetId, Integer startIndex, Boolean fetchSystemUsers, String bookmark, Integer pageSize);
    Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<BusinessAssetsGet200Response>> businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<BusinessMemberAssetsGetResponse>> businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, Integer pageSize);
    Future<ApiResponse<DeleteMemberAccessResultsResponseArray>> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody);
    Future<ApiResponse<UpdateMemberAssetsResultsResponseArray>> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody);
    Future<ApiResponse<BusinessPartnerAssetAccessGet200Response>> businessPartnerAssetAccessGet(String businessId, String partnerId, String partnerType, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, Integer pageSize);
    Future<ApiResponse<DeletePartnerAssetAccessResultsResponseArray>> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody);
    Future<ApiResponse<UpdatePartnerAssetsResultsResponseArray>> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody);
}
