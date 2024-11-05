package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BusinessAssetMembersGet200Response;
import org.openapitools.server.api.model.BusinessAssetPartnersGet200Response;
import org.openapitools.server.api.model.BusinessAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMemberAssetsGet200Response;
import org.openapitools.server.api.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.server.api.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.server.api.model.CreateAssetGroupBody;
import org.openapitools.server.api.model.CreateAssetGroupResponse;
import org.openapitools.server.api.model.DeleteAssetGroupBody;
import org.openapitools.server.api.model.DeleteAssetGroupResponse;
import org.openapitools.server.api.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.server.api.model.DeletePartnerAssetAccessBody;
import org.openapitools.server.api.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.PermissionsWithOwner;
import org.openapitools.server.api.model.UpdateAssetGroupBody;
import org.openapitools.server.api.model.UpdateAssetGroupResponse;
import org.openapitools.server.api.model.UpdateMemberAssetAccessBody;
import org.openapitools.server.api.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.server.api.model.UpdatePartnerAssetAccessBody;
import org.openapitools.server.api.model.UpdatePartnerAssetsResultsResponseArray;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BusinessAccessAssetsApi  {
    //asset_group/create
    void assetGroupCreate(String businessId, CreateAssetGroupBody createAssetGroupBody, Handler<AsyncResult<CreateAssetGroupResponse>> handler);

    //asset_group/delete
    void assetGroupDelete(String businessId, DeleteAssetGroupBody deleteAssetGroupBody, Handler<AsyncResult<DeleteAssetGroupResponse>> handler);

    //asset_group/update
    void assetGroupUpdate(String businessId, UpdateAssetGroupBody updateAssetGroupBody, Handler<AsyncResult<UpdateAssetGroupResponse>> handler);

    //business_asset_members/get
    void businessAssetMembersGet(String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex, Handler<AsyncResult<BusinessAssetMembersGet200Response>> handler);

    //business_asset_partners/get
    void businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize, Handler<AsyncResult<BusinessAssetPartnersGet200Response>> handler);

    //business_assets/get
    void businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize, Handler<AsyncResult<BusinessAssetsGet200Response>> handler);

    //business_member_assets/get
    void businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize, Handler<AsyncResult<BusinessMemberAssetsGet200Response>> handler);

    //business_members_asset_access/delete
    void businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest, Handler<AsyncResult<DeleteMemberAccessResultsResponseArray>> handler);

    //business_members_asset_access/update
    void businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, Handler<AsyncResult<UpdateMemberAssetsResultsResponseArray>> handler);

    //business_partner_asset_access/get
    void businessPartnerAssetAccessGet(String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark, Handler<AsyncResult<BusinessPartnerAssetAccessGet200Response>> handler);

    //delete_partner_asset_access_handler_impl
    void deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, Handler<AsyncResult<DeletePartnerAssetsResultsResponseArray>> handler);

    //update_partner_asset_access_handler_impl
    void updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, Handler<AsyncResult<UpdatePartnerAssetsResultsResponseArray>> handler);

}
