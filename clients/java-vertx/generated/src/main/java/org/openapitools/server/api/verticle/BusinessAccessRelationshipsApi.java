package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeletePartnersRequest;
import org.openapitools.server.api.model.DeletePartnersResponse;
import org.openapitools.server.api.model.DeletedMembersResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetBusinessEmployers200Response;
import org.openapitools.server.api.model.GetBusinessMembers200Response;
import org.openapitools.server.api.model.GetBusinessPartners200Response;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MemberBusinessRole;
import org.openapitools.server.api.model.MembersToDeleteBody;
import org.openapitools.server.api.model.PartnerType;
import org.openapitools.server.api.model.UpdateMemberBusinessRoleBody;
import org.openapitools.server.api.model.UpdateMemberResultsResponseArray;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BusinessAccessRelationshipsApi  {
    //delete_business_membership
    void deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody, Handler<AsyncResult<DeletedMembersResponse>> handler);

    //delete_business_partners
    void deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest, Handler<AsyncResult<DeletePartnersResponse>> handler);

    //get/business_employers
    void getBusinessEmployers(Integer pageSize, String bookmark, Handler<AsyncResult<GetBusinessEmployers200Response>> handler);

    //get/business_members
    void getBusinessMembers(String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize, Handler<AsyncResult<GetBusinessMembers200Response>> handler);

    //get/business_partners
    void getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark, Handler<AsyncResult<GetBusinessPartners200Response>> handler);

    //update/business_memberships
    void updateBusinessMemberships(String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, Handler<AsyncResult<UpdateMemberResultsResponseArray>> handler);

}
