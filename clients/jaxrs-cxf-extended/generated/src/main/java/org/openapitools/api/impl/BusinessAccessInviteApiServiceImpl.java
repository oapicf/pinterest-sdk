package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.CancelInvitesBody;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteInvitesResultsResponseArray;
import org.openapitools.model.Error;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteType;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.UpdateInvitesResultsResponseArray;

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
public class BusinessAccessInviteApiServiceImpl implements BusinessAccessInviteApi {
    /**
     * Create a request to access an existing partner&#39;s assets.
     *
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     *
     */
    @Override
    public CreateAssetAccessRequestResponse assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) {
        // TODO: Implement...
        return null;
    }

    /**
     * Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     *
     */
    @Override
    public DeleteInvitesResultsResponseArray cancelInvitesOrRequests(String businessId, CancelInvitesBody cancelInvitesBody) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     *
     */
    @Override
    public UpdateInvitesResultsResponseArray createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     *
     */
    @Override
    public CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     *
     */
    @Override
    public GetInvites200Response getInvites(String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     *
     */
    @Override
    public RespondToInvitesResponseArray respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody) {
        // TODO: Implement...
        return null;
    }

}
