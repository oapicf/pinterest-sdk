package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AuthRespondInvitesBody;
import org.openapitools.vertxweb.server.model.CancelInvitesRequest;
import org.openapitools.vertxweb.server.model.CancelInvitesResponse;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestBody;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestResponse;
import org.openapitools.vertxweb.server.model.CreateAssetInvitesRequest;
import org.openapitools.vertxweb.server.model.CreateInvitesResultsResponseArray;
import org.openapitools.vertxweb.server.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.vertxweb.server.model.GetInvites200Response;
import org.openapitools.vertxweb.server.model.InviteFilterStatus;
import org.openapitools.vertxweb.server.model.InviteType;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.RespondToInvitesResponseArray;
import org.openapitools.vertxweb.server.model.UpdateInvitesResultsResponseArray;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BusinessAccessInviteApi  {
    Future<ApiResponse<CreateAssetAccessRequestResponse>> assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody);
    Future<ApiResponse<CancelInvitesResponse>> cancelInvitesOrRequests(String businessId, CancelInvitesRequest cancelInvitesRequest);
    Future<ApiResponse<UpdateInvitesResultsResponseArray>> createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest);
    Future<ApiResponse<CreateInvitesResultsResponseArray>> createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody);
    Future<ApiResponse<GetInvites200Response>> getInvites(String businessId, Boolean isMember, List<InviteFilterStatus> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize);
    Future<ApiResponse<RespondToInvitesResponseArray>> respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody);
}
