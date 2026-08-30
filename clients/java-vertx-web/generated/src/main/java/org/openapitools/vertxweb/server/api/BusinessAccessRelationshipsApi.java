package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BrandAccount;
import org.openapitools.vertxweb.server.model.BrandAccountCreate;
import org.openapitools.vertxweb.server.model.BrandAccountUpdate;
import org.openapitools.vertxweb.server.model.BusinessMembershipMember;
import org.openapitools.vertxweb.server.model.DeleteBusinessMembership200Response;
import org.openapitools.vertxweb.server.model.DeleteBusinessMembershipBody;
import org.openapitools.vertxweb.server.model.DeleteBusinessPartners;
import org.openapitools.vertxweb.server.model.DeleteBusinessPartnersDelete;
import org.openapitools.vertxweb.server.model.GetBusinessEmployers200Response;
import org.openapitools.vertxweb.server.model.MemberBusinessRole;
import org.openapitools.vertxweb.server.model.PartnerType;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.UpdateBusinessMembershipsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BusinessAccessRelationshipsApi  {
    Future<ApiResponse<BrandAccount>> brandAccountsCreate(String businessHierarchyId, BrandAccountCreate brandAccountCreate);
    Future<ApiResponse<BrandAccount>> brandAccountsUpdate(String brandAccountId, String businessHierarchyId, BrandAccountUpdate brandAccountUpdate);
    Future<ApiResponse<DeleteBusinessMembership200Response>> deleteBusinessMembership(String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody);
    Future<ApiResponse<DeleteBusinessPartners>> deleteBusinessPartners(String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete);
    Future<ApiResponse<GetBusinessEmployers200Response>> getBusinessEmployers(Boolean assetsSummary, String bookmark, Integer pageSize);
    Future<ApiResponse<GetBusinessEmployers200Response>> getBusinessMembers(String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize);
    Future<ApiResponse<GetBusinessEmployers200Response>> getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Boolean sortAscending, String bookmark, Integer pageSize);
    Future<ApiResponse<Void>> systemUserUpdate(String businessId, String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody);
    Future<ApiResponse<UpdateBusinessMembershipsResponse>> updateBusinessMemberships(String businessId, List<BusinessMembershipMember> businessMembershipMember);
}
