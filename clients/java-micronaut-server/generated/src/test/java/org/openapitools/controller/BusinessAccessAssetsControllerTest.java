package org.openapitools.controller;

import org.openapitools.model.AssetGroupDeletion;
import org.openapitools.model.AssetGroupDeletionDelete;
import org.openapitools.model.AssetGroupInput;
import org.openapitools.model.AssetGroupInputCreate;
import org.openapitools.model.AssetGroupModification;
import org.openapitools.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.model.AssetPermissionType;
import org.openapitools.model.AssetSearchBy;
import org.openapitools.model.AssetSortBy;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGetResponse;
import org.openapitools.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetAccessResultsResponseArray;
import org.openapitools.model.NonDraftEntityStatus;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.PinterestLibError;
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
     * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void assetGroupCreateMethodTest() {
        // given
        String businessId = "example";
        AssetGroupInputCreate assetGroupInputCreate = new AssetGroupInputCreate("Asset groups that has ad accounts shared in Canada", "Canada Ad Accounts", Arrays.asList());

        // when
        AssetGroupInput result = controller.assetGroupCreate(businessId, assetGroupInputCreate).block();

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
        AssetGroupInputCreate body = new AssetGroupInputCreate("Asset groups that has ad accounts shared in Canada", "Canada Ad Accounts", Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6d5eebd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssetGroupInput.class);

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
        String businessId = "example";
        AssetGroupDeletionDelete assetGroupDeletionDelete = new AssetGroupDeletionDelete(Arrays.asList("example"));

        // when
        AssetGroupDeletion result = controller.assetGroupDelete(businessId, assetGroupDeletionDelete).block();

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
        AssetGroupDeletionDelete body = new AssetGroupDeletionDelete(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@cd61b0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssetGroupDeletion.class);

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
        String businessId = "example";
        AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate = new AssetGroupModificationReadOrUpdate();

        // when
        AssetGroupModification result = controller.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate).block();

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
        AssetGroupModificationReadOrUpdate body = new AssetGroupModificationReadOrUpdate();
        String uri = UriTemplate.of("/businesses/{business_id}/asset_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@12271417");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssetGroupModification.class);

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
        String businessId = "example";
        String assetId = "example";
        Integer startIndex = 0;
        Boolean fetchSystemUsers = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessAssetMembersGet200Response result = controller.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize).block();

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
            put("business_id", "example");
            put("asset_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2ecd3df0");
        request.getParameters()
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("fetch_system_users", String.valueOf(false)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

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
        String businessId = "example";
        String assetId = "example";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessAssetMembersGet200Response result = controller.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize).block();

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
            put("business_id", "example");
            put("asset_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7c49e92");
        request.getParameters()
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessAssetMembersGet200Response.class);

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
        String businessId = "example";
        List<PermissionsWithOwner> permissions = Arrays.asList();
        String childAssetId = "example";
        String assetGroupId = "example";
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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6c6faf3b");
        request.getParameters()
            .add("permissions", Arrays.asList()) // The query format should be multi
            .add("child_asset_id", "example") // The query parameter format should be 
            .add("asset_group_id", "example") // The query parameter format should be 
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
        String businessId = "example";
        String memberId = "example";
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        AssetSortBy sortBy = AssetSortBy.fromValue("NAME");
        Boolean sortAscending = true;
        AssetSearchBy searchBy = AssetSearchBy.fromValue("NAME");
        String searchValue = "example";
        AssetPermissionType assetPermissionType = AssetPermissionType.fromValue("AGGREGATED_PERMISSION");
        List<NonDraftEntityStatus> adAccountStatuses = Arrays.asList();
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessMemberAssetsGetResponse result = controller.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize).block();

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
            put("business_id", "example");
            put("member_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4642990d");
        request.getParameters()
            .add("asset_type", "AD_ACCOUNT") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("sort_by", String.valueOf(AssetSortBy.fromValue("NAME"))) // The query parameter format should be 
            .add("sort_ascending", String.valueOf(true)) // The query parameter format should be 
            .add("search_by", String.valueOf(AssetSearchBy.fromValue("NAME"))) // The query parameter format should be 
            .add("search_value", "example") // The query parameter format should be 
            .add("asset_permission_type", String.valueOf(AssetPermissionType.fromValue("AGGREGATED_PERMISSION"))) // The query parameter format should be 
            .add("ad_account_statuses", Arrays.asList()) // The query format should be multi
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BusinessMemberAssetsGetResponse.class);

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
        String businessId = "example";
        BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody = new BusinessMembersAssetAccessDeleteBody(Arrays.asList());

        // when
        DeleteMemberAccessResultsResponseArray result = controller.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody).block();

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
        BusinessMembersAssetAccessDeleteBody body = new BusinessMembersAssetAccessDeleteBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/members/assets/access").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@1270e88");

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
        String businessId = "example";
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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@22b43030");

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
        String businessId = "example";
        String partnerId = "example";
        String partnerType = "INTERNAL";
        String assetType = "AD_ACCOUNT";
        Integer startIndex = 0;
        AssetSortBy sortBy = AssetSortBy.fromValue("NAME");
        Boolean sortAscending = true;
        AssetSearchBy searchBy = AssetSearchBy.fromValue("NAME");
        String searchValue = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BusinessPartnerAssetAccessGet200Response result = controller.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize).block();

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
            put("business_id", "example");
            put("partner_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3333452a");
        request.getParameters()
            .add("partner_type", "INTERNAL") // The query parameter format should be 
            .add("asset_type", "AD_ACCOUNT") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("sort_by", String.valueOf(AssetSortBy.fromValue("NAME"))) // The query parameter format should be 
            .add("sort_ascending", String.valueOf(true)) // The query parameter format should be 
            .add("search_by", String.valueOf(AssetSearchBy.fromValue("NAME"))) // The query parameter format should be 
            .add("search_value", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

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
        String businessId = "example";
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new DeletePartnerAssetAccessBody(Arrays.asList());

        // when
        DeletePartnerAssetAccessResultsResponseArray result = controller.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody).block();

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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@61eb38b0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeletePartnerAssetAccessResultsResponseArray.class);

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
        String businessId = "example";
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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@5881294b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdatePartnerAssetsResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
