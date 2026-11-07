package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class BusinessAccessRelationshipsApiServiceImpl implements BusinessAccessRelationshipsApi {
    /**
     * Create a Brand Account
     *
     * Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
     *
     */
    public BrandAccount brandAccountsCreate(String businessHierarchyId, BrandAccountCreate brandAccountCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update a Brand Account
     *
     * Update an existing Brand Account
     *
     */
    public BrandAccount brandAccountsUpdate(String brandAccountId, String businessHierarchyId, BrandAccountUpdate brandAccountUpdate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     *
     */
    public DeleteBusinessMembership200Response deleteBusinessMembership(String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody) {
        // TODO: Implement...

        return null;
    }

    /**
     * Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     *
     */
    public DeleteBusinessPartners deleteBusinessPartners(String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) {
        // TODO: Implement...

        return null;
    }

    /**
     * List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     *
     */
    public GetBusinessEmployers200Response getBusinessEmployers(Boolean assetsSummary, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     */
    public GetBusinessEmployers200Response getBusinessMembers(String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     */
    public GetBusinessEmployers200Response getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Boolean sortAscending, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update a system user information.
     *
     * Update a system user information such as name.
     *
     */
    public void systemUserUpdate(String businessId, String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) {
        // TODO: Implement...

        
    }

    /**
     * Update member&#39;s business role
     *
     * Update a member&#39;s business role within the business.
     *
     */
    public UpdateBusinessMembershipsResponse updateBusinessMemberships(String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember) {
        // TODO: Implement...

        return null;
    }

}
