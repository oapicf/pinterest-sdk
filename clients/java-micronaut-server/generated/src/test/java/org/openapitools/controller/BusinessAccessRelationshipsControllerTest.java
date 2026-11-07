package org.openapitools.controller;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.BusinessMembershipMember;
import org.openapitools.model.DeleteBusinessMembership200Response;
import org.openapitools.model.DeleteBusinessMembershipBody;
import org.openapitools.model.DeleteBusinessPartners;
import org.openapitools.model.DeleteBusinessPartnersDelete;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.model.UpdateBusinessMembershipsResponse;
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
        String businessHierarchyId = "example";
        BrandAccountCreate brandAccountCreate = new BrandAccountCreate(org.openapitools.model.Country.fromValue("AD"), "example", "example");

        // when
        BrandAccount result = controller.brandAccountsCreate(businessHierarchyId, brandAccountCreate).block();

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
        BrandAccountCreate body = new BrandAccountCreate(org.openapitools.model.Country.fromValue("AD"), "example", "example");
        String uri = UriTemplate.of("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_hierarchy_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6325af19");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BrandAccount.class);

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
        String brandAccountId = "example";
        String businessHierarchyId = "example";
        BrandAccountUpdate brandAccountUpdate = new BrandAccountUpdate();

        // when
        BrandAccount result = controller.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate).block();

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
        BrandAccountUpdate body = new BrandAccountUpdate();
        String uri = UriTemplate.of("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("brand_account_id", "example");
            put("business_hierarchy_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@61486187");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BrandAccount.class);

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
        String businessId = "example";
        DeleteBusinessMembershipBody deleteBusinessMembershipBody = new DeleteBusinessMembershipBody(Arrays.asList());

        // when
        DeleteBusinessMembership200Response result = controller.deleteBusinessMembership(businessId, deleteBusinessMembershipBody).block();

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
        DeleteBusinessMembershipBody body = new DeleteBusinessMembershipBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@92981f4");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteBusinessMembership200Response.class);

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
        String businessId = "example";
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = new DeleteBusinessPartnersDelete(Arrays.asList("example"));

        // when
        DeleteBusinessPartners result = controller.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete).block();

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
        DeleteBusinessPartnersDelete body = new DeleteBusinessPartnersDelete(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{business_id}/partners").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@20da193a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteBusinessPartners.class);

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
        Boolean assetsSummary = true;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessEmployers200Response result = controller.getBusinessEmployers(assetsSummary, bookmark, pageSize).block();

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
            .accept("[Ljava.lang.String;@6e49375f");
        request.getParameters()
            .add("assets_summary", String.valueOf(true)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

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
        String businessId = "example";
        Boolean fetchSystemUsers = false;
        Boolean assetsSummary = false;
        List<MemberBusinessRole> businessRoles = Arrays.asList();
        String memberIds = "example";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessEmployers200Response result = controller.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize).block();

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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4caf2748");
        request.getParameters()
            .add("fetch_system_users", String.valueOf(false)) // The query parameter format should be 
            .add("assets_summary", String.valueOf(false)) // The query parameter format should be 
            .add("business_roles", Arrays.asList()) // The query format should be multi
            .add("member_ids", "example") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessEmployers200Response.class);

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
        String businessId = "example";
        Boolean assetsSummary = false;
        PartnerType partnerType = PartnerType.fromValue("INTERNAL");
        String partnerIds = "example";
        Integer startIndex = 0;
        Boolean sortAscending = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessEmployers200Response result = controller.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize).block();

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
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@94c3908");
        request.getParameters()
            .add("assets_summary", String.valueOf(false)) // The query parameter format should be 
            .add("partner_type", String.valueOf(PartnerType.fromValue("INTERNAL"))) // The query parameter format should be 
            .add("partner_ids", "example") // The query parameter format should be 
            .add("start_index", String.valueOf(0)) // The query parameter format should be 
            .add("sort_ascending", String.valueOf(false)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetBusinessEmployers200Response.class);

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
        String businessId = "example";
        String systemUserId = "example";
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody = new SystemUserUpdateWithRequiredBody("example");

        // when
        controller.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody).block();

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
        SystemUserUpdateWithRequiredBody body = new SystemUserUpdateWithRequiredBody("example");
        String uri = UriTemplate.of("/businesses/{business_id}/system_users/{system_user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
            put("system_user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@792fe2d2");

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
        String businessId = "example";
        List<@Valid BusinessMembershipMember> businessMembershipMember = Arrays.asList();

        // when
        UpdateBusinessMembershipsResponse result = controller.updateBusinessMemberships(businessId, businessMembershipMember).block();

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
        List<@Valid BusinessMembershipMember> body = Arrays.asList();
        String uri = UriTemplate.of("/businesses/{business_id}/members").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@5efbd167");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateBusinessMembershipsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
