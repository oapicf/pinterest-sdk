/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 * API tests for BusinessAccessAssetsApi.
 */
public class BusinessAccessAssetsApiTest {

    private BusinessAccessAssetsApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", BusinessAccessAssetsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Create a new asset group.
     *
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void assetGroupCreateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        CreateAssetGroupBody createAssetGroupBody = null;

        // TODO: delete this line and uncomment the next
        // CreateAssetGroupResponse response = api.assetGroupCreate(businessId, createAssetGroupBody);
        // TODO: complete test assertions
    }
    
    /**
     * Delete asset groups.
     *
     * Delete a batch of asset groups.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void assetGroupDeleteTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        DeleteAssetGroupBody deleteAssetGroupBody = null;

        // TODO: delete this line and uncomment the next
        // DeleteAssetGroupResponse response = api.assetGroupDelete(businessId, deleteAssetGroupBody);
        // TODO: complete test assertions
    }
    
    /**
     * Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void assetGroupUpdateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        UpdateAssetGroupBody updateAssetGroupBody = null;

        // TODO: delete this line and uncomment the next
        // UpdateAssetGroupResponse response = api.assetGroupUpdate(businessId, updateAssetGroupBody);
        // TODO: complete test assertions
    }
    
    /**
     * Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessAssetMembersGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        String assetId = null;
        String bookmark = null;
        Integer pageSize = null;
        Integer startIndex = null;

        // TODO: delete this line and uncomment the next
        // BusinessAssetMembersGet200Response response = api.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex);
        // TODO: complete test assertions
    }
    
    /**
     * Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessAssetPartnersGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        String assetId = null;
        Integer startIndex = null;
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // BusinessAssetPartnersGet200Response response = api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessAssetsGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        List<PermissionsWithOwner> permissions = null;
        String childAssetId = null;
        String assetGroupId = null;
        String assetType = null;
        Integer startIndex = null;
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // BusinessAssetsGet200Response response = api.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessMemberAssetsGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        String memberId = null;
        String assetType = null;
        Integer startIndex = null;
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // BusinessMemberAssetsGet200Response response = api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Delete member access to asset
     *
     * Terminate multiple members&#39; access to an asset.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessMembersAssetAccessDeleteTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = null;

        // TODO: delete this line and uncomment the next
        // DeleteMemberAccessResultsResponseArray response = api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessMembersAssetAccessUpdateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody = null;

        // TODO: delete this line and uncomment the next
        // UpdateMemberAssetsResultsResponseArray response = api.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody);
        // TODO: complete test assertions
    }
    
    /**
     * Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void businessPartnerAssetAccessGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        String partnerId = null;
        PartnerType partnerType = null;
        String assetType = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String bookmark = null;

        // TODO: delete this line and uncomment the next
        // BusinessPartnerAssetAccessGet200Response response = api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark);
        // TODO: complete test assertions
    }
    
    /**
     * Delete partner access to asset
     *
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void deletePartnerAssetAccessHandlerImplTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = null;

        // TODO: delete this line and uncomment the next
        // DeletePartnerAssetsResultsResponseArray response = api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody);
        // TODO: complete test assertions
    }
    
    /**
     * Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void updatePartnerAssetAccessHandlerImplTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = null;

        // TODO: delete this line and uncomment the next
        // UpdatePartnerAssetsResultsResponseArray response = api.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody);
        // TODO: complete test assertions
    }
    
}
