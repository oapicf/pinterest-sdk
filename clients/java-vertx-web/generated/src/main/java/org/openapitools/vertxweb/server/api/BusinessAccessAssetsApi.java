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

import java.util.List;
import java.util.Map;

public interface BusinessAccessAssetsApi  {
    Future<ApiResponse<CreateAssetGroupResponse>> assetGroupCreate(String businessId, CreateAssetGroupBody createAssetGroupBody);
    Future<ApiResponse<DeleteAssetGroupResponse>> assetGroupDelete(String businessId, DeleteAssetGroupBody deleteAssetGroupBody);
    Future<ApiResponse<UpdateAssetGroupResponse>> assetGroupUpdate(String businessId, UpdateAssetGroupBody updateAssetGroupBody);
    Future<ApiResponse<BusinessAssetMembersGet200Response>> businessAssetMembersGet(String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex);
    Future<ApiResponse<BusinessAssetPartnersGet200Response>> businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<BusinessAssetsGet200Response>> businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<BusinessMemberAssetsGet200Response>> businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<DeleteMemberAccessResultsResponseArray>> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest);
    Future<ApiResponse<UpdateMemberAssetsResultsResponseArray>> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody);
    Future<ApiResponse<BusinessPartnerAssetAccessGet200Response>> businessPartnerAssetAccessGet(String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark);
    Future<ApiResponse<DeletePartnerAssetsResultsResponseArray>> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody);
    Future<ApiResponse<UpdatePartnerAssetsResultsResponseArray>> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody);
}
