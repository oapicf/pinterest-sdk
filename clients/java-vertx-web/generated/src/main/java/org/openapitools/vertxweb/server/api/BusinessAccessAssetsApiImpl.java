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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BusinessAccessAssetsApiImpl implements BusinessAccessAssetsApi {
    public Future<ApiResponse<AssetGroupInput>> assetGroupCreate(String businessId, AssetGroupInputCreate assetGroupInputCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AssetGroupDeletion>> assetGroupDelete(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AssetGroupModification>> assetGroupUpdate(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetMembersGet(String businessId, String assetId, Integer startIndex, Boolean fetchSystemUsers, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetsGet200Response>> businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessMemberAssetsGetResponse>> businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteMemberAccessResultsResponseArray>> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateMemberAssetsResultsResponseArray>> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessPartnerAssetAccessGet200Response>> businessPartnerAssetAccessGet(String businessId, String partnerId, String partnerType, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeletePartnerAssetAccessResultsResponseArray>> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdatePartnerAssetsResultsResponseArray>> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
