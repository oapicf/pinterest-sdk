package org.openapitools.api.impl;

import org.openapitools.api.*;
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
public class BusinessAccessRelationshipsApiServiceImpl implements BusinessAccessRelationshipsApi {
    /**
     * Terminate business memberships
     *
     * Terminate memberships between the specified members and your business.
     *
     */
    @Override
    public DeletedMembersResponse deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody) {
        // TODO: Implement...
        return null;
    }

    /**
     * Terminate business partnerships
     *
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     *
     */
    @Override
    public DeletePartnersResponse deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * List business employers for user
     *
     * Get all of the viewing user&#39;s business employers.
     *
     */
    @Override
    public GetBusinessEmployers200Response getBusinessEmployers(Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get business members
     *
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     */
    @Override
    public GetBusinessMembers200Response getBusinessMembers(String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get business partners
     *
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     */
    @Override
    public GetBusinessPartners200Response getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update member&#39;s business role
     *
     * Update a member&#39;s business role within the business.
     *
     */
    @Override
    public UpdateMemberResultsResponseArray updateBusinessMemberships(String businessId, List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) {
        // TODO: Implement...
        return null;
    }

}
