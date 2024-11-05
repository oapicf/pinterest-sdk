package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeletePartnersRequest;
import org.openapitools.vertxweb.server.model.DeletePartnersResponse;
import org.openapitools.vertxweb.server.model.DeletedMembersResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetBusinessEmployers200Response;
import org.openapitools.vertxweb.server.model.GetBusinessMembers200Response;
import org.openapitools.vertxweb.server.model.GetBusinessPartners200Response;
import org.openapitools.vertxweb.server.model.MemberBusinessRole;
import org.openapitools.vertxweb.server.model.MembersToDeleteBody;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.UpdateMemberBusinessRoleBody;
import org.openapitools.vertxweb.server.model.UpdateMemberResultsResponseArray;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BusinessAccessRelationshipsApi  {
    Future<ApiResponse<DeletedMembersResponse>> deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody);
    Future<ApiResponse<DeletePartnersResponse>> deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest);
    Future<ApiResponse<GetBusinessEmployers200Response>> getBusinessEmployers(Integer pageSize, String bookmark);
    Future<ApiResponse<GetBusinessMembers200Response>> getBusinessMembers(String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<GetBusinessPartners200Response>> getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark);
    Future<ApiResponse<UpdateMemberResultsResponseArray>> updateBusinessMemberships(String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody);
}
