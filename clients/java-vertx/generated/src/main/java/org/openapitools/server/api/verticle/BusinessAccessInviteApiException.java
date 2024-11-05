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

public final class BusinessAccessInviteApiException extends MainApiException {
    public BusinessAccessInviteApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BusinessAccessInviteApiException BusinessAccessInvite_assetAccessRequestsCreate_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    public static final BusinessAccessInviteApiException BusinessAccessInvite_cancelInvitesOrRequests_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    public static final BusinessAccessInviteApiException BusinessAccessInvite_createAssetInvites_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    public static final BusinessAccessInviteApiException BusinessAccessInvite_createMembershipOrPartnershipInvites_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    public static final BusinessAccessInviteApiException BusinessAccessInvite_getInvites_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    public static final BusinessAccessInviteApiException BusinessAccessInvite_respondBusinessAccessInvites_200_Exception = new BusinessAccessInviteApiException(200, "Success");
    

}