package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetPartnersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGet200Response;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.CreateAssetGroupBody;
import org.openapitools.model.CreateAssetGroupResponse;
import org.openapitools.model.DeleteAssetGroupBody;
import org.openapitools.model.DeleteAssetGroupResponse;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.model.Error;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.UpdateAssetGroupBody;
import org.openapitools.model.UpdateAssetGroupResponse;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class BusinessAccessAssetsApiServiceImpl implements BusinessAccessAssetsApi {
    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     *
     */
    public CreateAssetGroupResponse assetGroupCreate(String businessId, CreateAssetGroupBody createAssetGroupBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete asset groups.
     *
     * Delete a batch of asset groups.
     *
     */
    public DeleteAssetGroupResponse assetGroupDelete(String businessId, DeleteAssetGroupBody deleteAssetGroupBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     *
     */
    public UpdateAssetGroupResponse assetGroupUpdate(String businessId, UpdateAssetGroupBody updateAssetGroupBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     *
     */
    public BusinessAssetMembersGet200Response businessAssetMembersGet(String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     */
    public BusinessAssetPartnersGet200Response businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     */
    public BusinessAssetsGet200Response businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     */
    public BusinessMemberAssetsGet200Response businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete member access to asset
     *
     * Terminate multiple members&#39; access to an asset.
     *
     */
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     *
     */
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     */
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete partner access to asset
     *
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     */
    public DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     */
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        // TODO: Implement...

        return null;
    }

}
