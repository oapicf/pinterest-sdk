package org.openapitools.controller;

import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.DeletePartnersRequest;
import org.openapitools.model.DeletePartnersResponse;
import org.openapitools.model.DeletedMembersResponse;
import org.openapitools.model.Error;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetBusinessMembers200Response;
import org.openapitools.model.GetBusinessPartners200Response;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MembersToDeleteBody;
import org.openapitools.model.PartnerType;
import org.openapitools.model.SystemUserUpdateRequest;
import org.openapitools.model.UpdateMemberBusinessRoleBody;
import org.openapitools.model.UpdateMemberResultsResponseArray;
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
 * API tests for BusinessAccessRelationshipsController
 */
@MicronautTest
public class BusinessAccessRelationshipsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BusinessAccessRelationshipsController controller;

    /**
     * This test is used to validate the implementation of brandAccountsCreate() method
     *
     * The method should: Create a Brand Account
     *
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void brandAccountsCreateMethodTest() {
        // given
        String businessHierarchyId = "7009386637860";
        BrandAccountsCreateRequest brandAccountsCreateRequest = new BrandAccountsCreateRequest("Canada Stores", "canada_stores", org.openapitools.model.Country.fromValue("AD"));

        // when
        BrandAccountsCreate200Response result = controller.brandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts' to the features of brandAccountsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void brandAccountsCreateClientApiTest() throws IOException {
        // given
        BrandAccountsCreateRequest body = new BrandAccountsCreateRequest("Canada Stores", "canada_stores", org.openapitools.model.Country.fromValue("AD"));
        String uri = UriTemplate.of("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_hierarchy_id", "7009386637860");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4433eba1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BrandAccountsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of brandAccountsUpdate() method
     *
     * The method should: Update a Brand Account
     *
     * Update an existing Brand Account
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void brandAccountsUpdateMethodTest() {
        // given
        String businessHierarchyId = "7009386637860";
        String brandAccountId = "729090764583391194";
        BrandAccountsUpdateRequest brandAccountsUpdateRequest = new BrandAccountsUpdateRequest();

        // when
        BrandAccountsCreate200Response result = controller.brandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}' to the features of brandAccountsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void brandAccountsUpdateClientApiTest() throws IOException {
        // given
        BrandAccountsUpdateRequest body = new BrandAccountsUpdateRequest();
        String uri = UriTemplate.of("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_hierarchy_id", "7009386637860");
            put("brand_account_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@163135");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BrandAccountsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteBusinessMembership() method
     *
     * The method should: Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteBusinessMembershipMethodTest() {
        // given
        String businessId = "729090764583391194";
        MembersToDeleteBody membersToDeleteBody = new MembersToDeleteBody(Arrays.asList());

        // when
        DeletedMembersResponse result = controller.deleteBusinessMembership(businessId, membersToDeleteBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members' to the features of deleteBusinessMembership() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteBusinessMembershipClientApiTest() throws IOException {
        // given
        MembersToDeleteBody body = new MembersToDeleteBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@28b39bfc");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeletedMembersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteBusinessPartners() method
     *
     * The method should: Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteBusinessPartnersMethodTest() {
        // given
        String businessId = "729090764583391194";
        DeletePartnersRequest deletePartnersRequest = new DeletePartnersRequest(Arrays.asList("example"));

        // when
        DeletePartnersResponse result = controller.deleteBusinessPartners(businessId, deletePartnersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/partners' to the features of deleteBusinessPartners() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteBusinessPartnersClientApiTest() throws IOException {
        // given
        DeletePartnersRequest body = new DeletePartnersRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{business_id}/partners").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@105c0f2b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeletePartnersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getBusinessEmployers() method
     *
     * The method should: List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessEmployersMethodTest() {
        // given
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        GetBusinessEmployers200Response result = controller.getBusinessEmployers(pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/employers' to the features of getBusinessEmployers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessEmployersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/employers").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4b699062");
        request.getParameters()
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessEmployers200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getBusinessMembers() method
     *
     * The method should: Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessMembersMethodTest() {
        // given
        String businessId = "729090764583391194";
        Boolean fetchSystemUsers = false;
        Boolean assetsSummary = false;
        List<MemberBusinessRole> businessRoles = Arrays.asList();
        String memberIds = "00101010101,2222220101";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessMembers200Response result = controller.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members' to the features of getBusinessMembers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessMembersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7ac78fa3");
        request.getParameters()
            .add("fetch_system_users", String.valueOf(false)) // The query parameter format should be 
            .add("assets_summary", String.valueOf(false)) // The query parameter format should be 
            .add("business_roles", Arrays.asList()) // The query format should be multi
            .add("member_ids", "00101010101,2222220101") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessMembers200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getBusinessPartners() method
     *
     * The method should: Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessPartnersMethodTest() {
        // given
        String businessId = "729090764583391194";
        Boolean assetsSummary = false;
        PartnerType partnerType = PartnerType.fromValue("INTERNAL");
        String partnerIds = "00101010101,2222220101";
        Integer startIndex = 0;
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        GetBusinessPartners200Response result = controller.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/partners' to the features of getBusinessPartners() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessPartnersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/partners").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4e9f877c");
        request.getParameters()
            .add("assets_summary", String.valueOf(false)) // The query parameter format should be 
            .add("partner_type", String.valueOf(PartnerType.fromValue("INTERNAL"))) // The query parameter format should be 
            .add("partner_ids", "00101010101,2222220101") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessPartners200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of systemUserUpdate() method
     *
     * The method should: Update a system user information.
     *
     * Update a system user information such as name.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void systemUserUpdateMethodTest() {
        // given
        String businessId = "729090764583391194";
        String systemUserId = "729090764583391194";
        SystemUserUpdateRequest systemUserUpdateRequest = new SystemUserUpdateRequest("Billing API");

        // when
        controller.systemUserUpdate(businessId, systemUserId, systemUserUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/system_users/{system_user_id}' to the features of systemUserUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void systemUserUpdateClientApiTest() throws IOException {
        // given
        SystemUserUpdateRequest body = new SystemUserUpdateRequest("Billing API");
        String uri = UriTemplate.of("/businesses/{business_id}/system_users/{system_user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
            put("system_user_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3ecaecd3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateBusinessMemberships() method
     *
     * The method should: Update member&#39;s business role
     *
     * Update a member&#39;s business role within the business.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessMembershipsMethodTest() {
        // given
        String businessId = "729090764583391194";
        List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody = Arrays.asList();

        // when
        UpdateMemberResultsResponseArray result = controller.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/members' to the features of updateBusinessMemberships() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateBusinessMembershipsClientApiTest() throws IOException {
        // given
        List<@Valid UpdateMemberBusinessRoleBody> body = Arrays.asList();
        String uri = UriTemplate.of("/businesses/{business_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@39a791e8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateMemberResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
