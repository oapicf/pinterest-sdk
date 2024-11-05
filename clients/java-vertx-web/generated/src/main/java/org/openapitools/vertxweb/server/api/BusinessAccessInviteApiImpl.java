package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AuthRespondInvitesBody;
import org.openapitools.vertxweb.server.model.CancelInvitesBody;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestBody;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestResponse;
import org.openapitools.vertxweb.server.model.CreateAssetInvitesRequest;
import org.openapitools.vertxweb.server.model.CreateInvitesResultsResponseArray;
import org.openapitools.vertxweb.server.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.vertxweb.server.model.DeleteInvitesResultsResponseArray;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetInvites200Response;
import org.openapitools.vertxweb.server.model.InviteType;
import org.openapitools.vertxweb.server.model.RespondToInvitesResponseArray;
import org.openapitools.vertxweb.server.model.UpdateInvitesResultsResponseArray;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BusinessAccessInviteApiImpl implements BusinessAccessInviteApi {
    public Future<ApiResponse<CreateAssetAccessRequestResponse>> assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteInvitesResultsResponseArray>> cancelInvitesOrRequests(String businessId, CancelInvitesBody cancelInvitesBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateInvitesResultsResponseArray>> createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateInvitesResultsResponseArray>> createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetInvites200Response>> getInvites(String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RespondToInvitesResponseArray>> respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody) {
        return Future.failedFuture(new HttpException(501));
    }

}
