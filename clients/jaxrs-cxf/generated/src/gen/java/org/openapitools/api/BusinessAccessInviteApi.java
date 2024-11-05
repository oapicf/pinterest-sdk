package org.openapitools.api;

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
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/businesses")
@Api(value = "/", description = "")
public interface BusinessAccessInviteApi  {

    /**
     * Create a request to access an existing partner&#39;s assets.
     *
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     *
     */
    @POST
    @Path("/{business_id}/requests/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request to access an existing partner's assets.", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateAssetAccessRequestResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CreateAssetAccessRequestResponse assetAccessRequestsCreate(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull CreateAssetAccessRequestBody createAssetAccessRequestBody);

    /**
     * Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     *
     */
    @DELETE
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel invites/requests", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeleteInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public DeleteInvitesResultsResponseArray cancelInvitesOrRequests(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull CancelInvitesBody cancelInvitesBody);

    /**
     * Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     *
     */
    @POST
    @Path("/{business_id}/invites/assets/access")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update invite/request with an asset permission", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = UpdateInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public UpdateInvitesResultsResponseArray createAssetInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull CreateAssetInvitesRequest createAssetInvitesRequest);

    /**
     * Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     *
     */
    @POST
    @Path("/{business_id}/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create invites or requests", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CreateInvitesResultsResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid @NotNull CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody);

    /**
     * Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     *
     */
    @GET
    @Path("/{business_id}/invites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get invites/requests", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = GetInvites200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public GetInvites200Response getInvites(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @QueryParam("is_member") @DefaultValue("true")Boolean isMember, @QueryParam("invite_status") @Size(min=1) List<String> inviteStatus, @QueryParam("invite_type") InviteType inviteType, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize);

    /**
     * Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     *
     */
    @PATCH
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Accept or decline an invite/request", tags={ "business_access_invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RespondToInvitesResponseArray.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public RespondToInvitesResponseArray respondBusinessAccessInvites(@Valid @NotNull AuthRespondInvitesBody authRespondInvitesBody);
}
