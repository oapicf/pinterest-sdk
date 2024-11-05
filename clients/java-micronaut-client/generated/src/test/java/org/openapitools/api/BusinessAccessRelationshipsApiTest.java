package org.openapitools.api;

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
import org.openapitools.model.UpdateMemberBusinessRoleBody;
import org.openapitools.model.UpdateMemberResultsResponseArray;
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
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteBusinessMembershipTest() {
        // given
        String businessId = "729090764583391194";
        MembersToDeleteBody membersToDeleteBody = new MembersToDeleteBody(Arrays.asList());

        // when
        DeletedMembersResponse body = api.deleteBusinessMembership(businessId, membersToDeleteBody).block();

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
        String businessId = "729090764583391194";
        DeletePartnersRequest deletePartnersRequest = new DeletePartnersRequest(Arrays.asList("example"));

        // when
        DeletePartnersResponse body = api.deleteBusinessPartners(businessId, deletePartnersRequest).block();

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
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        GetBusinessEmployers200Response body = api.getBusinessEmployers(pageSize, bookmark).block();

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
        String businessId = "729090764583391194";
        Boolean assetsSummary = false;
        List<MemberBusinessRole> businessRoles = Arrays.asList();
        String memberIds = "00101010101,2222220101";
        Integer startIndex = 0;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetBusinessMembers200Response body = api.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize).block();

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
        String businessId = "729090764583391194";
        Boolean assetsSummary = false;
        PartnerType partnerType = PartnerType.fromValue("INTERNAL");
        String partnerIds = "00101010101,2222220101";
        Integer startIndex = 0;
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        GetBusinessPartners200Response body = api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark).block();

        // then
        // TODO implement the getBusinessPartnersTest()
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
        String businessId = "729090764583391194";
        List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody = Arrays.asList();

        // when
        UpdateMemberResultsResponseArray body = api.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody).block();

        // then
        // TODO implement the updateBusinessMembershipsTest()
    }

    
}
