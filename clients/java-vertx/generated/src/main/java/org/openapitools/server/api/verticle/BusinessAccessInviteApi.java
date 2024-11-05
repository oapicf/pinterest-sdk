package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AuthRespondInvitesBody;
import org.openapitools.server.api.model.CancelInvitesBody;
import org.openapitools.server.api.model.CreateAssetAccessRequestBody;
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse;
import org.openapitools.server.api.model.CreateAssetInvitesRequest;
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray;
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.server.api.model.DeleteInvitesResultsResponseArray;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetInvites200Response;
import org.openapitools.server.api.model.InviteType;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RespondToInvitesResponseArray;
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BusinessAccessInviteApi  {
    //asset_access_requests/create
    void assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, Handler<AsyncResult<CreateAssetAccessRequestResponse>> handler);

    //cancel_invites_or_requests
    void cancelInvitesOrRequests(String businessId, CancelInvitesBody cancelInvitesBody, Handler<AsyncResult<DeleteInvitesResultsResponseArray>> handler);

    //create_asset_invites
    void createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, Handler<AsyncResult<UpdateInvitesResultsResponseArray>> handler);

    //create_membership_or_partnership_invites
    void createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, Handler<AsyncResult<CreateInvitesResultsResponseArray>> handler);

    //get/invites
    void getInvites(String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize, Handler<AsyncResult<GetInvites200Response>> handler);

    //respond_business_access_invites
    void respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody, Handler<AsyncResult<RespondToInvitesResponseArray>> handler);

}
