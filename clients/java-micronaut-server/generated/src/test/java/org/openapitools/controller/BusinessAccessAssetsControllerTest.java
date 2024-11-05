package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for BusinessAccessAssetsController
 */
@MicronautTest
public class BusinessAccessAssetsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BusinessAccessAssetsController controller;

    /**
     * This test is used to validate the implementation of assetGroupCreate() method
     *
     * The method should: Create a new asset group.
     *
     * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupCreateMethodTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetGroupBody createAssetGroupBody = new CreateAssetGroupBody("Canada Ad Accounts", "Asset groups that has ad accounts shared in Canada", Arrays.asList());

        // when
        CreateAssetGroupResponse result = controller.assetGroupCreate(businessId, createAssetGroupBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/asset_groups' to the features of assetGroupCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupCreateClientApiTest() throws IOException {
        // given
        CreateAssetGroupBody body = new CreateAssetGroupBody("Canada Ad Accounts", "Asset groups that has ad accounts shared in Canada", Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4e2ee59e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateAssetGroupResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of assetGroupDelete() method
     *
     * The method should: Delete asset groups.
     *
     * Delete a batch of asset groups.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupDeleteMethodTest() {
        // given
        String businessId = "729090764583391194";
        DeleteAssetGroupBody deleteAssetGroupBody = new DeleteAssetGroupBody(Arrays.asList("example"));

        // when
        DeleteAssetGroupResponse result = controller.assetGroupDelete(businessId, deleteAssetGroupBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/asset_groups' to the features of assetGroupDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupDeleteClientApiTest() throws IOException {
        // given
        DeleteAssetGroupBody body = new DeleteAssetGroupBody(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@681d20da");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteAssetGroupResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of assetGroupUpdate() method
     *
     * The method should: Update asset groups.
     *
     * Update a batch of asset groups with the specified parameters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupUpdateMethodTest() {
        // given
        String businessId = "729090764583391194";
        UpdateAssetGroupBody updateAssetGroupBody = new UpdateAssetGroupBody();

        // when
        UpdateAssetGroupResponse result = controller.assetGroupUpdate(businessId, updateAssetGroupBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/asset_groups' to the features of assetGroupUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupUpdateClientApiTest() throws IOException {
        // given
        UpdateAssetGroupBody body = new UpdateAssetGroupBody();
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@1ee71a77");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateAssetGroupResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessAssetMembersGet() method
     *
     * The method should: Get members with access to asset
     *
     * Get all the members the requesting business has granted access to on the given asset.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetMembersGetMethodTest() {
        // given
        String businessId = "729090764583391194";
        String assetId = "729090764583391194";
        String bookmark = "example";
        Integer pageSize = 25;
        Integer startIndex = 0;

        // when
        BusinessAssetMembersGet200Response result = controller.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/assets/{asset_id}/members' to the features of businessAssetMembersGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetMembersGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/assets/{asset_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
            put("asset_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2953bba6");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("start_index", String.valueOf(0)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessAssetMembersGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessAssetPartnersGet() method
     *
     * The method should: Get partners with access to asset
     *
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetPartnersGetMethodTest() {
        // given
        String businessId = "729090764583391194";
        String assetId = "729090764583391194";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessAssetPartnersGet200Response result = controller.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/assets/{asset_id}/partners' to the features of businessAssetPartnersGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetPartnersGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/assets/{asset_id}/partners").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
            put("asset_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@10e8b907");
        request.getParameters()
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessAssetPartnersGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessAssetsGet() method
     *
     * The method should: List business assets
     *
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetsGetMethodTest() {
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
        BusinessAssetsGet200Response result = controller.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/assets' to the features of businessAssetsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessAssetsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/assets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@11f25030");
        request.getParameters()
            .add("permissions", Arrays.asList()) // The query format should be multi
            .add("child_asset_id", "549764894835") // The query parameter format should be 
            .add("asset_group_id", "7078106104032") // The query parameter format should be 
            .add("asset_type", "AD_ACCOUNT") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessAssetsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessMemberAssetsGet() method
     *
     * The method should: Get assets assigned to a member
     *
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMemberAssetsGetMethodTest() {
        // given
        String businessId = "729090764583391194";
        String memberId = "729090764583391194";
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessMemberAssetsGet200Response result = controller.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members/{member_id}/assets' to the features of businessMemberAssetsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMemberAssetsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/members/{member_id}/assets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
            put("member_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@37e0c4db");
        request.getParameters()
            .add("asset_type", "AD_ACCOUNT") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessMemberAssetsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessMembersAssetAccessDelete() method
     *
     * The method should: Delete member access to asset
     *
     * Terminate multiple members&#39; access to an asset.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMembersAssetAccessDeleteMethodTest() {
        // given
        String businessId = "729090764583391194";
        BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = new BusinessMembersAssetAccessDeleteRequest(Arrays.asList());

        // when
        DeleteMemberAccessResultsResponseArray result = controller.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members/assets/access' to the features of businessMembersAssetAccessDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMembersAssetAccessDeleteClientApiTest() throws IOException {
        // given
        BusinessMembersAssetAccessDeleteRequest body = new BusinessMembersAssetAccessDeleteRequest(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/members/assets/access").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@35ac70a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteMemberAccessResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessMembersAssetAccessUpdate() method
     *
     * The method should: Assign/Update member asset permissions
     *
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMembersAssetAccessUpdateMethodTest() {
        // given
        String businessId = "729090764583391194";
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody = new UpdateMemberAssetAccessBody(Arrays.asList());

        // when
        UpdateMemberAssetsResultsResponseArray result = controller.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members/assets/access' to the features of businessMembersAssetAccessUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessMembersAssetAccessUpdateClientApiTest() throws IOException {
        // given
        UpdateMemberAssetAccessBody body = new UpdateMemberAssetAccessBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/members/assets/access").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@562f66e7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateMemberAssetsResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of businessPartnerAssetAccessGet() method
     *
     * The method should: Get assets assigned to a partner or assets assigned by a partner
     *
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void businessPartnerAssetAccessGetMethodTest() {
        // given
        String businessId = "729090764583391194";
        String partnerId = "729090764583391194";
        PartnerType partnerType = new PartnerType();
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        BusinessPartnerAssetAccessGet200Response result = controller.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/partners/{partner_id}/assets' to the features of businessPartnerAssetAccessGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void businessPartnerAssetAccessGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/partners/{partner_id}/assets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
            put("partner_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@55dfcfc2");
        request.getParameters()
            .add("partner_type", String.valueOf(new PartnerType())) // The query parameter format should be 
            .add("asset_type", "AD_ACCOUNT") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessPartnerAssetAccessGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deletePartnerAssetAccessHandlerImpl() method
     *
     * The method should: Delete partner access to asset
     *
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePartnerAssetAccessHandlerImplMethodTest() {
        // given
        String businessId = "729090764583391194";
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(Arrays.asList());

        // when
        DeletePartnerAssetsResultsResponseArray result = controller.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/partners/assets' to the features of deletePartnerAssetAccessHandlerImpl() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePartnerAssetAccessHandlerImplClientApiTest() throws IOException {
        // given
        DeletePartnerAssetAccessBody body = new DeletePartnerAssetAccessBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/partners/assets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@64280fbe");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeletePartnerAssetsResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updatePartnerAssetAccessHandlerImpl() method
     *
     * The method should: Assign/Update partner asset permissions
     *
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePartnerAssetAccessHandlerImplMethodTest() {
        // given
        String businessId = "729090764583391194";
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = new UpdatePartnerAssetAccessBody(Arrays.asList());

        // when
        UpdatePartnerAssetsResultsResponseArray result = controller.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/partners/assets' to the features of updatePartnerAssetAccessHandlerImpl() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePartnerAssetAccessHandlerImplClientApiTest() throws IOException {
        // given
        UpdatePartnerAssetAccessBody body = new UpdatePartnerAssetAccessBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/partners/assets").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@319fe6a6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdatePartnerAssetsResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
