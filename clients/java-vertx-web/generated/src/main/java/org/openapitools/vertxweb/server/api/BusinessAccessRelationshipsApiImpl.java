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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BusinessAccessRelationshipsApiImpl implements BusinessAccessRelationshipsApi {
    public Future<ApiResponse<DeletedMembersResponse>> deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeletePartnersResponse>> deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessEmployers200Response>> getBusinessEmployers(Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessMembers200Response>> getBusinessMembers(String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetBusinessPartners200Response>> getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateMemberResultsResponseArray>> updateBusinessMemberships(String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
