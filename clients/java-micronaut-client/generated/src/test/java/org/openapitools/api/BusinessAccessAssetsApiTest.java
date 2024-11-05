package org.openapitools.api;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for BusinessAccessAssetsApi
 */
@MicronautTest
public class BusinessAccessAssetsApiTest {

    @Inject
    BusinessAccessAssetsApi api;

    
    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     */
    @Test
    @Disabled("Not Implemented")
    public void assetGroupCreateTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetGroupBody createAssetGroupBody = new CreateAssetGroupBody("Canada Ad Accounts", "Asset groups that has ad accounts shared in Canada", Arrays.asList());

        // when
        CreateAssetGroupResponse body = api.assetGroupCreate(businessId, createAssetGroupBody).block();

        // then
        // TODO implement the assetGroupCreateTest()
    }

    
    /**
     * Delete asset groups.
     *
     * Delete a batch of asset groups.
     */
    @Test
    @Disabled("Not Implemented")
    public void assetGroupDeleteTest() {
        // given
        String businessId = "729090764583391194";
        DeleteAssetGroupBody deleteAssetGroupBody = new DeleteAssetGroupBody(Arrays.asList("example"));

        // when
        DeleteAssetGroupResponse body = api.assetGroupDelete(businessId, deleteAssetGroupBody).block();

        // then
        // TODO implement the assetGroupDeleteTest()
    }

    
    /**
     * Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     */
    @Test
    @Disabled("Not Implemented")
    public void assetGroupUpdateTest() {
        // given
        String businessId = "729090764583391194";
        UpdateAssetGroupBody updateAssetGroupBody = new UpdateAssetGroupBody();

        // when
        UpdateAssetGroupResponse body = api.assetGroupUpdate(businessId, updateAssetGroupBody).block();

        // then
        // TODO implement the assetGroupUpdateTest()
    }

    
    /**
     * Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessAssetMembersGetTest() {
        // given
        String businessId = "729090764583391194";
        String assetId = "729090764583391194";
        String bookmark = "example";
        Integer pageSize = 25;
        Integer startIndex = 0;

        // when
        BusinessAssetMembersGet200Response body = api.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex).block();

        // then
        // TODO implement the businessAssetMembersGetTest()
    }

    
    /**
     * Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessAssetPartnersGetTest() {
        // given
        String businessId = "729090764583391194";
        String assetId = "729090764583391194";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessAssetPartnersGet200Response body = api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize).block();

        // then
        // TODO implement the businessAssetPartnersGetTest()
    }

    
    /**
     * List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessAssetsGetTest() {
        // given
        String businessId = "729090764583391194";
        List<PermissionsWithOwner> permissions = Arrays.asList();
        String childAssetId = "549764894835";
        String assetGroupId = "7078106104032";
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessAssetsGet200Response body = api.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize).block();

        // then
        // TODO implement the businessAssetsGetTest()
    }

    
    /**
     * Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessMemberAssetsGetTest() {
        // given
        String businessId = "729090764583391194";
        String memberId = "729090764583391194";
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessMemberAssetsGet200Response body = api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize).block();

        // then
        // TODO implement the businessMemberAssetsGetTest()
    }

    
    /**
     * Delete member access to asset
     *
     * Terminate multiple members&#39; access to an asset.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessMembersAssetAccessDeleteTest() {
        // given
        String businessId = "729090764583391194";
        BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = new BusinessMembersAssetAccessDeleteRequest(Arrays.asList());

        // when
        DeleteMemberAccessResultsResponseArray body = api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest).block();

        // then
        // TODO implement the businessMembersAssetAccessDeleteTest()
    }

    
    /**
     * Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     */
    @Test
    @Disabled("Not Implemented")
    public void businessMembersAssetAccessUpdateTest() {
        // given
        String businessId = "729090764583391194";
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody = new UpdateMemberAssetAccessBody(Arrays.asList());

        // when
        UpdateMemberAssetsResultsResponseArray body = api.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody).block();

        // then
        // TODO implement the businessMembersAssetAccessUpdateTest()
    }

    
    /**
     * Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     */
    @Test
    @Disabled("Not Implemented")
    public void businessPartnerAssetAccessGetTest() {
        // given
        String businessId = "729090764583391194";
        String partnerId = "729090764583391194";
        PartnerType partnerType = new PartnerType();
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        BusinessPartnerAssetAccessGet200Response body = api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark).block();

        // then
        // TODO implement the businessPartnerAssetAccessGetTest()
    }

    
    /**
     * Delete partner access to asset
     *
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     */
    @Test
    @Disabled("Not Implemented")
    public void deletePartnerAssetAccessHandlerImplTest() {
        // given
        String businessId = "729090764583391194";
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(Arrays.asList());

        // when
        DeletePartnerAssetsResultsResponseArray body = api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody).block();

        // then
        // TODO implement the deletePartnerAssetAccessHandlerImplTest()
    }

    
    /**
     * Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     */
    @Test
    @Disabled("Not Implemented")
    public void updatePartnerAssetAccessHandlerImplTest() {
        // given
        String businessId = "729090764583391194";
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = new UpdatePartnerAssetAccessBody(Arrays.asList());

        // when
        UpdatePartnerAssetsResultsResponseArray body = api.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody).block();

        // then
        // TODO implement the updatePartnerAssetAccessHandlerImplTest()
    }

    
}
