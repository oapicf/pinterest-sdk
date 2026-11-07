package org.openapitools.api;

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
 * API tests for BusinessAccessRelationshipsApi
 */
@MicronautTest
public class BusinessAccessRelationshipsApiTest {

    @Inject
    BusinessAccessRelationshipsApi api;

    
    /**
     * Create a Brand Account
     *
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     */
    @Test
    @Disabled("Not Implemented")
    public void brandAccountsCreateTest() {
        // given
        String businessHierarchyId = "example";
        BrandAccountCreate brandAccountCreate = new BrandAccountCreate(org.openapitools.model.Country.fromValue("AD"), "example", "example");

        // when
        BrandAccount body = api.brandAccountsCreate(businessHierarchyId, brandAccountCreate).block();

        // then
        // TODO implement the brandAccountsCreateTest()
    }

    
    /**
     * Update a Brand Account
     *
     * Update an existing Brand Account
     */
    @Test
    @Disabled("Not Implemented")
    public void brandAccountsUpdateTest() {
        // given
        String brandAccountId = "example";
        String businessHierarchyId = "example";
        BrandAccountUpdate brandAccountUpdate = new BrandAccountUpdate();

        // when
        BrandAccount body = api.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate).block();

        // then
        // TODO implement the brandAccountsUpdateTest()
    }

    
    /**
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteBusinessMembershipTest() {
        // given
        String businessId = "example";
        DeleteBusinessMembershipBody deleteBusinessMembershipBody = new DeleteBusinessMembershipBody(Arrays.asList());

        // when
        DeleteBusinessMembership200Response body = api.deleteBusinessMembership(businessId, deleteBusinessMembershipBody).block();

        // then
        // TODO implement the deleteBusinessMembershipTest()
    }

    
    /**
     * Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteBusinessPartnersTest() {
        // given
        String businessId = "example";
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete = new DeleteBusinessPartnersDelete(Arrays.asList("example"));

        // when
        DeleteBusinessPartners body = api.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete).block();

        // then
        // TODO implement the deleteBusinessPartnersTest()
    }

    
    /**
     * List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessEmployersTest() {
        // given
        Boolean assetsSummary = true;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessEmployers200Response body = api.getBusinessEmployers(assetsSummary, bookmark, pageSize).block();

        // then
        // TODO implement the getBusinessEmployersTest()
    }

    
    /**
     * Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessMembersTest() {
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
        GetBusinessEmployers200Response body = api.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize).block();

        // then
        // TODO implement the getBusinessMembersTest()
    }

    
    /**
     * Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessPartnersTest() {
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
        GetBusinessEmployers200Response body = api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize).block();

        // then
        // TODO implement the getBusinessPartnersTest()
    }

    
    /**
     * Update a system user information.
     *
     * Update a system user information such as name.
     */
    @Test
    @Disabled("Not Implemented")
    public void systemUserUpdateTest() {
        // given
        String businessId = "example";
        String systemUserId = "example";
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody = new SystemUserUpdateWithRequiredBody("example");

        // when
        api.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody).block();

        // then
        // TODO implement the systemUserUpdateTest()
    }

    
    /**
     * Update member&#39;s business role
     *
     * Update a member&#39;s business role within the business.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessMembershipsTest() {
        // given
        String businessId = "example";
        List<@Valid BusinessMembershipMember> businessMembershipMember = Arrays.asList();

        // when
        UpdateBusinessMembershipsResponse body = api.updateBusinessMemberships(businessId, businessMembershipMember).block();

        // then
        // TODO implement the updateBusinessMembershipsTest()
    }

    
}
