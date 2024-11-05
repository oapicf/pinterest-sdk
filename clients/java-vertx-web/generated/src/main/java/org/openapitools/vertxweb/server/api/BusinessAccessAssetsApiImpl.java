package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BusinessAssetMembersGet200Response;
import org.openapitools.vertxweb.server.model.BusinessAssetPartnersGet200Response;
import org.openapitools.vertxweb.server.model.BusinessAssetsGet200Response;
import org.openapitools.vertxweb.server.model.BusinessMemberAssetsGet200Response;
import org.openapitools.vertxweb.server.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.vertxweb.server.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.vertxweb.server.model.CreateAssetGroupBody;
import org.openapitools.vertxweb.server.model.CreateAssetGroupResponse;
import org.openapitools.vertxweb.server.model.DeleteAssetGroupBody;
import org.openapitools.vertxweb.server.model.DeleteAssetGroupResponse;
import org.openapitools.vertxweb.server.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetAccessBody;
import org.openapitools.vertxweb.server.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.PermissionsWithOwner;
import org.openapitools.vertxweb.server.model.UpdateAssetGroupBody;
import org.openapitools.vertxweb.server.model.UpdateAssetGroupResponse;
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
    public Future<ApiResponse<CreateAssetGroupResponse>> assetGroupCreate(String businessId, CreateAssetGroupBody createAssetGroupBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteAssetGroupResponse>> assetGroupDelete(String businessId, DeleteAssetGroupBody deleteAssetGroupBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateAssetGroupResponse>> assetGroupUpdate(String businessId, UpdateAssetGroupBody updateAssetGroupBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetMembersGet(String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetPartnersGet200Response>> businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessAssetsGet200Response>> businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessMemberAssetsGet200Response>> businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteMemberAccessResultsResponseArray>> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateMemberAssetsResultsResponseArray>> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BusinessPartnerAssetAccessGet200Response>> businessPartnerAssetAccessGet(String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeletePartnerAssetsResultsResponseArray>> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdatePartnerAssetsResultsResponseArray>> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
